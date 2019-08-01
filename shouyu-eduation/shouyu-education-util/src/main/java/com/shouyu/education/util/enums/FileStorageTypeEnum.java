/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author YZJ
 */
@Getter
@AllArgsConstructor
public enum FileStorageTypeEnum {

	DOC(1, "附件"), PICTURE(2, "图片"), VIDEO(3, "视频");

	private Integer code;

	private String desc;

}
