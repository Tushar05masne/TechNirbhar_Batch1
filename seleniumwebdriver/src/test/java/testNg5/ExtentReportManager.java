package testNg5;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	
	public ExtentSparkReporter sparkReporter;	//UI of the report
	public ExtentReports extent;		// populate common info on the report
	public ExtentTest test;		// creating test case entries in the report and update status of the test methods
	
	  public void onStart(ITestContext context) {
		
		  sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myreport.html"); // specifies the location of the report

		  sparkReporter.config().setDocumentTitle("Automation Report");	// title of the report. On browser's tab
		  sparkReporter.config().setReportName("Functional Testing");		// name of the report
		  sparkReporter.config().setTheme(Theme.STANDARD);
	  
		  extent = new ExtentReports();
		  extent.attachReporter(sparkReporter);
		  
		  extent.setSystemInfo("Computer Name", "localhost");			// sets common info on the report
		  extent.setSystemInfo("Environment", "QA");
		  extent.setSystemInfo("Tester Name", "Mahesh");
		  extent.setSystemInfo("OS", "Windows10");
		  extent.setSystemInfo("Browser Name", "Chrome");
		  
	  }
	  	  
	  public void onTestSuccess(ITestResult result) {
		  
		  test = extent.createTest(result.getName());	// create new entry in the report
		  test.log(Status.PASS, "Test case PASSED is:"+ result.getName());	// update status pass/fail/skip

	  }
	  
	  public void onTestFailure(ITestResult result) {
		  
		  test = extent.createTest(result.getName());
		  test.log(Status.FAIL, "Test case FAILED is:"+ result.getName());
		  test.log(Status.FAIL, "Test case FAILED cause is:"+ result.getThrowable());
	  	
	  }
	  
	  public void onTestSkipped(ITestResult result) {

		  test = extent.createTest(result.getName());
		  test.log(Status.SKIP,"Test case SKIPED is:"+result.getName());
	  }
	  
	  public void onFinish(ITestContext context) {		// we have to write this method. mandatory

		  extent.flush();		// it will write test info from the standard report to it's output view
	  }

}
