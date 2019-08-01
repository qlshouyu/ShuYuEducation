package com.shouyu.education.course.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.course.common.interfaces.BossCourseRecommend;

/**
 * 课程推荐
 *
 * @author wujing
 */
@FeignClient(value = "shouyu-education-course-service")
public interface IBossCourseRecommend extends BossCourseRecommend {

}
