package com.shouyu.education.course.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.course.common.interfaces.BossZoneCourse;

/**
 * 专区课程关联表 
 *
 * @author 高露
 */
@FeignClient(value = "shouyu-education-course-service")
public interface IBossZoneCourse extends BossZoneCourse {

}
