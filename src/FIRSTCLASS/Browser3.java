package FIRSTCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser3 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","c:\\users\\computer\\download\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.facebook.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		
		
		
		
	}
	

}
