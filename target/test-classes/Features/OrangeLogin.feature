
@saleem
Feature: Orange HRM  Login Validation


Background:

		
 	 	And  open the Orange HRM Login Page

	 @jahan
	 Scenario: Orange HRM Login Validation with username and password
  	
  	When Enter the valid "Admin" and "admin123"
    And  click the login button
   	Then I validate the user profile name
   	
   	
   	Scenario: Orange HRM Login Validation with username and password
  	
  	When Enter the valid "Admin" and "admin1234"
    And  click the login button
   	Then I validate the user profile name
   	
   	
   	Scenario: Orange HRM Login Validation with username and password
  	
  	When Enter the valid "Admin12" and "admin123"
    And  click the login button
   	Then I validate the user profile name
   
   	
   	Scenario: Orange HRM Login Validation with username and password
  	
  	When Enter the valid "Admin12" and "admin1234"
    And  click the login button
   	Then I validate the user profile name
   
   	
   	Scenario Outline: Orange HRM Login Validation with username and password
  	
  	When Enter the valid "<username>" and "<password>"
    And  click the login button
   	Then I validate the user profile name
   
   	
   	Examples:
|username|password|
|Admin|admin123|
   
    
    
  
  
    
 

   
    
    
   
   
    
    

