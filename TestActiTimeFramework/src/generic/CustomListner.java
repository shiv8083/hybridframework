package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListner extends BaseTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("test has been started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("test is successfully executed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		Reporter.log("test"+methodname+"is failed and ss has been taken",true);
		failed(methodname);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		Reporter.log("test"+methodname+"is skipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("test execution has been finished",true);
	}
	
}


