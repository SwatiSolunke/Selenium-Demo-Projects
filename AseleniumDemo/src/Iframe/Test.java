package Iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
	     
	     // To load the url 
	     driver.get("https://jqueryui.com/droppable");
	     
	     // To maximize the browser
	     driver.manage().window().maximize();
	     
	     /* It is not possible..bcoz webelement are present in ifame..locators are correct
	     // finding locators
	     WebElement source = driver.findElement(By.id("draggable"));
	     WebElement target = driver.findElement(By.id("droppable"));
	     driver.findElement(By.id("droppable")).click();   // it is inside the frame
	     */
	     
	     // To find out number of iframes on the webpage first
	     List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
	     int count = iframe.size();
	     System.out.println("The number of iframes on the webpage are:===>"+count);
	     
	     // handling iframe here
	     driver.switchTo().frame(0);
	     WebElement source = driver.findElement(By.id("draggable"));
	     WebElement target = driver.findElement(By.id("droppable"));
	     
	     // Tocreate an action
	     Actions action = new Actions(driver);
	     action.dragAndDrop(source, target).build().perform();
	     
	     // To create javascript executor here to handling javascript alert
	     JavascriptExecutor javascript = (JavascriptExecutor)driver;
	     javascript.executeAsyncScript("alert('element dragged successfully')");
	     Thread.sleep(3000);
	     driver.switchTo().alert().accept();  // handling alert here
	    
	     // To move the focus of driver from java ifarme to original webpage
	     driver.switchTo().defaultContent();
	     
	     driver.findElement(By.linkText("About")).click();  // click on about link
	     
	     String title = driver.getTitle();
	     System.out.println("The title of the about webpage is:===>"+title);
	     
	     
	     
		
	}

}
