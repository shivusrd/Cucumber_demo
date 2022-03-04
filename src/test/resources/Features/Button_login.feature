Feature: Test button
@button
  Scenario: Check button is working
    Given open browser
    And user is navigating to path
    When user is on button tab
    Then button clicked by user
    Then A message will be shown up
    