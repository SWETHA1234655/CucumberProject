package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


import Utilities.ExcelWriter;

public class S3TC2_HealthInsurancePage extends BasePage{
	
	//Constructor
		public S3TC2_HealthInsurancePage(WebDriver driver)
		{
			super(driver);
		}
		
		
	//locators
		@FindBy(xpath="//div[@class='hide-nav hide-mobile-link onlydesktop']")
		WebElement list  ;
		//Get the list of available health plans
		@FindBy(xpath="//div[@class='hide-nav hide-mobile-link onlydesktop']/following-sibling::ul/li//span")
		List<WebElement> Healthplans  ;
		
		
		Actions act=new Actions(driver);
		
	//Actions
		public void HoverHealthInsurance()
		{
			act.moveToElement(list).perform();
		}
		public void PrintPlanNames() throws IOException
		{
			int i=1;
			for(WebElement p:Healthplans)
			{
				String plansname=p.getText();
				ExcelWriter.setCellData("Sheet1", i, 0, plansname);
				i++;
			}
		}

}
