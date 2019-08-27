package com.shouyu.education.web.boss.biz.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shouyu.education.course.common.bean.qo.CourseCategoryQO;
import com.shouyu.education.course.common.bean.vo.CourseCategoryVO;
import com.shouyu.education.course.feign.IBossCourseCategory;
import com.shouyu.education.util.base.BaseBiz;
import com.shouyu.education.util.base.Page;

/**
 * 课程分类 
 *
 * @author 高露
 */
@Component
public class CourseCategoryBiz extends BaseBiz{

	@Autowired
	private IBossCourseCategory bossCourseCategory;

	public Page<CourseCategoryVO> listForPage(CourseCategoryQO qo) {
        return bossCourseCategory.listForPage(qo);
	}

	public int save(CourseCategoryQO qo) {
		return bossCourseCategory.save(qo);
	}

	public int deleteById(CourseCategoryQO qo) {
		return bossCourseCategory.deleteById(qo.getId());
	}

	public CourseCategoryVO getById(Long id) {
		return bossCourseCategory.getById(id);
	}

	public int updateById(CourseCategoryQO qo) {
		return bossCourseCategory.updateById(qo);
	}

}
