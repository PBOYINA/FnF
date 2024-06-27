Feature: Validate the credit cardnumber textbox:validate cardnumber textbox with different values

  @TestCaseKey=payment_creditcardnumber
  Scenario: Validate the credit cardnumber textbox:validate cardnumber textbox with different values
    Given User is navigating to Disney application
    When click on sign in and create new account
    And scroll down and click Profile
    And click on Payment Methods Module
    And click on add credit card button
    Then click on creditcard number textbox and tabout
    And  Enter letters on the Credit Card Number field and tab out
    Then Enter invalid characters on the Credit Card Number field and tab out
    And Enter a valid CC number for card on the Credit Card Number field and tab out
    Then Enter a valid CC number for card but one digit less on the Credit Card Number field and tab out
    And Enter invalid card number on Credit card number field
    And close the browser

   
    

   
      

