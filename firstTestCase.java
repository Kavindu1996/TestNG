import org.testng.annotations.*;

public class firstTestCase {

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

    @Test(priority = 1)
    void test1_1()
    {
        System.out.println("test1_1");
    }

    @Test(priority = 2)
    void test1_2()
    {
        System.out.println("test1_2");
    }

    @Test(priority = 3)
    void test1_3()
    {
        System.out.println("test1_3");
    }

    @Test(priority = 4)
    void test1_4()
    {
        System.out.println("test1_4");
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
}
