package keywords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority {

	//@beforeclass
	//@afterclass
	//@test
	@BeforeClass
	public void openurl() {
		System.out.println("url is open");
	}
	@Test (priority=1)
	public void test1() {
		System.out.println("test 1 is successfull");	
	}
	@Test (priority=2)
	public void test2() {
		System.out.println("test 2 is successfull");
	}
	@Test (priority=3)
	public void test3() {
		System.out.println("test 3 is successfull");
	}	
	@AfterClass
	public void logout() {
		System.out.println("logout suceesfully");
	}
	
	
	
	
	
	
	
	
}
