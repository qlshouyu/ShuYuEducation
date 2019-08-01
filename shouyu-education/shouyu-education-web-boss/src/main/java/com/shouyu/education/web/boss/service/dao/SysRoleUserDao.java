/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.web.boss.service.dao;

import java.util.List;

import com.shouyu.education.util.base.Page;
import com.shouyu.education.web.boss.service.dao.impl.mapper.entity.SysRoleUser;
import com.shouyu.education.web.boss.service.dao.impl.mapper.entity.SysRoleUserExample;

public interface SysRoleUserDao {
	int save(SysRoleUser record);

	int deleteById(Long id);

	int updateById(SysRoleUser record);

	SysRoleUser getById(Long id);

	Page<SysRoleUser> listForPage(int pageCurrent, int pageSize, SysRoleUserExample example);

	List<SysRoleUser> listByUserId(Long userId);

	int deleteByUserId(Long userId);

}
