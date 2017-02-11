package test.bean.definition;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.bean.definition.Definition;

import test.bean.base.BaseUnitTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestDefinition extends BaseUnitTest
{
    public TestDefinition()
    {
        super("classpath*:resource/spring-annotation.xml");
    }
    
    @Test
    public void testDefinition()
    {
        Definition definition = super.getBean("definition");
        definition.hello("testOne");
        
        definition = super.getBean("definition");
        definition.hello("testTwo");
    }
}
