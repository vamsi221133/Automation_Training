package ClassRoomTraining;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Firefox {
static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\training\\Documents\\Selenium_classwork\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		//FirefoxBinary = new FirefoxBinary("C:\\Program Files (x86)\\Mozilla Firefox");
		//FirefoxBinary bin = new FirefoxBinary("C:\\Program Files (x86)\\Mozilla Firefox");
		//driver = new FirefoxDriver();
		File pathBinary = new File("search-ms:displayname=Search%20Results%20in%20Local%20Disk%20(C%3A)&crumb=location:C%3A%5C\\Mozilla Firefox\\firefox.exe");
		 FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);  
		 DesiredCapabilities desired = DesiredCapabilities.firefox();
		 FirefoxOptions options = new FirefoxOptions();
		 desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
		driver=new FirefoxDriver(options);
	
	}

}
