package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\OrangeHRM\\simple.feature", glue="steps")
	
	public class testrun extends AbstractTestNGCucumberTests{
}