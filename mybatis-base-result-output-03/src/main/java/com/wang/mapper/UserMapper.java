package com.wang.mapper;

import com.wang.pojo.User;

import java.util.List;

public interface UserMapper {

  /**
   * 增加用户
   * @param user 封装后的用户信息
   * @return 受影响的行数
   */
  int insertUser(User user);

  /**
   * 根据id修改用户信息
   * @param user 封装修改后的用户信息,传入数据库
   * @return 受影响的行数
   */
  int updateUserById(User user);

  /**
   * 根据id删除用户信息
   * @param id 用户id
   * @return 受影响的行数
   */
  int deleteUserById(Integer id);

  /**
   * 根据id查询用户信息
   * @param id 用户id
   * @return 封装后的用户信息对应的实体类
   */
  User selectUserById(Integer id);

  /**
   * 查询全部用户信息
   * @return list集合
   */
  List<User> selectAll();
}