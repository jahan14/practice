@SSS
Feature: Orange HRM  Login Validation

Background:
		
 	 	And  open the Orange HRM Login Page
	
	 @tag1
   Scenario: Orange HRM Login Validation with username and password
  	When Enter the valid username and password
  	|username|password|user|pass|
  	|Admin123|Admin|Admin12|Admin12345|
  	|admin123456|admin1231|admin123|admin12|
   # And  click the login button
   	Then I validate the user profile name
  
   	
    
   