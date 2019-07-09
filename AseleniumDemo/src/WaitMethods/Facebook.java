package WaitMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// To load the url of the webpage
		driver.get("http://www.facebook.com");
		
		// To maximize the browser
		driver.manage().window().maximize();
		
		// To use pageload method here because page is loaded
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		// To get title of the webapge
		String title = driver.getTitle();
		System.out.println("The title of the webpage is:==>"+title);
		
		// To click on forgotton-account link
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		// Use Implicit wait method here to finding the next element
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// title of the webpage 
		String title1 = driver.getTitle();
		System.out.println("The title of webpage after clicking on forgotten-account link is:==>"+title1);
		
	    // To fetch the label of find your account text
		String findacclb = driver.findElement(By.xpath("//h2[@class='uiHeaderTitle'][.='Find Your Account']")).getText();
		System.out.println("The find account your label is:==>"+findacclb);
		
		// Navigate back
		driver.navigate().back();
		
		// To get title of the wepage after navigating back
		String title3 = driver.getTitle();
		System.out.println("After navigating back the title of the wepage is:==>"+title3);
		
		// Use explicit wait method here ... it is used to verify the condition
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']")));
		
		// To send values in firstname textbox
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		fname.sendKeys("shree");
		
		// To fetch value in firstname textbox
		String fnameval = fname.getAttribute("value");
		System.out.println("The firstname attribute value is:==>"+fnameval);
		
		// To send values in lastname textbox
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
	    lname.sendKeys("mate");
				
		// To fetch value in lastname textbox
		String lnameval = lname.getAttribute("value");
	    System.out.println("The lastname attribute value is:==>"+lnameval);
				
	    // To send values in emailid textbox
	 	WebElement emailid = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	 	emailid.sendKeys("mate@1234");
	 				
	 	// To use Explicit-wait method here
	 	WebDriverWait wait1 = new WebDriverWait(driver,15);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='reg_email__']")));
		
	    // To fetch value in emailid textbox
	 	String emailidval = emailid.getAttribute("value");
	 	System.out.println("The emailid attribute value is:==>"+emailidval);
	 				
	 	  // To send values in password textbox
	 	WebElement passwd = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	 	passwd.sendKeys("mate@1234");
	 				
	    // To fetch value in password textbox
	 	String passwordval = passwd.getAttribute("value");
	 	System.out.println("The password attribute value is:==>"+passwordval);
	 	
	 	// To select value from dropdownbox
	 	WebElement birthday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	 	Select sel1 = new Select(birthday);
	 	sel1.selectByValue("2");
	 	
	 	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	 	Select sel2 = new Select(month);
	 	sel2.selectByValue("4");
	 		
	 	WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	 	Select sel3 = new Select(year);
	 	sel3.selectByValue("2018");
	 	
	 	// Click on radio button
	 	driver.findElement(By.id("u_0_a")).click();
	 	
	 	// click on sign-up button 
	 	driver.findElement(By.linkText("Sign Up")).click();
   }
 
}
