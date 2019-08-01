package com.shouyu.education.user.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.user.common.interfaces.BossSendSmsLog;

/**
 * 用户发送短信日志
 *
 * @author YZJ
 */
@FeignClient(value = "shouyu-education-user-service")
public interface IBossSendSmsLog extends BossSendSmsLog {

}
