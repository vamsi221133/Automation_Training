package BuissnessMethods;

import java.util.Properties;
import org.openqa.selenium.WebDriver;

import Utilities.BrowserConfig;

public class BaseSetUpDriver_Flipkart extends BrowserConfig {
	public static Properties prop;
	private static WebDriver driver;

	public static void browsertrigger()
	{
		driver=setBrowser("chrome","https://www.flipkart.com/");
	}
	public static WebDriver getDriver() {
		return driver;
		
		
	}
 
}
