package com.alipay.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yi.xia
 * @date Create At 2021/4/3
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
@RestController
@RequestMapping("/api/order")
public class OrderController {

  @GetMapping
  public String createOrder() {
    return "ok!";
  }
}
