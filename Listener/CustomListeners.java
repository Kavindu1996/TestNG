package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {

    public void onStart(ITestContext arg)
    {
        System.out.println("Start Test Execution........"+arg.getName());
    }

    public void onFinish(ITestContext arg)
    {
        System.out.println("Finish Test Execution........"+arg.getName());
    }

    public void onTestStart(ITestResult arg0)
    {
        System.out.println("Start Test Execution........"+arg0.getName());
    }

    public void onTestSkipped(ITestResult arg0)
    {
        System.out.println("Skipped Test Execution........"+arg0.getName());
    }

    public void onTestSuccess(ITestResult arg0)
    {
        System.out.println("Passed Test Execution........"+arg0.getName());
    }

    public void onTestFailure(ITestResult arg0)
    {
        System.out.println("Failed Test Execution........"+arg0.getName());
    }

    public void onTestFailedButWithInSuccessPercentage(ITestResult arg0)
    {

    }
}
