package com.shouyu.education.user.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.user.common.interfaces.BossLecturerAudit;

/**
 * 讲师信息-审核 
 *
 * @author 高露
 */
@FeignClient(value = "shouyu-education-user-service")
public interface IBossLecturerAudit extends BossLecturerAudit {

}
