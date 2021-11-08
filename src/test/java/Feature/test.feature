Feature: GetirSample1
Background:

  Given I start the application
  And I skip intro pages
  Then I check for homePage

  Scenario:Case1

    Then I click Water Category
    Then I open first product detail
    Then I add product to basket
    When I back
    Then I go to basket
    Then Clear Cart
    Then Basket Confirmed Empty

