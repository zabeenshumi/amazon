package commoncode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCode {
	
	WebDriver driver;
	
   public void browser() {
	
	System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
	driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	driver.get("https://www.amazon.com");   
	   
}	
   private static String URL="https://www.amazon.com/";
	public static String getURL() {
	return URL;
}





	public static WebDriver getbrwser(String BrowserName, WebDriver driver){
		if (BrowserName.equalsIgnoreCase("chrome"))	{
		System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		}
		return driver;
		
	}	
	
}