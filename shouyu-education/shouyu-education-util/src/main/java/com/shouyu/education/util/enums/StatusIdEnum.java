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
public enum StatusIdEnum {

	YES(1, "正常", ""), NO(0, "禁用", "red");

	private Integer code;

	private String desc;

	private String color;

}
