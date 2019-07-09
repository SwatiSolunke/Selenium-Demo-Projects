package RadioButtonSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// To load the url
		driver.get("http://demo.guru99.com/test/radio.html");
		
		// To maximize the browser
		driver.manage().window().maximize();
		
		// To fetch the title of the webpage
		String title = driver.getTitle();
		System.out.println("The title of the webpage is:===>"+title);
		
		
		// To select the radio buttons......by using click method
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		radio1.click();
		System.out.println("Radio button 1 is selected");
		
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		radio2.click();
		System.out.println("Radio button 2 is selected");
		
		WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
		radio3.click();
		System.out.println("Radio button 3 is selected");
		
		
	}

}
