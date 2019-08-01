package com.shouyu.education.system.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.system.common.interfaces.BossMsgUser;


/**
 * 站内信用户记录表 
 *
 * @author wuyun
 */
@FeignClient(value = "shouyu-education-system-service")
public interface IBossMsgUser extends BossMsgUser {

}
