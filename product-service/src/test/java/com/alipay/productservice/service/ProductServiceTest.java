package com.alipay.productservice.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wangte
 * @date 2021/04/04
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

  @Autowired
  private ProductService productService;

  @Test
  public void deduct() {
    productService.deduct();
  }
}