package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Button_page

{
	WebDriver driver;

	public Button_page(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;

	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement practiceform;

	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement elements;

	@FindBy(xpath = "//*[text()='buttons']")
	private WebElement buttons;

	@FindBy(xpath = "//*[@id=\"tab_5\"]/div[1]/button")
	private WebElement doubleclick;

	@FindBy(xpath = "//button[@id='noContextMenu']")
	private WebElement rightclick;

	public void closebtn() {

		closebtn.click();
		practiceform.click();
	}

	public void clickonelements()

	{
		elements.click();

	}

	public void clickbuttn() {
		buttons.click();

	}

}
