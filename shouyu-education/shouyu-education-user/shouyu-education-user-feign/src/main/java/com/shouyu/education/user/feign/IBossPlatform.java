package com.shouyu.education.user.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.user.common.interfaces.BossPlatform;

/**
 * 平台信息
 *
 * @author 高露
 */
@FeignClient(value = "shouyu-education-user-service")
public interface IBossPlatform extends BossPlatform {

}
