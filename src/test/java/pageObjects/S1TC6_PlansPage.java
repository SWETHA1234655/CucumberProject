package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S1TC6_PlansPage extends BasePage {
	
	//constructor
	public S1TC6_PlansPage(WebDriver driver)
	{
		super(driver);
	}
	
	//locators
	@FindBy(xpath="//aside[@class='rightSection  newFiltersRightSection']/section/details/summary/p")
	WebElement sortby;
	@FindBy(xpath="//input[@id='17_sort']")
	WebElement lowest;
	@FindBy(xpath="//*[@id='root']/div/div[2]/section/article/div/div/div/div/div")
	List<WebElement> plan_name;
	@FindBy(xpath="//div[@class='quotesCard__cta familyPlanPriceContainer']//span")
	List<WebElement> price;
	
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(20));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Actions act=new Actions(driver);
	//Actions
	public void ClickSortBy()
	{
//		mywait.until(ExpectedConditions.visibilityOf(sortby));
//		sortby.click();
		act.moveToElement(sortby).click().perform();
	}
	public void ClickLowest()
	{
		mywait.until(ExpectedConditions.visibilityOf(lowest));
		lowest.click();
	}
	public void getPlanDetails()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println(plan_name.get(i).getText());
			System.out.println(price.get(i).getText());
		}
	}
	
	
	

}
