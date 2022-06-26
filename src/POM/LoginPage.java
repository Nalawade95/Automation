package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//input[@id='email']") private WebElement ID;
	@FindBy(xpath="//input[@id='pass']") private WebElement password;
	@FindBy(xpath="//button[@name='login']") private WebElement login;
	@FindBy(xpath="//a[text()='Forgot user ID  or password? SignUp now!\"]") private WebElement forgot;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement SignUp;
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	public void enterEmail(String emailaddress){
		ID.sendKeys(emailaddress);
	}
	public void enterPassword(String pass){
		password.sendKeys(pass);}
	public void clickOnLogin(){
		login.click();
	}
	public void clickOnForgotPassword(){
	}
	public void clickOnSignUp(){
		SignUp.click();
	}
	}
	


