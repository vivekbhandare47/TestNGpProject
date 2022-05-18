package PompageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {
	WebDriver driver;
	@BeforeClass
	  public void setup()
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\selenium all jar file\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   }
	  @Test
	  public void FacebookRegistrationPageTest()
	  {
		  RegistrationPage rgPage=new RegistrationPage(driver);
		  rgPage.clickFacebookSignupLink();
	      Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/reg/");
		  rgPage.verifyRegistrationPageFblogo();
		  rgPage.verifyRegistrationPageAlreadyAccount();
		  //rgPage.verifyRegistrationPageAlreadyAccount();
		  rgPage.setRegistrationPageFirstName();
	      rgPage.setRegistrationPageLastName();
	      rgPage.setRegistrationPageMobileEmail();
	      rgPage.setRegistrationPagePassward();
	      rgPage.setRegistrationPageBirthday();
	      rgPage.setRegistrationPageBirthMonth();
	      rgPage.setRegistrationPageBirthYear();
	      rgPage.setRegistrationPageGender("male");
	      //rgPage.setRegistrationPageGender("Female");
	      rgPage.clickRegistrationPageSubmitBtn();
	  }
	  @AfterClass
	  public void tearDown()
	  {
		 // driver.quit();
	  }
	  
	  


	}
	
	
	
	
	
	
	
	
	
	
	
	

