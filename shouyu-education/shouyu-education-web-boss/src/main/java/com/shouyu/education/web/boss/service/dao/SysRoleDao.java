/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.web.boss.service.dao;

import java.util.List;

import com.shouyu.education.util.base.Page;
import com.shouyu.education.web.boss.service.dao.impl.mapper.entity.SysRole;
import com.shouyu.education.web.boss.service.dao.impl.mapper.entity.SysRoleExample;

public interface SysRoleDao {
	int save(SysRole record);

	int deleteById(Long id);

	int updateById(SysRole record);

	SysRole getById(Long id);

	Page<SysRole> listForPage(int pageCurrent, int pageSize, SysRoleExample example);

	List<SysRole> listByExample(SysRoleExample example);
}
