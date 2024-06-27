Feature: Verify user is able to view the Family and Friends dialog box

  @TestCaseKey=Disney_InformationDialog
  Scenario: Verify user is able to view the Family and Friends dialog box
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Family list
    And click what information can family and friends see
    Then verify dialog box is displayed
    And close the browser
