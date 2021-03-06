/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 是否开启统计
 * 
 * @author wuyun
 */
@Getter
@AllArgsConstructor
public enum IsEnableStatisticsEnum {

	YES(1, "开启"), NO(0, "关闭");

	private Integer code;

	private String desc;

}
