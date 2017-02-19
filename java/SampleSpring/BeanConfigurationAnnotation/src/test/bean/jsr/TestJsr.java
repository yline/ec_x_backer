package test.bean.jsr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.bean.jsr.JsrService;

import test.bean.base.BaseUnitTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJsr extends BaseUnitTest
{
    public TestJsr()
    {
        super("classpath*:resource/spring-jsr.xml");
    }
    
    @Test
    public void test()
    {
        JsrService jsrService = super.getBean("jsrService");
        jsrService.deal("Jsr Sample");
    }
}
