package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keywords_testNG {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BEFORECLASS");
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BEFOREMETHOD");
	}
	
	@Test (priority=2, invocationCount=3)
	public void demo1()
	{
		System.out.println("DEMO1");
	}
	
	@Test (enabled=false)
	public void demo3()
	{
		System.out.println("DEMO3");
	}
	
    @Test (dependsOnMethods={"demo3"},alwaysRun=true)
    public void demo4()
    {
    	System.out.println("DEMO4");
    }
    @Test (priority=1, timeOut=3000,invocationCount=3)
    public void demo2()
    {
    	System.out.println("DEMO2");
    }
    @AfterMethod
	public void afterMethod()
	{
		System.out.println("AFTERMETHOD");
	}
    @AfterClass
	public void afterClass()
	{
		System.out.println("AFTERCLASS");
		
	}
    
	
}
