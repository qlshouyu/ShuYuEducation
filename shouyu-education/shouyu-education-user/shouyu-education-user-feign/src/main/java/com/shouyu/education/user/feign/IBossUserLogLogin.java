package com.shouyu.education.user.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.user.common.interfaces.BossUserLogLogin;

/**
 * 用户错误登录日志 
 *
 * @author 高露
 */
@FeignClient(value = "shouyu-education-user-service")
public interface IBossUserLogLogin extends BossUserLogLogin {

}
