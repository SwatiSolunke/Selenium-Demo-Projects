package BrowserOpening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Swati Study Material\\SeleniumSetup\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// To load the url on website
		driver.get("https://www.google.com");
		
	}

}
