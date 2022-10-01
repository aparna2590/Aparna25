package testPackBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserSetup {
	public static WebDriver openChrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aadishma\\Documents\\Aparna_Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
		
	}
	public static WebDriver openEdge()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Aadishma\\Documents\\Aparna_Velocity\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver;
		
	}

}
