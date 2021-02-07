package com.lzh.springboot05webrestfulcrud.config;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@EnableWebMvc   接管SpringMvc  默认静态资源失效
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Bean
    public WebServerFactoryCustomizer webServerFactoryCustomizer() {
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                factory.setPort(8088);
            }
        };

    }

}

//    // ctrl + o 添加方法
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//
//        // 浏览器发送 /lzh 请求到 success
//         registry.addViewController("/lzh").setViewName("success");
//    }


//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("index");
//        registry.addViewController("/index.html").setViewName("index");
//    }
//
//    // 使自定义国际化组件生效
//    @Bean
//    public LocaleResolver localeResolver(){
//        return  new MyLocaleResolver() ;
//    }

