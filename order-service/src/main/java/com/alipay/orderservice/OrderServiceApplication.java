package com.alipay.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <pre>
 * 	order service stater
 * </pre>
 * EnableDiscoveryClient:nacos service discovery EnableFeignClients:feign
 *
 * @author yixia.wt
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableJpaRepositories
@EnableTransactionManagement
public class OrderServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(OrderServiceApplication.class, args);
  }

}
