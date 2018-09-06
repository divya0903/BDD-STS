
Feature: Flipkart application to search any product
Using this application user can search details of any product 

@flipkart
Scenario: when user searches for product in amazon with valid information

	Given user is given flipkart application into their desktop where they search for mobile
	When there is availability of mobile
	Then display all the details of the product

@flipkart
Scenario: when user searches for product in amazon with in valid information

	Given user is given flipkart application into their desktop where they search for mobile
	When there is no availability of mobile
	Then display no matches found
 