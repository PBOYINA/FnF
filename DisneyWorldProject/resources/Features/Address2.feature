Feature: Validate the all Address textboxes :validate all Address textboxes with different address

  @TestCaseKey=paymentMethod_Address2
  Scenario: Validate the all Address textboxes :validate all Address textboxes with different address
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Profile
    And click on Payment Methods Module
    And click on add credit card button
    Then Click on the Country dropdown menu and select Canada
    And Enter address on AddressLine1 and tab out
    And Enter address on AddressLine2 and tab out
    And Enter canada zipcode on Zipcode textbox and tab out
    And Enter canada city on city textbox and tab out
    And click on state dropdown and select Ontario
