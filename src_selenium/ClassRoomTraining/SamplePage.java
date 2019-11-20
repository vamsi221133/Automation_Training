package ClassRoomTraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SamplePage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training\\Documents\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
//		driver.findElement(By.id("fname")).sendKeys("vamsikrishna");
//		driver.findElement(By.linkText("This is a link")).click();
//		driver.findElement(By.partialLinkText("link")).click();
		
//		driver.findElement(By.xpath("//button[@id='idOfButton']")).click();
//		driver.findElement(By.id("male")).click();
//		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
//		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
//		driver.findElement(By.xpath("//select[@id='testingDropdown']")).click();
//		driver.findElement(By.id("automation")).click();
//		Select sel = new Select(driver.findElement(By.xpath("//select[@id='testingDropdown']")));
//		sel.selectByIndex(1);
//		sel.selectByValue("Performance");
//		WebElement links = driver.findElement(By.tagName("radio"));
//		Dimension n = links.getSize();
//		System.out.println(n);
		
		Actions ac = new Actions(driver);
//		WebElement ele = driver.findElement(By.id("dblClkBtn"));
//		ac.doubleClick(ele).build().perform();
//		Alert alrt = driver.switchTo().alert();
//		System.out.println("alert message is :"+alrt.getText());
//		alrt.accept();
//		driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();
//		alrt = driver.switchTo().alert();
//		System.out.println(alrt.getText());
//		alrt.accept();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@onclick='generateConfirmBox()']")).click();
//		alrt = driver.switchTo().alert();
//		System.out.println(alrt.getText());
//		alrt.dismiss();
//		Thread.sleep(2000);
		WebElement from =driver.findElement(By.id("sourceImage"));
		WebElement to =driver.findElement(By.xpath("//div[@ondrop='drop(event)']"));
		Thread.sleep(2000);
		//ac.dragAndDrop(from, to).perform();
		ac.clickAndHold(from).moveToElement(to).release().build().perform();
		System.out.println("element drag and droped successfully");
	}
}
