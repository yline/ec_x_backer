package test.bean.array;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.bean.autowired.array.ArrayInvoker;

import test.bean.base.BaseUnitTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutowiredArray extends BaseUnitTest
{
    public TestAutowiredArray()
    {
        super("classpath*:resource/spring-autowired.xml");
    }
    
    @Test
    public void testAutowiredArray()
    {
        ArrayInvoker arrayInvoker = super.getBean("arrayInvoker");
        arrayInvoker.hello("invoker");
    }
}
