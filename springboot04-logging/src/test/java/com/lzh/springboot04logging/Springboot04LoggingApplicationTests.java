package com.lzh.springboot04logging;

//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.junit.platform.commons.logging.Logger;
//import org.apache.log4j.Logger;
//import org.junit.platform.commons.logging.Logger;
//import org.junit.platform.commons.logging.LoggerFactory;
//import org.springframework.boot.test.context.SpringBootTest;


import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.jupiter.api.Test;


@RunWith(SpringRunner.class)
@SpringBootTest
class Springboot04LoggingApplicationTests {


    //记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {

        logger.trace("这是trace日志...");
        logger.debug("这是debug日志...");
        //SpringBoot默认级别
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");

    }
}
