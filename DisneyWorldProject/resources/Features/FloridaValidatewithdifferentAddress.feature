Feature: Validate Florida account with different address : Florida resident validation with different address

  @TestCaseKey=FloridaVaidatewithDifferentAddress
  Scenario: Florida resident validation with non Florida account
    Given User is navigating to Disney application
    When click on sign in and create non Florida account
    And scroll down and click specialOffer
    And Click on special Florida resident offer
    And Click on purchase now button
    Then Select the number of days
    And Select the ticket type Park Hopper Option
    And Select the number of tickets and Click on continue
    And Click on continue button in the Your cart screen
    And Fill all fields with different address and Click on Verfy Me Now button
    And Cick on continue button
    And Verify the ticket is visible in Check out screen
    And close the browser