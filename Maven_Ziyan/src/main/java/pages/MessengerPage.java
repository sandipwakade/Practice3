package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessengerPage {

	@FindBy(xpath="//a[text()='Features']")
	private WebElement featureButton;
	
	@FindBy(xpath="//a[text()='Desktop app']")
	private WebElement deskTopAppButton;
	
	@FindBy(xpath="//a[text()='Privacy and safety']")
	private WebElement privacyAndSafetyButton;
	
	@FindBy(xpath="//a[text()='For developers']")
	private WebElement forDeveloperButton ;
	
	public MessengerPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openFeatures()
	{
		featureButton.click();
	}
	
	public void openDeskTopApp()
	{
		deskTopAppButton.click();
	}
	
	public void openPrivacyAndSafety()
	{
		privacyAndSafetyButton.click();
	}
	
	public void openForDevelopers()
	{
		forDeveloperButton.click();
	}
}
