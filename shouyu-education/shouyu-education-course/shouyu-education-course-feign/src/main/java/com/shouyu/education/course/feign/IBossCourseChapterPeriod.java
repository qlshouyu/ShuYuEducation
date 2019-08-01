package com.shouyu.education.course.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.course.common.interfaces.BossCourseChapterPeriod;

/**
 * 课时信息 
 *
 * @author wujing
 */
@FeignClient(value = "shouyu-education-course-service")
public interface IBossCourseChapterPeriod extends BossCourseChapterPeriod {

}
