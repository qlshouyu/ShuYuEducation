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
public enum IsSuccessEnum {

	SUCCESS(1, "成功", "green"), FAIL(0, "失败", "red");

	private Integer code;

	private String desc;

	private String color;

}
