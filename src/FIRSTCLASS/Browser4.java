package FIRSTCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser4 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chromedriver.driver","C:\\Users\\PRABHA\\chromrdriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("htttp://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("velocity@gamil.com");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("Katraj");
		
	
}
	}
