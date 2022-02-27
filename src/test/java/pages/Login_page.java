package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;
import io.cucumber.java.en.When;

public class Login_page 

{
	WebDriver driver;
	By txt_username = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]");
	By txt_password = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]");
	By btn_login = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]");

	public Login_page(WebDriver driver)

	{
		this.driver=driver;	
	}

	public void login(String username) {
		driver.findElement(txt_username).sendKeys(username);

	}

	public void pass(String password) {

		driver.findElement(txt_password).sendKeys(password);

	}

	public void loginbtn() {

		driver.findElement(btn_login).click();

	}

}
