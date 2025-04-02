package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\OrangeHRM\\register.feature", glue="steps")
	
	public class register extends AbstractTestNGCucumberTests{
}
