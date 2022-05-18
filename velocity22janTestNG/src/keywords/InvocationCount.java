package keywords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount {

	@BeforeClass
	public void launchBrowser() {
		System.out.println("Browser is launch");	
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("");
	}
	@BeforeMethod
	public void login() {
		System.out.println("########login successfull########");
	}
	@AfterMethod
	public void logout() {
		System.out.println("=======logout successfull=======");
	}
	@Test (priority=1,invocationCount=3)
	public void HomepageTest() {
		System.out.println("Homepage is Tested");
	}
	@Test (priority=2,invocationCount=3)
	public void ProfilepageTest() {
		System.out.println("Profil is Tested");
	}
	
	
	
	
	
	
}
