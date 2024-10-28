package com.wang.mapper;

import com.wang.pojo.Employee;

/**
 * projectName: com.wang.mapper
 *
 * @Author: 王玉豪
 * @Date: 2024/10/22 18:43
 * @descriptions: 规定数据库方法即可
 */

public interface EmployeeMapper {

    /**
     * 根据id查询员工信息
     * @param id
     * @return 返回Employee对象
     */
    Employee queryById(Integer id);
}
