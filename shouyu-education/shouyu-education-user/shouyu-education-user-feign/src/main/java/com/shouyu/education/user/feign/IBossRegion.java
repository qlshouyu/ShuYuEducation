package com.shouyu.education.user.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.user.common.interfaces.BossRegion;

/**
 * 行政区域表 
 *
 * @author 高露
 */
@FeignClient(value = "shouyu-education-user-service")
public interface IBossRegion extends BossRegion {

}
