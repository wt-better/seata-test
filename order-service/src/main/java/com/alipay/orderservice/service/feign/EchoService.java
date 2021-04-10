package com.alipay.orderservice.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yi.xia
 * @date Create At 2021/4/4
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc"})
@FeignClient(value = "product-service", path = "/api/echo")
public interface EchoService {

  @GetMapping
  String echo();
}
