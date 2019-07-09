package Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99 {

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
		
		
		//   Title for This is Demo site
	    WebElement demositeTitle =  driver.findElement(By.xpath("//div[@class='page-title']/h2"));
		String demotitle = demositeTitle.getText();
		System.out.println("The Title of DemoSite is:===>"+demotitle);
		
		// Click on mobile option
		driver.findElement(By.xpath("//a[@class='level0 '][.='Mobile']")).click();
		
		// To Fetch title of the mobile page
	    driver.findElement(By.xpath("//div[@class='page-title category-title']/h1"));
		String title2 =driver.getTitle();
		System.out.println("The mobile page title is:==>"+title2);
		
		// Dropdown by name
		
		WebElement dropdown =  driver.findElement(By.xpath("//div[@class='sort-by']/select"));
		
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("Name");
		
	}

}
