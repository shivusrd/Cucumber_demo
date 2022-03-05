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
    |8171765673| Shivu@srd1 | shoes |
    |8171765673| Shivu@srd1 | bagpack |
    |8171765673| Shivu@srd1 | heater |
    |8171765673| Shivu@srd1 | mobile |
    |8171765673| Shivu@srd1 | games |
 		
 
    
   
    
