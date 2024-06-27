Feature: Validate Florida account wit different ticket type,increase number of days and increase number of members : Validate Florida account wit different ticket type

  @TestCaseKey=DifferentTicketType
  Scenario: Validate Florida account wit different ticket type
    Given User is navigating to Disney application
    When click on sign in and create non Florida account
    And scroll down and click specialOffer
    And Click on special Florida resident offer
    And Click on purchase now button
    Then Select the number of days Four
    And Select the ticket type one park per day Option
    And Select the number of tickets two and Click on continue
    And Click on continue button in the Your cart screen
    And Fill all fields with data and Click on Verfy Me Now button
    And Cick on continue button
    And Verify the ticket is visible in Check out screen
    And close the browser