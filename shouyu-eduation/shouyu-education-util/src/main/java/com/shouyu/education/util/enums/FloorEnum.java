/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FloorEnum {

    ONE(1, "1"), TWO(2, "2");

    private Integer code;

    private String desc;

}
