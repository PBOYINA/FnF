Feature: Validate the city textbox and state dropdown:validate city textbox and state dropdown with different values

  @TestCaseKey=payment_CityandState
  Scenario: Validate the city textbox and state dropdown:validate city textbox and state dropdown with different values
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Profile
    And click on Payment Methods Module
    And click on add credit card button
    And click on country dropdown and select Albania
    Then click on City field , delete the info on the field and tab out
    And Enter special characters on city field and tab out
    Then Enter numbers on city field and tab out
    And Enter city name on the city field and tab out
    And Enter invalid city name on the city field and tab out
    Then Click on State field, delete the info on the field and tab out
    And Enter special characters on state field and tab out
    And Enter state name on the state field
    And Enter numbers on state field and tab out
    And invalid state name on the state field and tab out