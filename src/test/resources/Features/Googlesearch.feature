Feature: feature to test Google search function

  Scenario: verify google search is working
    Given browser is opening
    And user is on google search page
    When user enters a <text> in search box
    And hits enter 
    Then user is navigated to search results
    
    Examples:
   	|text|
    
    |bird|
   
    
    