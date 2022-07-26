package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	ExtentReports extent;
	
	public static ExtentReports getReporterObject() {
		
		String path=System.getProperty("User.dir")+"\\reports\\index.html";
		ExtentSparkReporter report= new ExtentSparkReporter(path);
		report.config().setReportName("Firsttesting report");
		report.config().setDocumentTitle("Seleniumontheway");
		
		
	ExtentReports extent= new ExtentReports();
	extent.attachReporter(report);
	extent.setSystemInfo("tester", "sajoyua");
		
		return extent;
	}
	
	public void initializedemo() {
		
		ExtentTest test= extent.createTest("Initial Demo");
		
		
		
	}

	
}
