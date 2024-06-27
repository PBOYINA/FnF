Feature: Validate security code field:validate security code  textbox with different data 

  @TestCaseKey=Payment_securitycode
  Scenario: Validate security code field:validate security code  textbox with different data 
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Profile
    And click on Payment Methods Module
    And click on add credit card button
   Then click on the Security field and tab out
   And Enter letters on the  Security field and tab out
   Then enter special characters in the security field and tab out
   And Enter a two digits number and tab out
   And Enter a valid security code on the security code field and tab out
