package BrowserOpening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome 
{
   public static void main(String[] args) 
   {
	   System.setProperty("webdriver.chrome.driver", "E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	// To load the url here
	driver.get("https://www.google.com");
	
	// To maximize the browser
	driver.manage().window().maximize();
}
}
