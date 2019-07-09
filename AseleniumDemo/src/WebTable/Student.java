package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Student {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    // To load the url of webpage
	    driver.get("file:///E:/Swati%20Study%20Material/Swati%20Study%20Material/Html%20program/student.html");
	      
	    // To maximize the webpage
	    driver.manage().window().maximize();
	    
        // To get the title of the webpage
	    String title = driver.getTitle();
	    System.out.println("The title of the webpage is:===>"+title);
	    
	    // TO get current url of the webpage
	    String url = driver.getCurrentUrl();
	    System.out.println("The current url of the webpage is:===>"+url);
	    
	    System.out.println("---------------------------------------------------------------------------------------------------");
	
	   // To find out number of rows on webpage
	    List<WebElement> rowsss = driver.findElements(By.tagName("tr"));
	    int count = rowsss.size();
	    System.out.println("The number of rows on the webpage are:===>"+count);
	    
	    // Iterate the table data
	    for(WebElement row : rowsss)
	    {
	    	List<WebElement> col = row.findElements(By.tagName("td"));
	    	{
	    		for(WebElement columns :col)
	    		{
	    			System.out.println(columns.getText());
	    		}
	    	}
	    }
	}

}
