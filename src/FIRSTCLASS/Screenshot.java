package FIRSTCLASS;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = Browser.openBrowser("http://vctcpune.com/");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\PRABHA\\screenshot\\vctc.jpeg");
		FileHandler.copy(source, destination);
	}
	public static String date(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy-MMM-dd- HH-mm-SS");
		LocalDateTime currentTime = LocalDateTime.now();
		String d = dtf.format(currentTime);
		return d;
		
	}

}
