Feature: Test login functionality
@smoke
  Scenario: Check login is sucessful
    Given Browser is opening
    And user is on login  page
    When user enters <username> and <password>
    Then user is navigated to the home page
    Examples:
   	| username | password |
    |8171765673| Shivu@srd1|
    
   
    
