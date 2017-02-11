package test.bean.autowired;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.bean.autowired.injection.IService;

import test.bean.base.BaseUnitTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutowired extends BaseUnitTest
{
    public TestAutowired()
    {
        super("classpath*:resource/spring-autowired.xml");
    }
    
    @Test
    public void testAutowired()
    {
        IService iService = super.getBean("serviceImpl");
        iService.save("autowired");
    }
}
