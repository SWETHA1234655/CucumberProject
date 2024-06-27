package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class S1TC1_HomePage extends BasePage{
	
	//Constructor
	public S1TC1_HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	//Locators
	//Click the travel insurance
	@FindBy(xpath="(//div[@class='prd-icon add shadowHandler short'])[7]")
	WebElement Travel_Insurance ;
	
	
	//Actions
	public void clickTravelInsurance()
	{
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOf(Travel_Insurance));
		Travel_Insurance.click();
	}
	
	
	
	
	

}
