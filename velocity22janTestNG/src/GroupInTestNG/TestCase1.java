package GroupInTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	@BeforeTest(alwaysRun=true)
	public void OpenDB()
	{
		System.out.println("BeforeTest:Databse");
	}
	@AfterTest(alwaysRun=true)
	public void CloseDB()
	{
		System.out.println("AfterTest:Database Close");
	}
	@BeforeClass(alwaysRun=true)
	public void LaunchBrowser()
	{
		System.out.println("Launch the Browser");
	}
	@AfterClass(alwaysRun=true)
	public void CloseBrowser()
	{
		System.out.println("Browser Is Closed");
	}
	@Test(groups="smoke")
	public void Test1()
	{
		System.out.println("Test1");
	}
	@Test(groups="functional")
	public void Test2()
	{
		System.out.println("Test2");
	}
	@Test(groups={"functional","regression"})
	public void Test3()
	{
		System.out.println("Test3");
	}
	
	
	
	
	
	
}