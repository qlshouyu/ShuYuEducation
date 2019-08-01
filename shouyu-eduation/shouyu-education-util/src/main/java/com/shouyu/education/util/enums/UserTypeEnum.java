/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author wujing
 */
@Getter
@AllArgsConstructor
public enum UserTypeEnum {

	USER(1, "用户", ""), LECTURER(2, "讲师", "blue");

	private Integer code;

	private String desc;

	private String color;
}
