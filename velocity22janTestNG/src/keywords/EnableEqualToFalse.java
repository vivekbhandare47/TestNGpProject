package keywords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnableEqualToFalse {
    @BeforeMethod
	public void login() {
		System.out.println("Login successfull");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout successfull");
	}
	@Test (priority=1,enabled=false) 
	public void HomePage() {
		System.out.println("HomePage");
	}
	@Test (priority=2,dependsOnMethods="HomePage")
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
