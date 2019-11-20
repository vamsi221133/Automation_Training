@all
Feature: creating framework for mynthra
@test1
Scenario: Loging to the website and selecting a product by sorting
Given : launching a Mynthra website
Then : login to the website by passing "username" and "password"
Then : Searching for a product
And : sorting by Popularity
Then : click on the product by a larger price(Storing prices in hashmap)
Then : Switching to the window of the clicked product
Then : Select the size of the product
Then : clicking add to bag
Then : taking screenshot after clicking bag icon
Then : click on the quantity of the product  and take screenshot