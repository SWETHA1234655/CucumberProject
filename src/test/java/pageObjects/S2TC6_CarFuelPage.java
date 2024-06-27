package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S2TC6_CarFuelPage extends BasePage {
	
	//Constructor
		public S2TC6_CarFuelPage(WebDriver driver)
		{
			super(driver);
		}
		
	//locators
		//select the fuel
		@FindBy(xpath="//ul[@class='gridList slideToLeft']/li[1]")
		WebElement Fuel ;
		
	//Actions
		public void ClickFuel()
		{
			WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
			mywait.until(ExpectedConditions.visibilityOf(Fuel));
			Fuel.click();
		}

}
