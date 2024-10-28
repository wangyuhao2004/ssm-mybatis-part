package com.wang.mapper;

import com.wang.pojo.Customer;
import com.wang.pojo.Order;

import java.util.List;

/**
 * descriptions: 客户方法
 *
 * @Author: 王玉豪
 * @Date: 2024/10/27 15:33
 */

public interface CustomerMapper {

    /**
     * 查询所有客户的信息以及客户的订单信息
     * @return list集合
     */
    List<Customer> queryList();
}
