package com.lzh.springboot07data_mybatis.mapper;

import com.lzh.springboot07data_mybatis.bean.Employee;

//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
