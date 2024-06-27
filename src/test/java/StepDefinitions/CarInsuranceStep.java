package StepDefinitions;



import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Factory.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.S2TC1_CarInsurancePage;
import pageObjects.S2TC2_NewCarPage;
import pageObjects.S2TC3_RtoPage;
import pageObjects.S2TC4_CarBrandPage;
import pageObjects.S2TC5_CarModelPage;
import pageObjects.S2TC6_CarFuelPage;
import pageObjects.S2TC7_CarVariantPage;
import pageObjects.S2TC8_LastStepPage;

public class CarInsuranceStep {
	WebDriver driver;
	S2TC1_CarInsurancePage Cip;
	S2TC6_CarFuelPage Cfp;
	S2TC7_CarVariantPage Cvc;
	S2TC4_CarBrandPage Cbp;
	S2TC8_LastStepPage Lsp;
	S2TC3_RtoPage Rp;
	S2TC2_NewCarPage Ncp;
	S2TC5_CarModelPage Cmp;
	
	
	
	@Given("Navigate to home page")
	public void navigate_to_home_page() throws InterruptedException {
		
		BaseClass.getLogger().info("-----Starting Of Car Insurance-----");
	    Cip=new S2TC1_CarInsurancePage(BaseClass.getDriver());
	    
	    BaseClass.getLogger().info("Select Car Insurance");
	    Cip.ClickCarInsurance();
	    Thread.sleep(3000);
	}

	@When("click the click here button")
	public void click_the_click_here_button() {
		Ncp=new S2TC2_NewCarPage(BaseClass.getDriver());
		BaseClass.getLogger().info("Click the new car button");
	    Ncp.ClickNewCar();
	}

	@When("Select the city and Rto")
	public void select_the_city_and_rto() {
		Rp=new S2TC3_RtoPage(BaseClass.getDriver());
		BaseClass.getLogger().info("Select the city");
		Rp.ClickCity();
		BaseClass.getLogger().info("Select Rto according to the city");
		Rp.ClickRto();
	    
	}

	@When("Select car brand")
	public void select_car_brand() {
		Cbp=new S2TC4_CarBrandPage(BaseClass.getDriver());
		BaseClass.getLogger().info("Select the car brand");
		Cbp.ClickCarBrand();
	    
	}

	@When("Select car model")
	public void select_car_model() {
		Cmp=new S2TC5_CarModelPage(BaseClass.getDriver());
		BaseClass.getLogger().info("Select the car model");
		Cmp.ClickCarModel();
	    
	}

	@When("Select car fuel type")
	public void select_car_fuel_type() {
		Cfp=new S2TC6_CarFuelPage(BaseClass.getDriver());
		BaseClass.getLogger().info("Select the fuel type");
		Cfp.ClickFuel();
	    
	}

	@When("Select car Variant")
	public void select_car_variant() {
		Cvc=new S2TC7_CarVariantPage(BaseClass.getDriver());
		BaseClass.getLogger().info("Select the car variant");
		Cvc.ClickCarVariant();
	    
	}

	@Then("Give the name")
	public void give_the_name() throws IOException {
		Lsp=new S2TC8_LastStepPage(BaseClass.getDriver());
		BaseClass.getLogger().info("Provide the username");
		Lsp.excel();
		Lsp.setName();
		//Lsp.setName(ExcelReader.name);
	    
	}

	@Then("give the email")
	public void give_the_email() throws IOException {
		Lsp=new S2TC8_LastStepPage(BaseClass.getDriver());
		BaseClass.getLogger().info("Provide Emailid of user");
		Lsp.excel();
		Lsp.setEmail();
	    //Lsp.setEmail(ExcelReader.mail);
	    
	}

	@Then("give the mobile number")
	public void give_the_mobile_number() throws IOException {
		Lsp=new S2TC8_LastStepPage(BaseClass.getDriver());
		BaseClass.getLogger().info("Provide Phone number");
		Lsp.excel();
		Lsp.setMobileNumber();
	    //Lsp.setMobileNumber(ExcelReader.phone);
	    
	}

	@Then("capture the error message")
	public void capture_the_error_message() {
		Lsp=new S2TC8_LastStepPage(BaseClass.getDriver());
		//
		BaseClass.getLogger().info("Capture the error message if anything is incorrect");
		Lsp.getErrormsg();
		BaseClass.getLogger().info("-----Ending Of Car Insurance-----");
	    
	}


}
