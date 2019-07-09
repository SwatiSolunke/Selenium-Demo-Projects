package CheckboxSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main
{
	public static void main(String[] args) {									
		
    	// declaration and instantiation of objects/variables		
        System.setProperty("webdriver.chrome.driver","E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();						
        		
        // To load the url 
        driver.get("http://demo.guru99.com/test/radio.html");
        
        // Selecting CheckBox		
        WebElement option1 = driver.findElement(By.id("vfb-6-0"));							

        // This will Toggle the Check box 		
        option1.click();			

        // Check whether the Check box is toggled on 		
        if (option1.isSelected())    // ...isSelected() method is used to know whether the Checkbox is toggled on or off
        {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }		
         
        		
        		
        //Selecting Checkbox and using isSelected Method		
        driver.get("http://demo.guru99.com/test/facebook.html");					
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
        for (int i=0; i<2; i++) {											
            chkFBPersist.click (); 			
            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
        }		
		//driver.close();		
        		
    }		

}
