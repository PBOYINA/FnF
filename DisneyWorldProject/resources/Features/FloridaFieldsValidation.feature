Feature: Validate fields in the Validate by Id page : Validate florida fields

  @TestCaseKey=FloridaFieldsValidation
  Scenario: Validate florida fields
    Given User is navigating to Disney application
    When click on sign in and create non Florida account
    And scroll down and click specialOffer
    And Click on special Florida resident offer
    And Click on purchase now button
    Then Select the number of days
    And Select the ticket type Park Hopper Option
    And Select the number of tickets and Click on continue
    And Click on continue button in the Your cart screen
    And Click on First name and tabout and verify error message is displayed
    And Click on Date of Birth and tabout and verify error message is displayed
    And Click on Street and tabout and verify error message is displayed
    And Click on City and tabout and verify error message is displayed
    And Zip and tabout and verify error message is displayed
    And close the browser