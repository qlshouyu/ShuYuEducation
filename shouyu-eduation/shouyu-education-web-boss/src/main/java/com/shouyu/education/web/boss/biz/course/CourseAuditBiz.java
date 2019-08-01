package com.shouyu.education.web.boss.biz.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.shouyu.education.course.common.bean.qo.CourseAuditQO;
import com.shouyu.education.course.common.bean.qo.CourseCategoryQO;
import com.shouyu.education.course.common.bean.vo.CourseAuditVO;
import com.shouyu.education.course.common.bean.vo.CourseCategoryVO;
import com.shouyu.education.course.feign.IBossCourseAudit;
import com.shouyu.education.course.feign.IBossCourseCategory;
import com.shouyu.education.system.feign.IBossSys;
import com.shouyu.education.util.aliyun.Aliyun;
import com.shouyu.education.util.aliyun.AliyunUtil;
import com.shouyu.education.util.base.Page;
import com.shouyu.education.util.enums.PlatformEnum;
import com.shouyu.education.util.tools.BeanUtil;
import com.shouyu.education.web.boss.common.BizBoss;

/**
 * 课程信息-审核
 *
 * @author wujing
 */
@Component
public class CourseAuditBiz extends BizBoss {

	@Autowired
	private IBossSys bossSys;
	@Autowired
	private IBossCourseAudit bossCourseAudit;

	@Autowired
	private IBossCourseCategory bossCourseCategory;

	public Page<CourseAuditVO> listForPage(CourseAuditQO qo) {
		return bossCourseAudit.listForPage(qo);
	}

	public int save(CourseAuditQO qo) {
		return bossCourseAudit.save(qo);
	}

	public int deleteById(Long id) {
		return bossCourseAudit.deleteById(id);
	}

	public CourseAuditVO getById(Long id) {
		return bossCourseAudit.getById(id);
	}

	public int updateById(CourseAuditQO qo, MultipartFile advFile) {
		if (null != advFile && !advFile.isEmpty()) {
			qo.setCourseLogo(AliyunUtil.uploadPic(PlatformEnum.COURSE, advFile, BeanUtil.copyProperties(bossSys.getSys(), Aliyun.class)));
		}
		return bossCourseAudit.updateById(qo);
	}

	public List<CourseCategoryVO> listByFloorAndCategoryId(Integer floor, Long parentId) {
		CourseCategoryQO qo = new CourseCategoryQO();
		qo.setFloor(floor);
		qo.setParentId(parentId);
		return bossCourseCategory.listByFloorAndCategoryId(qo);
	}

	public int audit(CourseAuditQO qo) {
		return bossCourseAudit.audit(qo);
	}

	public int updateStatusId(CourseAuditQO qo) {
		return bossCourseAudit.updateStatusId(qo);
	}

}
