package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S2TC2_NewCarPage extends BasePage{
	//Constructor
			public S2TC2_NewCarPage(WebDriver driver)
			{
				super(driver);
			}
			
		//locators
			//choose click here
			@FindBy(xpath="//span[@class='CarRegDetails_blueTextButton__P1blP blueTextButton fontMedium']")
			WebElement clickhere;
			
		//Actions
			public void ClickNewCar()
			{
				WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
				mywait.until(ExpectedConditions.visibilityOf(clickhere));
				clickhere.click();
			}

}
