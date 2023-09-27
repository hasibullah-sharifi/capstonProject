@allTest
Feature: Laptop and NoteBook

  Background: 
    Given User is on Retail Website
    When User click on Laptop &NoteBook tab
    And User click on Show all Laptop &NoteBook option

  Scenario: Add and Remove a Mac book from Cart
    And User click on MacBook item
    And User click add to Cart button for mac
    Then User should see a message ‘Success: You have added MacBook to your shopping cart!’
    And User should see "1 item(s) - $602.00" showed to the cart
    And User click on cart option
    And user click on red X button to remove the item from cart
    Then item should be removed and cart should show "0 item(s) - $0.00" item(s)

  Scenario: Adding an item to Wish list
    And User click on heart icon to add Sony VaIO laptop to wish list
    Then User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!

  Scenario: Validate the price of MacBook pro is 2000
    And User click on ‘MacBook Pro’ item
    Then User should see "$2,000.00" price tag is present on UI.
