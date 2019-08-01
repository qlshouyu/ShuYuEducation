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
public enum IsShowUserEnum {

    YES(1, "显示"), NO(0, "不显示");

    private Integer code;

    private String desc;

}
