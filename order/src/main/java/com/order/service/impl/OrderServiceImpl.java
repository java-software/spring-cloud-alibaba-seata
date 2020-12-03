package com.order.service.impl;

import com.order.dao.OrderDao;
import com.order.entity.Orders;
import com.order.service.AccountService;
import com.order.service.OrderService;
import com.order.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author gaohu9712@163.com
 * @date 2020/12/3
 * @description
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Resource
    private AccountService accountService;

    @Resource
    private StorageService storageService;

    @Override
    @GlobalTransactional
    public void create(Orders orders) {
        log.info("###### 开始创建订单 ######");
        orders.setFlag(false);
        Orders save = orderDao.save(orders);
        log.info("###### 结束创建订单 ######");

        log.info("###### 开始减库存 ######");
        storageService.deduct(save.getProductId(), save.getProductNum());
        log.info("###### 结束减库存 ######");

        log.info("###### 开始减余额 ######");
        accountService.debit(save.getUserId(), save.getProductPrice());
        log.info("###### 结束减余额 ######");

        log.info("###### 开始修改订单状态 ######");
        save.setFlag(true);
        orderDao.save(save);
        log.info("###### 结束修改订单状态 ######");
    }
}
