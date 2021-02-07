package com.lzh.springboot05webrestfulcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/","/index.html"})
    public String index(){
        return "index" ;
    }
}
