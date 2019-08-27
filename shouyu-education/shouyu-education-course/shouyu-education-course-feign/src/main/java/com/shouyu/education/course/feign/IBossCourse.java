package com.shouyu.education.course.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.course.common.interfaces.BossCourse;

/**
 * 课程信息 
 *
 * @author 高露
 */
@FeignClient(value = "shouyu-education-course-service")
public interface IBossCourse extends BossCourse {

}
