package ParameterizationPracises;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;
	
	
	
	@Parameters("browser")
	@Test(priority=1)
	public void CrossBrowserTesting(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\selenium all jar file\\chromedriver.exe");
		    driver=new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\OneDrive\\Desktop\\selenium all jar file\\geckodriver.exe");
		    driver=new FirefoxDriver();
		}else {
			System.out.println("wrong broser selected");
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
	}
	
	@Test
	public void verifycurrentUrl() {
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");
		Reporter.log("verifycurrentUrl",true);
	}
	@Test(priority=3)
	public void VerifyPageTitle() {
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
	
	@Test(priority=4)
	public void VerifyUsernameField() {
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("vivek");
	}
	
	@Test(priority=5)
	public void VerifyPasswordField() {
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("satara@123");
	}
	
	
	@Test(priority=6)
	public void ClickLoginButton() {
		WebElement LoginBtn = driver.findElement(By.xpath("//input[@id='email']"));
		Assert.assertTrue(LoginBtn.isEnabled());
		LoginBtn.click();
	}
	
	
	
	
	
}
