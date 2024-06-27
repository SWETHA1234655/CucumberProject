package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S1TC3_TripDatePage extends BasePage {
	  //Constructor
			public S1TC3_TripDatePage(WebDriver driver)
			{
				super(driver);
			}
			
	 //locators
			//click the start date
			@FindBy(xpath="(//div[@class='MuiPickersDateRangePickerInput-root']/div/div)[1]")
			WebElement start_date ;
			//select the beginning date
			@FindBy(xpath="(//div[@class='MuiPickersDesktopDateRangeCalendar-root']/div[1]//div[@class='MuiPickersCalendar-week'])[5]/div[5]")
			WebElement begining_date ;
			//select the ending date
			@FindBy(xpath="(//div[@class='MuiPickersDesktopDateRangeCalendar-root']/div[2]//div[@class='MuiPickersCalendar-week'])[1]/div[4]")
			WebElement ending_date ;
			@FindBy(xpath="//div[@class='pqCtaWrapper']/button")
			WebElement next_button ;
			
			WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
			
     //Actions
			public void clickStartDate()
			{
				mywait.until(ExpectedConditions.visibilityOf(start_date));
				start_date.click();
			}
			public void clickBeginingDate()
			{
				mywait.until(ExpectedConditions.visibilityOf(begining_date));
				begining_date.click();
			}
			public void clickEndingDate()
			{
				mywait.until(ExpectedConditions.visibilityOf(ending_date));
				ending_date.click();
			}
			public void nextButton()
			{
				mywait.until(ExpectedConditions.visibilityOf(next_button));
				next_button.click();
			}
			
			

}
