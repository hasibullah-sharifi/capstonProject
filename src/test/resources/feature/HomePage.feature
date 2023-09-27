@allTest
Feature: HomePage

  Background: 
    Given User is on Retail websitee

  
  Scenario: User verify currency values change
    When User click on Currency
    And User Chose Euro from dropdown
    Then currency value should change to Euro
	@H
  Scenario: User empty shopping cart message displays
    When User click on shopping cart
    Then Your shopping cart is empty! message should display
