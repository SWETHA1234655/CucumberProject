package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.S3TC1_InsuranceProductPage;
import pageObjects.S3TC2_HealthInsurancePage;




public class HealthInsuranceStep {
	
	WebDriver driver;
	
	S3TC1_InsuranceProductPage Ipp;
	S3TC2_HealthInsurancePage Hip;
	
	@Given("Navigate to homepage")
	public void navigate_to_homepage() throws InterruptedException {
		
		BaseClass.getLogger().info("-----Starting Of Health Insurance-----");
		Ipp=new S3TC1_InsuranceProductPage(BaseClass.getDriver());
		BaseClass.getLogger().info("Select the Insuranceproduct");
		Ipp.ClickInsuranceproduct();
		Thread.sleep(3000);
		  
	}

	@When("click health insurance from insurance products")
	public void click_health_insurance_from_insurance_products() {
		Ipp=new S3TC1_InsuranceProductPage(BaseClass.getDriver());
		BaseClass.getLogger().info("Select the health insurance");
		Ipp.ClickHealthInsurance();
	    
	}

	@Then("click the health insurance menu and get all health plans")
	public void click_the_health_insurance_menu_and_get_all_health_plans() throws IOException {
		Hip=new S3TC2_HealthInsurancePage(BaseClass.getDriver());
		BaseClass.getLogger().info("Hover the health insurance");
		Hip.HoverHealthInsurance();
		BaseClass.getLogger().info("Print all the available plans in health insurance");
		Hip.PrintPlanNames();
		BaseClass.getLogger().info("-----Ending Of Health Insurance-----");
	}

}
