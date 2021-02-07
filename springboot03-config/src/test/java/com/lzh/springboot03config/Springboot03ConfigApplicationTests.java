package com.lzh.springboot03config;

import com.lzh.springboot03config.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/*
SpringBoot 单元测试  可以再测试期间类似于编码一样进行自动注入
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class Springboot03ConfigApplicationTests {

    @Autowired
    Person person ;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Autowired
    ApplicationContext ioc ;  // 容器
    @Test
    public void testHelloService(){
     boolean  b =  ioc.containsBean("helloService03") ;   // 测试容器中是否有此组件
        System.out.println(b);
    }

}
