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
public enum VideoTypeEnum {

	POLYV(1, "保利威视"), QINIU(2, "七牛");

	private Integer code;

	private String desc;

}
