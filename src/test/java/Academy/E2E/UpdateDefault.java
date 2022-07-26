package Academy.E2E;
	import java.io.IOException;
		import java.util.concurrent.TimeUnit;
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
import PageObjects.Popupwindow;
import Resources.basIC;

		public class UpdateDefault  extends basIC {
		public static WebDriver driver;
	
			
			

			@SuppressWarnings("deprecation")

			
			@Test
			
			public void basepageNavigation3() throws IOException, InterruptedException{
				
				driver=initializedriver();
				driver.get("https://www.securian.com/insights-tools/retirement-calculator.html");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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
			a.getSpouseIncome();
			Thread.sleep(3000);
			a.getCurrentIncome();
			a.getCurrtrsvn();
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
			Thread.sleep(3000);
			UpdateDefault.UpdateDefaultCalculator();
			Thread.sleep(3000);
			a.getCalculate().click();;
			Thread.sleep(3000);
			a.getResult();
			
			
		
			
			
		

			
			
			
			
			}
			
			public static void UpdateDefaultCalculator() throws InterruptedException {
				Popupwindow c= new Popupwindow(driver);
				c.getdefaultvalues().click();;
				Thread.sleep(3000);
				Actions d= new Actions(driver);
				WebElement text1=driver.findElement(By.id("additional-income"));
			d.moveToElement(text1).build().perform();
			c.getadditionalIncome();
			Thread.sleep(3000);
			c.getretirementduration();
			Thread.sleep(3000);
			c.getpostRetimentincome();
			Thread.sleep(3000);
			JavascriptExecutor ls=(JavascriptExecutor)driver;
			
			WebElement m = driver.findElement(By.xpath("//label[@for='post-retirement-roi']"));
			   ls.executeScript("arguments[0].scrollIntoView(true);", m);
				Thread.sleep(3000);
			c.getretirementannualincome();
			Thread.sleep(3000);
			c.getpreReturnROI();
			Thread.sleep(3000);
			c.getPostReturnROI();
			Thread.sleep(3000);
			c.getSavchanges().click();
			Thread.sleep(3000);
			
			
				
			}
			
			@AfterTest
			public void teardown() {
				
				driver.close();
			}
			
			

			}





