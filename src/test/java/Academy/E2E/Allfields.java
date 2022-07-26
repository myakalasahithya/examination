package Academy.E2E;
import java.io.IOException;
	import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	import PageObjects.Loginpage;
	import Resources.basIC;

	public class Allfields extends basIC {
	public WebDriver driver;
	public static Logger log= LogManager.getLogger(basIC.class.getName());
		
		

		@SuppressWarnings("deprecation")

		
@Test
		
		public void basepageNavigation() throws IOException, InterruptedException{
			
			driver=initializedriver();
			driver.get("https://www.securian.com/insights-tools/retirement-calculator.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			log.info("browser is launched");
			Thread.sleep(3000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(1000,400)");
			Thread.sleep(3000);
			//js.executeScript("document.getElementById('current-age').value='34'");
		Loginpage a= new Loginpage(driver);
		a.getCurrentage().sendKeys(String.valueOf(40));
		Thread.sleep(3000);
		a.getRetiredage();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(1000,400)");
		Thread.sleep(3000);
		a.getCurrentIncome();
		Thread.sleep(3000);
		a.getSpouseIncome();
		Thread.sleep(3000);
		a.getCurrtrsvn();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(1000,400)");
		a.getPcspyr();
		Thread.sleep(3000);
		a.getRoisey();
		Thread.sleep(3000);
		a.getSocialSI();
		Thread.sleep(3000);
		a.getMaritalstatus();
		Thread.sleep(3000);
		a.getsocialsecurityoverride();
		Thread.sleep(3000);
		a.getdefaultvalues().click();;
		Thread.sleep(3000);
		Actions b= new Actions(driver);
		WebElement text=driver.findElement(By.id("additional-income"));
	b.moveToElement(text).build().perform();
	
		a.getotherincomeduringRetirement();
		Thread.sleep(3000);
		a.getdependonretirementincome();
		Thread.sleep(3000);
		a.getpostRetimentincome();
		Thread.sleep(3000);
		a.getExpInflationRate();
		Thread.sleep(3000);
		WebElement m = driver.findElement(By.xpath("//label[@for='post-retirement-roi']"));
	      js.executeScript("arguments[0].scrollIntoView(true);", m);
	      a.getfinalannualincome();
		Thread.sleep(3000);
		a.getpreReturn();
		Thread.sleep(3000);
		a.getPostReturn();
		Thread.sleep(3000);
		a.getSavchanges().click();
		Thread.sleep(5000);
		a.getCalculate().click();
		Thread.sleep(3000);
		a.getResult();
	
	
		
		
	

		
		
		
		
		}
		
		
		@AfterTest
		public void teardown() {
			
			driver.close();
		}
		
		

		}


