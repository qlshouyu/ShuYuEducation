/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 定时任务
 */
@EnableScheduling
@EnableFeignClients
@SpringCloudApplication
public class CrontabPlanApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrontabPlanApplication.class, args);
    }

}
