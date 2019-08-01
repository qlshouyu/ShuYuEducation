/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.course.service.common.bo;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 订单异步通知
 * 
 * @author forest
 */
@Data
@Accessors(chain = true)
public class OrderInfoPayNotifyBO implements Serializable {

    private static final long serialVersionUID = 1L;

    private long serialNumber;


    private int orderStatus;

}
