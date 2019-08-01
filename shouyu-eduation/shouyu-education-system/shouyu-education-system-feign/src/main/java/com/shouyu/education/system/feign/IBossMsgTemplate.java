package com.shouyu.education.system.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.system.common.interfaces.BossMsgTemplate;


/**
 * 消息模板 
 *
 * @author wuyun
 */
@FeignClient(value = "shouyu-education-system-service")
public interface IBossMsgTemplate extends BossMsgTemplate {

}
