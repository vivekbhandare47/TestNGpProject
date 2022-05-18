package TestNgpractice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnnotation {
	
	//login and logout perform only once & check the all functionality 
	// login==homepage===profilepage====notification===logout
	
    @BeforeClass
	public void login() {
		System.out.println("=========login succesfully==========");
		Reporter.log("=========login===========");
	}
	@AfterClass
	public void logout() {
		System.out.println("======logout succesfully=======");
		Reporter.log("========logout======");
	}
	@Test(priority=1)
	 public void homepage() {
		 System.out.println("=========enter into homepage===========");
		 Reporter.log("==========enter into homepage succesfull=========");
	 }
	@Test(priority=2)
	public void profilepage () {
		System.out.println("========enter into profilepage========");
		Reporter.log("===========enter into profilepage succesful========l");
	}
	@Test(priority=3)
	public void notification() {
		System.out.println("========enter into notification=============");
		Reporter.log("==========enter into notification succesfull===========");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
