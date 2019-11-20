package ClassRoomTraining;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GettingListOfElements {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training\\Documents\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		FileOutputStream fo = new FileOutputStream("C:\\Users\\training\\Desktop\\vamsi1.txt");
		File file = new File("C:\\Users\\training\\Desktop\\vamsi1.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bf = new BufferedWriter(fw) ;
		List<WebElement> ele = driver.findElements(By.xpath("//select//option"));
		int no = ele.size();
		for(int i=0;i<no;i++) 
		{
			String text = ele.get(i).getText();
			System.out.println(text);
			bf.append(text);
			bf.newLine();
		}
		bf.close();
		
//		Select ob = new Select(driver.findElement(By.xpath("//select[@title='Search in']")));
//		List<WebElement> ele1 =ob.getOptions();
//		System.out.println(ele1.size());
//		int n = ele1.size();
		
	}

}
