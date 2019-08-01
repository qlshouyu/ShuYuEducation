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
public enum IsPayEnum {

    YES(1, "已支付"), NO(0, "未支付");

    private Integer code;

    private String desc;

}
