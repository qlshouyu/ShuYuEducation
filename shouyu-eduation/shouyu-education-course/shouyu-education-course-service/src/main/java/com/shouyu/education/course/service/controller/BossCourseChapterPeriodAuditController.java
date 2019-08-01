package com.shouyu.education.course.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.shouyu.education.course.common.bean.qo.CourseChapterPeriodAuditQO;
import com.shouyu.education.course.common.bean.vo.CourseChapterPeriodAuditVO;
import com.shouyu.education.course.common.interfaces.BossCourseChapterPeriodAudit;
import com.shouyu.education.course.service.controller.biz.BossCourseChapterPeriodAuditBiz;
import com.shouyu.education.util.base.BaseController;
import com.shouyu.education.util.base.Page;

/**
 * 课时信息-审核
 *
 * @author wujing
 */
@RestController
public class BossCourseChapterPeriodAuditController extends BaseController implements BossCourseChapterPeriodAudit {

	@Autowired
	private BossCourseChapterPeriodAuditBiz biz;

	@Override
	public Page<CourseChapterPeriodAuditVO> listForPage(@RequestBody CourseChapterPeriodAuditQO qo) {
		return biz.listForPage(qo);
	}

	@Override
	public int save(@RequestBody CourseChapterPeriodAuditQO qo) {
		return biz.save(qo);
	}

	@Override
	public int deleteById(@PathVariable(value = "id") Long id) {
		return biz.deleteById(id);
	}

	@Override
	public int updateById(@RequestBody CourseChapterPeriodAuditQO qo) {
		return biz.updateById(qo);
	}

	@Override
	public CourseChapterPeriodAuditVO getById(@PathVariable(value = "id") Long id) {
		return biz.getById(id);
	}

	@Override
	public CourseChapterPeriodAuditVO getByVideoNo(@RequestBody Long videoNo) {
		return biz.getByVideoNo(videoNo);
	}

}
