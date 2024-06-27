Feature: Verify user is able to close settings in Friends and Family request list

  @TestCaseKey=Disney_CloseSettings
  Scenario Outline: Verify user is able to close settings in Friends and Family request list
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
    When user sign out Disney application
    And again login to the same account
    And scroll down and click Family list
    And click on settings of the requested friend
    And click close
    And close the browser

    Examples: 
      | password  |
      | disney123 |
