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
public enum recruitTypeEnum {

	LECTURER(1, "讲师招募"), AGENT(2, "代理招募");

	private Integer code;

	private String desc;

}
