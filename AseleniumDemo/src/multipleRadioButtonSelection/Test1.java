package multipleRadioButtonSelection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver", "E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// To load the url
		driver.get("http://demo.guru99.com/test/radio.html");
		
		// To maximize the browser
		driver.manage().window().maximize();
		
		// To fetch the title of the webpage
		String title = driver.getTitle();
		System.out.println("The title of the webpage is:===>"+title);
		
	    // To select multiple radio buttons at a time
		List<WebElement> radiobutton = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("The total numbers of radio are:===>"+radiobutton.size());
		
		// to iterate multiple radio buttons
		for(int i=0; i<radiobutton.size(); i++)
		{
			radiobutton= driver.findElements(By.xpath("//input[@type='radio']"));
			System.out.println(radiobutton.get(i).getAttribute("value"));
			
			radiobutton.get(i).click();
			Thread.sleep(3000);
		}
		driver.findElement(By.id("vfb-7-3")).click();
		Thread.sleep(3000);
	}


}
