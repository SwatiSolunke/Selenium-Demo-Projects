package MultiplePopupWindowHandling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari
{
	public static void main(String[] args) throws InterruptedException 
	 {
		 System.setProperty("webdriver.chrome.driver", "E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
			
	     WebDriver driver = new ChromeDriver();
	     
	     // To load the url 
	     driver.get("https://www.naukri.com");
	     
	     // To maximize the browser
	     driver.manage().window().maximize();
	     
	     // To get the title of the webpage
	     String title = driver.getTitle();
	     System.out.println("The title of the webpage is:===>"+title);
	     
	     // To get the url of the webpage
	     String url = driver.getCurrentUrl();
	     System.out.println("The current url of the webpage is:===>"+url);

	     // To find out number of hy	perlinks on the webpage
	     List<WebElement> ls = driver.findElements(By.tagName("a"));
	     int count = ls.size();
	     System.out.println("The number of hyperlinks on the webpage are:===>"+count);
	     
	     System.out.println("---------------------------------------------------------------------------------------------------------------------");

	     // It will return the parent window name as a string
	     String parent = driver.getWindowHandle();
	     
	     // Title of the parent window
	     String title1 = driver.getTitle();
		 System.out.println("The parent window titleis:==>"+title1);
			
	     
	     // To handle multiple windows
	     Set<String> s1 = driver.getWindowHandles();
	     Iterator<String> itr = s1.iterator();
	     while(itr.hasNext())
	     {
	    	 String childwindow = itr.next();
	    	 
	    	 // Here we will comapare if parent window is not equal to child then we will close
	    	 
	    	 if(!parent.equalsIgnoreCase("childwindow"))
	    	 {
	    		 driver.switchTo().window(childwindow);
	    		 
	    		 // child window title
	    		 String title2 = driver.getTitle();
	    		 System.out.println("The child window title is:==>"+title2);
	    		 Thread.sleep(5000);
	    		 
	    		 driver.close();
	    	 }
	     }
	     // Once all pop up windows closed now switch to parent window
	     //driver.switchTo().window(parent);
	     //Thread.sleep(5000);
	    // System.out.println(driver.getTitle());
	     //driver.close();
	     
}
}