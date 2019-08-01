/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.web.boss.service.dao;

import java.util.List;

import com.shouyu.education.util.base.Page;
import com.shouyu.education.web.boss.service.dao.impl.mapper.entity.SysMenuRole;
import com.shouyu.education.web.boss.service.dao.impl.mapper.entity.SysMenuRoleExample;

public interface SysMenuRoleDao {
	int save(SysMenuRole record);

	int deleteById(Long id);

	int updateById(SysMenuRole record);

	SysMenuRole getById(Long id);

	Page<SysMenuRole> listForPage(int pageCurrent, int pageSize, SysMenuRoleExample example);

	List<SysMenuRole> listByRoleId(Long roleId);

	int deleteByRoleId(Long roleId);
}
