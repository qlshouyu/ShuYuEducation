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
public enum CategoryTypeEnum {

    COURSE(1, "课程分类"), RESOURCE(2, "资源分类");

    private Integer code;

    private String desc;

}
