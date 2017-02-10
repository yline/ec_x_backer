package test.java.com.imooc.test.ioc.interfaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import main.java.com.imooc.ioc.interfaces.IUnit;
import test.java.com.imooc.test.base.BaseUnitTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestIUnit extends BaseUnitTest
{
    public TestIUnit()
    {
        super("classpath*:/main/resources/spring-ioc.xml");
        // super("classpath*:spring-ioc.xml");
    }
    
    @Test
    public void testIUnit()
    {
        IUnit iUnit = super.getBean("oneInterface");
        System.out.println(iUnit + "");
        iUnit.hello("this is a new param");
    }
}
