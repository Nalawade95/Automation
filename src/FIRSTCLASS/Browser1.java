package FIRSTCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser1 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PRABHA\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://www.facebook.com/");
	Thread.sleep(4000);
	driver.navigate().back();
	Thread.sleep(4000);
	driver.navigate().refresh();
	}

}
