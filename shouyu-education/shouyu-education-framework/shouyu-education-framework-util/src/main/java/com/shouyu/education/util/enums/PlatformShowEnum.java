/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 平台展示枚举类
 * 
 * @author Administrator
 *
 */
@Getter
@AllArgsConstructor
public enum PlatformShowEnum {

	PC(1, "PC端", ""), EDIT(0, "微信端","green");

	private Integer code;

	private String desc;
	
	private String color;

}
