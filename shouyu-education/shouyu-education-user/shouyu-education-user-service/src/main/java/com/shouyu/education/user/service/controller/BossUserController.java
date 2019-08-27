package com.shouyu.education.user.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shouyu.education.user.common.bean.qo.UserQO;
import com.shouyu.education.user.common.bean.vo.UserVO;
import com.shouyu.education.user.common.interfaces.BossUser;
import com.shouyu.education.user.service.controller.biz.BossUserBiz;
import com.shouyu.education.util.base.BaseController;
import com.shouyu.education.util.base.Page;

/**
 * 用户基本信息
 *
 * @author 高露
 */
@RestController
public class BossUserController extends BaseController implements BossUser {

	@Autowired
	private BossUserBiz biz;

	@Override
	public Page<UserVO> listForPage(@RequestBody UserQO qo) {
		return biz.listForPage(qo);
	}

	@Override
	public int save(@RequestBody UserQO qo) {
		return biz.save(qo);
	}

	@Override
	public int deleteById(@PathVariable(value = "id") Long id) {
		return biz.deleteById(id);
	}

	@Override
	public int updateById(@RequestBody UserQO qo) {
		return biz.updateById(qo);
	}

	@Override
	public UserVO getById(@PathVariable(value = "id") Long id) {
		return biz.getById(id);
	}

	@Override
	public UserVO getByUserNo(@PathVariable(value = "userNo") Long userNo) {
		return biz.getByUserNo(userNo);
	}

	@Override
	public UserVO getByMobile(@PathVariable(value = "mobile") String mobile) {
		return biz.getByMobile(mobile);
	}

}
