package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  
	{									
		System.setProperty("webdriver.chrome.driver","E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
        // To load the url of the webpage           		
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        
        // To maximize the chrome browser
        driver.manage().window().maximize();
                            		
     	// To entering data in customer ID textbox     	
        driver.findElement(By.name("cusid")).sendKeys("53920");
        
        // Click on submit button
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();		
    }	


}
