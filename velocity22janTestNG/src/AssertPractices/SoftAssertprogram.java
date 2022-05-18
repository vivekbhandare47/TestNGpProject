package AssertPractices;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertprogram {
    @Test
	public void sample1() {
    	SoftAssert soft=new SoftAssert();
    	String str1="vivek";
    	System.out.println(str1);		
    	Assert.assertEquals(str1,"hii");
    	
    	String str2="hello";
    	System.out.println(str2);
    	Assert.assertEquals(str2, "hello");
    	soft.assertAll();
    }
	@Test
	public void sample2() {
		System.out.println("automation");
	}
	
	
}
