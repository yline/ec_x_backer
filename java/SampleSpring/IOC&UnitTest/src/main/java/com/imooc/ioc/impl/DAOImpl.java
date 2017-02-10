package main.java.com.imooc.ioc.impl;

import main.java.com.imooc.ioc.injection.IDAO;

public class DAOImpl implements IDAO
{
    
    @Override
    public void save(String arg)
    {
        System.out.println("模拟数据保存：" + arg);
    }
    
}
