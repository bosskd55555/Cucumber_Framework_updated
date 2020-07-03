Feature: Homepageverification

Scenario: Homepage deals link verification

	Given user opens browser
	Then user enters username and password
	And Validate Homepage title
	Then click the deals link
	Then Logout from the application
	
Scenario: Logout from the Application

	Given user opens browser
	Then user enters username and password
	Then Logout from the application	