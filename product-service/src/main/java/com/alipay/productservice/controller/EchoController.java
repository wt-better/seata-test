package com.alipay.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yi.xia
 * @date Create At 2021/4/4
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
@RestController
@RequestMapping("/api/echo")
public class EchoController {

  @GetMapping
  public String echo() {
    return "health check ok! ";
  }
}
