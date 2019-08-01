package com.shouyu.education.course.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.course.common.interfaces.BossOrderInfo;

/**
 * 订单信息表 
 *
 * @author wujing
 */
@FeignClient(value = "shouyu-education-course-service")
public interface IBossOrderInfo extends BossOrderInfo {

}
