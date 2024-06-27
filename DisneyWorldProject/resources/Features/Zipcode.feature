Feature: Validate the zipcode textbox:validate zipcode textbox with different values

  @TestCaseKey=payment_zipcode
  Scenario: Validate the zipcode textbox:validate zipcode textbox with different values
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Profile
    And click on Payment Methods Module
    And click on add credit card button
    Then Click on Zip Code field and tab out
    And Enter special characters on Zip Code field
    Then Enter numbers on Zip Code field
    And Enter valid zip code on Zip Code field
