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
public enum SexEnum {

	MALE(1, "男", "green"), FEMALE(2, "女", "red"), SECRET(3, "保密", "orange");

	private Integer code;

	private String desc;

	private String color;
}
