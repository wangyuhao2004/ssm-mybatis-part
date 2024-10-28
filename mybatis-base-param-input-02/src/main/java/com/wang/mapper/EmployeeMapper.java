package com.wang.mapper;

import com.wang.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
   * descriptions: 定义方法信息
   * @Author: 王玉豪
   * @Date: 2024/10/23 15:57
*/

public interface EmployeeMapper {

    /**
     * 根据id查询员工信息
     * @param id 员工id
     * @return 封装后的员工信息
     */
    Employee queryById(Integer id);

    /**
     * 根据id删除员工信息
     * @param id 员工id
     * @return 受影响的行数
     */
    int deleteById(Integer id);

    /**
     * 插入员工信息
     * @param employee 封装好的员工信息对应的实体类
     * @return 受影响的行数
     */
    int insertEmp(Employee employee);

    /**
     * 根据员工姓名和工资查询员工信息
     * @param name 员工姓名
     * @param salary 员工工资
     * @return 封装后的员工信息的集合
     */
    List<Employee> queryByNameAndSalary(@Param("name") String name, @Param("salary") Double salary);
}
