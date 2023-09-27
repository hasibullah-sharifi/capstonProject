@allTest
Feature: Retail Page
  Background: 
    Given User is on Retail Website
    When User click on MyAccount
    And User click on Login
    And User enter username "alisharifi2@gmail.com" and password "kingkhan"
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  Scenario: Register as an Affiliate user with Cheque Pagyment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate from with bellow information
      | company      | website  | taxID | paymentMethod | payName      |
      | "tek school" | "retail" |  4444 | "cheqe"       | "hasibullah" |
    And check on About us check box
    And User click on continue button
    Then User should see a success message

  @affiliate
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate informationlink
    And User click on Bank Transfer radio button
    And User fill Bank information with below information
      | BankName | abaNumber | swiftCode | accountName | AccountNumber  |
      | "BOA"    |       420 |   3454324 | "gul agha"  | 23456789765432 |
    And User click on Contiue button
    Then User Should seea seccess message

  @test
  Scenario: edit your account information
    When User click on Edit your account information
    And User modify below information
      | firstName   | lastName     | email         | telephone  |
      | "Kinghasib" | "kingsharifi | has@gmail.com | 3139135608 |
    And User click on continueButton
    Then User should see a success message "Your account has been successfully updated."
