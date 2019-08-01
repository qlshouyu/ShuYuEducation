package com.shouyu.education.system.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.system.common.interfaces.BossSys;

/**
 * 系统配置表 
 *
 * @author YZJ
 */
@FeignClient(value = "shouyu-education-system-service")
public interface IBossSys extends BossSys {

}
