package com.alipay.productservice.repository;

import com.alipay.productservice.entity.ProductDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @author yi.xia
 * @date Create At 2021/4/4
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
@SuppressWarnings({"unused", "AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc"})
public interface ProductReposity extends JpaRepository<ProductDO, Long> {

  @Modifying(clearAutomatically = true)
  @Query(value = "update product_tbl set productStock =  productStock - 1")
  void deduct();
}
