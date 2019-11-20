package TestNG;


	
	import java.net.MalformedURLException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
	public class Parallels {
	WebDriver driver;
	@BeforeMethod
		public void launchbrowser() throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\downloadfiles\\chromedriver.exe");
		  driver = new ChromeDriver();
		//driver=new WebDriverException();
		//driver.manage().window().maximize();
		}
		@Parameters({"browsers"})
		@Test
		public void firstest(String text) throws InterruptedException {
			driver.get("https://connect.maveric-systems.com/index.php/site/login");
			driver.findElement(By.xpath("//input[@id='LoginForm_username']")).sendKeys(text);	
		
		}
		@Parameters({"browserss"})
		@Test
		public void firsttest(String text1) throws InterruptedException {
			driver.get("https://outlook.office.com/mail/inbox/id/AAQkADYzMjM1YzQxLTNmZDgtNDc1NS1hNWIwLTkwNmQ4ZGI2MjM4YQAQAGBTGjX3BeNBumxIEz9stjA%3D");
			driver.findElement(By.id("searchBoxId")).sendKeys(text1);	
		
		}
		@AfterTest
		public void secondtest() throws InterruptedException {
			//driver.close();
		}

	}


