/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 是否高亮(1高亮;0不高亮)
 * 
 * @author wuyun
 */
@Getter
@AllArgsConstructor
public enum IsHfield {

	NO(0, "不高亮"), YES(1, "高亮");

	private Integer code;

	private String desc;

}
