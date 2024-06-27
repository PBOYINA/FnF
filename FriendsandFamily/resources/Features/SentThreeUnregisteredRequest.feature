Feature: Verify user is able to invite two guests in Friends and Family

  @TestCaseKey=Disney_Sent_Three_Unregistered_request
  Scenario: Verify user is able to invite two guests in Friends and Family
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Family list
    And click Add a Guest then click Disney account and Create account
    And enters title, firstname, lastname, age, email id and click done
    And click Add a Guest then click Disney account and Create account
    And enters title, firstname, lastname, age, email id and click done for second time
    And click Add a Guest then click Disney account and Create account
    And enters title, firstname, lastname, age, email id and click done for third time
    And click sent
    And verify three mails are sent
    When user navigates to mailinator page
    Then verify email is received
    When user navigates to mailinator page for second time
    Then verify email is received
    When user navigates to mailinator page for third time
    Then verify email is received
    And close the browser
