/**
 * Copyright 2015-2017 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 短信类型
 * 
 * @author wuyun
 *
 */
@Getter
@AllArgsConstructor
public enum MsgTypeEnum {

	SYSTEM(1, "系统消息"), OTHER(2, "其他");

	private Integer code;

	private String desc;

}
