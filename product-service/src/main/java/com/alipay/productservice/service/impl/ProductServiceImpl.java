package com.alipay.productservice.service.impl;

import com.alipay.productservice.repository.ProductReposity;
import com.alipay.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yi.xia
 * @date Create At 2021/4/4
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductReposity productReposity;

  @Override
  public void deduct() {
    productReposity.deduct();
  }
}
