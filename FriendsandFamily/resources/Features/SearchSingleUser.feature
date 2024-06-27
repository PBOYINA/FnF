Feature: Verify user is able to search the request

  @TestCaseKey=Disney_Search
  Scenario Outline: Verify user is able to search the request
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Family list
    And click Add a Guest
    When enters firstname, lastname and email
    And click search
    And click send in that request
    And click done
    When user navigates to mailinator page of "<email>"
    Then verify email is received
    And close the browser

    Examples: 
      | email                  |
      | two_fnf@mailinator.com |
