package com.bean.autowired.array;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2) // @Order list 会排序，而map不会自动排序
@Component
public class ArrayTwoImpl implements IArray
{
    
    @Override
    public void hello(String content)
    {
        System.out.println("ArrayTwoImpl -> " + content);
    }
}
