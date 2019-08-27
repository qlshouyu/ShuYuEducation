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
 * 用户基本信息
 * </p>
 *
 * @author 高露123
 */
@Data
@Accessors(chain = true)
public class UserLoginPasswordBO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 手机号码
	 */
	@ApiModelProperty(value = "手机号", required = true)
	private String mobile;
	/**
	 * 登录密码
	 */
	@ApiModelProperty(value = "密码", required = true)
	private String password;
	/**
	 * clientId
	 */
	@ApiModelProperty(value = "clientId", required = true)
	private String clientId;
	
	private String ip;

}
