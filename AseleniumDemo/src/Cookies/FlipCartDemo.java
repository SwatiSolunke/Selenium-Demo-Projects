package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// To load the url
		driver.get("https://www.flipkart.com");
		
		// To maximize the browser
		driver.manage().window().maximize();
		
		Set<Cookie> cookies = driver.manage().getCookies(); // Return The List of all Cookies
		for(Cookie cookie:cookies)
		{
			// It is fetch specific name of cookie
			System.out.println("The cookie name is:===>"+cookie.getName());
			
			// It is used to retrieve cookies value information
			System.out.println("The cookie value is:==>"+cookie.getValue());
			
			// It is used to retrieve path information 
			System.out.println("The cookie path is:===>"+cookie.getPath());
			
			// It is used to retrieve domain name of the website
			System.out.println("The cookie Domain of cookie is:===>"+cookie.getDomain());
			
			// It is used to retrieve expiry date of the cookies
			System.out.println("The expiry date of cookie is:===>"+cookie.getExpiry());
			
			// It is verify the website is secure or not
			System.out.println("Verify the cookie is secure:===>"+cookie.isSecure());
			
			// It is used to verify that the website is http only or not
			System.out.println("Verify is http only:===>"+cookie.isHttpOnly());
			
			// It is used to retrieve information about cookie class
			System.out.println("The cookie class is:===>"+cookie.getClass());
			
		}
		// It is used to delete a specific cookie name
		driver.manage().deleteCookieNamed("S");
		
		// It is used to get all cookies name
		Cookie cookie = driver.manage().getCookieNamed("SN");
	    System.out.println("The cookie name is:===>"+cookie.getName());
	    
	    // It is used to add a new cookie in a cookies
	    Cookie cookie1 = new Cookie("username","swati");
	    driver.manage().addCookie(cookie1);
		}

}
