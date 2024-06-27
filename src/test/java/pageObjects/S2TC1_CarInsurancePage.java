package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S2TC1_CarInsurancePage extends BasePage {
	
	//Constructor
		public S2TC1_CarInsurancePage(WebDriver driver)
		{
			super(driver);
		}
		
	//locators
		//Click the car insurance
		@FindBy(xpath="//div[@class='prd-block car']")
		WebElement Car_Insurance ;
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
	//Actions
	
		public void ClickCarInsurance()
		{
			mywait.until(ExpectedConditions.visibilityOf(Car_Insurance));
			Car_Insurance.click();
		}
		

}
