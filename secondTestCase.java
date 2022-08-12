import org.testng.Assert;
import org.testng.annotations.*;

public class secondTestCase {


    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("This execute before other method");
    }

    @AfterMethod
    void afterMethod()
    {
        System.out.println("This execute after other method");
    }

    @BeforeClass
    void beforeClass()
    {
        System.out.println("This execute before other class");
    }

    @AfterClass
    void afterClass()
    {
        System.out.println("This execute before other class");
    }

    @BeforeTest
    void beforeTest()
    {
        System.out.println("This will execute before the test");
    }

    @AfterTest
    void afterTest()
    {
        System.out.println("This will execute after the test");
    }

    @Test(priority = 1)
    void test2_1()
    {
        System.out.println("test2_1");
    }

    @Test(priority = 2)
    void test2_2()
    {
        System.out.println("test2_2");
    }

    @Test(priority = 3)
    void test2_3()
    {
        System.out.println("test2_3");
    }

    @Test(priority = 4)
    void test2_4()
    {
        System.out.println("test2_4");
    }
}
