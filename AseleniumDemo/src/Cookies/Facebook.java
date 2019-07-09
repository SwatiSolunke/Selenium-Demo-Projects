package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook
{
   public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// To load the url
		driver.get("https://www.facebook.com");
		
		// To maximize the browser
		driver.manage().window().maximize();
		
        // To iterate number of cookies
		Set<Cookie> cookies = driver.manage().getCookies();
		for(Cookie cookie:cookies)
		{
			System.out.println("The cookie name is:===>"+cookie.getName());
			System.out.println("The cookie class is:===>"+cookie.getClass());
			System.out.println("The cookie path is:===>"+cookie.getPath());
			System.out.println("The cookie domain is:===>"+cookie.getDomain());
			System.out.println("The cookie expiry date is:===>"+cookie.getExpiry());
			System.out.println("The value of cookie is:===>"+cookie.getValue());
			System.out.println("To verify cookie is secure:===>"+cookie.isSecure());
			System.out.println("Verify cookie is httpsonly:===>"+cookie.isHttpOnly());
		}
		
	}

}
