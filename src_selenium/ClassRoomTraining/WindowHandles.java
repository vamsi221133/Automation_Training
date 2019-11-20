package ClassRoomTraining;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WindowHandles {

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training\\Documents\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'    click   ')]")).click();

		String st = driver.getWindowHandle();
		System.out.println("window handles are : "+st.toString());
//		System.out.println("page source are : "+driver.getPageSource());
		System.out.println("window title are : "+driver.getTitle());
		System.out.println("class  are : "+driver.getClass());
		ArrayList<String> str= new ArrayList<String>(driver.getWindowHandles());
		for(int i=0;i<str.size();i++) {
			if(i==1) {
				driver.switchTo().window(str.get(i));
				System.out.println(driver.getCurrentUrl());
				TakesScreenshot scr = (TakesScreenshot) driver;
				File src = scr.getScreenshotAs(OutputType.FILE);
				File dstn = new File("C:\\Users\\training\\Desktop\\Snapshot.txt");
				FileHandler.copy(src, dstn);	
				driver.close();
				driver.switchTo().window(str.get(0));
				System.out.println(driver.getCurrentUrl());;
			}
			else if(i>1) {
				driver.switchTo().window(str.get(i));
				driver.close();
			}
					else {
				driver.switchTo().defaultContent();
				System.out.println(driver.getCurrentUrl());
				//System.out.println(driver.getPageSource());
				
				}
			}
		}
	}

