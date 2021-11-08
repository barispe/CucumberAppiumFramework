Feature: GetirSample2
Background:

  Given I start the application
  And I skip intro pages
  Then I check for homePage

  Scenario:Case2

      Then I click more categories menu
      Then I navigate to Baby Care
      Then I click third product
      Then I check the price
      When I back
      Then I check for homePage

