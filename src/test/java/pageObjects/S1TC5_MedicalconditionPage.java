package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S1TC5_MedicalconditionPage extends BasePage {
	//Constructor
		public S1TC5_MedicalconditionPage(WebDriver driver)
		{
			super(driver);
		}
		
	//locators
		//select no for medical precondition
		@FindBy(xpath="//div[@class='options_box_wrapper isPedOpt']/div[2]")
		WebElement noButton;
		
	//Actions
		public void clickMedicalCondition()
		{
			WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
			mywait.until(ExpectedConditions.visibilityOf(noButton));
			noButton.click();
		}
	

}

