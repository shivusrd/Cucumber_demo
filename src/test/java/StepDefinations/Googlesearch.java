package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Googlesearch

{
	WebDriver driver = null;
	public String text;
	
	@Given("browser is opening")
	public void browser_is_opening() 
	{
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page()
	{
	   driver.navigate().to("https://www.google.com/");
	}

	@When("^user enters a (.*) in search box$")
	public void user_enters_a_text_in_search_box(String text) 
	{
	   driver.findElement(By.name("q")).sendKeys(text);
	}

	@And("hits enter")
	public void hits_enter() 
	{
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() 
	{
	  
	  driver.quit();
	}

}
