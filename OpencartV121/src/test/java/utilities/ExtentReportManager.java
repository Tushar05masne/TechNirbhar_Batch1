package utilities;

import java.awt.Desktop;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testCases.BaseClass;


// ITestListener	  => A listener for the test running.
// ITestContext 	  -> Defines a test context which contains all the information for a given test run.
// ITestResult	  -> Describes the result of the test.
// onStart()      -> sets-up report. Invoked before running all the test methods.
// onTestSuccess	  -> Invoked each time the test succeeds. log pass.
// onTestFailure	  -> Invoked each time the test fails. log fail + screenshots.
// onTestSkipped  -> Invoked each time the test is skipped. log skip.
// onFinish		  -> extent.flush(). Invoked after all the test methods have run and all their Configuration methods have been called.

public class ExtentReportManager implements ITestListener {
	
	public ExtentSparkReporter sparkReporter;	//UI of the report
	public ExtentReports extent;					// populate common info on the report
	public ExtentTest test;						// creating test case entries in the report and update status of the test methods
	String repName;
	
	public void onStart(ITestContext testContext) {
	
		/*SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		Date dt = new Date();
		String currentdatetimestamp = df.format(dt);
		*/
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss").format(new Date());	// time stamp
		repName = "Test-Report-"+timestamp+".html";		// name of the report with time stamp so that every report name will be different		
		//sparkReporter = new ExtentSparkReporter(".\\reports\\"+repName);	// location of the report
	
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\"+repName);
		
		
		sparkReporter.config().setDocumentTitle("Opencart Automation Report"); // title of the report. On browser's tab
		sparkReporter.config().setReportName("Opencart Functional Testing"); // name of the report
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);			// attaching the UI to the common info of the report i.e. adding common info into the report
		extent.setSystemInfo("Application", "Opencart");		// add common info/ system info to the reporters
		extent.setSystemInfo("Module", "Admin");
		extent.setSystemInfo("Sub Module", "Customer");
		extent.setSystemInfo("User Name", System.getProperty("user.name"));	// System.getProperty() - gets the system property by the specified key.
		extent.setSystemInfo("Environment", "QA");
		
		String os = testContext.getCurrentXmlTest().getParameter("os"); //go to the current XmlTest file and get the value of parameter.
		extent.setSystemInfo("Operating System",os);
		
		String browser = testContext.getCurrentXmlTest().getParameter("browser");
		extent.setSystemInfo("Browser", browser);
		
		List<String> includedGroups = testContext.getCurrentXmlTest().getIncludedGroups(); // go to the current XmlTest file and get the value of included groups.
		if(!includedGroups.isEmpty()) {
			extent.setSystemInfo("Groups", includedGroups.toString());
		}
		
	}
	
	
	// createTest - Creates a test with description, getTestClass() - returns test class
	// getName() - returns the name of the test class.
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName());	
		test.assignCategory(result.getMethod().getGroups());			// to display groups in report
		test.log(Status.PASS, result.getName()+" got successfully executed.");	// logs an event with details
	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		
		test.log(Status.FAIL, result.getName()+" got failed.");
		test.log(Status.INFO, result.getThrowable().getMessage());
		
		try {
			String imgpath = new BaseClass().captureScreen(result.getName());
			test.addScreenCaptureFromPath(imgpath);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}	
	}
	
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		
		test.log(Status.SKIP,result.getName()+" got skipped");
		test.log(Status.INFO, result.getThrowable().getMessage());	
	}
	
	public void onFinish(ITestContext testContext) {
		
		extent.flush();				//  writes test info from the standard report to it's output view
		
		// open the report in the browser automatically when all the tests get executed	
		String pathOfExtentReport = System.getProperty("user.dir")+"\\reports\\"+repName;	
		File extentReport = new File(pathOfExtentReport);
		
		try {	
			Desktop.getDesktop().browse(extentReport.toURI());	// opens the report in browser automatically
						
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
