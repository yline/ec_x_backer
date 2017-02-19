package com.bean.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class JsrService
{
    @Resource
    private JsrDAO jsrDAO;
    
    /* 作用同上
    @Resource
    public void setJsrDAO(JsrDAO jsrDAO)
    {
        this.jsrDAO = jsrDAO;
    }
    */
    
    @PostConstruct
    public void postConstruct()
    {
        System.out.println("JsrService postConstruct");
    }
    
    @PreDestroy
    public void preDestroy()
    {
        System.out.println("JsrService postConstruct");
    }
    
    public void deal(String content)
    {
        System.out.println("JsrService deal -> " + content);
        jsrDAO.save(content);
    }
}
