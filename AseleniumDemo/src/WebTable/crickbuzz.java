package WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class crickbuzz 
{
	 public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver","E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			// To load the url
			driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-shri-lanka-inuae-2017");
			
			// To maximize the browser
			driver.manage().window().maximize();
			
			// to load the webpage
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			
			// To get title of the webpage
		    String title = driver.getTitle();
		    System.out.println("The current title of the webpage is:===>"+title);
		    
		    // total number of hyperlinks on the webpage
		    List<WebElement>ls=driver.findElements(By.tagName("a"));
			int count=ls.size();
			System.out.println("total number of hyperlinks on the webpage:===>"+count);
			
			// for table
			WebElement table = driver.findElement(By.xpath("//div[@id='innings_1']/child::div[1]"));
			
			// rowcount
			 int rowcount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();	
		     System.out.println("rows are="+rowcount);	
		     
		     // total sum of runs
		     int sum=0;
		     for(int i=0;i<count-2;i++)
		      {
			     String val=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			     int value=Integer.parseInt(val);
			     sum=sum+value;
			     //System.out.println("sum is="+sum);
		      }

		    System.out.println("total sum are="+sum);
		    
		    // capature extras
		    String extraval = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		    int extra = Integer.parseInt(extraval);
		    System.out.println("Total runs including by extras:===>"+extra);
		    
		    // total runs
		    String totalval = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		    int totalvalue = Integer.parseInt(totalval);
		    System.out.println("The runs are:===>"+totalvalue);
		    
		    
		    
			
			
		}
}
