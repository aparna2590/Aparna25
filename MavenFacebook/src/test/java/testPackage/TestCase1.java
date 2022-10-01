package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import faceBookPages.LoginPage;
import faceBookPages.MessengerPage;
import faceBookPages.RoomsPage;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("hello");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aadishma\\Documents\\Aparna_Velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.openMessenger();
		//Thread.sleep(5000);
		
		MessengerPage messengerPage=new MessengerPage(driver);
		//Thread.sleep(5000);
		messengerPage.openRooms();
		
		RoomsPage roomsPage=new RoomsPage(driver);
		//Thread.sleep(5000);
		roomsPage.openReturnToMessenger();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		
		if(url.equals("https://www.messenger.com/") && title.equals("Messenger"))
		{
			System.out.println("Pass Test");
		}
		else
		{
			System.out.println("Fail Test");
		}
		
	}
}
