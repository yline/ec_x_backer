package com.bean.genericitywired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GenericityWiredConfig
{
    @Bean
    public SmallCloth smallCloth()
    {
        return new SmallCloth();
    }
    
    @Bean
    public BigCloth bigCloth()
    {
        return new BigCloth();
    }
    
    @Bean
    public SmallCloth bigClothNew()
    {
        return new SmallCloth();
    }
}
