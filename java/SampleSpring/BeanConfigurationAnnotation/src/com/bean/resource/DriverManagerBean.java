package com.bean.resource;

public class DriverManagerBean
{
    private String url;
    
    private String username;
    
    private String password;
    
    public DriverManagerBean(String url, String username, String password)
    {
        super();
        this.url = url;
        this.username = username;
        this.password = password;
        
        System.out.println(this.toString());
    }
    
    public String getUrl()
    {
        return url;
    }
    
    public void setUrl(String url)
    {
        this.url = url;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    @Override
    public String toString()
    {
        return "DriverManagerBean [url=" + url + ", username=" + username + ", password=" + password + "]";
    }
}
