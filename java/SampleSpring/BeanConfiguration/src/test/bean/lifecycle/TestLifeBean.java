package test.bean.lifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import test.bean.base.BaseUnitTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestLifeBean extends BaseUnitTest
{
    public TestLifeBean()
    {
        super("classpath*:resource/spring-lifecycle.xml");
    }
    
    @Test
    public void testLifeCycle()
    {
        super.getBean("lifecycle");
    }
}
