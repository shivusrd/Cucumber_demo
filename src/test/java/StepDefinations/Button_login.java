package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Button_page;



public class Button_login 

{	WebDriver driver = null;
    Button_page ob;
	
	@Given("open browser")
	public void open_browser() 
	{
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/Drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
	}

	@Given("user is navigating to path")
	public void user_is_navigating_to_path() 
	{
		driver.navigate().to("https://testingbaba.com/");
	}

	@When("user is on button tab")
	public void user_is_on_button_tab()
	
	{
		ob = new Button_page(driver);
		ob.closebtn();
		ob.clickonelements();
	
	}

	@Then("button clicked by user")
	public void button_clicked_by_user() 
	
	{
	   ob.clickbuttn();
		
	}

	@Then("A message will be shown up")
	public void a_message_will_be_shown_up() 
	
	{
		String title= driver.getTitle();
		System.out.println(title);
		driver.quit();
	}



}
