package Refresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	// To load the url
	driver.get("http://demo.guru99.com/selenium/guru99home/");
	
	// To maximize the browser
	driver.manage().window().maximize();
	
	// To refresh the webpage
	driver.navigate().refresh();
	
	// close the browser
	driver.close();
	}
}
