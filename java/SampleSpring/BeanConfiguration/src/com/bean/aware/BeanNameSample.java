package com.bean.aware;

import org.springframework.beans.factory.BeanNameAware;

/**
 * 该接口在 类加载的时候,就会调用一次了;而不用等待被调用
 * @author YLine
 *
 * 2017年2月10日 下午5:28:29
 */
public class BeanNameSample implements BeanNameAware
{
    
    @Override
    public void setBeanName(String name)
    {
        System.out.println("BeanNameSample name = " + name);
    }
    
}
