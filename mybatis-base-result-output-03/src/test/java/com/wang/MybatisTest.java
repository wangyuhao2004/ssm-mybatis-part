package com.wang;

import com.wang.mapper.EmployeeMapper;
import com.wang.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;

/**
 * descriptions:
 *
 * @Author: 王玉豪
 * @Date: 2024/10/23 17:51
 */

public class MybatisTest {

    @Test
    public void test_01() throws IOException {
        //读取配置文件
        InputStream isp = Resources.getResourceAsStream("mybatis-config.xml");

        //根据配置文件创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(isp);

        //创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取代理对象
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        //Employee employee = mapper.queryById(1);
        //System.out.println(employee);
        Map<String, Double> map = mapper.selectEmpNameAndMaxSalary();
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println(entry.getKey() +":" + entry.getValue());
        }

        //管理连接
        sqlSession.close();
    }

    @Test
    public void test_02() throws IOException {

        InputStream isp = Resources.getResourceAsStream("mybatis-config.xml");

        //根据配置文件创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(isp);

        //创建SqlSession对象,开启事务自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //获取代理对象
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        Employee employee = new Employee();
        employee.setEmpName("wangyue");
        employee.setEmpSalary(345.67);
        mapper.insertEmp(employee);
        System.out.println(employee.getEmpId());


        sqlSession.close();

    }
}
