package main.java.com.imooc.ioc.interfaces;

public class UnitImpl implements IUnit
{
    
    @Override
    public void hello(String param)
    {
        System.out.println("UnitImpl hello : " + param);
    }
    
}
