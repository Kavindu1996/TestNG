public class DataProvider2 {

    @org.testng.annotations.DataProvider(name="LoginDataProvider")
    public Object[][] getData()
    {
        Object[][] data={{"abc@gmail.com","abc"},{"def@gmail.com","def"},{"ghi@gmail.com","ghi"}};
        return data;
    }

}
