package com.emergon.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class [] array = {MyWebAppConfig.class};
        return array;
        //return new Class [] {MyWebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String [] {"/"};
    }
    
}
