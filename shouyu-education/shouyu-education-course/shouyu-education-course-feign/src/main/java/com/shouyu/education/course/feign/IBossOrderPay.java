package com.shouyu.education.course.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.course.common.interfaces.BossOrderPay;

/**
 * 订单支付信息表 
 *
 * @author 高露
 */
@FeignClient(value = "shouyu-education-course-service")
public interface IBossOrderPay extends BossOrderPay {

}
