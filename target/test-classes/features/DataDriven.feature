Feature: Datadriven types

#Scenario: Without examples
#
#	Given user opens browser
#	Then user enters "kannan21109444@gmail.com" and "Aswath555."
#	Then Logout from the application 
#	
#	
#Scenario Outline: With examples
#
#	Given user opens browser
#	Then user enters username and password
#	Then click the deals link
#	Then user creates new deals of "<title>" and "<amount>" and "<probability>"
#	Then Logout from the application
#	
#Examples:
#
#|title|amount|probability|
#|zaheer|111|123|
#|yuvraj|222|234|
#|kaif  |333|567|

Scenario: Without examples

	Given user opens browser
	Given user opens the URL
	Then user entering username and password
	|    username            |password|
	|kannan21109444@gmail.com|Aswath555.|
	Then Logout from the application
	