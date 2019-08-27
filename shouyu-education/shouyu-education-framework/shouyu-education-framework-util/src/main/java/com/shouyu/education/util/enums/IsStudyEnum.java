/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 是否学习枚举类
 * @author forest
 */
@Getter
@AllArgsConstructor
public enum IsStudyEnum {

    YES(1, "已学习"), NO(0, "未学习");

    private Integer code;

    private String desc;

}
