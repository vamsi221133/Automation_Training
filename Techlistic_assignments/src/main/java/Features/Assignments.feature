@practice
Feature: just for hands on practice on selenium.

@Assignment1
Scenario: Automate Browser Actions - Launch Browser, maximize window, validate title & close browser.
Given launching browser with website https://www.techlistic.com/ and Get Title of page and validate it with expected value.
And Get URL of current page and validate it with expected value.
And Get Page source of web page.
And And Validate that page title is present in page source.
Then Close browser


@Assignment2
Scenario: Automate Menu Links and Validate Page Titles using Selenium
Given launching browser with website https://www.techlistic.com/ and  Click on 'Java Tutorial' link and validate page title.
And Navigate back to Home Page
And Click on Selenium Tutorial link and validate page title and Navigate back to Home Page.
And Click on Selenium Blogs link and validate page title. and Navigate back to Home Page.
Then Click on TestNG Blogs link and validate page title and close the browser


@Assignment3
Scenario: Automate demo 'About Me' form using Selenium
Given Open this link - https://www.techlistic.com/p/selenium-practice-form.html
And Enter first and last name (textbox).
And Select gender, ears of experience(radio button),Enter date.
And Select Profession (Checkbox) and Automation tools you are familiar with (multiple checkboxes).
And  Select Continent (Select box).
And Select multiple commands from a multi select box.
And  If you can handle Upload image then try it or leave this step.
And Click on Download file link and handle the download file pop-up (leave it if you are beginner).
Then Click on Submit button.

@Assignment4
Scenario: Automate Google search using Selenium's Explicit Wait
Given user need to Open google.
And Enter keyword “techlistic selenium tutorials”
And Get text of each option and match with “techlistic selenium tutorials”.
And Select the option which matches.
And After that, validate that Techlistic.com is the first option present.
And Click on search result displayed for Techlistic.com.
Then Validate the page title