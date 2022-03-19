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
    |8630597482| Shivam@123 | shoes |
    |8630597482| Shivam@123 | food |
    |8630597482| Shivam@123 | peanut butter |
    |8630597482| Shivam@123 | bag |
    |8630597482| Shivam@123 | laptop |
    |8630597482| Shivam@123 | chips |
   
 		
 
    
   
    
