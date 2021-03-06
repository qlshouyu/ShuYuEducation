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
public enum TradeTypeEnum {
    
    ONLINE(1, "线上支付"), OFFLINE(2, "线下支付");

    private Integer code;

    private String desc;

}
