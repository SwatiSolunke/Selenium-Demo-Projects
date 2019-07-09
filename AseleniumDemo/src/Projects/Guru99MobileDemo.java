package Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99MobileDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

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
		
		// To fetch or read(getAttibute value) the value of sony-xperia mobile
		WebElement sony_Xperia = driver.findElement(By.xpath("//span[@class='price'][.='$100.00']"));
		String val = sony_Xperia.getText();
		System.out.println("The value of Sony_Xperia is:===>"+val);
		
		// Click on Sony_Xperia mobile
		driver.findElement(By.xpath("//img[@id='product-collection-image-1']")).click();
		
		// To fetch the value Sony_Xperia from detail page
		WebElement sony_Xperia1 = driver.findElement(By.xpath("//span[@class='price']"));
		String val1 = sony_Xperia1.getText();
		System.out.println("The value of Sony_Xperia1 is:===>"+val1);
		
		// To get the title of the detail page
		String title1 = driver.getTitle();
		System.out.println("The title of the detail page is:===>"+title1);
		
		}
}
