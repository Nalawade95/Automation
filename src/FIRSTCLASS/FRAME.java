package FIRSTCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FRAME {
	public static void main(String[] args)
	{
		WebDriver driver = Browser.openBrowser("http://demo.automationtesting.in/Frames.html");
		WebElement doubleframe = driver.findElement(By.xpath("//a[@href='#Multiple']"));
		doubleIframe.click();
		WebElement multiIframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(multiIframe);
		WebElement singleFrame = driver.findElement(By.xpath("/iframe[@src='SingleFrame.html']"));
		 
		
	}
	

}
