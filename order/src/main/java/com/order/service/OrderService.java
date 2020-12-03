package com.order.service;

import com.order.entity.Orders;

/**
 * Created with IntelliJ IDEA.
 *
 * @author gaohu9712@163.com
 * @date 2020/12/3
 * @description
 */
public interface OrderService {
    // 创建订单
    void create(Orders orders);
}
