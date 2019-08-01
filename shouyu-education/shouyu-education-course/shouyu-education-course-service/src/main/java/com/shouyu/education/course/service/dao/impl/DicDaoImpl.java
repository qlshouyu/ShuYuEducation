package com.shouyu.education.course.service.dao.impl;

import com.shouyu.education.course.service.dao.DicDao;
import com.shouyu.education.course.service.dao.impl.mapper.DicMapper;
import com.shouyu.education.course.service.dao.impl.mapper.entity.Dic;
import com.shouyu.education.course.service.dao.impl.mapper.entity.DicExample;
import com.shouyu.education.util.base.Page;
import com.shouyu.education.util.base.PageUtil;
import com.shouyu.education.util.tools.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DicDaoImpl implements DicDao {
    @Autowired
    private DicMapper dicMapper;

    public int save(Dic record) {
        record.setId(IdWorker.getId());
        return this.dicMapper.insertSelective(record);
    }

    public int deleteById(Long id) {
        return this.dicMapper.deleteByPrimaryKey(id);
    }

    public int updateById(Dic record) {
        return this.dicMapper.updateByPrimaryKeySelective(record);
    }

    public Dic getById(Long id) {
        return this.dicMapper.selectByPrimaryKey(id);
    }

    public Page<Dic> listForPage(int pageCurrent, int pageSize, DicExample example) {
        int count = this.dicMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<Dic>(count, totalPage, pageCurrent, pageSize, this.dicMapper.selectByExample(example));
    }
}