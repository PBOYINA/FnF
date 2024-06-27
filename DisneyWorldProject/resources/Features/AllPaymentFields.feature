Feature: Validate the all paymentmethod fields :validate all paymentmethod fields with inputs

  @TestCaseKey=paymentMethod_allFields
  Scenario: Validate the all Address textboxes :validate all Address textboxes
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Profile
    And click on Payment Methods Module
    And click on add credit card button
    And click on the Credit Card Number field and tab out
    And Enter a valid CC number on the Credit Card Number field and tab out
    And Enter security code on the security code field and tab out
    And Enter future date on date field
    And Fill in Cardholders Name field with TestName and tab out
    And Click on the Country dropdown menu to expand it and select any country
    And Fill in Address Line1 field with a address and tab out
    And Fill in Address Line2 field with a address and tab out
    And Fill on Zip Code field with zipcode and tab out
    And Click on the Store my payment checkbox
    And Click on Conform button
