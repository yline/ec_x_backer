package test.bean.resource;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.bean.resource.ResourceImpl;

import test.bean.base.BaseUnitTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestResourceImpl extends BaseUnitTest
{
    public TestResourceImpl()
    {
        super("classpath*:resource/spring-resource.xml");
    }
    
    @Test
    public void testResourceImpl()
    {
        ResourceImpl resourceImpl = super.getBean("resourceImpl");
        try
        {
            resourceImpl.hello();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
