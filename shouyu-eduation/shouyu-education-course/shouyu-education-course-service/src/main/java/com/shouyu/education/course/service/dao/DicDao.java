package com.shouyu.education.course.service.dao;

import com.shouyu.education.course.service.dao.impl.mapper.entity.Dic;
import com.shouyu.education.course.service.dao.impl.mapper.entity.DicExample;
import com.shouyu.education.util.base.Page;

public interface DicDao {
    int save(Dic record);

    int deleteById(Long id);

    int updateById(Dic record);

    Dic getById(Long id);

    Page<Dic> listForPage(int pageCurrent, int pageSize, DicExample example);
}