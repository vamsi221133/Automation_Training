package ClassRoomTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {

	public static void main(String[] args) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training\\Documents\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//div[@class='container']//input[@type='text']")).sendKeys("vamsi");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		WebElement ele = driver.findElement(By.xpath("//div[@class='container']//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(ele);
		
		//driver.findElement(By.)
		
		
	}

}
