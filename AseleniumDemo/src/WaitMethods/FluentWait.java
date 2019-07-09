package WaitMethods;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Function;
import com.google.common.base.Functions;

public class FluentWait 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
	     
	     // To load the url 
	     driver.get("https://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
	     
	     // Pageload
	     driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	     
	     // To maximize the browser
	     driver.manage().window().maximize();
	     
	     // To get the title of the webpage
	     String title = driver.getTitle();
	     System.out.println("The title of the webpage is:===>"+title);
	     
	     // Click on "click on me button"
	     driver.findElement(By.xpath("//button[@onclick='myFunction()'][.='Click Me - Fluent Wait']")).click();
	     
	    FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NouchElementException.class);
	     WebElement element =wait.until(new Function<WebDriver,WebElement>()
	      {
	    	 @Override
	    	 public WebElement apply(WebDriver driver)
	    	 {
	    		 WebElement msgelement=driver.findElement(By.xpath("//p[contains(text(),'Software Testing Material - DEMO PAGE')]"));
	    		 String msgtxt = msgelement.getText();
	    		 //System.out.println(msgtxt);
	    		 // return msgelement
	    		 
	    		 if(msgtxt.equals("Software Testing Material - DEMO PAGE"))
	    		 {
	    			 System.out.println(msgtxt);
	    		 }
	    		 else {
	    			System.out.println("Fluent wait is failed"); 
	    			return null;
	    		 }
	    		 
	    		 
	    	 }
	      });
	     
	}
}
