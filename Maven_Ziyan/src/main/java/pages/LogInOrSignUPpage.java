package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInOrSignUPpage {
	
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='loginbutton']")
	private WebElement logInButton;
	
	@FindBy(xpath="//a[text()='Messenger']")
	private WebElement messenger;
	
	public LogInOrSignUPpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName()
	{
		userName.sendKeys("sandip");
	}

	public void sendPassword()
	{
		password.click();
	}
	
	public void openMessanger()
	{
		messenger.click();
	}
	
}
