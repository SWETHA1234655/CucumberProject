package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S3TC1_InsuranceProductPage extends BasePage {
	
	//Constructor
			public S3TC1_InsuranceProductPage(WebDriver driver)
			{
				super(driver);
			}
			
		//locators
			//click the insurance product
			@FindBy(xpath="//li[@class='ruby-menu-mega shade mr']/child::a")
			WebElement insurance_product ;
			//click the health insurance
			@FindBy(xpath="//i[@class=' menu-ico icon-bg health-insurance']/following-sibling::a")
			WebElement health_insurance ;
			
			WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(15));
			
		//Actions
			
			public void ClickInsuranceproduct()
			{
				mywait.until(ExpectedConditions.visibilityOf(insurance_product));
				insurance_product.click();
			}
			public void ClickHealthInsurance()
			{
				mywait.until(ExpectedConditions.visibilityOf(health_insurance));
				health_insurance.click();
			}

}
