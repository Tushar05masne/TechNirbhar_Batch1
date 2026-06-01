package utilities;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListerner_study implements ITestListener {

	@Override
	public void onStart(ITestContext context) {
		System.out.println(">>> Suite Started: " + context.getName());
	}

	@Override
	public void onTestStart(ITestResult TC) {
		System.out.println(">>> Test Started: " + TC.getMethod().getMethodName());
		String CurrentTCNAme = TC.getMethod().getMethodName();
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(">>> Test Passed: " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(">>> Test Failed: " + result.getMethod().getMethodName());
		System.out.println("Reason: " + result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(">>> Test Skipped: " + result.getMethod().getMethodName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(">>> Suite Finished: " + context.getName());
	}
}
