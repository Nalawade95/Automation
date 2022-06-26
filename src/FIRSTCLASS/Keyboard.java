package FIRSTCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
	public static void main(String[]args)
	{
		WebDriver driver = Browser.openBrowser("http://demoqa.com/text-box");
		WebElement firstNames = driver.findElement(By.xpath("//input[@id='username']"));
		firstName.sendKeys("Prabha");
		Actions action = new Actions(driver);
		action.sendKeys(Key.TAB);
		action.sendKeys("prabha@gmail.com");
		action.sendKeys(key.TAB);
		action.sendKeys("T22,khradi pune,Maharashtra");
		
		action.keyDown(keys.CONTROL);
		action.sendKeys("a");
		action.sendKeys("c");
		action.keyUp(keys.CONTROL);
		action.sendKeys(keys.TAB);
	}

}
