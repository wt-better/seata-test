package com.alipay.orderservice.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * https://blog.csdn.net/u012211603/article/details/84312709
 * <pre>
 * spring.main.allow-bean-definition-overriding:true
 * </pre>
 *
 * @author yi.xia
 * @date Create At 2021/4/4
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
@SuppressWarnings({"unused", "AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc"})
@FeignClient(value = "product-service", path = "/api/product")
public interface ProductService {

  @PostMapping
  void deduct();
}
