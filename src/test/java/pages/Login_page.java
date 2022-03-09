package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import io.cucumber.java.en.When;

public class Login_page 

{
	WebDriver driver;

	public Login_page(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = " //body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
	private WebElement email;

	@FindBy(xpath = " //body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
	private WebElement pass;

	@FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")
	private WebElement login;
	
	@FindBy(xpath = "//*[@class=\"_3704LK\"]")
	private WebElement search;
	
	

	public void gen(String username, String password) throws InterruptedException
   {
		email.sendKeys(username);
		pass.sendKeys(password);
		login.click();
		
		Thread.sleep(2000);
	}
	
	public void search(String product) throws InterruptedException
	
	{   
		search.sendKeys(product,Keys.ENTER);
		Thread.sleep(4000);
	}
	

}
