package AssertPractices;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardasert {

	String str1="";
	String str2="hii";
	
	//assert equal method
//	@Test
//	public void test1(){
//		Assert.assertEquals(str1, str2);
//	}
	
	//assert not equal method
//	@Test
//	public void test2() {
//		Assert.assertNotEquals(str1,str2);
//	}
	//assert null method
//	@Test
//	public void test3() {
//	Assert.assertNull(str1);
//	}
	//assert not null method
	@Test
	public void test4() {
		Assert.assertNotNull(str1);
	}
	
	
	
	
	
	
}
