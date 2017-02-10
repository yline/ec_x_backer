package test.bean.aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import test.bean.base.BaseUnitTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends BaseUnitTest
{
    public TestAware()
    {
        super("classpath*:resource/spring-aware.xml");
    }
    
    @Test
    public void testApplicationContextAware()
    {
        //super.getBean("awareApplicationContext");
    }
    
    @Test
    public void testBeanNameAware()
    {
        //super.getBean("awareBeanName");
    }
}
