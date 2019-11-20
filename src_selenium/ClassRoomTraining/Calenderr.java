package ClassRoomTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderr {

	public static void main(String[] args) {
		WebDriver driver;
		String s ="C:\\Users\\training\\Documents\\selenium\\chromedriver_win32 (2)\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", s);
		driver = new ChromeDriver();driver.get("http://team-scale.com/testo/references/date_picker/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@value='Open calendar']")).click();
		
		
	}

}
