package com.alipay.orderservice.service;

import com.alipay.orderservice.entity.OrdertDO;
import java.util.Date;
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
public class OrderServiceTest {

  @Autowired
  private OrderService orderService;

  @Test
  public void createOrder() {
    OrdertDO ordertDO = new OrdertDO();
    ordertDO.setOrderName("test-order-05");
    ordertDO.setCreateTime(new Date());
    orderService.createOrder(ordertDO);
  }
}