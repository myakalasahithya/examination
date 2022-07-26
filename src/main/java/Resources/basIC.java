package Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class basIC {

	
	public WebDriver driver;
	public  Properties prop;
	@SuppressWarnings("deprecation")
	public WebDriver initializedriver() throws IOException {
		
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\Chaarvik\\eclipse-workspace\\New\\New\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
	
	String browsername=prop.getProperty("browser");
	
	if(browsername.equals("chrome"))
	{
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chaarvik\\chromedriver_win32\\chromedriver.exe");
		
		 driver= new ChromeDriver();
	}
		
	
	else if(browsername.equals("Firefox")) {
		
		
		
	}
	
	else if(browsername.equals("IE")) {
		
		
	}
		//chrom
		
		//firfox
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	}
	
	
	public void getScreenshotpath(String testcaseName, WebDriver driver) throws IOException  {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testcaseName+".png";
	FileUtils.copyFile(src, new File(destinationFile));
	}
}