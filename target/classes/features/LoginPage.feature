Feature: FreeCRM application test

Scenario: Validate Login page

	Given user opens browser
	Given user opens the URL
	Then user is on login page
	Then user enters username and password
	And Validate Homepage title
	
	
#Scenario: scenario2
#
#	Given user opens the URL
#	Then user is on login page
#	Then user enters username and password
#	Then Logout from the application 