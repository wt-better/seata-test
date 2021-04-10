package com.alipay.orderservice.service.impl;

import com.alipay.orderservice.entity.OrdertDO;
import com.alipay.orderservice.repository.OrderRepository;
import com.alipay.orderservice.service.OrderService;
import com.alipay.orderservice.service.feign.ProductService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yi.xia
 * @date Create At 2021/4/4
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
@Service
public class OrderServiceImpl implements OrderService {

  @Autowired
  private OrderRepository orderRepository;

  @Autowired
  private ProductService productService;

  @Override
  @GlobalTransactional
  public void createOrder(OrdertDO ordertDO) {
    orderRepository.save(ordertDO);

    productService.deduct();
  }
}
