Feature: Verify user is able to search unregistered guest in Friends and Family

  @TestCaseKey=Disney_Search_Unregistered_Guest
  Scenario Outline: Verify user is able to search unregistered guest in Friends and Family
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Family list
    And click Add a Guest
    When enters unregistered firstname, lastname and email
    And click search
    Then verify user is not found
    And click Add a Guest in search result then click Disney account and Create account
    And enters age and click done
    When user sign out Disney application
    And login to with "<password>"
    And click on notification icon and click manage invites
    Then check invite is received
    And click Accept
    When user navigates to mailinator page and enter searched mail
    Then verify email is received
    And close the browser

    Examples: 
      | password  |
      | disney123 |
