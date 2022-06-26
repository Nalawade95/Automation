package FIRSTCLASS;

import org.apache.commons.collections4.list.LazyList;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args){
	WebDriver driver = Browser.openBrowser("http:/demo.guru99.com/test/simple_context_menu.html");
	Actions action = new Actions(driver);
	WebElement Iframe = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
	driver.switchTo().frame(Iframe);
	List<WebElement> images = driver.findElement(By.xpath("//li[@class=\"ui-widget-content ui-corner-tr ui-draggable-handle\"]"));
	int numbers = images.size();
	for(int i= 2; i < numbers; i++)
	{
		WebElement image = images.get(i);
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		action.dragAndDrop(image, trash);
		action.perform();
		Thread.sleep(4000);
	}
	}
	
	

}
