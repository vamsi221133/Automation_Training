package StepDef;



import org.testng.Assert;

import com.google.common.base.Objects;

import BusinessMethods.BrowserSetUp;
import ObjectsRepo.Objects_Repository;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilities.CommonMethods;

public class StepDefAssignment4  {
	
	@Given("^Open this link - https://www\\.techlistic\\.com/p/selenium-practice-form\\.html$")
	public void open_this_link_https_www_techlistic_com_p_selenium_practice_form_html() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BrowserSetUp.BrowserTrigger("https://www.techlistic.com/p/selenium-practice-form.html");
	    
	}

	@And("^Enter first and last name \\(textbox\\)\\.$")
	public void enter_first_and_last_name_textbox() throws Throwable {
	  CommonMethods.sendkeys_m(Objects_Repository.Fname, "vamsi");
	  CommonMethods.sendkeys_m(Objects_Repository.Lname, "krishna");
	  
	    
	}

	@And("^Select gender, ears of experience\\(radio button\\),Enter date\\.$")
	public void select_gender_ears_of_experience_radio_button_Enter_date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		CommonMethods.click_m(Objects_Repository.gender);
		CommonMethods.click_m(Objects_Repository.Yexp);
		CommonMethods.sendkeys_m(Objects_Repository.date,"10-10-1998");
		
	}

	@And("^Select Profession \\(Checkbox\\) and Automation tools you are familiar with \\(multiple checkboxes\\)\\.$")
	public void select_Profession_Checkbox_and_Automation_tools_you_are_familiar_with_multiple_checkboxes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		CommonMethods.click_m(Objects_Repository.tester);
		CommonMethods.click_m(Objects_Repository.tool);
//		CommonMethods.click_m(Objects_Repository.tool);
		
	}

	@And("^Select Continent \\(Select box\\)\\.$")
	public void select_Continent_Select_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		CommonMethods.click_m(Objects_Repository.continents);
		CommonMethods.click_m(Objects_Repository.continents_option);
	}

	@And("^Select multiple commands from a multi select box\\.$")
	public void select_multiple_commands_from_a_multi_select_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		CommonMethods.click_m(Objects_Repository.MultiSelect);
		Thread.sleep(1500);
//		CommonMethods.click_m(Objects_Repository.photo);
	}

	@And("^If you can handle Upload image then try it or leave this step\\.$")
	public void if_you_can_handle_Upload_image_then_try_it_or_leave_this_step() throws Throwable {
		Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
		CommonMethods.click_m(Objects_Repository.photo);
		Thread.sleep(1500);
		CommonMethods.FileUpload(Objects_Repository.Pic_Path);
		
	}

	@And("^Click on Download file link and handle the download file pop-up \\(leave it if you are beginner\\)\\.$")
	public void click_on_Download_file_link_and_handle_the_download_file_pop_up_leave_it_if_you_are_beginner() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		CommonMethods.click_m(Objects_Repository.photo);
		BrowserSetUp.GetDriver().navigate().back();
	}

	@Then("^Click on Submit button\\.$")
	public void click_on_Submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		CommonMethods.click_m(Objects_Repository.submit);
	}


}
