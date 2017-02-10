package test.bean.scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.bean.scope.ScopeImpl;

import test.bean.base.BaseUnitTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestSingletonImpl extends BaseUnitTest
{
    public TestSingletonImpl()
    {
        super("classpath*:/resource/spring-scope.xml");
    }
    
    /**
     * hasCode 相同,一个Bean容器内,仅存一个单例
     */
    @Test
    public void testSingleton()
    {
        System.out.println("Singleton");
        int hasCode;
        ScopeImpl singletonImpl = super.getBean("singleScope");
        hasCode = singletonImpl.hello();
        
        ScopeImpl singletonImpl2 = super.getBean("singleScope");
        if (singletonImpl2.hello() == hasCode)
        {
            System.out.println("has code is same");
        }
        else
        {
            System.out.println("has code is diff");
        }
    }
    
    /**
     * hasCode与上一个方法中不同,不同容器,对应的单例不同
     */
    @Test
    public void testSingleton2()
    {
        System.out.println("Singleton2");
        ScopeImpl singletonImpl = super.getBean("singleScope");
        singletonImpl.hello();
    }
    
    /**
     * hasCode 不同,每次调用方法,都创建一个实例
     */
    @Test
    public void testProtetype()
    {
        System.out.println("Protetype");
        int hasCode;
        ScopeImpl protetypeImpl = super.getBean("prototypeScope");
        hasCode = protetypeImpl.hello();
        
        ScopeImpl protetypeImpl2 = super.getBean("prototypeScope");
        if (protetypeImpl2.hello() == hasCode)
        {
            System.out.println("has code is same");
        }
        else
        {
            System.out.println("has code is diff");
        }
    }
    
    /**
     * hasCode与上一个方法中不同,不同容器,更加不同
     */
    @Test
    public void testProtetype2()
    {
        System.out.println("Protetype2");
        ScopeImpl protetypeImpl = super.getBean("prototypeScope");
        protetypeImpl.hello();
    }
}
