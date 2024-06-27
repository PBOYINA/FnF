Feature: Verify user is able to allow search the request

  @TestCaseKey=Disney_Allow_Search
  Scenario: Verify user is able to allow search the request
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Family list
    And click Add a Guest
    And click Allow searchable
    When enters firstname, lastname and email
    And click search
    And click send in that request
    And click done
    And close the browser
