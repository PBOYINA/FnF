Feature: Verify user is able to accept Friends and Family request

  @TestCaseKey=Disney_Decline
  Scenario Outline: Verify user is able to accept Friends and Family request
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Family list
    And click Add a Guest then click Disney account and Create account
    And enters title, firstname, lastname, age, email id and click done
    When user sign out Disney application
    And again login to with "<password>"
    And click on notification icon and click manage invites
    Then check invite is received
    And click Decline
    When user navigates to mailinator page
    Then verify email is received
    And close the browser

    Examples: 
      | password  |
      | disney123 |
