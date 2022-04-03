package testrunner_test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
	
@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/Features",publish=true,
glue={"StepDefinations"},
plugin = {"html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/cucumber.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
)

public class Testrunner_class 
{
	
	
	
}


