package com.shouyu.education.course.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.course.common.interfaces.BossCourseUserStudyLog;

/**
 * 课程用户学习日志 
 *
 * @author 高露
 */
@FeignClient(value = "shouyu-education-course-service")
public interface IBossCourseUserStudyLog extends BossCourseUserStudyLog {

}
