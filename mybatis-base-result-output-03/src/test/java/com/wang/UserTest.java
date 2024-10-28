package com.wang;

import com.wang.mapper.UserMapper;
import com.wang.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * descriptions: UserMapper接口测试类
 *
 * @Author: 王玉豪
 * @Date: 2024/10/26 16:11
 */

public class UserTest {

    @Test
    public void test_01() throws IOException {

        //读取配置文件
        InputStream isp = Resources.getResourceAsStream("mybatis-config.xml");

        //根据配置文件创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(isp);

        //创建SqlSession对象,开启事务自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //获取代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //mapper.insertUser(new User(null,"wang","123456"));
        //mapper.insertUser(new User(null,"zhao","123456"));

        //mapper.deleteUserById(2);

        //mapper.updateUserById(new User(3,"li","88888888"));

        //User user = mapper.selectUserById(3);
        //System.out.println(user);

        //List<User> users = mapper.selectAll();
        //System.out.println(users);

        sqlSession.close();
    }
}
