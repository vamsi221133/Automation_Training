package StepDef;



import org.testng.Assert;

import BusinessMethods.BrowserSetUp;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefAssignment1 {
	
	@Given("^launching browser with website https://www\\.techlistic\\.com/ and Get Title of page and validate it with expected value\\.$")
	public void launching_browser_with_website_https_www_techlistic_com_and_Get_Title_of_page_and_validate_it_with_expected_value() throws Throwable {
		BrowserSetUp.BrowserTrigger("https://www.techlistic.com/");
	     
	}

	@And("^Get URL of current page and validate it with expected value\\.$")
	public void get_URL_of_current_page_and_validate_it_with_expected_value() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String st = BrowserSetUp.GetDriver().getCurrentUrl().toString();
		System.out.println(st+" this is page url");
		Assert.assertEquals("https://www.techlistic.com/", st);
	}

	@And("^Get Page source of web page\\.$")
	public void get_Page_source_of_web_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		String st = BrowserSetUp.GetDriver().getPageSource().toString();
//		System.out.println(st);
	}

	@And("^And Validate that page title is present in page source\\.$")
	public void and_Validate_that_page_title_is_present_in_page_source() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String st = BrowserSetUp.GetDriver().getTitle().toString();
		System.out.println(st+" this is page title");
		Assert.assertEquals("Techlistic", st);
	     
	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	     BrowserSetUp.GetDriver().close();
	}



}
