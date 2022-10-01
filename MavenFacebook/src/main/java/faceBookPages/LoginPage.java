package faceBookPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility_class;

public class LoginPage extends Utility_class {
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy (xpath="//input[@id='pass']")
	private WebElement pswd;
	
	@FindBy (xpath="//div[@class='_6luv _52jv']//button")
	private WebElement loginButton;
	
	@FindBy (xpath="//a[text()='Messenger']")
	private WebElement messenger;
	
	@FindBy (xpath="//a[text()='Watch']")
	private WebElement watch;
	
	@FindBy (xpath="//a[text()='Places']")
	private WebElement places;
	
	@FindBy (xpath="//a[text()='Games']")
	private WebElement games;
	
    public LoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void enterUser(String user)
    {
    	email.sendKeys(user);
    }
    
    public void enterPassword(String pass)
    {
    	pswd.sendKeys(pass);
    }
    public void loginToFacebookClick()
    {
    	loginButton.click();
    }
    public void openMessenger()
    {
    	messenger.click();
    }
    
    public void openWatch()
    {
    	watch.click();
    }
    public void openPlaces()
    {
    	places.click();
    }
    public void openGames()
    {
    	games.click();
    }
    
    
    
}
