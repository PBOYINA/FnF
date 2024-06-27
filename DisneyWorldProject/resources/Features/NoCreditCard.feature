Feature: Verify the elements on the Profile landing page when user has not added a CC yet

  @TestCaseKey=Payment_AddCreditCard
  Scenario: Verify the elements on the Profile landing page when user has not added a CC yet
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Profile
    Then avatar and username of the profile is displayed
    And click on Payment Methods Module
    Then Payment method page and related elements are displayed
    And click on add credit card button
    And verify the elements are displayed
    And close the browser

