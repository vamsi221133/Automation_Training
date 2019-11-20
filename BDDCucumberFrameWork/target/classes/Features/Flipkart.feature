@vamsi
Feature: creating framework for flipkart
@test1
Scenario: Loging to the website and selecting a product by sorting
Given : launching a flipkart website
Then : login to the website by passing "username" and "password"
And : Searching for a product
Then : sorting by Popularity
Then : going to the next page by scrolling and clicking next page
And : Switching to the window of the clicked product
Then : Select the size of the product
And : clicking add to bag
Then : taking screenshot after clicking bag icon 
