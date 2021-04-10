package com.alipay.productservice.controller;

import com.alipay.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yi.xia
 * @date Create At 2021/4/3
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
@RestController
@RequestMapping("/api/product")
public class ProductController {

  @Autowired
  private ProductService productService;

  @PostMapping
  public String deduct() {
    productService.deduct();
    return "deduct success";
  }
}
