package Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 
{
   public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
	     
	     // To load the url 
	     driver.get("https://www.naukri.com");
	     
	     // To maximize the browser
	     driver.manage().window().maximize();
	     
	     // Takes screenshot
         File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(src, new File("E:\\Swati Study Material\\selenium programs\\AseleniumDemo\\screenshot\\login1.jpeg"));
	}

}
