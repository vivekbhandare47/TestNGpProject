package keywords;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class DependsOnMethod {

	@BeforeGroups
	public void OpenUrl() {
		System.out.println("url is opened");
		
	}
	@Test  (priority=1)
	public void Test1() {
		System.out.println("Test 1 successfull");
		Assert.fail();
	}	
	@Test (priority=2,dependsOnMethods="Test1")
	public void Test2() {
		System.out.println("Test 2 successfull");
	}
	@Test (priority=3,dependsOnMethods={"Test1","Test2"})
	public void Test3() {
	   System.out.println("Test 3 succesfull");
	}
	@AfterClass
	public void Logout() {
		System.out.println("logout successfull");
	}
	
	
	
	
	
}
