package com.bean.autowiring;

public class AutoService
{
    private AutoDAO autoDAO;
    
    public void setAutoDAO(AutoDAO autoDAO)
    {
        this.autoDAO = autoDAO;
    }
    
    public void hello(String str)
    {
        System.out.println("AutoService -> " + str);
        autoDAO.hello(str);
    }
}
