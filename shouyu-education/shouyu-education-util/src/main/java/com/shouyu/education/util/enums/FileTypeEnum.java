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
public enum FileTypeEnum {

	ALIYUN(1, "阿里云"), QINIU(2, "七牛"), LOCAL(3, "本地");

	private Integer code;

	private String desc;

}
