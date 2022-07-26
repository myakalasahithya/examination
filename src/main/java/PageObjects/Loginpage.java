package PageObjects;
import java.util.Collection;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {

	
	
public WebDriver driver;
	
	

	By Currentage=By.xpath("//input[@id='current-age']");
	By Retiredage=By.xpath("//input[@id='retirement-age']");
	By CurrentIncome=By.xpath("//input[@id='current-income']");
	By SpouseIncome=By.xpath("//input[@id='spouse-income']");
	By CurrtrSVb=By.xpath("//input[@id='current-total-savings']");
	By CurrtrfEy=By.xpath("//input[@id='current-annual-savings']");
	By inSVEY=By.xpath("//input[@id='savings-increase-rate']");
	By SocialSI=By.xpath("//label[@for='yes-social-benefits']");
	By Maritalstatus=By.xpath("//label[@for='married']");
	By socialsecurityoverride=By.xpath("//input[@id='social-security-override']");
	By Calculate=By.xpath("//button[@class='dsg-btn-primary btn-block']");
	By Result=By.xpath("//p[@id='result-message']");
	By defaultvalues=By.linkText("Adjust default values");
	By postRetimentincome=By.xpath("//label[@for='include-inflation']");
	By savechanges=By.cssSelector("button[onclick='savePersonalizedValues();']");
	

	public Loginpage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	
	public WebElement getCurrentage() {
		
		return driver.findElement(Currentage);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("document.getElementById('current-age').value='34'");
	}
	
	
public void getRetiredage() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('retirement-age').value='68'");
	}

public void getCurrentIncome() {
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('current-income').value='$100000'");
}
public void getSpouseIncome() {
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('spouse-income').value='$75000'");
}	
public void getCurrtrsvn() {
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('current-total-savings').value='500000'");
}	

public void getPcspyr() {
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('current-annual-savings').value='10'");
}	
public void getRoisey() {
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('savings-increase-rate').value='0.25'");
}	

public void getSocialSI() {
	
	int i=1;
	while(i<2){
	
	driver.findElement(SocialSI).click();
i++;
	
}
}	

public void getMaritalstatus() {
	int i=1;
	while(i<2){
	
	driver.findElement(Maritalstatus).click();
i++;
	
	}	
}
	public void getsocialsecurityoverride() {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('social-security-override').value='$4000'");
		//return driver.findElement(socialsecurityoverride);
	}	
	public WebElement getCalculate() {
		
		return driver.findElement(Calculate);
	}
public void getResult() {
		
		System.out.println(driver.findElement(Result).getText());
	}

public WebElement getdefaultvalues() {
	
	return driver.findElement(defaultvalues);
}


public void getotherincomeduringRetirement() {

	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('additional-income').value='$500'");
}
public void getdependonretirementincome() {

	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('retirement-duration').value='20'");
}


public void getpostRetimentincome() {
int i=1;
while(i<2){

driver.findElement(postRetimentincome).click();
i++;
}	

}

public void getExpInflationRate() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('expected-inflation-rate').value='20'");

	
}

public void getfinalannualincome(){
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('retirement-annual-income').value='75'");
}
public void getpreReturn(){
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('pre-retirement-roi').value='8'");
}

public void getPostReturn(){
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('post-retirement-roi').value='5'");
}


public WebElement getSavchanges() {
	return driver.findElement(savechanges);
	
}



}