import org.testng.annotations.Test;

public class DataProvider {

    @Test(dataProvider = "LoginDataProvider",dataProviderClass = DataProvider2.class)
    public void loginTest(String email,String pwd)
    {
        System.out.println(email+""+pwd);
    }

    //@DataProvider(name="LoginDataProvider")

}
