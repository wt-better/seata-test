package com.alipay.orderservice.controller;

import com.alipay.orderservice.service.feign.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yi.xia
 * @date Create At 2021/4/4
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
@RestController
@RequestMapping("/api/test")
public class EchoController {

  @Autowired
  private EchoService echoService;

  @GetMapping
  public String echo() {
    return echoService.echo();
  }

}
