package com.shouyu.education.user.service.controller.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shouyu.education.user.common.bean.qo.UserLogLoginQO;
import com.shouyu.education.user.common.bean.vo.UserLogLoginVO;
import com.shouyu.education.user.service.dao.UserLogLoginDao;
import com.shouyu.education.user.service.dao.impl.mapper.entity.UserLogLogin;
import com.shouyu.education.user.service.dao.impl.mapper.entity.UserLogLoginExample;
import com.shouyu.education.util.base.Page;
import com.shouyu.education.util.base.PageUtil;
import com.shouyu.education.util.tools.BeanUtil;

/**
 * 用户错误登录日志 
 *
 * @author 高露
 */
@Component
public class BossUserLogLoginBiz {

	@Autowired
	private UserLogLoginDao dao;

	public Page<UserLogLoginVO> listForPage(UserLogLoginQO qo) {
	    UserLogLoginExample example = new UserLogLoginExample();
	    example.setOrderByClause(" id desc ");
        Page<UserLogLogin> page = dao.listForPage(qo.getPageCurrent(), qo.getPageSize(), example);
        return PageUtil.transform(page, UserLogLoginVO.class);
	}

	public int save(UserLogLoginQO qo) {
	    UserLogLogin record = BeanUtil.copyProperties(qo, UserLogLogin.class);
		return dao.save(record);
	}

	public int deleteById(Long id) {
		return dao.deleteById(id);
	}

	public UserLogLoginVO getById(Long id) {
	    UserLogLogin record = dao.getById(id);
		return BeanUtil.copyProperties(record, UserLogLoginVO.class);
	}

	public int updateById(UserLogLoginQO qo) {
	    UserLogLogin record = BeanUtil.copyProperties(qo, UserLogLogin.class);
		return dao.updateById(record);
	}
	
}
