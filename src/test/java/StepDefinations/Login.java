package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login 
{
	WebDriver driver = null;
	
	@Given("is on login page")
	public void is_on_login_page() 
	{
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/Drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
	    
	   
	}

	@When("user enters valid cred")
	public void user_enters_username_and_password() 
	{
		 driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("shivam");
		 driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")).sendKeys("testpass");
		 
		 
	  
	}

	@And("cicks on login button")
	public void cicks_on_login_button() {
		
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")).click();
	}

	@Then("user is navigated to the page")
	public void user_is_navigated_to_the_home_page()
	{
		 
		driver.getPageSource().contains("shivam dubey");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();

	
}
}
