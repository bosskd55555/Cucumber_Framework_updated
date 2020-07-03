Feature: Document features

Scenario: Download document excel

	Given user opens browser
	Then user enters username and password
	Then click the document link
	Then user downloads the excel
	Then Logout from the application