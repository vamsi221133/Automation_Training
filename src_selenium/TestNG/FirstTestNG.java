package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNG {
	WebDriver driver;
	String s ="C:\\Users\\training\\Documents\\selenium\\chromedriver_win32 (2)\\chromedriver.exe";
	
	@BeforeTest
	public void launchingBrowser() {
		System.out.println("launching browser ");
		System.setProperty("webdriver.chrome.driver", s);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@BeforeMethod
	public void loginpage() throws InterruptedException {
		System.out.println("navigating to webpage ");
		Actions act = new Actions(driver);
		driver.get("https://www.amazon.com/");
		System.out.println("navigating to loginpage");
		Thread.sleep(2000);
		WebElement ele =driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Thread.sleep(2000);
		act.doubleClick(ele).build().perform();
		
	}
	@Test(priority=1)
	public void validCredntl() throws InterruptedException {
		System.out.println("valid credential");
		driver.findElement(By.xpath("//input[@name='email']")).
		sendKeys("6281186742");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.id("ap_password")).sendKeys("vmskrshn10");
	}
	@Test(priority=2)
	public void invalidcrendtl() {
		System.out.println("invalid credential");
		driver.findElement(By.id("ap_email")).sendKeys("vamsikrishna");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@Test(priority=3)
	public void Emptycrendtl() {
		System.out.println("Empty credential");
		driver.findElement(By.id("ap_email")).sendKeys("");}
	@AfterTest
	public void aftertest() {
		//driver.close();
	}
}
