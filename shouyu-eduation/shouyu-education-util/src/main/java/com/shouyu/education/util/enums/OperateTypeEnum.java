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
public enum OperateTypeEnum {

	INCREASE(1, "增加"), EDIT(2, "修改"), DISADLE(3,"禁用");

	private Integer code;

	private String desc;

}
