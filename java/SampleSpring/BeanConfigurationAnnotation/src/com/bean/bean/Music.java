package com.bean.bean;

public class Music extends EMusic
{
    
    public void init()
    {
        System.out.println("Music -> init");
    }
    
    @Override
    public void play(String content)
    {
        System.out.println("Music -> " + content);
    }
    
    public void destroy()
    {
        System.out.println("Music -> destroy");
    }
}
