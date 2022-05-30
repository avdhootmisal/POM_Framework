Feature: ActiTime Login Page 

Scenario: login into application 
	Given user should be on "Login" 
	Then user enters username and password 
	Then page title should be display as "Enter Time-Track" 
	
Scenario: logout from applicatation 
	Given user should be on "Enter Time-Track" 
	Then user clicks on logout 
	Then page title should be display as "Login" 