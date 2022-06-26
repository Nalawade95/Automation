package FIRSTCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class scroll {
  public static void main(String[] args)
  {
	  WebDriver driver = Browser.openBrowser("http://vctc.com/selenium/practice.html");
	  WebElement hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
	  ((JavascriptExecutor)driver).executeScript("argument[0].scrollIntoView(true)",hide);
	  
	  
  }
}
