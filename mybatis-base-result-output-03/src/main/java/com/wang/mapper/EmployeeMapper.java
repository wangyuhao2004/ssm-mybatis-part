package com.wang.mapper;

import com.wang.pojo.Employee;
import org.apache.ibatis.annotations.Insert;

import java.util.Map;

/**
 * descriptions:
 *
 * @Author: 王玉豪
 * @Date: 2024/10/23 17:15
 */

public interface EmployeeMapper {

    /**
     * 根据id查询员工信息
     * @param id 员工id
     * @return 受影响的行数
     */
    Employee queryById(Integer id);

    /**
     * 查询工资高与平均工资的员工姓名
     * @return map集合
     */
    Map<String,Double> selectEmpNameAndMaxSalary();

    /**
     * 员工插入(主键回显)
     * @param employee
     * @return
     */
    int insertEmp(Employee employee);



}
