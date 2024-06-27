Feature: Verify user is able to view Friends and Family request on enabling like and search settings

  @TestCaseKey=Disney_LikeAndShare_Settings
  Scenario Outline: Verify user is able to view Friends and Family request on enabling like and search settings
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Family list
    And click like and share settings button
    And disable share and allow toggles and click save
    When user sign out Disney application
    When click on sign in and create another new account
    And scroll down and click Family list
    And click Add a Guest
    When enters before registered accounts data
    And click search
    Then verify user is not found
    When user sign out Disney application
    And again login to the same account
    And scroll down and click Family list
    And click like and share settings button
    And enable share and allow toggles and click save
    When user sign out Disney application
    When click on sign in and create another new account
    And scroll down and click Family list
    And click Add a Guest
    When enters before registered accounts data
    And click search
    Then verify the user is displayed
    And close the browser

    Examples: 
      | password  |
      | disney123 |
