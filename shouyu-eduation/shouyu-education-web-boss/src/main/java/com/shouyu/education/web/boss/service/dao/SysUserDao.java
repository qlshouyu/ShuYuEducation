/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.web.boss.service.dao;

import com.shouyu.education.util.base.Page;
import com.shouyu.education.web.boss.service.dao.impl.mapper.entity.SysUser;
import com.shouyu.education.web.boss.service.dao.impl.mapper.entity.SysUserExample;

public interface SysUserDao {
	int save(SysUser record);

	int deleteById(Long id);

	int updateById(SysUser record);

	SysUser getById(Long id);

	Page<SysUser> listForPage(int pageCurrent, int pageSize, SysUserExample example);

	SysUser getByUserNo(Long userNo);

	SysUser getByMobile(String mobile);

}
