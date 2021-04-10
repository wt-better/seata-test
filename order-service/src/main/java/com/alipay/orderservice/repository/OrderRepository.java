package com.alipay.orderservice.repository;

import com.alipay.orderservice.entity.OrdertDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yi.xia
 * @date Create At 2021/4/4
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
public interface OrderRepository extends JpaRepository<OrdertDO, Long> {

}
