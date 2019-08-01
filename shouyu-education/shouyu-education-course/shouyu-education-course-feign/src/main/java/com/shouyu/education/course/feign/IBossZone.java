package com.shouyu.education.course.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.course.common.interfaces.BossZone;

/**
 * 专区 
 *
 * @author wujing
 */
@FeignClient(value = "shouyu-education-course-service")
public interface IBossZone extends BossZone {

}
