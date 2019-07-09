package multipleRadioButtonSelection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleRadio {

	public static void main(String[] args) throws InterruptedException 
	{
		
       System.setProperty("webdriver.chrome.driver", "E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// To load the url
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		// To maximize the browser
		driver.manage().window().maximize();
		
		// To fetch the title of the webpage
		String title = driver.getTitle();
		System.out.println("The title of the webpage is:===>"+title);
		
	    // To select multiple radio buttons at a time......for group1
		List<WebElement> radiobutton = driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println("The total numbers of radio are:===>"+radiobutton.size());
		
        // To iterate multiple radio buttons
		for(int i=0; i<radiobutton.size(); i++)
		{
			radiobutton = driver.findElements(By.xpath("//input[@name='group1']"));
			System.out.println(radiobutton.get(i).getAttribute("value"));
			radiobutton.get(i).click();
			Thread.sleep(3000);
		}
		
		//  To click on a specific radio button
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
		Thread.sleep(3000);
		
		// For group2
		List<WebElement> radiobutton1 = driver.findElements(By.xpath("//input[@name='group2']"));
		System.out.println("The total numbers of radio are:===>"+radiobutton.size());
		
	    // To iterate multiple radio buttons
		for(int i=0; i<radiobutton1.size(); i++)
		{
			radiobutton1 = driver.findElements(By.xpath("//input[@name='group2']"));
			System.out.println(radiobutton1.get(i).getAttribute("value"));
			radiobutton1.get(i).click();
			Thread.sleep(3000);
		}
		
		//  To click on a specific radio button
		driver.findElement(By.xpath("//input[@value='Wine']")).click();
		Thread.sleep(3000);
		

	}
	
}
