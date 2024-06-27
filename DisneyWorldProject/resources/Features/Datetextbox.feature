Feature: Validate the date textbox:validate date textbox with past and future date

  @TestCaseKey=date_textbox
  Scenario: Validate the date textbox:validate date textbox with past and future date
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Profile
    And click on Payment Methods Module
    And click on add credit card button
    And click on date field and tab out
    Then Enter past date in date textbox
    And Enter future date in date textbox