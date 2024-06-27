package StepDefinitions;

import Factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.S1TC1_HomePage;
import pageObjects.S1TC2_DestinationPage;
import pageObjects.S1TC3_TripDatePage;
import pageObjects.S1TC4_PeopleAgePage;
import pageObjects.S1TC5_MedicalconditionPage;
import pageObjects.S1TC6_PlansPage;


public class TravelInsuranceStep {
	
	S1TC1_HomePage Hp;
	S1TC2_DestinationPage Dp;
	S1TC3_TripDatePage Tp;
	S1TC4_PeopleAgePage Pp;
	S1TC5_MedicalconditionPage Mp;
	S1TC6_PlansPage planp;
	
	@Given("Click on travel insurance")
	public void click_on_travel_insurance() {
		BaseClass.getLogger().info("-----Starting Of Travel Insurance-----");
		Hp=new S1TC1_HomePage(BaseClass.getDriver());
		BaseClass.getLogger().info("Select Travel Insurance");
		Hp.clickTravelInsurance();
		
	}
	    

	@When("Enter your destination")
	public void enter_your_destination() {
	    Dp=new S1TC2_DestinationPage(BaseClass.getDriver());
	    BaseClass.getLogger().info("Select the country");
	    Dp.clickCountry();
	    BaseClass.getLogger().info("Click the next button");
	    Dp.nextButton();
	    
	}

	@When("Enter the trip dates")
	public void enter_the_trip_dates() {
		Tp=new S1TC3_TripDatePage(BaseClass.getDriver());
		BaseClass.getLogger().info("Click start date");
		Tp.clickStartDate();
		BaseClass.getLogger().info("Give the starting date");
		Tp.clickBeginingDate();
		BaseClass.getLogger().info("Give the ending date");
		Tp.clickEndingDate();
		BaseClass.getLogger().info("Click the next button");
		Tp.nextButton();
	    
	}

	@When("Select the age of travellers")
	public void select_the_age_of_travellers() {
		Pp=new S1TC4_PeopleAgePage(BaseClass.getDriver());
		BaseClass.getLogger().info("Total Number of people");
		Pp.clickPeopleCount();
		BaseClass.getLogger().info("Click first person");
		Pp.clickPeopleOne();
		BaseClass.getLogger().info("Select the age of First people");
		Pp.clickAgeOfPeople1();
		BaseClass.getLogger().info("Click  second person");
		Pp.clickPeopleTwo();
		BaseClass.getLogger().info("Select the age of First people");
		Pp.clickAgeOfPeople2();
		BaseClass.getLogger().info("Click the next button");
		Pp.nextButton();
		
	}

	@When("select the predimedical condition")
	public void select_the_predimedical_condition() {
		Mp=new S1TC5_MedicalconditionPage(BaseClass.getDriver());
		BaseClass.getLogger().info("Choose No for premedical condition");
		Mp.clickMedicalCondition();
	
	}

	@Then("click premium low to high in sortby")
	public void click_premium_low_to_high_in_sortby() throws InterruptedException {
		planp=new S1TC6_PlansPage(BaseClass.getDriver());
		BaseClass.getLogger().info("Select sortBy");
		planp.ClickSortBy();
		BaseClass.getLogger().info("Choose premium low to high");
		planp.ClickLowest();
		
	
	}

	@Then("click the lowest three plans")
	public void click_the_lowest_three_plans() throws InterruptedException {
		planp=new S1TC6_PlansPage(BaseClass.getDriver());
		BaseClass.getLogger().info("Select the first three plans");
		planp.getPlanDetails();
		Thread.sleep(4000);
		BaseClass.getLogger().info("-----Ending Of Travel Insurance-----");
	}


}
