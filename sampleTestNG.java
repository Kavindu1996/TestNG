import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sampleTestNG {


    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("This will execute before methods");
    }

    @AfterMethod
    void afterMethod()
    {
        System.out.println("This will execute after methods");
    }

    @Test
    void first()
    {
        System.out.println("This is a first");
    }

    @Test
    void second()
    {
        System.out.println("This is a second");
    }

    @Test
    void third()
    {
        System.out.println("This is a third");
    }
}
