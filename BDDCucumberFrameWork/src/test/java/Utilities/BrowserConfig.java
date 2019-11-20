package Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfig {
public  static BrowserConfig obj;
private static WebDriver driver;

	
	public static WebDriver setBrowser(String browse,String url)
	{
		if(browse.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","Drivers_/chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.get(url);
		}
		else if(browse.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver","Drivers_/geckodriver.exe");
			  driver = new FirefoxDriver();
			  driver.get(url);  
		}
		return driver;
		
	}

}
