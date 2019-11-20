package ClassRoomTraining;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
	public static void main(String[] args) throws InterruptedException {
		String value = "vamsi";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any index value :");
		int c = sc.nextInt();
		c=c-1;
		int i ;
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training\\Documents\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys(value);
		Thread.sleep(6000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='aajZCb']//div//span"));
		int no = ele.size();
		System.out.println(ele.size());
		for( i=0;i<no;i++) 
		{
			String text = ele.get(i).getText();
			System.out.println(text);
			if(i==c) {
				ele.get(c).click();
			}
		}
			driver.close();
}
}