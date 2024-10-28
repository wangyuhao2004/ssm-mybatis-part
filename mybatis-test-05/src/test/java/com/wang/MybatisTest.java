package com.wang;

import com.wang.mapper.CategoryMapper;
import com.wang.pojo.Category;
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
 * @Date: 2024/10/27 17:54
 */

public class MybatisTest {

    @Test
    public void test_01() throws IOException {
        InputStream isp = Resources.getResourceAsStream("mybatis-config.xml");

        //根据配置文件创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(isp);

        //创建SqlSession对象,开启事务自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        CategoryMapper mapper = sqlSession.getMapper(CategoryMapper.class);
        Category category = mapper.findProductsByTypename("白色家电");
        System.out.println(category);

    }
}
