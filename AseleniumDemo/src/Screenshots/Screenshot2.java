package Screenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot2 
{
	public WebDriver driver;
   public void capaturescreenshot(String filename,String extension) throws IOException
	{
		// Takes screenshot
	     File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     
	     // Taking screenshot by using timestamp
	     String timestamp = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
	     
	     FileUtils.copyFile(src, new File("E:\\Swati Study Material\\selenium programs\\AseleniumDemo\\screenshot\\"+filename+timestamp+extension));
	     Screenshot2 sc = new Screenshot2();
	     sc.capaturescreenshot("login2", ".jpeg");
	     
	}
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
	     
	     // To load the url 
	     driver.get("https://www.naukri.com");
	     
	     // To maximize the browser
	     driver.manage().window().maximize();
	}

}
