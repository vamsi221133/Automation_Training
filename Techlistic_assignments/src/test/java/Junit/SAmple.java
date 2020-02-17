package Junit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;


import BusinessMethods.BrowserSetUp;
import ObjectsRepo.Objects_Repository;
import junit.framework.Assert;

public class SAmple {
	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot robo = new Robot();
		BrowserSetUp.BrowserTrigger("https://outlook.office.com/mail/inbox");
		Thread.sleep(1500);
		BrowserSetUp.GetDriver().findElement(By.xpath("//input[@name='loginfmt']")).sendKeys("vamsikrishnaa@maveric-systems.com");
		Thread.sleep(1500);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		BrowserSetUp.GetDriver().findElement(By.xpath("//input[@name='passwd']")).sendKeys("Maveric@4");
		Thread.sleep(1500);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1500);
		BrowserSetUp.GetDriver().findElement(By.xpath("//input[@type='button']")).click();
		
		Thread.sleep(1200);
		BrowserSetUp.GetDriver().findElement(By.xpath("//span[text()='New message']")).click();
		
		Thread.sleep(1500);
		BrowserSetUp.GetDriver().findElement(By.xpath("//span[text()='Attach']")).click();
		Thread.sleep(1500);
		BrowserSetUp.GetDriver().findElement(By.xpath("//span[text()='Browse this computer']")).click();
		
		StringSelection ss = new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		robo.delay(2000);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);	
	}

}
