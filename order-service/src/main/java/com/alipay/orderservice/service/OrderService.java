package com.alipay.orderservice.service;

import com.alipay.orderservice.entity.OrdertDO;

/**
 * @author yi.xia
 * @date Create At 2021/4/4
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "unused"})
public interface OrderService {

  void createOrder(OrdertDO ordertDO);
}
