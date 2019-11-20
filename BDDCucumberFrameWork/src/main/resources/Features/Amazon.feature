Feature: To check mobile price ranges in Amazon.com

  @AmazonLogin
  Scenario: To test successfull Login of the user
    Given User is in Login Page of Amazon website
    When user type "mobileno" and "password" in website
    And User clicks on the submit button
    Then user should be able to see homepage of amazon
    Then user search for product in the website
