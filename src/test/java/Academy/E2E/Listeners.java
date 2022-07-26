package Academy.E2E;

import java.io.IOException;
import Resources.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Resources.basIC;


public class Listeners extends basIC implements ITestListener {
	
	ExtentTest test;
	ExtentReports extent=ExtentReport.getReporterObject();
	
	
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		 test= extent.createTest(result.getMethod().getMethodName());
		

	}
	
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Passed");
		
		
	}

	public void onTestFailure(ITestResult result) {
		
		test.fail(result.getThrowable());
		String testMethodName=result.getMethod().getMethodName();
		WebDriver driver=null;
		try {
			driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e)
		{}
		
		
	try {
		getScreenshotpath(testMethodName,driver);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		
		extent.flush();
		// TODO Auto-generated method stub
		
	}

}
