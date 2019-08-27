/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.tools;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author 高露
 */
public final class CookieUtil {

	private CookieUtil() {
	}

	public static String getCookieByName(HttpServletRequest request, String cookieName) {
		Cookie[] cookies = request.getCookies();
		if (null == cookies) {
			return "";
		} else {
			for (Cookie cookie : cookies) {
				if (cookieName.equals(cookie.getName())) {
					return cookie.getValue();
				}
			}
		}
		return "";
	}

}
