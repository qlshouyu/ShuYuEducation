package com.shouyu.education.web.boss.biz.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shouyu.education.course.common.bean.qo.CourseChapterQO;
import com.shouyu.education.course.common.bean.vo.CourseChapterVO;
import com.shouyu.education.course.feign.IBossCourseChapter;
import com.shouyu.education.user.common.bean.vo.LecturerVO;
import com.shouyu.education.user.common.interfaces.BossLecturer;
import com.shouyu.education.util.base.BaseBiz;
import com.shouyu.education.util.base.Page;

/**
 * 章节信息
 *
 * @author wujing
 */
@Component
public class CourseChapterBiz extends BaseBiz {

	@Autowired
	private IBossCourseChapter bossCourseChapter;
	@Autowired
	private BossLecturer bossLecturer;

	public Page<CourseChapterVO> listForPage(CourseChapterQO qo) {
		return bossCourseChapter.listForPage(qo);
	}

	public int save(CourseChapterQO qo) {
		return bossCourseChapter.save(qo);
	}

	public int deleteById(Long id) {
		return bossCourseChapter.deleteById(id);
	}

	public CourseChapterVO getById(Long id) {
		return bossCourseChapter.getById(id);
	}

	public int updateById(CourseChapterQO qo) {
		return bossCourseChapter.updateById(qo);
	}

	public List<LecturerVO> listAllLecturer() {
		return bossLecturer.listAllForLecturer();
	}

}
