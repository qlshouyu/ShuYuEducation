/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.web.boss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.shouyu.education.util.base.Page;
import com.shouyu.education.util.base.PageUtil;
import com.shouyu.education.util.tools.BeanUtil;
import com.shouyu.education.web.boss.common.bean.qo.SysRoleQO;
import com.shouyu.education.web.boss.common.bean.qo.SysRoleUserQO;
import com.shouyu.education.web.boss.common.bean.vo.SysRoleUserVO;
import com.shouyu.education.web.boss.common.bean.vo.SysRoleVO;
import com.shouyu.education.web.boss.service.dao.SysMenuRoleDao;
import com.shouyu.education.web.boss.service.dao.SysRoleDao;
import com.shouyu.education.web.boss.service.dao.impl.mapper.entity.SysRole;
import com.shouyu.education.web.boss.service.dao.impl.mapper.entity.SysRoleExample;
import com.shouyu.education.web.boss.service.dao.impl.mapper.entity.SysRoleExample.Criteria;

/**
 * 角色信息
 *
 * @author 高露123
 * @since 2018-01-29
 */
@Component
public class SysRoleService {

	@Autowired
	private SysRoleDao dao;

	@Autowired
	private SysMenuRoleDao sysMenuRoleDao;

	public Page<SysRoleVO> listForPage(SysRoleQO qo) {
		SysRoleExample example = new SysRoleExample();
		Criteria c = example.createCriteria();
		if (StringUtils.hasText(qo.getRoleName())) {
			c.andRoleNameEqualTo(qo.getRoleName());
		}
		example.setOrderByClause(" status_id desc, sort desc, id desc ");
		Page<SysRole> page = dao.listForPage(qo.getPageCurrent(), qo.getPageSize(), example);
		return PageUtil.transform(page, SysRoleVO.class);
	}

	public int save(SysRoleQO qo) {
		SysRole record = BeanUtil.copyProperties(qo, SysRole.class);
		return dao.save(record);
	}

	@Transactional
	public int deleteById(Long id) {
		// 1、删除角色下的菜单
		sysMenuRoleDao.deleteByRoleId(id);
		// 2、删除角色
		return dao.deleteById(id);
	}

	public SysRoleVO getById(Long id) {
		SysRole record = dao.getById(id);
		return BeanUtil.copyProperties(record, SysRoleVO.class);
	}

	public int updateById(SysRoleQO qo) {
		SysRole record = BeanUtil.copyProperties(qo, SysRole.class);
		return dao.updateById(record);
	}

	public List<SysRoleVO> listRoleForUser(SysRoleUserQO qo, List<SysRoleUserVO> list) {
		SysRoleExample example = new SysRoleExample();
		Criteria c = example.createCriteria();
		if (StringUtils.hasText(qo.getRoleName())) {
			c.andRoleNameLike(PageUtil.rightLike(qo.getRoleName()));
		}
		List<SysRole> sysRolelist = dao.listByExample(example);
		List<SysRoleVO> sysRoleVOlist = PageUtil.copyList(sysRolelist, SysRoleVO.class);
		for (SysRoleVO roleVO : sysRoleVOlist) {
			Integer isShow = 0;
			for (SysRoleUserVO roleUserVo : list) {
				if (roleVO.getId().equals(roleUserVo.getRoleId())) {
					isShow = 1;
					break;
				}
			}
			roleVO.setIsShow(isShow);
		}
		return sysRoleVOlist;
	}

}
