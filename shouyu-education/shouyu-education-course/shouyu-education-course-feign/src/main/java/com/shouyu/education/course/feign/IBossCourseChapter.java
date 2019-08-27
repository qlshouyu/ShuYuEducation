package com.shouyu.education.course.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.course.common.interfaces.BossCourseChapter;

/**
 * 章节信息 
 *
 * @author 高露
 */
@FeignClient(value = "shouyu-education-course-service")
public interface IBossCourseChapter extends BossCourseChapter {

}
