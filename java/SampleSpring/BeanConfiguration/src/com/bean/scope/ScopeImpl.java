package com.bean.scope;

public class ScopeImpl
{
    public int hello()
    {
        System.out.println("content = " + this.hashCode());
        return this.hashCode();
    }
}
