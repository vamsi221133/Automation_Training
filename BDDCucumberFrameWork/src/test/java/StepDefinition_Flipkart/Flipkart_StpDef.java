package StepDefinition_Flipkart;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.akiban.sql.parser.GetCurrentConnectionNode;

import BuissnessMethods.BaseSetUpDriver_Flipkart;
import BuissnessMethods.BaseSetUpDriver_Mynthra;
import Object_Repository.Flipkart_Objects;
import Utilities.CommonMethods;
import Utilities.CommonMethods_Flipkart;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Flipkart_StpDef {
	@Before
	public void inti() {
		BaseSetUpDriver_Flipkart.browsertrigger();
		BaseSetUpDriver_Flipkart.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Given("^: launching a flipkart website$")
	public void launching_a_flipkart_website() throws Throwable {
//	    System.out.println(GetCurrentConnectionNode);
		System.out.println("website launched");
	}

	@Then("^: login to the website by passing \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_to_the_website_by_passing_and(String arg1, String arg2) throws Throwable {
		
	   CommonMethods_Flipkart.sendKeysMethod(Flipkart_Objects.Username, arg1);
	   CommonMethods_Flipkart.sendKeysMethod(Flipkart_Objects.Password, arg2);
	   CommonMethods_Flipkart.clickMethod(Flipkart_Objects.Login_btn);
	   
	}

	@Then("^: Searching for a product$")
	public void searching_for_a_product() throws Throwable {
		String value = CommonMethods_Flipkart.readFillo();
	   CommonMethods_Flipkart.sendFillo(Flipkart_Objects.Search,value);
	   CommonMethods_Flipkart.clickMethod(Flipkart_Objects.Search_btn);
	}

	@Then("^: sorting by Popularity$")
	public void sorting_by_Popularity() throws Throwable {
		Thread.sleep(2000);
		CommonMethods_Flipkart.clickMethod(Flipkart_Objects.Sorting);
		Thread.sleep(2000);
		
	}

	@Then("^: going to the next page by scrolling and clicking next page$")
	public void going_to_the_next_page_by_scrolling_and_clicking_next_page() throws Throwable {
		Thread.sleep(2000);
		WebElement ele = CommonMethods_Flipkart.norm_method(Flipkart_Objects.NxtPage);
		JavascriptExecutor js = (JavascriptExecutor) BaseSetUpDriver_Flipkart.getDriver();
		js.executeScript("arguments[0].scrollIntoView();",ele);
//		Thread.sleep(2000);
//		ele.click();
//		CommonMethods_Flipkart.clickMethod(Flipkart_Objects.NxtPage);
		//CommonMethods_Flipkart.clickMethod(Flipkart_Objects.NxtPage);
		js.executeScript("arguments[0].click();", ele);
		 Thread.sleep(1500);
		   CommonMethods_Flipkart.clickMethod(Flipkart_Objects.Product);
	}

	@Then("^: Switching to the window of the clicked product$")
	public void switching_to_the_window_of_the_clicked_product() throws Throwable {
	  
	   ArrayList<String> tabs2 = new ArrayList<String> (BaseSetUpDriver_Flipkart.getDriver().getWindowHandles());
		BaseSetUpDriver_Flipkart.getDriver().switchTo().window(tabs2.get(1));
	   
	}

	@Then("^: Select the size of the product$")
	public void select_the_size_of_the_product() throws Throwable {
		Thread.sleep(1500);
		 CommonMethods_Flipkart.clickMethod(Flipkart_Objects.size);
	}

	@Then("^: clicking add to bag$")
	public void clicking_add_to_bag() throws Throwable {
		Thread.sleep(1500);
		 CommonMethods_Flipkart.clickMethod(Flipkart_Objects.Add_to_cart);
	}

	@Then("^: taking screenshot after clicking bag icon$")
	public void taking_screenshot_after_clicking_bag_icon() throws Throwable {
		TakesScreenshot scr = (TakesScreenshot) BaseSetUpDriver_Mynthra.getDriver();
		File src = scr.getScreenshotAs(OutputType.FILE);
		File dstn = new File("C:\\Users\\training\\Desktop\\Flipkart.png");
		FileHandler.copy(src, dstn);	
	}





}
