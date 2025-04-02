package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\feature\\new.feature", glue="Stepdefinition")

public class testrun extends AbstractTestNGCucumberTests{
}