package StepDefinition;
//package StepDefinition;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.Properties;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.codoid.products.fillo.Connection;
//import com.codoid.products.fillo.Fillo;
//import com.codoid.products.fillo.Recordset;
//
//import BuissnessMethods.BaseSetUpDriver;
//import Object_Repository.Amazon_Objects;
//import Utilities.BrowserConfig;
//import Utilities.CommonMethods;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Step  extends BrowserConfig{
//	@Before
//	public void openbrowser()
//	{
//		BaseSetUpDriver.browsertrigger();
//	}
//
//	
//	@Given("^User is in Login Page of Amazon website$")
//	public void user_is_in_Login_Page_of_Amazon_website() throws Throwable {
//		
//	}
//
//	@When("^user type \"([^\"]*)\" and \"([^\"]*)\" in website$")
//	public void user_type_and_in_website(String arg1, String arg2) throws Throwable {
//	    Actions ac = new Actions(BaseSetUpDriver.getDriver());
//		WebDriverWait wait = new WebDriverWait(BaseSetUpDriver.getDriver(),20);
//		WebElement elem = wait.until(ExpectedConditions.visibilityOfElementLocated(Amazon_Objects.ScrollLogin));
//		ac.moveToElement(elem).click().build().perform();
//		Thread.sleep(2000);
//		//BaseSetUpDriver.getDriver().findElement(Amazon_Objects.LoginClick);
//		CommonMethods.clickMethod(Amazon_Objects.LoginClick);
//		Thread.sleep(1000);
//		CommonMethods.sendKeysMethod(Amazon_Objects.MobileNo, arg1);
//		Thread.sleep(3000);
//		CommonMethods.clickMethod(Amazon_Objects.MobileContinue);
//		Thread.sleep(2000);
//		CommonMethods.sendKeysMethod(Amazon_Objects.AmazonPassword, arg2);
//		Thread.sleep(1000);
//	}
//
//	@When("^User clicks on the submit button$")
//	public void user_clicks_on_the_submit_button() throws Throwable {
//		BaseSetUpDriver.getDriver().findElement(Amazon_Objects.Submit).click();
//		Thread.sleep(2000);
//	}
//
//	@Then("^user should be able to see homepage of amazon$")
//	public void user_should_be_able_to_see_homepage_of_amazon() throws Throwable {
//		Thread.sleep(2000);
//	   
//	}
//
//	@Then("^user search for product in the website$")
//	public void user_search_for_product_in_the_website() throws Throwable {
//		String b=CommonMethods.readFillo();
//		CommonMethods.sendFillo(Amazon_Objects.SearchBox, b);
//		BaseSetUpDriver.getDriver().findElement(Amazon_Objects.SearchBox).sendKeys(Keys.ENTER);
//	   
//	}
//
//
//
//}
