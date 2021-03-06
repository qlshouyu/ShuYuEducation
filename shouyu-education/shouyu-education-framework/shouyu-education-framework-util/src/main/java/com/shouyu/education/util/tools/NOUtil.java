/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.tools;

import java.util.Date;

import com.xiaoleilu.hutool.date.DateUtil;
import com.xiaoleilu.hutool.util.RandomUtil;

/**
 * 时间+随机数，一定几率是会重复的，但忽略这个，数据库校验了唯一性
 */
public final class NOUtil {

	private NOUtil() {
	}

	public static Long getOrderNo() {
		return Long.valueOf(DateUtil.format(new Date(), Constants.DATE.YYYYMMDDHHMMSS) + RandomUtil.randomNumbers(3));
	}

	public static Long getSerialNumber() {
		return Long.valueOf(DateUtil.format(new Date(), Constants.DATE.YYYYMMDDHHMMSS) + RandomUtil.randomNumbers(4));
	}

	public static Long getUserNo() {
		return Long.valueOf(DateUtil.format(new Date(), Constants.DATE.YYYYMMDDHHMMSS) + RandomUtil.randomNumbers(2));
	}

}
