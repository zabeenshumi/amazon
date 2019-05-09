package testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
		 
		features= "Cucumber/Amazon.feature",
		glue= "stepdef"
		 
  )

public class AmazonRunner extends  AbstractTestNGCucumberTests {

		 
	}
