package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S1TC2_DestinationPage extends BasePage{
	
	//Constructor
		public S1TC2_DestinationPage(WebDriver driver)
		{
			super(driver);
		}
		
	//locators
		//select the country
		@FindBy(xpath="//ul[@id='favourite-country']/li[4]")
		WebElement country;
		@FindBy(xpath="//div[@class='pqCtaWrapper']/child::button")
		WebElement next_button;
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(15));
		JavascriptExecutor js=(JavascriptExecutor)driver;
	//Actions
		public void clickCountry()
		{
			mywait.until(ExpectedConditions.visibilityOf(country));
			country.click();
		}
		public void nextButton()
		{
//			mywait.until(ExpectedConditions.visibilityOf(next_button));
//			next_button.click();
			js.executeScript("arguments[0].click();", next_button);
		}

}
