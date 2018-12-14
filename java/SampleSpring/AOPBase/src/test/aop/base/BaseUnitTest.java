package test.aop.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * classpath 指的是 SampleSpring/src
 * @author YLine
 *
 * 2017年2月10日 下午12:18:35
 */
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
            // springXmlPath = "classpath*:spring-*.xml";
            springXmlPath = "classpath*:resource/spring-aop-*.xml";
        }
        
        try
        {
            context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
            context.start();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    @After
    public void after()
    {
        context.destroy();
    }
    
    @SuppressWarnings("unchecked")
    protected <T extends Object> T getBean(String beanId)
    {
        return (T)context.getBean(beanId);
    }
    
    protected <T extends Object> T getBean(Class<T> cls)
    {
        return context.getBean(cls);
    }
}
