package com.order.dao;

import com.order.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created with IntelliJ IDEA.
 *
 * @author gaohu9712@163.com
 * @date 2020/12/3
 * @description
 */
public interface OrderDao extends JpaRepository<Orders, Long>, JpaSpecificationExecutor<Orders> {
}
