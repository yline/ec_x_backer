package com.bean.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 名称必须和 config.properties中一模一样
 * @author YLine
 *
 * 2017年2月14日 上午12:33:49
 */
@Configuration
@ImportResource("classpath:resource/config.xml")
public class AppConfig
{
    @Value("${url}")
    private String url;
    
    @Value("${jdbc.username}")
    private String username;
    
    @Value("${password}")
    private String password;
    
    @Bean(name = "driverManagerBean")
    public DriverManagerBean driverManagerBean()
    {
        System.out.println("driverManagerBean start");
        return new DriverManagerBean(url, username, password);
    }
}
