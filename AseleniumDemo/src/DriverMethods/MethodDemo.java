package DriverMethods;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodDemo 
{
  public static void main(String[] args)
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Swati Study Material\\SeleniumSetup\\chrome\\chromedriver.exe");
	
      WebDriver driver = new ChromeDriver();
      
      // get()==> It is used to passed the website url
      driver.get("https://www.google.com");
      System.out.println("To load the url ");
      
      // manage().window().maximize()==> It is used to maximize the browser
      driver.manage().window().maximize();
      System.out.println("Maximize the browser here");
      
      // getCurrentUrl()==> It is used to fetch the current url of the webpage
      String url = driver.getCurrentUrl();
      System.out.println("The current url of the webpage is==>"+url);
      
      // getTitle()==> It is used to fetch the title of the current webpage
      String title = driver.getTitle();
      System.out.println("The title of the webpage is:==>"+title);
      
      // getWindowHandles()==> It is used to handle any window and returns a window key
      String key = driver.getWindowHandle();
      System.out.println("The window handle key is:==>"+key);
      
      /*
      // getWindowHandles()==> It is used to handle multiple windows at a same time
      Set<Key> windows = driver.getWindowHandles();
      System.out.println("The multiple windows are:==>"+windows);
      */
      
      /*
      // getPageSource()==> It is used to fetch source code of the current webpage
      System.out.println( driver.getPageSource());
      */
      
      /*
      // swithTo()==> It is used to switch any frame by using frame or framename
      driver.switchTo().frame(0); // ..............Byindex
      driver.switchTo().frame("frame");   // .............Byname
      */
      /*
      //switchTo()==> It is used to switch focus of driver on another window
      driver.switchTo().window("windowname");
      */
      
      // navigate().To(String)==> It is used to navigate any other webpage or website
      driver.navigate().to("https://www.naukri.com");
      String title1 = driver.getTitle();
      System.out.println("The title of the webpage is:==>"+title1);
      
      // navigate().back()==> It is used to navigate back from next page to previous page
      driver.navigate().back();
      String title2 = driver.getTitle();
      System.out.println("After navigating back from naukri to google title of webpage is:==>"+title2);
      
      // navigate().forward()==> It is used to navigate back from next page to previous page
      driver.navigate().forward();
      String title3 = driver.getTitle();
      System.out.println("After navigating forward from  google naukri to title of webpage is:==>"+title3);
      
      /*
      //findElement()==> It is used to locate any webelement on the webpage
      WebElement compLogo =driver.findElement(By.className("hb2Smf"));
      System.out.println("The component is==>"+compLogo);
      */
      
      /*
      //findElements()==> It is used to locate group of  webelement on the webpage
      List<WebElement> manyComp =driver.findElements(By.className("hb2Smf"));
      System.out.println("The component is==>"+manyComp);
      */
      
      /*
      //manage()==> It is used to synchronize and script with application
      driver.manage().timeouts();
      driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
      driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
      */
      // manage().getCookies()==> It is used to fetch number of cookies
      Set<Cookie> cookies = driver.manage().getCookies();
      for(Cookie cookie:cookies)
      {
    	  System.out.println(cookie.getName());
      }
      
      // manage().deleteAllCookies()==> It is used to delete all cookies
      driver.manage().deleteAllCookies();
      
      // quit()==> It is used to close current open browser & child windows or pop up windows in current browsers
      //driver.quit();
      
      // close()==> It is used to close current web browser
      driver.close();
  }
}
