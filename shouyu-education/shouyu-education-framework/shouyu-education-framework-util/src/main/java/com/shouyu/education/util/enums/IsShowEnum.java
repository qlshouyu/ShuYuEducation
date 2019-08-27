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
public enum IsShowEnum {

    YES(1, "显示"), NO(0, "不显示");

    private Integer code;

    private String desc;

}
