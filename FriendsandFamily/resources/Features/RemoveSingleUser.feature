Feature: Verify user is able to remove the request

  @TestCaseKey=Disney_Remove
  Scenario Outline: Verify user is able to remove the request
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Family list
    And click Add a Guest then click Disney account and Create account
    And enters title, firstname, lastname, age, email id and click done
    When user sign out Disney application
    And again login to with "<password>"
    And click on notification icon and click manage invites
    Then check invite is received
    And click Accept
    And click settings button
    And click remove and click yes
    And close the browser

    Examples: 
      | username               | password  |
      | two_fnf@mailinator.com | disney123 |
