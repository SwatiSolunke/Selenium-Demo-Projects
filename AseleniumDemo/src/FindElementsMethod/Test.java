package FindElementsMethod;

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
	    
	    // To load the url of yhe webpage
	    driver.get("http://demo.guru99.com/test/ajax.html"); 
	    
	    // To maximize the browser 
	    driver.manage().window().maximize();
	    
	    // To find out number of webelements on the webpage
	    List<WebElement> elements = driver.findElements(By.name("name"));
	    System.out.println("Number of elements:" +elements.size());

	    for (int i=0; i<elements.size();i++){
	      System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
	    }
	  }

}
