package com.shouyu.education.web.boss.biz.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shouyu.education.course.common.bean.qo.CourseChapterPeriodAuditQO;
import com.shouyu.education.course.common.bean.vo.CourseChapterPeriodAuditVO;
import com.shouyu.education.course.feign.IBossCourseChapterPeriodAudit;
import com.shouyu.education.util.base.BaseBiz;
import com.shouyu.education.util.base.Page;

/**
 * 课时信息-审核 
 *
 * @author 高露
 */
@Component
public class CourseChapterPeriodAuditBiz extends BaseBiz{

	@Autowired
	private IBossCourseChapterPeriodAudit bossCourseChapterPeriodAudit;

	public Page<CourseChapterPeriodAuditVO> listForPage(CourseChapterPeriodAuditQO qo) {
        return bossCourseChapterPeriodAudit.listForPage(qo);
	}

	public int save(CourseChapterPeriodAuditQO qo) {
		return bossCourseChapterPeriodAudit.save(qo);
	}

	public int deleteById(Long id) {
		return bossCourseChapterPeriodAudit.deleteById(id);
	}

	public CourseChapterPeriodAuditVO getById(Long id) {
		return bossCourseChapterPeriodAudit.getById(id);
	}

	public int updateById(CourseChapterPeriodAuditQO qo) {
		return bossCourseChapterPeriodAudit.updateById(qo);
	}
	
}
