package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S2TC3_RtoPage extends BasePage {
	//Constructor
			public S2TC3_RtoPage(WebDriver driver)
			{
				super(driver);
			}
			
		//locators
			//select the city
			@FindBy(xpath="//ul[@class='gridList CityRTO_gridList__W74_c']//li[9]")
			WebElement city ;
			//select the rto
			@FindBy(xpath="//ul[@class='CityRTO_rtoList__Plo2H']//li[3]")
			WebElement rto ;
			WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
			
		//Actions
			public void ClickCity()
			{
				mywait.until(ExpectedConditions.visibilityOf(city));
				city.click();
			}
			public void ClickRto()
			{
				mywait.until(ExpectedConditions.visibilityOf(rto));
				rto.click();
			}

}
