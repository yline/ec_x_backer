package com.bean.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 该接口在 类加载的时候,就会调用一次了;而不用等待被调用
 * @author YLine
 *
 * 2017年2月10日 下午5:27:59
 */
public class ApplicationContextSample implements ApplicationContextAware
{
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
        throws BeansException
    {
        System.out.println("ApplicationContextSample hascode = " + applicationContext.hashCode());
    }
    
}
