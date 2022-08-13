import org.testng.annotations.Test;

public class prioritizing_disabling_test {

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

    @Test(priority = 3, enabled = true)
    void test1_3()
    {
        System.out.println("test1_3");
    }

    @Test(priority = 4, enabled = false)
    void test1_4()
    {
        System.out.println("test1_4");
    }
}
