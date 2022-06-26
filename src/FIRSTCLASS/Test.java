package FIRSTCLASS
import org.openqa.selenium.WebDriver;

import POM.LoginPage;

public class Test {
public void loginWithoutCredentials(){
	WebDriver driver = Browser.openBrowser("http://www.facebook.com/");
	LoginPage obj= new LoginPage(driver);
	obj.clickOnLogin();
}
public void loginWithInvalidCredentials(){
	WebDriver driver = Browser.openBrowser("http://www.facebook.com/");
	LoginPage obj = new LoginPage(driver);
	obj.enterEmail("Velocity");
	obj.enterPassword("Katraj");
	obj.clickOnLogin();
}
public void loginWithoutPassword()
{
	WebDriver driver = Browser.openBrowser("http://www.facebook.com/");
	LoginPage obj = new LoginPage(driver);
	obj.enterEmail("Velocity");
	obj.clickOnLogin();
}
public static void main(String[] args)
{
Test obj = new Test();
obj.loginWithInvalidCredentials();
obj.loginWithoutCredentials();
obj.loginWithoutPassword();

}

}
