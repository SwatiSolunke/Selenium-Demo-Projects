package AjaxImplementionCompnentHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// To load the url
		driver.get("https://www.ksrtc.in/oprs-web");
		
		// maxximize the browser
		driver.manage().window().maximize();
		
		// Get title of webpage
		String title=driver.getTitle();
		System.out.println("curren ttile is="+title);

		// Get current url of the webpage
		String url=driver.getCurrentUrl();
		System.out.println("current url is="+url);
		
		
		WebElement fromcity=driver.findElement(By.id("fromPlaceName"));
		fromcity.sendKeys("BENG");
		
		// to fetch attribute value
		String fromcitynm=fromcity.getAttribute("value");
		System.out.println("fromcity name is="+fromcitynm);
		
		// for keys down
		fromcity.sendKeys(Keys.DOWN);
		Thread.sleep(5000);
		//fromcity.sendKeys(Keys.DOWN);
		//fromcity.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		String fromcitynm1=fromcity.getAttribute("value");
		System.out.println("fromcitynmae is="+fromcitynm1);
		
		//Handles ajax components//
		
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   String citynm="return document.getElementById(\"fromPlaceName\").value;";
		   String cityname=(String) js.executeScript(citynm);
		   System.out.println("Cityname is:"+cityname);
		   
		   int i=0;
		   while(!cityname.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		   {   
			   driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			   cityname=(String) js.executeScript(citynm);
			   System.out.println("Cityname is:"+cityname);
			   
			   if(i>5)
			   {
				   break;
			   }
		   }
		   if(i>5)
		   {
			   System.out.println("element is not found");
		   }
		   else
		   {
			   System.out.println("element is found");
			   }
		   }
		   

}
