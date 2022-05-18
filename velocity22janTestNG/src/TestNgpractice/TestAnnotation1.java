package TestNgpractice;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation1 {

	
	@BeforeTest
	public void opendb() {
		System.out.println("=====db is opened");
		Reporter.log("====db is open=====");
	}
	@AfterTest
	 public void closedb() {
		 System.out.println("====closed db=====");
		 Reporter.log("===db is close=====");
	 }
	@Test
	public void m1() {
		System.out.println("these is m1 method");
		Reporter.log("===these is m1 method====");
	}
	@Test
	public void m2() {
		System.out.println("these is m2 method");
		Reporter.log("===these is m3 method====");
	}
	@Test
	public void m3() {
		System.out.println("these is m3 method");
		Reporter.log("===these is m3 method====");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
