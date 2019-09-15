Feature: FreeCRM features
Scenario: login page functionality check 
	Given initialize the browser and navigate to login page
	When user is using valid username and password
	Then user is logged in to application successfully
	Then user close the browser instance