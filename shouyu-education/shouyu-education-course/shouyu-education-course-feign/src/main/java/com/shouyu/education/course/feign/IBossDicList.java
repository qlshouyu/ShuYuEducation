package com.shouyu.education.course.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.course.common.interfaces.BossDicList;

/**
 * 数据字典明细表 
 *
 * @author wujing
 */
@FeignClient(value = "shouyu-education-course-service")
public interface IBossDicList extends BossDicList {

}
