@allTest
Feature: Desktop Tab

  Background: 
    Given User is on Retail Website

  Scenario: User verify all item are present in Desktop tab
    When User click on Desktops tab
    And User click on Show all desktops
    Then User should see all items are present in Desktop pag

  @Computer
  Scenario: User add HP LP3065 from Desktop tab to the card
    When User click on Desktops tab
    And User click on Show all desktops
    And User click ADD TO CART option on HP LP3065 item
    And User select quantity
    And User click add to Cart button
    Then User should see a message Success

  @Camera
  Scenario: User add Cannon EOS5D from Desktops to the cart
    When User click on Desktops tab
    And User click on Show all desktops
    And User click ADD TO CART option on Canon EOS5D item
    And User select color from dropdown Red
    And User select quantity "1"
    And User click add to Cartbutton
    Then User should see a message

  @Review
  Scenario: User Add review to Canon EOS5D item in Desktop tab
    When User click on Desktops tab
    And User click on Show all desktops
    And User click ADD TO CART option on Canon EOS5D item
    And User click on write a review link
    And user fill the review information with below information
      | yourname     | yourReview                                                        | Rating |
      | "hasibullah" | "this is a very great camera and i like it very much lkdjflajdf " | "good" |
    And User click on ContinueButton
    Then User should see a message Of successfull review
