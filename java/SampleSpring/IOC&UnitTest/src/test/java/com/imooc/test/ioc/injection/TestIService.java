package test.java.com.imooc.test.ioc.injection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import main.java.com.imooc.ioc.injection.IService;
import test.java.com.imooc.test.base.BaseUnitTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestIService extends BaseUnitTest
{
    public TestIService()
    {
        super("classpath*:/main/resources/spring-injection.xml");
    }
    
    @Test
    public void test()
    {
        IService iService = super.getBean("twoInterface");
        iService.save("Service Data");
    }
}
