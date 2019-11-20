package vamsitimecards;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timecrd {
	static WebDriver driver = null ;
	static void init() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Desktop\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
	}

	public static void main(String[] args) throws InterruptedException {
		init();
	ConnectA STC = new ConnectA();
	STC.username(driver).sendKeys("vamsikrishnaa");
	STC.password(driver).sendKeys("Maveric@1");
	driver.findElement(By.name("yt0")).click();
	Thread.sleep(2000);
	STC.timecard(driver);
	STC.logout(driver);

	}

}
