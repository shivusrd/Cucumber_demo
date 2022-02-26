package StepDefinations;

import org.junit.runner.RunWith;
	
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
	
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinations"},monochrome=true,
plugin= {"pretty","json:target/JSONReports/reports.json",
		"junit:target/JUnitreports/report.xml",
		"html:target/HtmlReports"})
public class TestRunner 
{

}
