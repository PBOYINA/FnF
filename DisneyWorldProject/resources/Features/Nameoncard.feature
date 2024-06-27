Feature: Validate the Nameoncard textbox:validate Nameoncard textbox with different values

  @TestCaseKey=paymentmethod_nameoncard
  Scenario: Validate the Nameoncard textbox:validate Nameoncard textbox with different values
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Profile
    And click on Payment Methods Module
    And click on add credit card button
    Then Click on Cardholders name field and tab out
    And Enter special characters in Cardholders name field and tab out
    Then Enter numbers in Cardholders name field and tab out
    And Enter one character in Cardholders name field and tab out
    And Enter characters in Cardholders name field and tab out