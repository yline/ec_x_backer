package test.bean.autowired;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.bean.autowired.qualifier.QualifierImpl;

import test.bean.base.BaseUnitTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestQualifier extends BaseUnitTest
{
    public TestQualifier()
    {
        super("classpath*:resource/spring-autowired.xml");
    }
    
    @Test
    public void testAutowired()
    {
        QualifierImpl qualifierImpl = super.getBean("qualifierImpl");
        qualifierImpl.hello("qualifier");
    }
}
