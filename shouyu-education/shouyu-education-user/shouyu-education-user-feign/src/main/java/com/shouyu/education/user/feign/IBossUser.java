package com.shouyu.education.user.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.user.common.interfaces.BossUser;

/**
 * 用户基本信息
 *
 * @author 高露
 */
@FeignClient(value = "shouyu-education-user-service")
public interface IBossUser extends BossUser {

}
