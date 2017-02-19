package com.bean.genericitywired;

public class SmallCloth implements ICloth<Integer>
{
    
    @Override
    public void dress(Integer size)
    {
        System.out.println("SmallCloth size is " + size);
    }
    
}
