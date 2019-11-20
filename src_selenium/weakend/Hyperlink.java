package weakend;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Hyperlink {
	public static void main(String[] args) throws IOException {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\training\\Documents\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://en.wikipedia.org/wiki/Vamsi_Krishna");
	List<WebElement> ele = driver.findElements(By.tagName("a"));
	int no = ele.size();
	System.out.println("this page contains "+no+" of hyperlinks....");
	for(int i=0;i<no;i++) 
	{
		String text = ele.get(i).getText();
		System.out.println(text);
		if(text.contentEquals("Telugu")) {
			System.out.println("element found at  "+i);
//			driver.findElement(By.xpath("(//a)["+i+"]")).click();
			break;
		}
	}
	driver.findElement(By.partialLinkText("Career")).click();
	
	TakesScreenshot tk = (TakesScreenshot) driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File dstn = new File("C:\\Users\\training\\Desktop\\chumma.png");
	FileHandler.copy(src, dstn);
	
}
}