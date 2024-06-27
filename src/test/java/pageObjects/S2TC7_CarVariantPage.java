package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S2TC7_CarVariantPage extends BasePage {
	
	    //Constructor
			public S2TC7_CarVariantPage(WebDriver driver)
			{
				super(driver);
			}
			
		//locators
			//select the car variant
			@FindBy(xpath="//ul[@class='gridList slideToLeft mb-24']/li[1]")
			WebElement variant ;
			
		//Actions
			public void ClickCarVariant()
			{
				WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
				mywait.until(ExpectedConditions.visibilityOf(variant));
				variant.click();
			}

}
