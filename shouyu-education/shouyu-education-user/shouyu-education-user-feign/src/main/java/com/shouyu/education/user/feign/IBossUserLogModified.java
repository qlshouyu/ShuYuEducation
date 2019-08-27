package com.shouyu.education.user.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.user.common.interfaces.BossUserLogModified;

/**
 * 用户修改日志 
 *
 * @author 高露
 */
@FeignClient(value = "shouyu-education-user-service")
public interface IBossUserLogModified extends BossUserLogModified {

}
