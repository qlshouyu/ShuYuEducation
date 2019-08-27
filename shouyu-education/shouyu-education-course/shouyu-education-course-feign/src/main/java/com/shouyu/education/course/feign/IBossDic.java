package com.shouyu.education.course.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.course.common.interfaces.BossDic;

/**
 * 数据字典 
 *
 * @author 高露
 */
@FeignClient(value = "shouyu-education-course-service")
public interface IBossDic extends BossDic {

}
