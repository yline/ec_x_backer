package com.bean.autowired.qualifier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.bean.autowired.array.IArray;

@Component
public class QualifierImpl
{
    @Qualifier("arrayOneImpl") // 过滤到只剩下ArrayOneImpl类
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
