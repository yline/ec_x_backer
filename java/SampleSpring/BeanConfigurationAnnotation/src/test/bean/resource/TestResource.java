package test.bean.resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import test.bean.base.BaseUnitTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestResource extends BaseUnitTest
{
    public TestResource()
    {
        super("classpath*:resource/spring-resource.xml");
    }
    
    @Test
    public void testResource()
    {
        super.getBean("driverManagerBean");
        // DriverManagerBean driverManagerBean = super.getBean("driverManagerBean");
    }
}
