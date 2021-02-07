package com.lzh.springboot05webrestfulcrud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor

public class Employee {
    private Integer id ;
    private String lastName ;
    private String email ;
    private Integer gender ;
    private Department   department ;
    private Date birth ;


    // 自定义有参构造   --- >  constructor   自己生成时间日期
    public Employee(Integer id, String lastName, String email, Integer gender, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.birth = new Date();
    }
}
