package com.shouyu.education.user.service.dao;

import com.shouyu.education.user.common.bean.vo.UserExtMsgVO;
import com.shouyu.education.user.service.dao.impl.mapper.entity.User;
import com.shouyu.education.user.service.dao.impl.mapper.entity.UserExample;
import com.shouyu.education.util.base.Page;

public interface UserDao {
	int save(User record);

	int deleteById(Long id);

	int updateById(User record);

	User getById(Long id);

	Page<User> listForPage(int pageCurrent, int pageSize, UserExample example);

	User getByMobile(String mobile);

	User getByUserNo(Long userNo);

	/**
	 * 分页缓存用户信息，站内信发送用
	 * 
	 * @param statusId
	 * @param pageCurrent
	 * @param pageSize
	 * @return
	 * @author wuyun
	 */
	Page<UserExtMsgVO> pageByStatusIdForMsg(Integer statusId, int pageCurrent, int pageSize);
}