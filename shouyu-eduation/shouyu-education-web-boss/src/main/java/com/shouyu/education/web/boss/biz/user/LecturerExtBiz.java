package com.shouyu.education.web.boss.biz.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shouyu.education.user.common.bean.qo.LecturerExtQO;
import com.shouyu.education.user.common.bean.vo.LecturerExtVO;
import com.shouyu.education.user.feign.IBossLecturerExt;
import com.shouyu.education.util.base.BaseBiz;
import com.shouyu.education.util.base.Page;

/**
 * 讲师账户信息表 
 *
 * @author wujing
 */
@Component
public class LecturerExtBiz extends BaseBiz{

	@Autowired
	private IBossLecturerExt bossLecturerExt;

	public Page<LecturerExtVO> listForPage(LecturerExtQO qo) {
        return bossLecturerExt.listForPage(qo);
	}

	public int save(LecturerExtQO qo) {
		return bossLecturerExt.save(qo);
	}

	public int deleteById(Long id) {
		return bossLecturerExt.deleteById(id);
	}

	public LecturerExtVO getById(Long id) {
		return bossLecturerExt.getById(id);
	}

	public int updateById(LecturerExtQO qo) {
		return bossLecturerExt.updateById(qo);
	}
	
}
