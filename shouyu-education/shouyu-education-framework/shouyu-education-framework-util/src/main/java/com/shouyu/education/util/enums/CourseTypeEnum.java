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
public enum CourseTypeEnum {

    COURSE(1, "课程"), CHAPTER(2, "章节"), PERIOD(3, "课时");

    private Integer code;

    private String desc;

}
