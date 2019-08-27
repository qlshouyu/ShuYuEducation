package com.shouyu.education.web.boss.biz.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shouyu.education.course.common.bean.qo.CourseIntroduceQO;
import com.shouyu.education.course.common.bean.vo.CourseIntroduceVO;
import com.shouyu.education.course.feign.IBossCourseIntroduce;
import com.shouyu.education.util.base.BaseBiz;
import com.shouyu.education.util.base.Page;

/**
 * 课程介绍信息 
 *
 * @author 高露
 */
@Component
public class CourseIntroduceBiz extends BaseBiz{

	@Autowired
	private IBossCourseIntroduce bossCourseIntroduce;

	public Page<CourseIntroduceVO> listForPage(CourseIntroduceQO qo) {
        return bossCourseIntroduce.listForPage(qo);
	}

	public int save(CourseIntroduceQO qo) {
		return bossCourseIntroduce.save(qo);
	}

	public int deleteById(Long id) {
		return bossCourseIntroduce.deleteById(id);
	}

	public CourseIntroduceVO getById(Long id) {
		return bossCourseIntroduce.getById(id);
	}

	public int updateById(CourseIntroduceQO qo) {
		return bossCourseIntroduce.updateById(qo);
	}
	
}
