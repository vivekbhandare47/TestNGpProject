package PompageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	//declaration
	//initialization
	//usage
	
	//declaration
	@FindBy(xpath="//img[@class='fb_logo _8ilh img']")private WebElement regi_fblogo;
	@FindBy(xpath="//h2[text()='Facebook helps you connect and share with the people in your life.']")private WebElement loginfb_tagline;
	@FindBy(xpath="//input[@name='email']")private WebElement username;
	@FindBy(xpath="//input[@name='pass']")private WebElement password;
	@FindBy(xpath="//button[@data-testid='royal_login_button']")private WebElement login_button;
	@FindBy(xpath="//a[text()='Forgotten password?']")private WebElement forgotpassword;
	@FindBy(xpath="//a[@data-testid='open-registration-form-button']")private WebElement creatnew_accnt;
	@FindBy(xpath="//a[text()='Create a Page']")private WebElement creat_page;
	@FindBys({@FindBy(xpath="//div[@id='pageFooter']")})private WebElement footer_link;
	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//usage
	
	public void verifyaPageFBlogo() {
		Assert.assertTrue(regi_fblogo.isDisplayed(),"fb logo is not displyed");
	    Assert.assertFalse(regi_fblogo.isDisplayed(),"fb logo is displyed");
	}
	
	public void verifyPageFbText() {
		Assert.assertTrue(loginfb_tagline.isDisplayed(),"loginfb_tagline fb logo is not displyed");
//		Assert.assertFalse(loginfb_tagline.isDisplayed(),loginfb_tagline fb logo us is displyed);
	}
	
	
	
	
	
	
	
	
	
	
}
