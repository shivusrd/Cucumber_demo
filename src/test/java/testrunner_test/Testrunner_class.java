package testrunner_test;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
	
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue={"StepDefinations"},
plugin = {"html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/cucumber.json"
}
)

public class Testrunner_class {

}
