package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\feature\\registration.feature", glue="Stepdefinition")
	
	public class register extends AbstractTestNGCucumberTests{
}
