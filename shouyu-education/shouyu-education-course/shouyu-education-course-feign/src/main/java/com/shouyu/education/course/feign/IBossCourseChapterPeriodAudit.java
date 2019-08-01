package com.shouyu.education.course.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.course.common.interfaces.BossCourseChapterPeriodAudit;

/**
 * 课时信息-审核 
 *
 * @author wujing
 */
@FeignClient(value = "shouyu-education-course-service")
public interface IBossCourseChapterPeriodAudit extends BossCourseChapterPeriodAudit {

}
