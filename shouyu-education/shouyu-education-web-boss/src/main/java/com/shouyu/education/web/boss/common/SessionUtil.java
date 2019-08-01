/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.web.boss.common;

import org.apache.shiro.SecurityUtils;

import com.shouyu.education.util.tools.Constants;

public final class SessionUtil {

	private SessionUtil() {
	}
	
	public static Long getUserNo() {
		return Long.valueOf(SecurityUtils.getSubject().getSession().getAttribute(Constants.Session.USER_NO).toString());
	}

	public static String getRealName() {
		return SecurityUtils.getSubject().getSession().getAttribute(Constants.Session.REAL_NAME).toString();
	}

}
