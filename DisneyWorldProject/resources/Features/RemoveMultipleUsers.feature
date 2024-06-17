Feature: Verify user is able to remove multiple guests request

  @TestCaseKey=Remove_Multiple_Guests
  Scenario Outline: Verify user is able to remove multiple guests request
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Family list
    And click Add a Guest then click Disney account and Create account
    And enters title, firstname, lastname, age, email id and click done
    When user sign out Disney application
    And again login to with "<password>"
    And click on notification icon and click manage invites
    Then check invite is received
    And click Accept for multiple users
    And click settings button and remove for multiple users
    And close the browser

    Examples:
      | username               | password  |
      | two_fnf@mailinator.com | disney123 |
