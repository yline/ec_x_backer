package test.bean.genericitywired;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.bean.genericitywired.ClothService;

import test.bean.base.BaseUnitTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestGenericityWired extends BaseUnitTest
{
    public TestGenericityWired()
    {
        super("classpath*:resource/spring-genericity-wired.xml");
    }
    
    @Test
    public void testGenericity()
    {
        ClothService service = super.getBean("clothService");
        service.log("yline");
    }
}
