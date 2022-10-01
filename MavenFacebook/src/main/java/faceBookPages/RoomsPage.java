package faceBookPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomsPage {
	
	@FindBy (xpath="//div[@style='margin-top: 20px;']//a[1]")
	private WebElement returnToMessenge;
	
	@FindBy (xpath="//div[@style='margin-top: 20px;']//a[2]")
	private WebElement helpCenter;
	
	public RoomsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openReturnToMessenger()
	{
		returnToMessenge.click();
	}
	public void openHelpCenter()
	{
		helpCenter.click();
	}
}
