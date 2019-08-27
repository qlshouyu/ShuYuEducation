package com.shouyu.education.web.boss.biz.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shouyu.education.user.common.bean.qo.UserQO;
import com.shouyu.education.user.common.bean.vo.UserVO;
import com.shouyu.education.user.feign.IBossUser;
import com.shouyu.education.util.base.BaseBiz;
import com.shouyu.education.util.base.Page;

/**
 * 用户基本信息 
 *
 * @author 高露
 */
@Component
public class UserBiz extends BaseBiz{

	@Autowired
	private IBossUser bossUser;

	public Page<UserVO> listForPage(UserQO qo) {
        return bossUser.listForPage(qo);
	}

	public int save(UserQO qo) {
		return bossUser.save(qo);
	}

	public int deleteById(Long id) {
		return bossUser.deleteById(id);
	}

	public UserVO getById(Long id) {
		return bossUser.getById(id);
	}

	public int updateById(UserQO qo) {
		return bossUser.updateById(qo);
	}
	
}
