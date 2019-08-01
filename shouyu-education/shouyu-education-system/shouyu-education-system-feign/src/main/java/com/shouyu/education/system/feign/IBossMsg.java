package com.shouyu.education.system.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.system.common.interfaces.BossMsg;


/**
 * 站内信息表 
 *
 * @author wuyun
 */
@FeignClient(value = "shouyu-education-system-service")
public interface IBossMsg extends BossMsg {

}
