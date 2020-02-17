package StepDef;



import org.testng.Assert;

import com.google.common.base.Objects;

import BusinessMethods.BrowserSetUp;
import ObjectsRepo.Objects_Repository;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilities.CommonMethods;

public class StepDefAssignment2  {
	
	@Given("^launching browser with website https://www\\.techlistic\\.com/ and  Click on 'Java Tutorial' link and validate page title\\.$")
	public void launching_browser_with_website_https_www_techlistic_com_and_Click_on_Java_Tutorial_link_and_validate_page_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BrowserSetUp.BrowserTrigger("https://www.techlistic.com/");
	    CommonMethods.click_m(Objects_Repository.JavaTutorial);
	    String temp= CommonMethods.GetTitle_m();
	    CommonMethods.AsertEquals(Objects_Repository.title1, temp);
	    
	}

	@Given("^Navigate back to Home Page$")
	public void navigate_back_to_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 CommonMethods.click_m(Objects_Repository.Home);
	}

	@Given("^Click on Selenium Tutorial link and validate page title and Navigate back to Home Page\\.$")
	public void click_on_Selenium_Tutorial_link_and_validate_page_title_and_Navigate_back_to_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 CommonMethods.click_m(Objects_Repository.SeleniumTuto);
		 String temp= CommonMethods.GetTitle_m();
		 CommonMethods.AsertEquals(Objects_Repository.title2, temp);
		 CommonMethods.click_m(Objects_Repository.Home);
	}

	@Given("^Click on Selenium Blogs link and validate page title\\. and Navigate back to Home Page\\.$")
	public void click_on_Selenium_Blogs_link_and_validate_page_title_and_Navigate_back_to_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 CommonMethods.click_m(Objects_Repository.Selenium_Blogs);
		 String temp= CommonMethods.GetTitle_m();
		 CommonMethods.AsertEquals(Objects_Repository.title3, temp);
		 CommonMethods.click_m(Objects_Repository.Home);
	}

	@Then("^Click on TestNG Blogs link and validate page title and close the browser$")
	public void click_on_TestNG_Blogs_link_and_validate_page_title_and_close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 CommonMethods.click_m(Objects_Repository.TestNG_Blog);
		 String temp= CommonMethods.GetTitle_m();
		 CommonMethods.AsertEquals(Objects_Repository.title4, temp);
		 BrowserSetUp.GetDriver().close();
	}



}
