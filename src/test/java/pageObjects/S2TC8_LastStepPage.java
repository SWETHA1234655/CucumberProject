package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.ExcelReader;

public class S2TC8_LastStepPage extends BasePage {
	
	//Constructor
			public S2TC8_LastStepPage(WebDriver driver)
			{
				super(driver);
			}
			
		//locators
			//Give the name
			@FindBy(xpath="//input[@placeholder='Full name']")
			WebElement name ;
			//Give the email
			@FindBy(xpath="//input[@placeholder='Your email']")
			WebElement email ;
			//Give the mobile number
			@FindBy(xpath="//input[@placeholder='Mobile number']")
			WebElement mobile ;
			//capture the error message
			@FindBy(xpath="//div[@class='errorMsg']")
			WebElement errormsg ;
			
		//Actions
			public void excel() throws IOException {
				
				ExcelReader.getCellData();
			}
			
			public void setName() throws IOException
			{
				//ExcelReader.getCellData();
				name.sendKeys(ExcelReader.username);
			}
			public void setEmail() 
			{
				
				email.sendKeys(ExcelReader.mail);
			}
			public void setMobileNumber()
			{
				mobile.sendKeys(ExcelReader.phone);
			}
			public void getErrormsg()
			{
				System.out.println(errormsg.getText());
				
			}
			

}
