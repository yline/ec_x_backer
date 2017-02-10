package com.bean.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class ResourceImpl implements ApplicationContextAware
{
    private ApplicationContext applicationContext;
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
        throws BeansException
    {
        this.applicationContext = applicationContext;
    }
    
    public void hello()
        throws IOException
    {
        // 默认与 创建 applicationContext的方式一致, 该情况为：classpath:
        Resource resource = applicationContext.getResource("resource/config.txt");
        System.out.println("default");
        System.out.println("filename = " + resource.getFilename());
        System.out.println("contentLength = " + resource.contentLength());
        
        Resource resource2 = applicationContext.getResource("classpath:resource/config.txt");
        System.out.println("classpath");
        System.out.println("filename = " + resource2.getFilename());
        System.out.println("contentLength = " + resource2.contentLength());
    }
}
