package com.bean.jsr;

import org.springframework.stereotype.Repository;

@Repository
public class JsrDAO
{
    public void save(String content)
    {
        System.out.println("JsrDAO save -> " + content);
    }
}
