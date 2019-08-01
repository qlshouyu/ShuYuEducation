package com.shouyu.education.user.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.shouyu.education.user.common.interfaces.BossLecturerExt;

/**
 * 讲师账户信息表 
 *
 * @author wujing
 */
@FeignClient(value = "shouyu-education-user-service")
public interface IBossLecturerExt extends BossLecturerExt {

}
