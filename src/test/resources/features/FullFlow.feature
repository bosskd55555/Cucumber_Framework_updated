Feature: Deal creation and exporting the document

Scenario: Create deals and export

	Given user opens browser
	Then user enters username and password
	Then click the deals link
	Then user creates new deals
	Then click the document link
	Then user downloads the excel
	Then Logout from the application