package com.alipay.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Product Service
 *
 * @author yixia.wt
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories
public class ProductServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProductServiceApplication.class, args);
  }

}
