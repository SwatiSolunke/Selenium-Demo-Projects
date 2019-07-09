package Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		// To load the url of webpage
		driver.get("http://live.guru99.com");
		
		// To maximize the browser
		driver.manage().window().maximize();
		
		// To fetch the title of the Home page
		String hometitle = driver.getTitle();
		System.out.println("The title of the hompage page is:==>"+hometitle);
		
		// To fetch the current url of the homepage
		String url = driver.getCurrentUrl();
		System.out.println("The current url of the webpage is:==>"+url);
		
		// To find out number of hyperlinks on the Homepage
		List<WebElement> ls = driver.findElements(By.tagName("a"));
		int count = ls.size();
		System.out.println("The number of hyperlinks on the homepage are:===>"+count);
	   
		System.out.println("----------------------------------------------------------------------------------");
		
		// Click on mobile option
		driver.findElement(By.xpath("//a[@class='level0 '][.='Mobile']")).click();
		
		//AddToComapre for Sony_Xperia mobile
		driver.findElement(By.xpath("//div[@class='product-info']/div[3]/ul/li[2]/a")).click();
		
		// AddToCompare for Iphone mobile
		driver.findElement(By.xpath("//div[@class='product-info']/div[3]/ul/li[2]/a")).click();
	
	   // Click on compare button
		driver.findElement(By.xpath("//button[@title='Compare']")).click();
	}

}
