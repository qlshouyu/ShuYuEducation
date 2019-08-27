/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education;

import com.shouyu.education.gateway.common.FilterPre;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * 服务网关
 * 
 * @author 高露
 */
@EnableZuulProxy
@SpringCloudApplication
public class GatewayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApiApplication.class, args);
	}

	@Bean
	public FilterPre filterPre() {
		return new FilterPre();
	}

}
