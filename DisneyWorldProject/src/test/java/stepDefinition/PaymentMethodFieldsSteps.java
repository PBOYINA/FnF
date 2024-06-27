package stepDefinition;

import config.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static UIWrapper.DisneyWorldWrapper.*;

import static Pages.PaymentMethodFields.*;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class PaymentMethodFieldsSteps extends BaseClass{
	
	public static String mail, createPass;
    public static StringBuilder firstname, lastname;

	//cardNumber steps
	
	@Then("Enter a valid CC number for card on the Credit Card Number field and tab out")
	public void enter_a_valid_cc_number_for_card_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"4444394758408416");     
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
		 Thread.sleep(3000);
        isMessageDisplayed(cardnumbererrormessage);
        cleartextbox(cardnumber);
		
	   	}

	@Then("Enter a valid CC number for card but one digit less on the Credit Card Number field and tab out")
	public void enter_a_valid_cc_number_for_card_but_one_digit_less_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"444439475840841");    
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
		Thread.sleep(3000);
		isMessageDisplayed(cardnumbererrormessage);
	    cleartextbox(cardnumber);
		
	    	}

	@Then("Enter invalid card number on Credit card number field")
	public void enter_invalid_card_number_on_credit_card_number_field() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"123456");    
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
		Thread.sleep(3000);
		isMessageDisplayed(cardnumbererrormessage);
	    cleartextbox(cardnumber);
		
		
	    	}



	
	@Then("click on creditcard number textbox and tabout")
	public void click_on_creditcard_number_textbox_and_tabout() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
		clickOn(cardnumber);
		 sendKeysTab(cardnumber,Keys.TAB);
		 fluentWaitForElement(cardnumbererrormessage);
		 Thread.sleep(3000);
		 isMessageDisplayed(cardnumbererrormessage);
		
	    
	}

	@Then("Enter letters on the Credit Card Number field and tab out")
	public void enter_letters_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        isemptytextbox(cardnumber);
        sendKeys(cardnumber,"test");
        sendKeysTab(cardnumber,Keys.TAB);
        isemptytextbox(cardnumber);
        fluentWaitForElement(cardnumbererrormessage);
		 Thread.sleep(3000);
		 isMessageDisplayed(cardnumbererrormessage);
        
	    
	}

	@Then("Enter invalid characters on the Credit Card Number field and tab out")
	public void enter_invalid_characters_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        isemptytextbox(cardnumber);
        sendKeys(cardnumber,"$@");
        sendKeysTab(cardnumber,Keys.TAB);
        isemptytextbox(cardnumber);
        fluentWaitForElement(cardnumbererrormessage);
		 Thread.sleep(3000);
		 isMessageDisplayed(cardnumbererrormessage);
        
	    
	}

	@Then("Enter a valid CC number for VISA card on the Credit Card Number field and tab out")
	public void enter_a_valid_cc_number_for_visa_card_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"4444394758408416");     
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
		 Thread.sleep(3000);
        isMessageDisplayed(cardnumbererrormessage);
        cleartextbox(cardnumber);
        
	    
	}

	@Then("Enter a valid CC number for VISA card but one digit less on the Credit Card Number field and tab out")
	public void enter_a_valid_cc_number_for_visa_card_but_one_digit_less_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"444439475840841");    
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
		Thread.sleep(3000);
		isMessageDisplayed(cardnumbererrormessage);
	    cleartextbox(cardnumber);
	    
	}

	@Then("Enter a valid CC number for DISNEY VISA card on the Credit Card Number field and tab out")
	public void enter_a_valid_cc_number_for_disney_visa_card_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"4266902036250643");
        sendKeysTab(cardnumber,Keys.TAB); 
        fluentWaitForElement(cardnumbererrormessage);
		 Thread.sleep(3000);
        isMessageDisplayed(cardnumbererrormessage);
        cleartextbox(cardnumber);
	}

	@Then("Enter a valid CC number for DISNEY VISA card but one digit less on the Credit Card Number field and tab out")
	public void enter_a_valid_cc_number_for_disney_visa_card_but_one_digit_less_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"426690203625064");
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
		Thread.sleep(3000);
		isMessageDisplayed(cardnumbererrormessage);
	    cleartextbox(cardnumber);
	   
	}

	@Then("Enter a valid CC number for DINERS CLUB card on the Credit Card Number field and tab out")
	public void enter_a_valid_cc_number_for_diners_club_card_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"30000049331824");  
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
		Thread.sleep(3000);
        isMessageDisplayed(cardnumbererrormessage);
        cleartextbox(cardnumber);
	}

	@Then("Enter a valid CC number for DINERS CLUB card but one digit less on the Credit Card Number field and tab out")
	public void enter_a_valid_cc_number_for_diners_club_card_but_one_digit_less_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"3000004933182");
     
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
		Thread.sleep(3000);
		isMessageDisplayed(cardnumbererrormessage);
	    cleartextbox(cardnumber);
	}

	@Then("Enter a valid CC number for MASTERCARD card on the Credit Card Number field and tab out")
	public void enter_a_valid_cc_number_for_mastercard_card_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"5555552575148281");
       
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
		Thread.sleep(3000);
        isMessageDisplayed(cardnumbererrormessage);
        cleartextbox(cardnumber);
	    
	}

	@Then("Enter a valid CC number for MASTERCARD card but one digit less on the Credit Card Number field and tab out")
	public void enter_a_valid_cc_number_for_mastercard_card_but_one_digit_less_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"555555257514828");
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
		Thread.sleep(3000);
		isMessageDisplayed(cardnumbererrormessage);
	    cleartextbox(cardnumber);
	    
	}

	@Then("Enter a valid CC number for DISCOVER card on the Credit Card Number field and tab out")
	public void enter_a_valid_cc_number_for_discover_card_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"6011114379162822");
        
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
		Thread.sleep(3000);
        isMessageDisplayed(cardnumbererrormessage);
        cleartextbox(cardnumber);
	    
	}

	@Then("Enter a valid CC number for DISCOVER card but one digit less on the Credit Card Number field and tab out")
	public void enter_a_valid_cc_number_for_discover_card_but_one_digit_less_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"601111437916282");
       
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
		Thread.sleep(3000);
		isMessageDisplayed(cardnumbererrormessage);
	    cleartextbox(cardnumber);
	  
	}

	@Then("Enter a valid CC number for  American express card on the Credit Card Number field and tab out")
	public void enter_a_valid_cc_number_for_american_express_card_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"371449635398431");   
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
        Thread.sleep(3000);
        isMessageDisplayed(cardnumbererrormessage);
        cleartextbox(cardnumber);
	    
	}

	@Then("Enter a valid CC number for  American express card but one digit less on the Credit Card Number field and tab out")
	public void enter_a_valid_cc_number_for_american_express_card_but_one_digit_less_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"37144963539843");
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
		Thread.sleep(3000);
		isMessageDisplayed(cardnumbererrormessage);
	    cleartextbox(cardnumber);
	    
	}

	@Then("Enter a valid CC number for  JAPAN CREDIT BUREAU  card on the Credit Card Number field and tab out")
	public void enter_a_valid_cc_number_for_japan_credit_bureau_card_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"3555559303166035");
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
		Thread.sleep(3000);
        isMessageDisplayed(cardnumbererrormessage);
        cleartextbox(cardnumber);
	    
	}

	@Then("Enter a valid CC number for  JAPAN CREDIT BUREAU  card but one digit less on the Credit Card Number field and tab out")
	public void enter_a_valid_cc_number_for_japan_credit_bureau_card_but_one_digit_less_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"355555930316603");
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
		Thread.sleep(3000);
		isMessageDisplayed(cardnumbererrormessage);
	    cleartextbox(cardnumber);
	}

	//date steps
	@When("click on date field and tab out")
	public void click_on_date_field_and_tab_out() throws InterruptedException {

        Thread.sleep(3000);

       driver.findElement(By.cssSelector("input[formcontrolname=\"expiration\"]")).click();
        driver.findElement(By.cssSelector("input[formcontrolname=\"expiration\"]")).sendKeys(Keys.TAB);
        
        
        
        if(driver.findElement(By.cssSelector("[id=\"card-expiration-error\"]>div>img")).isDisplayed())
       {
        	System.out.println("errormessage displayed");
        	
       }
        else
        {
        	System.out.println("errormessage not displayed");
       }
        
	    
	}
	
	@Then("Enter past date in date textbox")
	public void enter_past_date_in_date_textbox() throws InterruptedException {

		
		 Thread.sleep(3000);
		 
		 driver.findElement(By.cssSelector("input[formcontrolname=\"expiration\"]")).sendKeys("0622");
		 driver.findElement(By.cssSelector("input[formcontrolname=\"expiration\"]")).sendKeys(Keys.TAB);
		 Thread.sleep(3000);
		 
	        if(driver.findElement(By.cssSelector("[id=\"card-expiration-error\"]>div>img")).isDisplayed())
	       {
	        	System.out.println("errormessage displayed");
	        	
	       }
	        else
	        {
	        	System.out.println("errormessage not displayed");
	       }
	        
		driver.findElement(By.cssSelector("input[formcontrolname=\"expiration\"]")).clear();
		
		 
	    
	}

	@Then("Enter future date in date textbox")
	public void enter_future_date_in_date_textbox() throws InterruptedException {

		 Thread.sleep(3000);
		 
		 driver.findElement(By.cssSelector("input[formcontrolname=\"expiration\"]")).sendKeys("0627");
		 //driver.findElement(By.cssSelector("input[formcontrolname=\"expiration\"]")).sendKeys(Keys.TAB);
		 Thread.sleep(3000);
		 
	        if(driver.findElement(By.cssSelector("[id=\"card-expiration-error\"]>div>img")).isDisplayed())
	       {
	        	System.out.println("errormessage displayed");
	        	
	       }
	        else
	        {
	        	System.out.println("errormessage not displayed");
	       }
		 
	}

//securitycode field steps
	@Then("click on the Security field and tab out")
	public void click_on_the_security_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(securitycode);
        Thread.sleep(3000);
        clickOn(securitycode);
        sendKeysTab(securitycode,Keys.TAB);
        isMessageDisplayed(securitycodeErrormessage);
	    
	}

	@Then("Enter letters on the  Security field and tab out")
	public void enter_letters_on_the_security_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(securitycode);
        Thread.sleep(3000);
        sendKeys(securitycode,"test");
        sendKeysTab(securitycode,Keys.TAB);
        isMessageDisplayed(securitycodeErrormessage);
	    
	    
	}

	@Then("enter special characters in the security field and tab out")
	public void enter_special_characters_in_the_security_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(securitycode);
        Thread.sleep(3000);
        sendKeys(securitycode,"&@");
        sendKeysTab(securitycode,Keys.TAB);
        isMessageDisplayed(securitycodeErrormessage);
	    
	}

	@Then("Enter a two digits number and tab out")
	public void enter_a_two_digits_number_and_tab_out() throws InterruptedException {
		fluentWaitForElement(securitycode);
        Thread.sleep(3000);
        sendKeys(securitycode,"22");
        sendKeysTab(securitycode,Keys.TAB);
        isMessageDisplayed(securitycodeErrormessage);
	    cleartextbox(securitycode);
	    
	}

	@Then("Enter a valid security code on the security code field and tab out")
	public void enter_a_valid_security_code_on_the_security_code_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(securitycode);
        Thread.sleep(3000);
        sendKeys(securitycode,"2345");
        sendKeysTab(securitycode,Keys.TAB);
        isMessageDisplayed(securitycodeErrormessage);
	   
	   
	}


	
//Name on card field steps
	@Then("Click on Cardholders name field and tab out")
	public void click_on_cardholders_name_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(nameoncard);
        Thread.sleep(3000);
		clickOn(nameoncard);
		 sendKeysTab(nameoncard,Keys.TAB);
		 fluentWaitForElement(nameerrormessage);
		 Thread.sleep(3000);
		 isMessageDisplayed(nameerrormessage);
	   
	}

	@Then("Enter special characters in Cardholders name field and tab out")
	public void enter_special_characters_in_cardholders_name_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(nameoncard);
        Thread.sleep(3000);
        sendKeys(nameoncard,"$@");      
        sendKeysTab(nameoncard,Keys.TAB);
        fluentWaitForElement(nameerrormessage);
        Thread.sleep(3000);
        isMessageDisplayed(nameerrormessage);
        cleartextbox(nameoncard);
        
	   
	}

	@Then("Enter numbers in Cardholders name field and tab out")
	public void enter_numbers_in_cardholders_name_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(nameoncard);
        Thread.sleep(3000);
        sendKeys(nameoncard,"123");     
        sendKeysTab(nameoncard,Keys.TAB);
        isMessageDisplayed(nameerrormessage);
        cleartextbox(nameoncard);
        
	   
	}
	@Then("Enter one character in Cardholders name field and tab out")
	public void enter_one_character_in_cardholders_name_field_and_tab_out() throws InterruptedException {
		
		fluentWaitForElement(nameoncard);
        Thread.sleep(3000);
        sendKeys(nameoncard,"T");
        sendKeysTab(nameoncard,Keys.TAB);
        fluentWaitForElement(nameerrormessage);
        Thread.sleep(3000);
        isMessageDisplayed(nameerrormessage);
        cleartextbox(nameoncard);
	}

	@Then("Enter characters in Cardholders name field and tab out")
	public void enter_characters_in_cardholders_name_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(nameoncard);
        Thread.sleep(3000);
        sendKeys(nameoncard,"Test");    
        sendKeysTab(nameoncard,Keys.TAB);
        isMessageDisplayed(nameerrormessage);
        
        
	    
	}
	
	//address lines
	@Then("Click on Address Line1 field and tab out")
	public void click_on_address_line1_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(addressLine1);
        Thread.sleep(3000);
        clickOn(addressLine1);
        sendKeysTab(addressLine1,Keys.TAB);
        isMessageDisplayed(addressLine1Errormessage);
	    
	    
	}

	@Then("Enter special characters on AddressLine1 and tab out")
	public void enter_special_characters_on_address_line1_and_tab_out() throws InterruptedException {
		fluentWaitForElement(addressLine1);
        Thread.sleep(3000);
        sendKeys(addressLine1,"$@");    
        sendKeysTab(addressLine1,Keys.TAB);
        isMessageDisplayed(addressLine1Errormessage);
        cleartextbox(addressLine1);
	    
	}

	@Then("Enter valid address with numbers and characters on AddressLine1 and tab out")
	public void enter_valid_address_with_numbers_and_characters_on_address_line1_and_tab_out() throws InterruptedException {
		fluentWaitForElement(addressLine1);
        Thread.sleep(3000);
        sendKeys(addressLine1,"666 Sunset Blvd");    
        sendKeysTab(addressLine1,Keys.TAB);
        isMessageDisplayed(addressLine1Errormessage);
        cleartextbox(addressLine1);
	    
	   
	}

	@Then("Click on Address Line2 field and tab out")
	public void click_on_address_line2_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(addressLine2);
        Thread.sleep(3000);
        clickOn(addressLine2);
        sendKeysTab(addressLine2,Keys.TAB);
        isMessageDisplayed(addressLine2Errormessage);
	   
	}

	@Then("Enter special characters on AddressLine2 and tab out")
	public void enter_special_characters_on_address_line2_and_tab_out() throws InterruptedException {
		fluentWaitForElement(addressLine2);
        Thread.sleep(3000);
        sendKeys(addressLine2,"$@");    
        sendKeysTab(addressLine2,Keys.TAB);
        isMessageDisplayed(addressLine2Errormessage);
        cleartextbox(addressLine2);
	    
	   
	}

	@Then("Enter valid address with numbers and characters on AddressLine2 and tab out")
	public void enter_valid_address_with_numbers_and_characters_on_address_line2_and_tab_out() throws InterruptedException {
		fluentWaitForElement(addressLine2);
        Thread.sleep(3000);
        sendKeys(addressLine2,"3600 Barham boulevard");    
        sendKeysTab(addressLine2,Keys.TAB);
        isMessageDisplayed(addressLine2Errormessage);
        cleartextbox(addressLine2);
	    
	   
	}
	
	//address1
	
	@Then("Click on the Country dropdown menu and select United states")
	public void click_on_the_country_dropdown_menu_and_select_united_states() throws InterruptedException {
		fluentWaitForElement(country);
        Thread.sleep(3000);
        dropdown(country,"US");
	    
	}

	@Then("Enter address on AddressLine1 and tab out")
	public void enter_address_on_address_line1_and_tab_out() throws InterruptedException {
		fluentWaitForElement(addressLine1);
        Thread.sleep(3000);
        sendKeys(addressLine1,"666 Sunset Blvd");    
        sendKeysTab(addressLine1,Keys.TAB);
        isMessageDisplayed(addressLine1Errormessage);
	   
	}

	@Then("Enter address on AddressLine2 and tab out")
	public void enter_address_on_address_line2_and_tab_out() throws InterruptedException {
		fluentWaitForElement(addressLine2);
        Thread.sleep(3000);
        sendKeys(addressLine2,"3600 Barham boulevard");    
        sendKeysTab(addressLine2,Keys.TAB);
        isMessageDisplayed(addressLine2Errormessage);
	    
	}

	@Then("Enter zipcode on Zipcode textbox and tab out")
	public void enter_zipcode_on_zipcode_textbox_and_tab_out() throws InterruptedException {
		fluentWaitForElement(zipcode);
        Thread.sleep(3000);
        sendKeys(zipcode,"90068");    
        sendKeysTab(zipcode,Keys.TAB);
        isMessageDisplayed(zipcodeErrormessage);
	    
	}

	@Then("Enter city on city textbox and tab out")
	public void enter_city_on_city_textbox_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cityTextbox);
        Thread.sleep(3000);
        sendKeys(cityTextbox,"Los Angeles");    
        sendKeysTab(cityTextbox,Keys.TAB);
        isMessageDisplayed(cityErrormessage);
	   
	}

	@Then("click on state dropdown and select colorado state")
	public void click_on_state_dropdown_and_select_colorado_state() throws InterruptedException {
		fluentWaitForElement(stateDropdown);
        Thread.sleep(3000);
        dropdown(stateDropdown,"CO");
        isMessageDisplayed(stateErrormessage);
	    
		
	   
	}
	
	//Address2
	
	@Then("Click on the Country dropdown menu and select Canada")
	public void click_on_the_country_dropdown_menu_and_select_canada() throws InterruptedException {
		fluentWaitForElement(country);
        Thread.sleep(3000);
        dropdown(country,"CA");
	    
	}

	@Then("Enter canada zipcode on Zipcode textbox and tab out")
	public void enter_canada_zipcode_on_zipcode_textbox_and_tab_out() throws InterruptedException {
		fluentWaitForElement(zipcodeCanada);
        Thread.sleep(3000);
        sendKeys(zipcodeCanada,"M3C 0C1");    
        sendKeysTab(zipcodeCanada,Keys.TAB);
        isMessageDisplayed(zipcodeErrormessage);
	   
	}

	@Then("Enter canada city on city textbox and tab out")
	public void enter_canada_city_on_city_textbox_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cityTextbox);
        Thread.sleep(3000);
        sendKeys(cityTextbox,"Toronto");    
        sendKeysTab(cityTextbox,Keys.TAB);
        isMessageDisplayed(cityErrormessage);
	}

	@Then("click on state dropdown and select Ontario")
	public void click_on_state_dropdown_and_select_ontario() throws InterruptedException {
		fluentWaitForElement(stateDropdown);
        Thread.sleep(3000);
        dropdown(stateDropdown,"ON");
        isMessageDisplayed(stateErrormessage);
	    
	}
//city and state
	
	@Then("click on City field , delete the info on the field and tab out")
	public void click_on_city_field_delete_the_info_on_the_field_and_tab_out() throws InterruptedException {
		
		fluentWaitForElement(cityTextbox);
        Thread.sleep(3000);
        clickOn(cityTextbox);
        sendKeysTab(cityTextbox,Keys.TAB);
        cleartextbox(cityTextbox);
        sendKeysTab(cityTextbox,Keys.TAB);
        isMessageDisplayed(cityErrormessage);
		
	   
	}

	@Then("Enter special characters on city field and tab out")
	public void enter_special_characters_on_city_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cityTextbox);
        Thread.sleep(3000);
        sendKeys(cityTextbox,"&@"); 
        sendKeysTab(cityTextbox,Keys.TAB);
        isMessageDisplayed(cityErrormessage);
        cleartextbox(cityTextbox);
	    
	}

	@Then("Enter numbers on city field and tab out")
	public void enter_numbers_on_city_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cityTextbox);
        Thread.sleep(3000);
        sendKeys(cityTextbox,"1234"); 
        sendKeysTab(cityTextbox,Keys.TAB);
        isMessageDisplayed(cityErrormessage);
        cleartextbox(cityTextbox);
	    
	    
	}

	@Then("Enter characters on the city field and tab out")
	public void enter_characters_on_the_city_field_and_tab_out() throws InterruptedException {
		
	    
	   
	}

	@Then("click on state dropdown and tab out")
	public void click_on_state_dropdown_and_tab_out() throws InterruptedException {
		fluentWaitForElement(stateDropdown);
        Thread.sleep(3000);
        clickOn(stateDropdown);
        sendKeysTab(stateDropdown,Keys.TAB);
        isMessageDisplayed(stateErrormessage);
        
        
	    
	}

	@Then("click on state dropdown and select one state and tab out")
	public void click_on_state_dropdown_and_select_one_state_and_tab_out() throws InterruptedException {
		fluentWaitForElement(stateDropdown);
        Thread.sleep(3000);
        dropdown(stateDropdown,"CO");
        isMessageDisplayed(stateErrormessage);
	    
	}
	
	@When("click on country dropdown and select Albania")
	public void click_on_country_dropdown_and_select_albania() throws InterruptedException {
		fluentWaitForElement(country);
        Thread.sleep(3000);
        dropdown(country,"AL");
	}

	@Then("Enter city name on the city field and tab out")
	public void enter_city_name_on_the_city_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cityTextbox);
        Thread.sleep(3000);
        sendKeys(cityTextbox,"Tirana"); 
        sendKeysTab(cityTextbox,Keys.TAB);
        isMessageDisplayed(cityErrormessage);
        cleartextbox(cityTextbox);
	    
	}

	@Then("Enter invalid city name on the city field and tab out")
	public void enter_invalid_city_name_on_the_city_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cityTextbox);
        Thread.sleep(3000);
        sendKeys(cityTextbox,"Los Angeles"); 
        sendKeysTab(cityTextbox,Keys.TAB);
        isMessageDisplayed(cityErrormessage);
        cleartextbox(cityTextbox);
	    
	}

	@Then("Click on State field, delete the info on the field and tab out")
	public void click_on_state_field_delete_the_info_on_the_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(stateTextbox);
        Thread.sleep(3000);
        clickOn(stateTextbox);
        sendKeysTab(stateTextbox,Keys.TAB);
        isMessageDisplayed(stateErrormessage);
	    
	}

	@Then("Enter special characters on state field and tab out")
	public void enter_special_characters_on_state_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(stateTextbox);
        Thread.sleep(3000);
        sendKeys(stateTextbox,"@&"); 
        sendKeysTab(stateTextbox,Keys.TAB);
        isMessageDisplayed(stateErrormessage);
        cleartextbox(stateTextbox);
	    
	}

	@Then("Enter state name on the state field")
	public void enter_state_name_on_the_state_field() throws InterruptedException {
		fluentWaitForElement(stateTextbox);
        Thread.sleep(3000);
        sendKeys(stateTextbox,"Tirana"); 
        sendKeysTab(stateTextbox,Keys.TAB);
        isMessageDisplayed(stateErrormessage);
        cleartextbox(stateTextbox);
	    
	}

	@Then("Enter numbers on state field and tab out")
	public void enter_numbers_on_state_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(stateTextbox);
        Thread.sleep(3000);
        sendKeys(stateTextbox,"12345"); 
        sendKeysTab(stateTextbox,Keys.TAB);
        isMessageDisplayed(stateErrormessage);
        cleartextbox(stateTextbox);
	    
	}

	@Then("invalid state name on the state field and tab out")
	public void invalid_state_name_on_the_state_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(stateTextbox);
        Thread.sleep(3000);
        sendKeys(stateTextbox,"Los Angeles"); 
        sendKeysTab(stateTextbox,Keys.TAB);
        isMessageDisplayed(stateErrormessage);
        cleartextbox(stateTextbox);
	    
	}
	
	//zipcode
	
	@Then("Click on Zip Code field and tab out")
	public void click_on_zip_code_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(zipcode);
        Thread.sleep(3000);
        sendKeysTab(zipcode,Keys.TAB);
        isMessageDisplayed(zipcodeErrormessage);
	    
	    
	}

	@Then("Enter special characters on Zip Code field")
	public void enter_special_characters_on_zip_code_field() throws InterruptedException {
		fluentWaitForElement(zipcode);
        Thread.sleep(3000);
        sendKeys(zipcode,"&@");    
        sendKeysTab(zipcode,Keys.TAB);
        isMessageDisplayed(zipcodeErrormessage);
        cleartextbox(zipcode);
	    
	    
	}

	@Then("Enter numbers on Zip Code field")
	public void enter_numbers_on_zip_code_field() throws InterruptedException {
		fluentWaitForElement(zipcode);
        Thread.sleep(3000);
        sendKeys(zipcode,"123456789012345678901234567890");    
        sendKeysTab(zipcode,Keys.TAB);
        isMessageDisplayed(zipcodeErrormessage);
        cleartextbox(zipcode);
	    
	   
	}

	@Then("Enter valid zip code on Zip Code field")
	public void enter_valid_zip_code_on_zip_code_field() throws InterruptedException {
		fluentWaitForElement(zipcode);
        Thread.sleep(3000);
        sendKeys(zipcode,"90068");    
        sendKeysTab(zipcode,Keys.TAB);
        isMessageDisplayed(zipcodeErrormessage);
        
	    
	}
	
	//all payment method fields
	
	
	@When("Enter CC number for card on the Credit Card Number field and tab out")
	public void enter_cc_number_for_card_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"4444394758408416");     
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
		 Thread.sleep(3000);
        isMessageDisplayed(cardnumbererrormessage);
       
		
	    
	}

	
	@Then("Click on the Store my payment information for use across the Walt Disney Family of companies checkbox")
	public void click_on_the_store_my_payment_information_for_use_across_the_walt_disney_family_of_companies_checkbox() throws InterruptedException {
		
		fluentWaitForElement(storemycheckbox);
        Thread.sleep(3000);
		clickOn(storemycheckbox);
		
	   
	}

	@Then("Click on Confirm button")
	public void click_on_confirm_button() throws InterruptedException {
		fluentWaitForElement(paymentconfirm);
        Thread.sleep(3000);
		clickOn(paymentconfirm);
		
	    
	}
	
	@Then("Enter city name on city textbox and tab out")
	public void enter_city_name_on_city_textbox_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cityTextbox);
        Thread.sleep(3000);
        sendKeys(cityTextbox,"Alaska");    
        sendKeysTab(cityTextbox,Keys.TAB);
        isMessageDisplayed(cityErrormessage);
	   
	    
	}

	@Then("click on state dropdown and select one state")
	public void click_on_state_dropdown_and_select_one_state() throws InterruptedException {
		fluentWaitForElement(stateDropdown);
        Thread.sleep(3000);
        dropdown(stateDropdown,"Ak");
        isMessageDisplayed(stateErrormessage);
	    
	}
	
	//all payment field steps
	
	@When("click on the Credit Card Number field and tab out")
	public void click_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);  
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
		 Thread.sleep(3000);
        isMessageDisplayed(cardnumbererrormessage);
        
	   
	}

	@When("Enter a valid CC number on the Credit Card Number field and tab out")
	public void enter_a_valid_cc_number_on_the_credit_card_number_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cardnumber);
        Thread.sleep(3000);
        sendKeys(cardnumber,"4444394758408416");  
        sendKeysTab(cardnumber,Keys.TAB);
        fluentWaitForElement(cardnumbererrormessage);
		Thread.sleep(3000);
        isMessageDisplayed(cardnumbererrormessage);
        
	   
	}

//	@When("Enter a valid CID code on the CID field and tab out")
//	public void enter_a_valid_cid_code_for_example_on_the_cid_field_and_tab_out(String string) throws InterruptedException {
//		fluentWaitForElement(securitycode);
//        Thread.sleep(3000);
//        sendKeys(securitycode,"2345");
//        sendKeysTab(securitycode,Keys.TAB);
//        isMessageDisplayed(securitycodeErrormessage);
//	   
//	}
	

	
	@When("Enter security code on the security code field and tab out")
	public void enter_security_code_on_the_security_code_field_and_tab_out() throws InterruptedException {
		fluentWaitForElement(securitycode);
        Thread.sleep(3000);
        sendKeys(securitycode,"234");
        sendKeysTab(securitycode,Keys.TAB);
        isMessageDisplayed(securitycodeErrormessage);
	   
	   
	   
	}
	


	@When("Enter future date on date field")
	public void enter_future_date_on_date_field() throws InterruptedException {
		Thread.sleep(3000);
		 driver.findElement(By.cssSelector("input[formcontrolname=\"expiration\"]")).sendKeys("0627"+Keys.TAB);
		 //isMessageDisplayed(dateErrormessage);
		 //driver.findElement(By.cssSelector("input[formcontrolname=\"expiration\"]")).clear();
		 Thread.sleep(3000);
		 if(driver.findElement(By.cssSelector("[id=\"card-expiration-error\"]>div")).isDisplayed())
{
			 System.out.println(driver.findElement(By.cssSelector("[id=\"card-expiration-error\"]>div")).getText());
	         System.out.println("errormessage displayed");
	
}
else
{
	System.out.println("errormessage not displayed");
}
	 
	}

	@When("Fill in Cardholders Name field with TestName and tab out")
	public void fill_in_cardholders_name_field_with_test_name_and_tab_out() throws InterruptedException {
		fluentWaitForElement(nameoncard);
        Thread.sleep(3000);
        sendKeys(nameoncard,"Test");    
        sendKeysTab(nameoncard,Keys.TAB);
        isMessageDisplayed(nameerrormessage);
	}

	@When("Click on the Country dropdown menu to expand it and select any country")
	public void click_on_the_country_dropdown_menu_to_expand_it_and_select_any_country() throws InterruptedException {
		fluentWaitForElement(country);
        Thread.sleep(3000);
        dropdown(country,"US");
	   
	}

	@When("Fill in Address Line1 field with a address and tab out")
	public void fill_in_address_line1_field_with_a_address_and_tab_out() throws InterruptedException {
		fluentWaitForElement(addressLine1);
        Thread.sleep(3000);
        sendKeys(addressLine1,"666 Sunset Blvd");    
        sendKeysTab(addressLine1,Keys.TAB);
        isMessageDisplayed(addressLine1Errormessage);
       
	   
	}

	@When("Fill in Address Line2 field with a address and tab out")
	public void fill_in_address_line2_field_with_a_address_and_tab_out() throws InterruptedException {
		fluentWaitForElement(addressLine2);
        Thread.sleep(3000);
        sendKeys(addressLine2,"3600 Barham boulevard");    
        sendKeysTab(addressLine2,Keys.TAB);
        isMessageDisplayed(addressLine2Errormessage);
        
	   
	}

	@When("Fill on City field with Los Angeles and tab out")
	public void fill_on_city_field_with_los_angeles_and_tab_out() throws InterruptedException {
		fluentWaitForElement(cityTextbox);
        Thread.sleep(3000);
        sendKeys(cityTextbox,"Alaska");    
        sendKeysTab(cityTextbox,Keys.TAB);
        isMessageDisplayed(cityErrormessage);
	   
	}

	@When("Fill on State field with Colorado and tab out")
	public void fill_on_state_field_with_colorado_and_tab_out() throws InterruptedException {
		fluentWaitForElement(stateDropdown);
        Thread.sleep(3000);
        dropdown(stateDropdown,"Ak");
        isMessageDisplayed(stateErrormessage);
	    
	}

	@When("Fill on Zip Code field with zipcode and tab out")
	public void fill_on_zip_code_field_with_zipcode_and_tab_out() throws InterruptedException {
		fluentWaitForElement(zipcode);
        Thread.sleep(3000);
        sendKeys(zipcode,"90068");    
        sendKeysTab(zipcode,Keys.TAB);
        isMessageDisplayed(zipcodeErrormessage);
        
	    
	   
	}

	@When("Click on the Store my payment checkbox")
	public void click_on_the_store_my_payment_checkbox() throws InterruptedException {
		fluentWaitForElement(storemycheckbox);
        Thread.sleep(3000);
		clickOn(storemycheckbox);
	    
	}

	@When("Click on Conform button")
	public void click_on_conform_button() throws InterruptedException {
		fluentWaitForElement(paymentconfirm);
        Thread.sleep(3000);
		clickOn(paymentconfirm);
		
	    
	}


	
	
	

















	
	


	


}
