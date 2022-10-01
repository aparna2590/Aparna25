package testPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.Utility_class;
import faceBookPages.LoginPage;
import faceBookPages.MessengerPage;
import faceBookPages.RoomsPage;
import testPackBrowser.BrowserSetup;

public class TestNG_Facebook_Messenger extends BrowserSetup{
	private WebDriver driver;
	private LoginPage loginPage;
	private MessengerPage messengerPage;
	private RoomsPage roomsPage;
	private int testId;
	
	
	@Parameters("browser")
	
	@BeforeTest
	public void launch_Browser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			driver=openChrome();
		}
		if(browserName.equals("Edge"))
		{
			driver=openEdge();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void createPomObjects()
	{
		//System.out.println("beforeClass");
		loginPage=new LoginPage(driver);
		
		messengerPage=new MessengerPage(driver);
		roomsPage=new RoomsPage(driver);
		
	}
	
	@BeforeMethod
	public void open_Facebook() throws EncryptedDocumentException, IOException
	{
		driver.get("https://www.facebook.com/");
		String data=Utility_class.getDatafromExcel("simple", 6, 0);
		loginPage.enterUser(data);
		
		String data1=Utility_class.getDatafromExcel("simple", 6, 1);
		loginPage.enterPassword(data1);
		
		loginPage.loginToFacebookClick();
		
		System.out.println("beforeMethod123");
//		loginPage.openMessenger();
//		messengerPage.openRooms();
	}
	
	@Test 
	public void verify_Rooms_page() throws EncryptedDocumentException, IOException
	{
		System.out.println("before@test");
		
//		testId=101;
//		
//		//Thread.sleep(5000);
//		roomsPage.openReturnToMessenger();
//		String url=driver.getCurrentUrl();
//		String title=driver.getTitle();
//		Assert.assertEquals(url, "https://www.messenger.com/");
//		Assert.assertEquals(title, "Messenger");
//	
//		if(url.equals("https://www.messenger.com/") && title.equals("Messenger"))
//		{
//			System.out.println("Pass Test");
//		}
//		else
//		{
//			System.out.println("Fail Test");
//		}
		
	}
	
	@Test 
//	public void verify_Helpcenter() throws InterruptedException
//	{
//		System.out.println("before@test1");
//		testId=102;
//		
//		roomsPage.openHelpCenter();
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
//		String title=driver.getTitle();
//		Assert.assertEquals(url, "https://www.messenger.com/help");
//		Assert.assertEquals(title, "Messenger Help ");
//	
//		if(url.equals("https://www.messenger.com/help") && title.equals("Messenger Help Centre"))
//		{
//			System.out.println("Pass Test");
//		}
//		else
//		{
//			System.out.println("Fail Test");
//		}
//	}
	
//	@AfterMethod
//	public void afterMethod(ITestResult result) throws IOException
//	{
//		System.out.println("AfterMethod");
//		if(ITestResult.FAILURE==result.getStatus())
//		{
//			Utility_class.captureScreenshot(driver, testId);
//		}
//		System.out.println("afterMethod");
//	}
	
	@AfterClass
	public void removeObjects()
	{
		loginPage=null;
		messengerPage=null;
		roomsPage=null;
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
		System.gc();
	}
}
