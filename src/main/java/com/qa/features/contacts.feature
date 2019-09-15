Feature: contact features
Scenario: Contact page functionality
	Given initialize the browser and navigate to login page
	When user is using valid username and password
	Then user is logged in to application successfully
	When Customer click contacts option
	Then customer navigate to contact page
	Then customer clicks on New button
	Then customer enters firstname and lastname and save changes
	|FIRSTNAME|LASTNAME|
	|bikrr|sahoo|
	|gaurr|sahoo|
	Then user close the browser instance