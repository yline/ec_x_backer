package com.bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeBean implements InitializingBean, DisposableBean
{
    public void init()
    {
        System.out.println("xml 全局  init");
    }
    
    public void finish()
    {
        System.out.println("xml 全局  finish");
    }
    
    public void start()
    {
        System.out.println("xml 单条  start");
    }
    
    public void stop()
    {
        System.out.println("xml 单条  stop");
    }
    
    @Override
    public void afterPropertiesSet()
        throws Exception
    {
        System.out.println("java 单条  afterPropertiesSet");
    }
    
    @Override
    public void destroy()
        throws Exception
    {
        System.out.println("java 单条  destroy");
    }
    
}
