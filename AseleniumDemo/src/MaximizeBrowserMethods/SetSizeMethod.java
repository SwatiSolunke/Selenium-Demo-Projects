package MaximizeBrowserMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod 
{
	public static void main(String args[]) throws InterruptedException
	{
	    System.setProperty("webdriver.chrome.driver","E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
 		 
         // Launch the application
     	 driver.get("https://www.guru99.com/");
     	 
     	Dimension d = new Dimension(300,1080);
     	
     	//Void setSize() – This method is used to set the size of the current browser.
     	
     	//Resize current window to the set dimension
     	driver.manage().window().setSize(d);
     	        
        //To Delay execution for 10 sec. as to view the resize browser
     	Thread.sleep(10000);
     	       
     	//Close the browser
     	driver.quit();
	}	

}
