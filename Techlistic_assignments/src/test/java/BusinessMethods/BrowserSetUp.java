package BusinessMethods;


import java.util.Properties;
import org.openqa.selenium.WebDriver;
import utilities.BrowserConfi;

public class BrowserSetUp extends BrowserConfi  {

	private static WebDriver driver;
	public static Properties prop;
	public String username;
	public String password;
	
	public static void BrowserTrigger(String url) {
		driver = browser("chrome", url);
	}
	public static WebDriver GetDriver() {
		return driver;
	}
	
}
