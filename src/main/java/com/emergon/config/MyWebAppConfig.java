package com.emergon.config;

import com.emergon.controller.HomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.emergon")        
class MyWebAppConfig implements WebMvcConfigurer{
    //web.xml: Declare Dispatcher Servlet 
    /*
    <initParam>
        <paramName>contextConfigLocation</paramName>
        <paramValue>WEB-INF/dispatcher-servlet.xml</paramValue>
    </initParam>
    */
    
}
