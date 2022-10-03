package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

// @org.testng.annotations.Listeners(listeners.CustomListeners.class)
public class Listeners {

    @Test
    void test1()
    {
        System.out.println("This is Test 1");
        Assert.assertEquals("A","A");
    }

    @Test
    void test2()
    {
        System.out.println("This is Test 2");
        Assert.assertEquals("A","B");
    }

    @Test
    void test3()
    {
        System.out.println("This is Test 3");
        throw new SkipException("This is skip exeception");
    }

}
