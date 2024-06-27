Feature: Validate the Add a Credit Card page: includes validation of elements and Cancel button

  @TestCaseKey=Payment_NoCreditCard
  Scenario: Validate the Add a Credit Card page: includes validation of elements and Cancel button
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Profile
    And click on Payment Methods Module
    And click on add credit card button
    Then verify the elements are displayed
    And click on cancel button
    And close the browser