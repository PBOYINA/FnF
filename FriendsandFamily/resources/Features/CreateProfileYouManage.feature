Feature: Verify user is able to create profile you can manage

  @TestCaseKey=Disney_CreateProfileYouManage
  Scenario: Verify user is able to create profile you can manage
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Family list
    And click Add a Guest
    And click add guest who does not have an account
    When user select create profile u will manage
    And enter all data and click done
    And click on settings of the requested friend
    And enter email in invite and click done
    And close the browser
