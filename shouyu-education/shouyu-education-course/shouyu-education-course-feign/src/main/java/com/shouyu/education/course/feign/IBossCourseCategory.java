package com.shouyu.education.course.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.course.common.interfaces.BossCourseCategory;

/**
 * 课程分类 
 *
 * @author wujing
 */
@FeignClient(value = "shouyu-education-course-service")
public interface IBossCourseCategory extends BossCourseCategory {

}
