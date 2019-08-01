/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * boss工程
 * 
 * @author wujing
 */
@EnableFeignClients
@ServletComponentScan
@SpringCloudApplication
public class WebBossApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebBossApplication.class, args);
	}

}
