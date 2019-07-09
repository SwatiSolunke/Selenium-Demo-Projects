package ImageLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Image links are the links in web pages represented by an image which 
 * when clicked navigates to a different window or page.
 */

/*Since they are images, we cannot use the By.linkText() and By.partialLinkText()
 *  methods because image links basically have no link texts at all.
 */

/*In this case, we can use either By.cssSelector or By.xpath. 
 * The first method is more preferred because of its simplicity.
 */
public class Fcebook {

	public static void main(String[] args) 
	{
	    System.setProperty("webdriver.chrome.driver","E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();						
        		
        // To load the url 
        driver.get("https://www.facebook.com/login/identify?ctx=recover");
        
        // To maximize the browser
        driver.manage().window().maximize();
        
        // To fetch the title of the webpage
        String title = driver.getTitle();
        System.out.println("The title of the webpage is:===>"+title);
        
        //click on the "Facebook" logo on the upper left portion		
		driver.findElement(By.cssSelector("a[title='Go to Facebook home']")).click();
        //driver.findElement(By.xpath("//a[@title='Go to Facebook home']")).click(); 				

		//verify that we are now back on Facebook's homepage		
		if (driver.getTitle().equals("Facebook - log in or sign up")) 
		{							
        System.out.println("We are back at Facebook's homepage");					
        } 
		else 
        {			
        System.out.println("We are NOT in Facebook's homepage");					
       }		
    driver.close();		

  }		
 }


