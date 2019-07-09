package MultiplePopupWindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// To load the url of the webpage
		driver.get("http://demo.guru99.com/popup.php");
		
		// To maximize the browser
		driver.manage().window().maximize();
		
		// click on a link "click here"
		driver.findElement(By.linkText("Click Here")).click();
		
		// To handle the parent window
		String parentwindow = driver.getWindowHandle();
		
		// Title of the parent window
		String title1 = driver.getTitle();
		System.out.println("The parent window title is:==>"+title1);
		
		// To handle the childwindow or open window
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> itr = s1.iterator();
		while(itr.hasNext())
		{
			String childwindow = itr.next();
			if(!parentwindow.equalsIgnoreCase(childwindow))
			{
				// To switch the childwindow
				driver.switchTo().window(childwindow);
				
				// To get title of the child window
				String title = driver.getTitle();
				System.out.println("Title of the childwindow is:==>"+title);
				
				//To sending values in the useremailId text box
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("12344");
				
				// Click on the submit button
				driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
				
				// To close the child window
				driver.close();

			}
		}

	    // Swching the parent window 
		driver.switchTo().window(parentwindow);
		
		
		
	}

}
