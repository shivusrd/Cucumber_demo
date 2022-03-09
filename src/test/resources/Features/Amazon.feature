Feature: Amazon
Scenario: Search a product

Given i have a search field on amazone page
When i search for a product with name "fan" and price 1000
Then product with name "fan" should be diplayed
