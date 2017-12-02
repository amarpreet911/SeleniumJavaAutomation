package qatest.reporting;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * Created by amarpreet911 on 11/30/17.
 */
public class TestListner extends TestListenerAdapter implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("The test case which started is "+iTestResult.getName()+
                " and "+iTestResult.getTestName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("The test case which succeeded is "+iTestResult.getName()+
                " and "+iTestResult.getTestName());
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("The test case which failed is "+iTestResult.getName()+
                " and "+iTestResult.getTestName());
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
        System.out.println("The test case in OnStart "+iTestContext.getName());
    }

    public void onFinish(ITestContext iTestContext) {
        System.out.println("The test case in OnFinished "+iTestContext.getName());
    }

}
