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
import java.util.List;

/**
   * descriptions: 
   * @Author: 王玉豪
   * @Date: 2024/10/23 14:32
*/

public class MybatisTest {

    @Test
    public void test_01() throws IOException {

        //读取配置文件
        InputStream ips = Resources.getResourceAsStream("mybatis-config.xml");

        //根据配置文件创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);

        //获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取mapper代理对象
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        //查询方法
        //Employee employee = mapper.queryById(1);

        //删除方法
        //mapper.deleteById(2);

        //插入方法
        //mapper.insertEmp(new Employee(null,"wangyuhao",345.45));

        //根据员工姓名和工资查询员工信息
        List<Employee> employeeList = mapper.queryByNameAndSalary("wangyuhao", 345.45);
        System.out.println(employeeList);

        //System.out.println("employee:" + employee);

        //管理资源/提交事务
            //todo:查询语句不需要提交事务,增删改操作需要提交事务
        sqlSession.commit();
        sqlSession.close();


    }
}
