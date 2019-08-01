/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.util.enums;

/**
 * 状态码描述
 * 
 * @author hugovon
 * @version 1.0
 */
public enum PayProductTypeEnum {

    WEIXIN_T1("10000101", "微信T1扫码支付"), ZHIFUBAO_T1("20000301", "支付宝T1扫码支付");

    private String code;

    private String desc;

    private PayProductTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
