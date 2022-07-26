package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Popupwindow {
	
	public WebDriver driver;
	By defaultvalues=By.linkText("Adjust default values");
	By additionalincome=By.xpath("//input[@id='additional-income']");
	By retirementduration=By.xpath("//input[@id='retirement-duration']");
	By postRetimentincome=By.xpath("//label[@for='exclude-inflation']");
	By retirementannualincome=By.cssSelector("input[id='retirement-annual-income']");
	By preReturnROI=By.xpath("//input[@id='pre-retirement-roi']");
	By PostReturnROI=By.xpath("//input[@id='post-retirement-roi']");
	By savechanges=By.cssSelector("button[onclick='savePersonalizedValues();']");
	
	
	public Popupwindow(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	
	
	public WebElement getdefaultvalues() {
		
		return driver.findElement(defaultvalues);
	}
	
	public void getadditionalIncome() {
		
		driver.findElement(additionalincome).clear();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('additional-income').value='$200'");
		}

		public void getretirementduration() {
			
		driver.findElement(retirementduration).clear();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('retirement-duration').value='12'");
		}
		public void getpostRetimentincome() {
			int i=2;
			while(i>=2){
			
			driver.findElement(postRetimentincome).click();
		i--;
			
			}	}
			public void getretirementannualincome() throws InterruptedException {
				driver.findElement(retirementannualincome).clear();
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("document.getElementById('retirement-annual-income').value='60'");
		
				
			}
			
			
			public void getpreReturnROI(){
				driver.findElement(preReturnROI).clear();
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("document.getElementById('pre-retirement-roi').value='10'");
			}

			public void getPostReturnROI(){
				driver.findElement(PostReturnROI).clear();
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("document.getElementById('post-retirement-roi').value='10'");
			}
			public WebElement getSavchanges() {
				return driver.findElement(savechanges);
				
			}
			
			

}
