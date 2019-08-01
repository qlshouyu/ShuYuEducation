package com.shouyu.education.course.service.controller.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shouyu.education.course.common.bean.qo.DicQO;
import com.shouyu.education.course.common.bean.vo.DicVO;
import com.shouyu.education.course.service.dao.DicDao;
import com.shouyu.education.course.service.dao.impl.mapper.entity.Dic;
import com.shouyu.education.course.service.dao.impl.mapper.entity.DicExample;
import com.shouyu.education.util.base.Page;
import com.shouyu.education.util.base.PageUtil;
import com.shouyu.education.util.tools.BeanUtil;

/**
 * 数据字典
 *
 * @author wujing
 */
@Component
public class BossDicBiz {

	@Autowired
	private DicDao dao;

	public Page<DicVO> listForPage(DicQO qo) {
		DicExample example = new DicExample();
		example.setOrderByClause(" id desc ");
		Page<Dic> page = dao.listForPage(qo.getPageCurrent(), qo.getPageSize(), example);
		return PageUtil.transform(page, DicVO.class);
	}

	public int save(DicQO qo) {
		Dic record = BeanUtil.copyProperties(qo, Dic.class);
		return dao.save(record);
	}

	public int deleteById(Long id) {
		return dao.deleteById(id);
	}

	public DicVO getById(Long id) {
		Dic record = dao.getById(id);
		return BeanUtil.copyProperties(record, DicVO.class);
	}

	public int updateById(DicQO qo) {
		Dic record = BeanUtil.copyProperties(qo, Dic.class);
		return dao.updateById(record);
	}

}
