package test.java.com.imooc.test.base;

import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class BaseUnitTest
{
    private ClassPathXmlApplicationContext context;
    
    private String springXmlPath;
    
    public BaseUnitTest()
    {
    }
    
    public BaseUnitTest(String springXmlPath)
    {
        this.springXmlPath = springXmlPath;
    }
    
    @Before
    public void before()
    {
        if (StringUtils.isEmpty(springXmlPath))
        {
            springXmlPath = "classpath*:spring-*.xml";
        }
        
        try
        {
            context = new ClassPathXmlApplicationContext();
            context.start();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
