package com.shouyu.education.web.boss.biz.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shouyu.education.user.common.bean.qo.LecturerQO;
import com.shouyu.education.user.common.bean.vo.LecturerVO;
import com.shouyu.education.user.feign.IBossLecturer;
import com.shouyu.education.util.base.Page;
import com.shouyu.education.web.boss.common.BizBoss;

/**
 * 讲师信息
 *
 * @author 高露
 */
@Component
public class LecturerBiz extends BizBoss {

	@Autowired
	private IBossLecturer bossLecturer;

	public Page<LecturerVO> listForPage(LecturerQO qo) {
		return bossLecturer.listForPage(qo);
	}

	public int save(LecturerQO qo) {
		return bossLecturer.save(qo);
	}

	public int deleteById(Long id) {
		return bossLecturer.deleteById(id);
	}

	public LecturerVO getById(Long id) {
		return bossLecturer.getById(id);
	}

	public int updateById(LecturerQO qo) {
		return bossLecturer.updateById(qo);
	}

	public LecturerVO getByLecturerUserNo(Long lecturerUserNo) {
		return bossLecturer.getByLecturerUserNo(lecturerUserNo);
	}

	public int updateStatusId(LecturerQO qo) {
		return bossLecturer.updateById(qo);
	}

}
