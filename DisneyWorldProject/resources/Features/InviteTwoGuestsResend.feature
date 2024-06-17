Feature: Verify user is able to invite two guests in Friends and Family and resent the invite

  @TestCaseKey=Disney_Invite_Two_Guests_Resend
  Scenario Outline: Verify user is able to invite two guests in Friends and Family and resent the invite
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Family list
    And click Add a Guest then click Disney account and Create account
    And enters title, firstname, lastname, age, email id and click done
    And click Add a Guest then click Disney account and Create account
    And enters title, firstname, lastname, age, email id and click done for second time
    And click sent
    And resend them
    When user sign out Disney application
    And again login to with "<password>"
    And click on notification icon and click manage invites
    Then check invite is received
    And click Accept
    When user navigates to mailinator page
    Then verify email is received
    When user sign out Disney application
    And again login to with another "<password>"
    And click on notification icon and click manage invites
    Then check invite is received
    And click Accept
    When user navigates to mailinator page for second time
    Then verify email is received
    And close the browser
