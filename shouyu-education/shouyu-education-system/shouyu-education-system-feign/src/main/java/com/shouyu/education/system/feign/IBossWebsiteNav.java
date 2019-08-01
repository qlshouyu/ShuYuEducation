package com.shouyu.education.system.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.system.common.interfaces.BossWebsiteNav;

/**
 * 站点导航 
 *
 * @author wuyun
 */
@FeignClient(value = "shouyu-education-system-service")
public interface IBossWebsiteNav extends BossWebsiteNav {

}
