/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 是否定时发送
 * 
 * @author wuyun
 *
 */
@Getter
@AllArgsConstructor
public enum IsTimeSendEnum {

	YES(1, "是"), NO(0, "否");

	private Integer code;

	private String desc;

}
