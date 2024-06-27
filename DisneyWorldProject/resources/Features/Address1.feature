Feature: Validate the all Address textboxes :validate all Address textboxes

  @TestCaseKey=paymentMethod_Address1
  Scenario: Validate the all Address textboxes :validate all Address textboxes
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Profile
    And click on Payment Methods Module
    And click on add credit card button
    Then Click on the Country dropdown menu and select United states
    And Enter address on AddressLine1 and tab out
    And Enter address on AddressLine2 and tab out
    And Enter zipcode on Zipcode textbox and tab out

    