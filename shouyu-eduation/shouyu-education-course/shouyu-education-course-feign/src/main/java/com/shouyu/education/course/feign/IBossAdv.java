package com.shouyu.education.course.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.course.common.interfaces.BossAdv;

/**
 * 广告信息 
 *
 * @author wujing
 */
@FeignClient(value = "shouyu-education-course-service")
public interface IBossAdv extends BossAdv {

}
