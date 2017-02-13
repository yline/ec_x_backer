package com.bean.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Config
{
    @Bean(name = "music", initMethod = "init", destroyMethod = "destroy")
    public EMusic setPlayFormat()
    {
        System.out.println("music start");
        return new Music();
    }
}
