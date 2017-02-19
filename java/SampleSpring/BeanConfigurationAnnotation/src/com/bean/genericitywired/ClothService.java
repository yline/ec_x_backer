package com.bean.genericitywired;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClothService
{
    @Autowired
    private ICloth<String> bigCloth;
    
    @Autowired
    private ICloth<Integer> smallCloth; // 父类会依据 类型选择 子类
    
    @Autowired
    private List<ICloth<Integer>> list; // 只要返回类型符合 ICloth<Integer> 就加载到这个类中
    
    public void log(String name)
    {
        bigCloth.dress(name);
        smallCloth.dress(34);
        
        for (int i = 0; i < list.size(); i++)
        {
            list.get(i).dress(i);
        }
    }
}
