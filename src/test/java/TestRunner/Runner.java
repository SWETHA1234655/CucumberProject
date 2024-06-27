package TestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		    
		           //features= {".//Feature"},
		           //features= {".//Feature/TravelInsurance.feature/"},
		           //features= {".//Feature/CarInsurance.feature/"},
		           //features = {".//Feature/HealthInsurance.feature/"},
		        	
		           features= {".//Feature/TravelInsurance.feature/",".//Feature/CarInsurance.feature/",".//Feature/HealthInsurance.feature/"},
		          //features={"@target/rerun.txt"},
		           glue="StepDefinitions",
		           plugin= {"pretty","html:reports/myreport.html",
		        		   "rerun:target/rerun.txt",
						   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		        		   
		        		  },
		           dryRun=false,
		           monochrome=true,
		           publish=true
		           )
		        		   
public class Runner {

}
