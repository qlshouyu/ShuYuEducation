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
public enum SourceTypeEnum {

	REGISTER(1, "注册"), VIEW(2, "观看");

	private Integer code;

	private String desc;

}
