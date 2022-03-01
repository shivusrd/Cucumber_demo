Feature: feature to test login

  Scenario: to check login with valid cred
    Given is on login page
    When user enters valid cred
    And cicks on login button
    Then user is navigated to the page
