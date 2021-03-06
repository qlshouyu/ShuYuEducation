/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.user.common.bean.vo;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 用户教育信息,批量生成用户站内信用
 *
 * @author zkpc
 */
@Data
@Accessors(chain = true)
public class UserExtMsgVO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户编号
	 */
	private Long userNo;
	
	/**
	 * 用户手机
	 */
	private String mobile;
}
