package com.eg.fcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: CAOPING
 * @Date: 2021/2/2 09:39
 * @Description:
 */

@SpringBootApplication
@EnableEurekaClient
public class GatewayAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayAdminApplication.class, args);
    }

}
