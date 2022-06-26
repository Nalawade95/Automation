package FIRSTCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser5 {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRABHA\\chromedriver.exe");
	{
		WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
	email.sendKeys("prabha@gamil.com");
	WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
	pass.sendKeys("prabha");
	WebElement login = driver.findElement(By.xpath("//button[contains(@data-testid,'royal')]"));
	login.click();
	
	}

}
}
