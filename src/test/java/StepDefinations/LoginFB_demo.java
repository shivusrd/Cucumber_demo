package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginFB_demo 

{	
	WebDriver driver = null;
	@Given("Browser is opening")
	public void browser_is_opening() 
	{
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("user is on login  page")
	public void user_is_on_login_page()
	{
		 driver.navigate().to("https://www.flipkart.com/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) 
	{	
	   driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys(username);
	   driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")).sendKeys(password);
	   driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")).click();
	   
	}	

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException 
	{	Thread.sleep(5000);
		driver.getPageSource().contains("shivam dubey");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}


}
