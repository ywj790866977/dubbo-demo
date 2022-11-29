package com.qxnw.dubbo.provide;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ProvideApplication
 *
 * @author yanwenjie
 * @date 2022/11/28 16:55
 */
@EnableDubbo
@SpringBootApplication
@EnableDiscoveryClient
public class ProvideApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProvideApplication.class);
    }
}
