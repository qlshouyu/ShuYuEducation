/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.tools;

import java.util.Arrays;
import java.util.List;

/**
 * @author 高露
 */
public final class EnumUtil {

	private EnumUtil() {
	}

	public static <T extends Enum<?>> List<T> toList(Class<T> clazz) {
		return Arrays.asList(clazz.getEnumConstants());
	}

	public static <T extends Enum<?>> T getEnum(Object name, Class<T> clazz) {
		List<T> list = toList(clazz);
		for (T t : list) {
			if (t.name().equals(name)) {
				return t;
			}
		}
		return null;
	}

}
