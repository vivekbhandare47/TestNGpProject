package GroupInTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase3 {

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
	public void Test7()
	{
		System.out.println("Test7");
	}
	@Test(groups="functional")
	public void Test8()
	{
		System.out.println("Test8");
	}
	@Test(groups={"functional","regression"})
	public void Test9()
	{
		System.out.println("Test9");
	}
	
	
	
}
