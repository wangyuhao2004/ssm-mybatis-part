package com.wang.mapper;

import com.wang.pojo.Order;

/**
 * descriptions:订单方法
 *
 * @Author: 王玉豪
 * @Date: 2024/10/26 18:34
 */

public interface OrderMapper {

    /**
     * 根据ID查询订单，以及订单关联的用户的信息！
     * @param orderId 订单id
     * @return 封装后的信息
     */
    Order selectOrderWithCustomer(Integer orderId);
}
