package com.order.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author gaohu9712@163.com
 * @date 2020/12/3
 * @description 订单实体类
 */
@Data
@Entity
public class Orders implements Serializable {

    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    // 购买用户
    private Long userId;

    // 商品 id
    private Long productId;

    // 商品价格
    private Integer productPrice;

    // 商品数量
    private Integer productNum;

    // 是否付款
    private Boolean flag;
}
