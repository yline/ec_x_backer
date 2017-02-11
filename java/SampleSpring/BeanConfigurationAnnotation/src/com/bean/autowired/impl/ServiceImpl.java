package com.bean.autowired.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.autowired.injection.IDAO;
import com.bean.autowired.injection.IService;

@Service
public class ServiceImpl implements IService
{
    // @Autowired 和构造器 效果一样
    private IDAO iDAO;
    
    @Autowired
    public ServiceImpl(IDAO iDAO)
    {
        this.iDAO = iDAO;
    }
    
    // @Autowired  和构造器 效果一样
    public void setiDAO(IDAO iDAO)
    {
        this.iDAO = iDAO;
    }
    
    @Override
    public void save(String content)
    {
        System.out.println("ServiceImpl -> " + content);
        iDAO.save(content);
    }
    
}
