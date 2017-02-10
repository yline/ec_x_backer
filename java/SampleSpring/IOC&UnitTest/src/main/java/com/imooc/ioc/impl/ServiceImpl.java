package main.java.com.imooc.ioc.impl;

import main.java.com.imooc.ioc.injection.IDAO;
import main.java.com.imooc.ioc.injection.IService;

public class ServiceImpl implements IService
{
    private IDAO iDAO;
    
    // 构造器注入
    public ServiceImpl(IDAO iDAO)
    {
        super();
        this.iDAO = iDAO;
    }
    
    // 设置注入
    public void setiDAO(IDAO iDAO)
    {
        this.iDAO = iDAO;
    }
    
    @Override
    public void save(String arg)
    {
        System.out.println("Service 接收参数 " + arg);
        arg = arg + (":" + this.hashCode());
        
        iDAO.save(arg);
    }
}
