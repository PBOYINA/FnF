Feature: Verify user is able to check mutual guest in Friends and Family

  @TestCaseKey=Checking_Mutual_Guest
  Scenario:  Verify user is able to check mutual guest in Friends and Family
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Family list
    And click Add a Guest then click Disney account and Create account
    And enters title, firstname, lastname, age, email id and click done
    And click Add a Guest then click Disney account and Create account
    And enters title, firstname, lastname, age, email id and click done for second time
    When user sign out Disney application
    And again login to second invited account
    And click on notification icon and click manage invites
    Then check invite is received
    And click Accept
    When user sign out Disney application
    And again login to first invited account
    And click on notification icon and click manage invites
    Then check invite is received
    And click Accept
    Then check first invited guest is displayed
    And close the browser