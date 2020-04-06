/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.tools;

/**
 * 常量工具类
 * 
 * @author 高露
 */
public final class Constants {

	private Constants() {
	}

	public final static String ADMIN = "admin";// admin
	public final static Integer FREEZE = 3;// 冻结状态
	public final static String REGEX_MOBILE = "^1[0-9]{10}$";

	/**
	 * session
	 * 
	 * @author 高露
	 */
	public interface Session {
		public final static String BOSS_MENU = "BOSS_MENU";//
		public final static String USER_NO = "USERNO"; // userno
		public final static String USER_VO = "USERVO";// 不能使用user，关键词
		public final static String REAL_NAME = "REALNAME";//
	}

	/**
	 * cookie
	 * 
	 * @author 高露
	 */
	public interface Cookie {
		public final static String USER_TOKEN = "USERTOKEN";
	}

	/**
	 * 日期类型
	 * 
	 * @author 高露
	 */
	public interface DATE {
		public final static String YYYYMMDD = "yyyyMMdd";
		public final static String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
		public final static String YYYYMMDDHHMMSSSSS = "yyyyMMddHHmmssSSS";
		public final static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
		public final static String YYYY_MM_DD = "yyyy-MM-dd";
	}

}