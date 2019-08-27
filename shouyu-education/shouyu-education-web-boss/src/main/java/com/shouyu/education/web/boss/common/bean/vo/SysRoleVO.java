/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.web.boss.common.bean.vo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 角色信息
 * </p>
 *
 * @author 高露123
 * @since 2018-01-29
 */
@Data
@Accessors(chain = true)
public class SysRoleVO implements Serializable {

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
     * 状态(0:无效,1:有效)
     */
    private Integer statusId;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 名称
     */
    private String roleName;
    /**
     * 备注
     */
    private String remark;

    private int isShow;

}
