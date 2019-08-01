package com.shouyu.education.system.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.system.common.interfaces.BossWebsiteNavArticle;

/**
 * 站点导航文章 
 *
 * @author wuyun
 */
@FeignClient(value = "shouyu-education-system-service")
public interface IBossWebsiteNavArticle extends BossWebsiteNavArticle {

}
