/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.polyv;

import java.io.Serializable;

public class PolyvCode implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long userNo;

	private Long periodNo;

	public Long getUserNo() {
		return userNo;
	}

	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}

	public Long getPeriodNo() {
		return periodNo;
	}

	public void setPeriodNo(Long periodNo) {
		this.periodNo = periodNo;
	}

}
