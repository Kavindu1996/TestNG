import org.testng.annotations.Test;

public class dependency {

    @Test
    void startCar()
    {
        System.out.println("start car");
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar()
    {
        System.out.println("drive car");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar()
    {
        System.out.println("stop car");
    }

    @Test(dependsOnMethods = {"driveCar","stopCar"})
    void parkCar()
    {
        System.out.println("park car");
    }
}
