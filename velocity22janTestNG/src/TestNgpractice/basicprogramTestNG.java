package TestNgpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class basicprogramTestNG {
	
    @Test  (priority=1)
	public void login() {
		
		System.out.println("login into facebook");	
		Reporter.log("login successful");
	}
	@Test  (priority=2)
	public void homepage() {
		
		System.out.println("welcome to homepage");
		Reporter.log("enter homepage successful");
	}
	@Test  (priority=3)
	public void logout() {
		
		System.out.println("logout facebook");
		Reporter.log("logout successful");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
