/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 是否存在文档
 * 
 * @author wuyun
 */
@Getter
@AllArgsConstructor
public enum IsDocEnum {

	YES(1, "存在"), NO(0, "否");

	private Integer code;

	private String desc;

}
