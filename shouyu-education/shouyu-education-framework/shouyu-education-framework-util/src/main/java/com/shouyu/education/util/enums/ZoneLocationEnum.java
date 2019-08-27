/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 高露
 */
@Getter
@AllArgsConstructor
public enum ZoneLocationEnum {

	PC(0, "PC端", ""),
	//
	WX(1, "微信端", "green");

	private Integer code;

	private String desc;

	private String color;
}
