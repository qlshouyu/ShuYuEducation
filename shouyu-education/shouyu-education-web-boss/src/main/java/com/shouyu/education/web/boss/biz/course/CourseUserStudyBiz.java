package com.shouyu.education.web.boss.biz.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shouyu.education.course.common.bean.qo.CourseUserStudyQO;
import com.shouyu.education.course.common.bean.vo.CourseUserStudyVO;
import com.shouyu.education.course.feign.IBossCourseUserStudy;
import com.shouyu.education.util.base.BaseBiz;
import com.shouyu.education.util.base.Page;

/**
 * 课程用户关联表 
 *
 * @author 高露
 */
@Component
public class CourseUserStudyBiz extends BaseBiz{

	@Autowired
	private IBossCourseUserStudy bossCourseUserStudy;

	public Page<CourseUserStudyVO> listForPage(CourseUserStudyQO qo) {
        return bossCourseUserStudy.listForPage(qo);
	}

	public int save(CourseUserStudyQO qo) {
		return bossCourseUserStudy.save(qo);
	}

	public int deleteById(Long id) {
		return bossCourseUserStudy.deleteById(id);
	}

	public CourseUserStudyVO getById(Long id) {
		return bossCourseUserStudy.getById(id);
	}

	public int updateById(CourseUserStudyQO qo) {
		return bossCourseUserStudy.updateById(qo);
	}
	
}
