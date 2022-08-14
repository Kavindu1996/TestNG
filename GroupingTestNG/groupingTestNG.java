import org.testng.annotations.Test;

public class groupingTestNG {
    @Test(groups = {"sanity"})
     void test1()
     {
         System.out.println("This is Test 1");
     }

    @Test(groups = {"sanity"})
    void test2()
    {
        System.out.println("This is Test 2");
    }

    @Test(groups = {"regration"})
    void test3()
    {
        System.out.println("This is Test 3");
    }

    @Test(groups = {"regration"})
    void test4()
    {
        System.out.println("This is Test 4");
    }

    @Test(groups = {"sanity","regration"})
    void test5()
    {
        System.out.println("This is Test 5");
    }
}
