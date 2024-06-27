package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S2TC4_CarBrandPage extends BasePage{
	//Constructor
			public S2TC4_CarBrandPage(WebDriver driver)
			{
				super(driver);
			}
			
		//locators
			//select the brand
			@FindBy(xpath="//li[@class='toyota ']")
			WebElement brand ;
			
		//Actions
			public void ClickCarBrand()
			{
				WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
				mywait.until(ExpectedConditions.visibilityOf(brand));
				brand.click();
			}

}
