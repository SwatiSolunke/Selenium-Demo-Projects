package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMail 
{
  public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.chrome.driver", "E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		
	   WebDriver driver = new ChromeDriver();
	    
		// To load the website url
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// To maximize the window
		driver.manage().window().maximize();
		
		// To get title of the 
		String title=driver.getTitle();
		System.out.println("The current title of the webpage is===>"+title);
		
		// To get current url of the webpage 
		String url=driver.getCurrentUrl();
		System.out.println("The current url of the webpage is:===>"+url);
			
		System.out.println("------------------------------------------------------------------------------------------");
		
		// To handle Alert Window
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(4000);
		
		//To print Alert msg on consol
		String msg=	 driver.switchTo().alert().getText();
		System.out.println("The alert pop-up msg is:===>"+msg);
		
		System.out.println("------------------------------------------------------------------------------------------");
		
        //handle the alert
		driver.switchTo().alert().accept();
		
		// To dismiss alert pop-up window
		//driver.switchTo().alert().dismiss();
		
		// To sending some text in alert window
	    //driver.switchTo().alert().sendKeys("text");
			
	  }
  }


