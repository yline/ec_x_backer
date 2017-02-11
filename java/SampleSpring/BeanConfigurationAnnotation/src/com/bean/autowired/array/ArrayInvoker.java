package com.bean.autowired.array;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArrayInvoker
{
    @Autowired
    private List<IArray> list;
    
    public void hello(String content)
    {
        if (null != list)
        {
            for (IArray iArray : list)
            {
                iArray.hello(content);
            }
        }
        else
        {
            System.out.println("ArrayInvoker list is null");
        }
        
    }
}
