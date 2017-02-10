package test.bean.autowiring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.bean.autowiring.AutoService;

import test.bean.base.BaseUnitTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutoWiring extends BaseUnitTest
{
    public TestAutoWiring()
    {
        super("classpath*:resource/spring-autowiring.xml");
    }
    
    @Test
    public void testAutoWiring()
    {
        AutoService autoService = super.getBean("autoService");
        autoService.hello("world");
    }
}
