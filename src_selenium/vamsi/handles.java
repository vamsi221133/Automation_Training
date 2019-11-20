package vamsi;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training\\Documents\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		//driver.get("https://outlook.office.com/mail/inbox/id/AAQkADYzMjM1YzQxLTNmZDgtNDc1NS1hNWIwLTkwNmQ4ZGI2MjM4YQAQAFQwDARDigRGlzB0pNMppDY%3D");
		//driver.findElement(By.name("name='loginfmt'")).sendKeys("vamsikrishnaa@maveric-systems.com");
//		WebElement from =driver.findElement(By.xpath("//div[@draggable='true'][3]"));
//		WebElement to =driver.findElement(By.xpath("//div[@draggable='true'][2]"));
//		WebElement from =driver.findElement(By.id("draga"));
//		WebElement to =driver.findElement(By.id("dragb"));
//		Actions act = new Actions(driver);
//		Thread.sleep(2000);
//		act.dragAndDrop(from, to).click().build().perform();
//		//System.out.println(to);
//		System.out.println("drag and drop successful");
		//----------------------------------------------------window handling
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//button[@onclick='newBrwWin()']")).click();
		//driver.findElement(By.id(""))
		ArrayList<String> str= new ArrayList<String>(driver.getWindowHandles());
		for(int i=0;i<str.size();i++)
		{
			if(i==1) {
				System.out.println(str);
				driver.switchTo().window(str.get(i));
				System.out.println(driver.getCurrentUrl());
				driver.close();
				driver.switchTo().window(str.get(0));
				System.out.println(driver.getCurrentUrl());
				
			}
		}
		
		
	}

}
