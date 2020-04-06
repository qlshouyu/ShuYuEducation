/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.polyv;

import java.io.Serializable;

/**
 * @author lyq
 **/
public class QuestionResult implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 错误码 0为成功 ，其他为失败
	 */
	private String error;

	/**
	 * 问题id
	 */
	private String examId;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getExamId() {
		return examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
	}

}