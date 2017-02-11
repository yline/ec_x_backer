package com.bean.autowired.impl;

import org.springframework.stereotype.Repository;

import com.bean.autowired.injection.IDAO;

@Repository
public class DAOImpl implements IDAO
{
    
    @Override
    public void save(String content)
    {
        System.out.println("DAOImpl -> " + content);
    }
    
}
