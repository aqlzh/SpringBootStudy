package com.lzh.springboot05webrestfulcrud.controller;

import com.lzh.springboot05webrestfulcrud.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloControlller {

//    @RequestMapping({"/","index.html"})
//    public String index(){
//        return "index" ;
//    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user){
        if(user.equals("aaa")){
            throw  new UserNotExistException() ;
        }
        return "Hello World" ;
    }


    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("zs","ls","ww")) ;
        return "success" ;
    }

}
