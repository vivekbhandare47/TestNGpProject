package keywords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeOuts {

    @BeforeMethod
	public void login() {
		System.out.println("Login successfull");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout successfull");
	}
	@Test (priority=1,timeOut=5000) 
	public void HomePage() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("HomePage");
	}
	@Test (priority=2)
	public void ProfilePage() {
	
		System.out.println(" ProfilePage");
	}
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("launch the browser");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("close the browser");
	}
	
	
	
	
	
	
	
	
	
}
