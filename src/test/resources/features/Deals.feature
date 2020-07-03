Feature: DealsVerification

Scenario: Create deals

	Given user opens browser
	Then user enters username and password
	Then click the deals link
	Then user creates new deals
	Then Logout from the application