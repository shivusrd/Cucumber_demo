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
    |8171765676| Shivu@srd1|
    |8171765643| Shivu@srd1|
    |8171765234| Shivu@srd1|
    |8171765232| Shivu@srd1|
    |8171765451| Shivu@srd1|
    |8171765652| Shivu@srd1|
    |8171765223| Shivu@srd1|
    |8171765634| Shivu@srd1|
    |8171765673| Shivu@srd1|
    |8171765623| Shivu@srd1|
    |8171765672| Shivu@srd1|
    |8171765671| Shivu@srd1|
    |8171765676| Shivu@srd1|
    |8171765673| Shivu@srd1|
    |8171765673| Shivu@srd1|
    |8171765673| Shivu@srd1|
    |8171765676| Shivu@srd1|
    |8171765673| Shivu@srd1|
    |8171765673| Shivu@srd1|
    |8171765673| Shivu@srd1|
    |8171765673| Shivu@srd1|
    |8171765673| Shivu@srd1|
    |8171765673| Shivu@srd1|
    |8171765656| Shivu@srd1|
    
    
   
    
