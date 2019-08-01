/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 
 * @author forest
 */
@Getter
@AllArgsConstructor
public enum FundDirectionEnum {

    ADD(1, "增加"), SUBSTRACT(2, "减少");

    private Integer code;

    private String desc;

}
