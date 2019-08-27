/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.user.service.common.bo;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 讲师信息
 * </p>
 *
 * @author 高露123
 */
@Data
@Accessors(chain = true)
public class LecturerViewBO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 讲师编号
	 */
	@ApiModelProperty(value = "讲师用户编号", required = true)
	private Long lecturerUserNo;

}
