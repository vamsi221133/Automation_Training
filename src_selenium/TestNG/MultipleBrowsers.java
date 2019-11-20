package TestNG;

	import java.util.HashMap;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class MultipleBrowsers {
		private static MultipleBrowsers obj;
	 static WebDriver driver;
	 private MultipleBrowsers()
	 {
		 
	 }
	 public static MultipleBrowsers getInstance()
	 {
		 if(obj==null)
		 {
			 obj=new MultipleBrowsers();
		 }
		return obj;
		 
	 }
	
		public void setBrowser(String browse)
		{
			if(browse.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Desktop\\chromedriver.exe");
				  driver = new ChromeDriver();
				  driver.get("https://connect.maveric-systems.com/index.php/site/login");
			}
			else if(browse.equalsIgnoreCase("FireFox"))
			{
				System.setProperty("webdriver.gecko.driver","C:\\Users\\training\\Desktop\\geckodriver.exe");
				  driver = new FirefoxDriver();
				  driver.get("https://connect.maveric-systems.com/index.php/site/login");
				  driver.findElement(By.xpath("//input[@id='LoginForm_username']")).sendKeys("vamsi");
			}
			
		}
		

	}



