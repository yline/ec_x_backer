package com.bean.genericitywired;

public class BigCloth implements ICloth<String>
{
    
    @Override
    public void dress(String personName)
    {
        System.out.println("BigCloth is dressed by " + personName);
    }
    
}
