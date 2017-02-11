package test.bean.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.bean.bean.EMusic;

import test.bean.base.BaseUnitTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBean extends BaseUnitTest
{
    public TestBean()
    {
        super("classpath*:resource/spring-bean.xml");
    }
    
    @Test
    public void testAutowired()
    {
        EMusic eMusic = super.getBean("music");
        eMusic.play("fa er");
    }
}
