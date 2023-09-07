package com.ep.cucumber.steps.pim;

import com.ep.cucumber.pages.pim.PIMContactDetailsPage;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;

public class PIMContactDetailsStep {

	@Inject
	PIMContactDetailsPage contactDetailsPage;

	// *******************************************************************************************
	// Step Definition to click contact details
	// *******************************************************************************************

	@When("user clicks on the contact details from left panel")
	public void user_clicks_on_the_contact_details_from_left_panel() {
		contactDetailsPage.clickContactDetails();
	}
	@When("user navigated to contact details page")
	public void user_navigated_to_contact_details_page() {

	}
	// *******************************************************************************************
	// Step Definition to set the street, city, postal code, mobile and email
	// *******************************************************************************************
	@When("user enters the street1 {string} in the inputbox")
	public void user_enters_the_street1_in_the_inputbox(String street) {
		contactDetailsPage.setStreetAddress(street);
	}
	@When("user enters the city {string} in the inputbox")
	public void user_enters_the_city_in_the_inputbox(String city) {
		contactDetailsPage.setCity(city);
	}
	@When("user enters postal code {string} in the inputbox")
	public void user_enters_postal_code_in_the_inputbox(String postalCode) {
		contactDetailsPage.setPostalCode(postalCode);
	}
	@When("user selects the country as {string} from the dropdown")
	public void user_selects_the_country_as_from_the_dropdown(String country) {
		contactDetailsPage.selectCountry(country);
	}
	@When("user enters the mobile {string} in the inputbox")
	public void user_enters_the_mobile_in_the_inputbox(String mobile) {
		contactDetailsPage.setMobile(mobile);
	}
	@When("user enters the email {string} in the inputbox")
	public void user_enters_the_email_in_the_inputbox(String email) {
		contactDetailsPage.setEmail(email);
	}
}
