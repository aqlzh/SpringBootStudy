package com.lzh.springboot01quickhello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
//@ResponseBody
public class HelloController {

   // @ResponseBody   // 将数据写给浏览器，方法返回的数据直接写给浏览器，（如果是对象转为json数据）
    @RequestMapping("/hello")
     public String hello(){
         return  "hello world quick" ;
     }

}
