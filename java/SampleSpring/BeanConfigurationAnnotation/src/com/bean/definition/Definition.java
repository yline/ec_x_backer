package com.bean.definition;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Definition
{
    public void hello(String str)
    {
        System.out.println("Definition str = " + str + ",hasCode = " + this.hashCode());
    }
}
