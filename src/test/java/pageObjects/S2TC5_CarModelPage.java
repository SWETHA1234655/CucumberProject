package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S2TC5_CarModelPage extends BasePage{
	     //Constructor
			public S2TC5_CarModelPage(WebDriver driver)
			{
				super(driver);
			}
			
		//locators
			//select the model
			@FindBy(xpath="//ul[@class='gridList    slideToLeft mb-16']/li[1]")
			WebElement model ;
			
		//Actions
			public void ClickCarModel()
			{
				WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
				mywait.until(ExpectedConditions.visibilityOf(model));
				model.click();
			}
			

}
