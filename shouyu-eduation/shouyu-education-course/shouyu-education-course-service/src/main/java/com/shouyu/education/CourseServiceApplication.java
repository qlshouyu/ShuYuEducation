/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.spring4all.swagger.EnableSwagger2Doc;

/**
 * 课程服务
 * 
 * @author wujing
 */
@EnableSwagger2Doc
@EnableFeignClients
@ServletComponentScan
@SpringCloudApplication
public class CourseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseServiceApplication.class, args);
	}

}
