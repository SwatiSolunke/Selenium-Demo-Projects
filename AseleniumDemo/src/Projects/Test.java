package Projects;

import java.util.List;

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
	
	// Click on add to craft for SONY_XPERIA mobile
	driver.findElement(By.xpath("//div[@class='product-info']/div[3]/button/span/span")).click();
			
	// Deleting previous values in qty text-box
	driver.findElement(By.xpath("//input[@class='input-text qty']")).clear();
	// To change quantity value
	WebElement qty = driver.findElement(By.xpath("//input[@class='input-text qty']"));
	qty.sendKeys("1000");
	
	//click on upadte button
	driver.findElement(By.xpath("//td[@class='product-cart-actions']/button/span/span")).click();
	
	// Click on empty cart option
	driver.findElement(By.xpath("//td[@class='a-right cart-footer-actions last']/button[2]/span/span")).click();
	
	// To check or verify that Cart is empty
	WebElement craft = driver.findElement(By.xpath("//span[@class='count']"));
	String craftval = craft.getAttribute("value");
	System.out.println(craftval);
     if(craftval.isEmpty())
     {
	   System.out.println("To verify cart is empty");
     }
	}

}
