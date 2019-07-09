package Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amezon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
	     
	     // To load the url 
	     driver.get("https://www.amazon.in");
	     
	     // To maximize the browser
	     driver.manage().window().maximize();
	     
	     // To load page load
	     driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	     
	     // To find out number of hyperlinks on the webpage
	     List<WebElement> hyperlinks= driver.findElements(By.tagName("a"));
	     int count = hyperlinks.size();
	     System.out.println("The number of hyperlinks on the webpage are:===>"+count);
	     
	     // To get title of the webpage
	     String title = driver.getTitle();
	     System.out.println("The title of the webpage is:==>"+title);
	     
	     // To get url of the webpage
	     String url = driver.getCurrentUrl();
	     System.out.println("The url of the webpage is:==>"+url);
	     
	     System.out.println("----------------------------------------------------------------------------------------------------------------------");
	    
	     // Double click on "your-amezon.in"
	     WebElement your_Amezon = driver.findElement(By.id("nav-your-amazon"));
	     Actions action = new Actions(driver);
	     action.doubleClick(your_Amezon).build().perform();
	     
	     // Use Explicit-wait method here
	     WebDriverWait wait = new WebDriverWait(driver,15);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
	     
	     // To get title of the webpage
	     String title1 = driver.getTitle();
	     System.out.println("The title1 of the webpage is:==>"+title1);
	     
	     // Navigating back
	     driver.navigate().back();
	   
	     // To get title of the webpage
	     String title2 = driver.getTitle();
	     System.out.println("After navigating back The title1 of the webpage is:==>"+title2);
	     
	     System.out.println("----------------------------------------------------------------------------------------------------------------------");
		    
	     // For Right click
	     WebElement customer_serv = driver.findElement(By.linkText("Customer Service"));
	     Actions action1 = new Actions(driver);
	     action1.contextClick(customer_serv).build().perform();
	     
	     Thread.sleep(3000);
	     
	     // For mousehover
	     WebElement your_orders = driver.findElement(By.xpath("//span[@class='nav-line-1'][.='Hello, Sign in']"));
	     Actions action2 = new Actions(driver);
	     action2.moveToElement(your_orders).build().perform();
	     
	     // click on yourorder   links in moousehover list
	     driver.findElement(By.xpath("//span[@class='nav-line-4'][.='Yours-orders']")).click();
	     
	     // Implicit Wait method here
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     
	     // For email-text box
	     WebElement email = driver.findElement(By.name("email"));
	    
	     boolean act_flag=email.isDisplayed();
	     System.out.println("Email text-box is displayed:===>"+act_flag);
	     if(act_flag==true)
	     {
	    	 email.sendKeys("Swati@1995.gmail.com");
	     }
	   }
	}
