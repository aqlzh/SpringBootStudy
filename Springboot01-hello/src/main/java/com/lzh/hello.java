package com.lzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class hello {

    public static void main(String[] args) {

        // Spring应用启动起来
        SpringApplication.run(hello.class,args);
    }
}
