package faceBookPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GamesPage {
	
	@FindBy (xpath="//li[text()='Top Charts']")
	private WebElement topCharts;
	
	@FindBy (xpath="//a[@id='js_mj']")
	private WebElement casuals;
	
	@FindBy (xpath="//input[@class='_58al']")
	private WebElement searchBox;
	
	public GamesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnTopcharts()
	{
		topCharts.click();
	}
	
	public void enterInSearchBox(String gameName)
	{
		searchBox.click();
		searchBox.sendKeys(gameName);
		searchBox.sendKeys(Keys.ENTER);
	}
}
