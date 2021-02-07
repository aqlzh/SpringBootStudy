package com.lzh.springboot05webrestfulcrud.config;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {

    // 解析请求
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
//获取请求中语言参数
        String language = httpServletRequest.getParameter("1") ;
        Locale locale = Locale.getDefault();  // 如果没有使用默认

        // 如果请求链接带有国际化参数
        if(!StringUtils.isEmpty(language)){
            //zh_CN
            String[] split = language.split("_") ;
            // 国家 地区
            locale = new Locale(split[0],split[1]) ;
        }


        return   locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
