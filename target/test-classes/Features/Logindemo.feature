Feature: Test login functionality
@smoke
  Scenario: Check login is sucessful
    Given Browser is opening
    And user is on login  page
    When user enters <username> and <password>
    Then user is navigated to the home page
    Then user enters <product> name
    Examples:
   	| username | password | product | 
    |8630597482| Shivam@123 | bagpack |
   
   
 		
 
    
   
    
