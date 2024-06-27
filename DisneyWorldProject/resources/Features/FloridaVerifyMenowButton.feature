Feature: Validate whether Verify Me Know button enable without enter the data

  @TestCaseKey=VerifyMeButton
  Scenario: Validate whether Verify Me Know button
    Given User is navigating to Disney application
    When click on sign in and create non Florida account
    And scroll down and click specialOffer
    And Click on special Florida resident offer
    And Click on purchase now button
    Then Select the number of days
    And Select the ticket type Park Hopper Option
    And Select the number of tickets and Click on continue
    And Click on continue button in the Your cart screen
    And Check the Verify me now button enable
    And close the browser