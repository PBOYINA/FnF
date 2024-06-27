Feature: Validate the AddressLine textboxes :validate AddressLine textboxes

  @TestCaseKey=paymentMethod_AddressLine
  Scenario:  Validate the AddressLine textboxes :validate AddressLine textboxes
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Profile
    And click on Payment Methods Module
    And click on add credit card button
   Then Click on Address Line1 field and tab out
   And Enter special characters on AddressLine1 and tab out
   Then Enter valid address with numbers and characters on AddressLine1 and tab out
   And Click on Address Line2 field and tab out
    Then Enter special characters on AddressLine2 and tab out
    And Enter valid address with numbers and characters on AddressLine2 and tab out