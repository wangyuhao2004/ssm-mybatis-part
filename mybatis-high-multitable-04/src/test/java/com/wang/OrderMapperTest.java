package com.wang;

import com.wang.mapper.CustomerMapper;
import com.wang.mapper.OrderMapper;
import com.wang.pojo.Customer;
import com.wang.pojo.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * descriptions:
 *
 * @Author: 王玉豪
 * @Date: 2024/10/26 22:15
 */

public class OrderMapperTest {

    @Test
    public void test_01() throws IOException {
        InputStream isp = Resources.getResourceAsStream("mybatis-config.xml");

        //根据配置文件创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(isp);

        //创建SqlSession对象,开启事务自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        Order order = mapper.selectOrderWithCustomer(1);
        System.out.println(order);
    }

    @Test
    public void test_02() throws IOException {
        InputStream isp = Resources.getResourceAsStream("mybatis-config.xml");

        //根据配置文件创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(isp);

        //创建SqlSession对象,开启事务自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);

        List<Customer> customers = mapper.queryList();
        System.out.println(customers);

        for (Customer customer : customers) {
            List<Order> orderList = customer.getOrderList();
            System.out.println(orderList);
        }
    }
}
