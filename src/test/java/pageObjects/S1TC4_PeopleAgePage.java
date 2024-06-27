package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S1TC4_PeopleAgePage extends BasePage {
	//Constructor
	public S1TC4_PeopleAgePage(WebDriver driver)
	{
		super(driver);
	}
	
	//locators
	//choose the people count
	@FindBy(xpath="//div[@class='memSelectRadioWrapper']/div[2]")
	WebElement people_count ;
	@FindBy(xpath="(//div[@class='customDropdown ']/div)[1]")
	WebElement age1;
	//select the age of first person
	@FindBy(xpath="//div[@id='optionBox_0_wrapper']/div[23]")
	WebElement people1_age ;
	@FindBy(xpath="(//div[@class='customDropdown ']/div)[2]")
	WebElement age2;
	//select the age of second person
	@FindBy(xpath="//div[@id='optionBox_1_wrapper']/div[24]")
	WebElement people2_age ;
	@FindBy(xpath="//div[@class='pqCtaWrapper']/button")
	WebElement next_button;
	
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	//Actions
	public void clickPeopleCount()
	{
		
		mywait.until(ExpectedConditions.visibilityOf(people_count));
		people_count.click();
	}
	public void clickPeopleOne()
	{
		mywait.until(ExpectedConditions.visibilityOf(age1));
		age1.click();
	}
	public void clickAgeOfPeople1()
	{
		mywait.until(ExpectedConditions.visibilityOf(people1_age));
		people1_age.click();
	}
	public void clickPeopleTwo()
	{
		mywait.until(ExpectedConditions.visibilityOf(age2));
		age2.click();
	}
	public void clickAgeOfPeople2()
	{
		mywait.until(ExpectedConditions.visibilityOf(people2_age));
		people2_age.click();
	}
	public void nextButton()
	{
		
		mywait.until(ExpectedConditions.visibilityOf(next_button));
		next_button.click();
	}

}
