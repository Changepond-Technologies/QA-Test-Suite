package com.ep.cucumber.steps.admin;

import com.ep.cucumber.pages.admin.AdminAddLocationPage;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;

public class AdminAddLocationSteps {
	
	@Inject
	AdminAddLocationPage locationPage;
	
	// *******************************************************************************************
	// Step Definition to click location submenu
	// *******************************************************************************************
    @When("user selects locations from organization dropdown")
	public void user_selects_locations_from_organization_dropdown() {
		locationPage.clickOnLocationSubMenu();
	}
    // *******************************************************************************************
 	// Step Definition to click add button
 	// *******************************************************************************************
	@When("user clicks Add button from location tab")
	public void user_clicks_add_button_from_location_tab() {
		locationPage.clickOnAddButton();
	}
	// *******************************************************************************************
 	// Step Definition to enter city name
 	// ********************************************************************************************
	@When("user enters City name {string} in the inputBox")
	public void user_enters_city_name_in_the_input_box(String cityname) {
		locationPage.enterCityName(cityname);
	}
	// *******************************************************************************************
 	// Step Definition to enter zip code
 	// ********************************************************************************************
	@When("user enters Zip code {string} in the inputBox")
	public void user_enters_zip_code_in_the_input_box(String postalcode) {
		locationPage.enterPostalCode(postalcode);
	}
	// *******************************************************************************************
	// Step Definition to enter phone number
	// ********************************************************************************************
	@When("user enters Phone number {string} in the inputBox")
	public void user_enters_phone_number_in_the_input_box(String phonenumber) {
		locationPage.enterPhoneNumber(phonenumber);
	}
	// *******************************************************************************************
	// Step Definition to enter address
	// ********************************************************************************************
	@When("user enters Address {string} in the inputBox")
	public void user_enters_address_in_the_input_box(String address) {
		locationPage.enterAddress(address);
	}
	// *******************************************************************************************
	// Step Definition to enter state
	// ********************************************************************************************
	@When("user enters State {string} in the inputBox")
	public void user_enters_state_in_the_input_box(String state) {
		locationPage.enterStateName(state);
	}
	// *******************************************************************************************
	// Step Definition to click country field
	// ********************************************************************************************
	@When("user clicks Country dropdown")
	public void user_clicks_country_dropdown() {
		locationPage.clickOnCountry();
	}
	// *******************************************************************************************
	// Step Definition to select country name
	// ********************************************************************************************
	@When("user selects Country name  as {string}")
	public void user_selects_country_name_as(String country) {
		locationPage.selectCountry(country);
	}
	// *******************************************************************************************
	// Step Definition to enter fax number
	// ********************************************************************************************
	@When("user enters Fax number {string} in the inputBox")
	public void user_enters_fax_number_in_the_input_box(String faxnumber) {
		locationPage.enterFaxNumber(faxnumber);
	}
	// *******************************************************************************************
    // Step Definition to enter notes
	// *******************************************************************************************
	@When("user enters notes in the inputBox")
	public void user_enters_notes_in_the_input_box() {
		locationPage.enterNotes();
	}
}