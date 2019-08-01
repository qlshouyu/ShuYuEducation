package com.shouyu.education.user.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.user.common.interfaces.BossLecturerProfit;

/**
 * 讲师提现日志表 
 *
 * @author wujing
 */
@FeignClient(value = "shouyu-education-user-service")
public interface IBossLecturerProfit extends BossLecturerProfit {

}
