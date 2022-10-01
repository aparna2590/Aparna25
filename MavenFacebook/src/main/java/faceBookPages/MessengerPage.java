package faceBookPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MessengerPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy (xpath="//a[text()='Rooms']")
	private WebElement rooms;
	
	@FindBy (xpath="//a[text()='Features']")
	private WebElement features;
	
	@FindBy (xpath="//a[text()='Desktop app']")
	private WebElement desktop_app ;
	
	@FindBy (xpath="//a[text()='Privacy and safety']")
	private WebElement privacy_safety;
	
	public MessengerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		wait=new WebDriverWait(driver, 5);
		
	}
	
	public void openRooms()
	{
		wait.until(ExpectedConditions.visibilityOf(rooms));
		rooms.click();
	}
	
	public void openFeatures()
	{
		wait.until(ExpectedConditions.visibilityOf(features));
		features.click();
	}
	
	public void openDeskopApp()
	{
		wait.until(ExpectedConditions.visibilityOf(desktop_app));
		desktop_app.click();
	}
	public void openPrivacySafety()
	{
		wait.until(ExpectedConditions.visibilityOf(privacy_safety));
		privacy_safety.click();
	}
	
	
	
}
