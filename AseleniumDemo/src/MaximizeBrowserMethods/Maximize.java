package MaximizeBrowserMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize 
{
	public static void main(String args[]) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Launch the application
		driver.get("https://www.guru99.com/");

		//Void maximize()–This method is used to maximize the current browser.

		//maximize browser by using maximize method
		driver.manage().window().maximize();  
		// To Delay execution for 10 sec. as to view the maximize browser
		Thread.sleep(10000);

		// Close the browser
		driver.quit();
	}

}
