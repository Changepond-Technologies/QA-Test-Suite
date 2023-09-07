package com.ep.cucumber.steps.time;

import com.ep.cucumber.pages.time.EmployeeTimeSheetPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;
import org.testng.Assert;

public class EmployeeTimeSheetSteps {

	@Inject
	EmployeeTimeSheetPage employeeTimeSheetPage;

	// *******************************************************************************************
	// Step Definition to enter the search value in search bar
	// *******************************************************************************************
	@When("user enters the search value {string} in the searchbar")
	public void user_enters_the_search_value_in_the_searchbar(String value) {
		employeeTimeSheetPage.enterValueInSearchBar(value);
	}

	// *******************************************************************************************
	// Step Definition to Click on view button
	// *******************************************************************************************
	@When("user Click on view button")
	public void user_click_on_view_button() {
		employeeTimeSheetPage.clickOnViewButton();
	}

	// *******************************************************************************************
	// Step Definition to verify the employee error message is displayed
	// *******************************************************************************************
	@Then("user should see the error message in employee name field")
	public void user_should_see_the_error_message_in_employee_name_field() {
		boolean flag = employeeTimeSheetPage.employeeNameErrorValidation();
		Assert.assertTrue(flag);
	}

	// *******************************************************************************************
	// Step Definition to Click on edit button
	// *******************************************************************************************
	@Then("user click on Edit button")
	public void user_click_on_edit_button() {
		employeeTimeSheetPage.clickOnEditButton();
	}
}
