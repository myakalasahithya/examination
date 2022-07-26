package Academy.E2E;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObjects.Loginpage;
import Resources.basIC;

public class withouttoggle extends basIC{
	
	@Test
	public void BasepageNavigation2() throws IOException, InterruptedException {
		
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
	a.getCurrentIncome();
	Thread.sleep(3000);
	a.getSpouseIncome();
	Thread.sleep(3000);
	a.getCurrtrsvn();
	Thread.sleep(3000);
	a.getPcspyr();
	Thread.sleep(3000);
	a.getRoisey();
	js.executeScript("window.scrollBy(1000,400)");
	Thread.sleep(3000);
	a.getCalculate().click();
	Thread.sleep(3000);
	a.getResult();
	}
	
	
	@AfterTest
	public void teardown() {
		
		driver.close();
	}

}
