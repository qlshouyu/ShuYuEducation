/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.web.boss.service.dao;

import com.shouyu.education.util.base.Page;
import com.shouyu.education.web.boss.service.dao.impl.mapper.entity.SysLog;
import com.shouyu.education.web.boss.service.dao.impl.mapper.entity.SysLogExample;

public interface SysLogDao {
	int save(SysLog record);

	int deleteById(Long id);

	int updateById(SysLog record);

	SysLog getById(Long id);

	Page<SysLog> listForPage(int pageCurrent, int pageSize, SysLogExample example);
}
