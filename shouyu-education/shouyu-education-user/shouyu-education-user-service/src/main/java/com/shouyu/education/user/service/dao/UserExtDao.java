package com.shouyu.education.user.service.dao;

import com.shouyu.education.user.service.dao.impl.mapper.entity.UserExt;
import com.shouyu.education.user.service.dao.impl.mapper.entity.UserExtExample;
import com.shouyu.education.util.base.Page;

public interface UserExtDao {
	int save(UserExt record);

	int deleteById(Long id);

	int updateById(UserExt record);

	UserExt getById(Long id);

	Page<UserExt> listForPage(int pageCurrent, int pageSize, UserExtExample example);

	UserExt getByUserNo(Long userNo);

	int updateByUserNo(UserExt record);

	/**
	 * 根据手机号码获取用户信息
	 * 
	 * @param mobile
	 * @return
	 * @author wuyun
	 */
	UserExt getByMobile(String mobile);

	/**
	 * 获取用户注册量
	 * 
	 * @param date
	 * @return
	 * @author wuyun
	 */
	Integer sumByCountOrders(String date);

}