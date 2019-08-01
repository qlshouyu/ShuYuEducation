package com.shouyu.education.course.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.course.common.interfaces.BossCourseVideo;

/**
 * 课程视频信息 
 *
 * @author wuyun
 */
@FeignClient(value = "shouyu-education-course-service")
public interface IBossCourseVideo extends BossCourseVideo {

}
