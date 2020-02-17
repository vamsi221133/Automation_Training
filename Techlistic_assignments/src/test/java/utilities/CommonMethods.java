package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BusinessMethods.BrowserSetUp;
import junit.framework.Assert;

public class CommonMethods {
	public static WebElement click_m(By locators) throws InterruptedException {
		WebElement ele = BrowserSetUp.GetDriver().findElement(locators);
		Thread.sleep(1500);
		ele.click();
		return ele;
	}
	public static String GetTitle_m() {
		String ele = BrowserSetUp.GetDriver().getTitle().toString();
		return ele;
	}
	public static boolean AsertEquals(String expected, String Actual) {
		Assert.assertEquals(expected, Actual);
		return false;
	}
	public static WebElement sendkeys_m(By locator, String value) throws InterruptedException {
		WebElement ele = BrowserSetUp.GetDriver().findElement(locator);
		Thread.sleep(1000);
		ele.sendKeys(value);
		return ele;
	}
	public static Robot FileUpload(String pathOfFile) throws AWTException {
		Robot robo = new Robot();
		StringSelection ss = new StringSelection(pathOfFile);
		robo.delay(2000);
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
		return robo;
		
	}
	

}
