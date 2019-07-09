package scopeofwebpage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
	public static void main(String[] args) throws InterruptedException 
	{
		   System.setProperty("webdriver.chrome.driver","E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   
		   // To load the url
		   driver.get("http://www.qaclickacademy.com/practice.php");
		   
		   // To load page
		   driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		   
		   // maximize the browser
		   driver.manage().window().maximize();
		   
		   // To get title of the webpage
		   String title=driver.getTitle();
		   System.out.println("The Title of web page is:"+title);
		   
		   // Number of hyperlinks on the webpage
		   int count1=driver.findElements(By.tagName("a")).size();
		   System.out.println("The number of hyperlinks on web page are:"+count1);
		   
		   // To move focus of driver on footer
		   WebElement footerdriver=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		   
		   // Number of hyperlinks on footer 
		   int count2=footerdriver.findElements(By.tagName("a")).size();
		   System.out.println("The number of hyperlinks on footerdriver:"+count2);
		   
		   // To move focus of driver on column
		   WebElement columndriver=driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		   
		   // // Number of hyperlinks on column
		   int count3= columndriver.findElements(By.tagName("a")).size();
		   System.out.println("The number of hyperlinks in column are:"+count3);
		   
		   // To open the website on next tab//
		   
		   for (int i=1;i<count3;i++)
		   {
			   String clickonlink= Keys.chord(Keys.CONTROL,Keys.ENTER);
			   columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			   Thread.sleep(5000);
		   }
		   //Handling multiple windows 
		   
		  Set<String> abc=driver.getWindowHandles();
		  Iterator<String> itr= abc.iterator();
		   
		   while(itr.hasNext())
		   {
			   driver.switchTo().window(itr.next());
			   System.out.println(driver.getTitle());
			   
			   driver.close();
			   
		   }  
		   

		}

}
