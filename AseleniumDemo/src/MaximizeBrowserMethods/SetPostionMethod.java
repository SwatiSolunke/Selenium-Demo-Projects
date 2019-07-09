package MaximizeBrowserMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPostionMethod 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver;
	
	    System.setProperty("webdriver.chrome.driver","E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		driver= new ChromeDriver();
 		 
         // Launch the application
     	 driver.get("https://www.guru99.com/");
     	 
     	Point p = new Point(0,3000);
     	
     	// Point setPosition() – This method is used to set the position of the current browser.
     	/*Dimension getSize() – This method is used to get the size of the browser in height and width.
     	It returns the dimension of the browser.*/
     	
     	//Minimize the current window to the set position
     	driver.manage().window().setPosition(p);
     	        
     	//To Delay execution for 10 sec. as to view the minimize browser
     	//you can view in the taskbar below of the screen.
     	Thread.sleep(10000);
     	        
        //Close the browser
     	driver.quit();
	}	

}
