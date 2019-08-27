package com.shouyu.education.course.common.bean.vo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 数据字典明细表
 *
 * @author 高露
 */
@Data
@Accessors(chain = true)
public class DicListVO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private Long id;
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	/**
	 * 修改时间
	 */
	private Date gmtModified;
	/**
	 * 状态(1:正常，0:禁用)
	 */
	private Integer statusId;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 字段ID
	 */
	private Long fieldId;
	/**
	 * 字段KEY
	 */
	private String fieldKey;
	/**
	 * 字段VALUE
	 */
	private String fieldValue;

}
