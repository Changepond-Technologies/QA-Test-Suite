package com.ep.cucumber.steps.pim;

import org.picocontainer.annotations.Inject;
import org.testng.Assert;

import com.ep.cucumber.pages.pim.PIMAddEmployeePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMAddEmployeeSteps {

	@Inject
	PIMAddEmployeePage addEmployeePage;

	// *******************************************************************************************
	// Step Definition to click add user
	// *******************************************************************************************

	@Then("user clicks on the add button")
	public void user_clicks_on_the_add_button() {
		addEmployeePage.clickAddUser();
	}

	// *******************************************************************************************
	// Step Definition to verify add employee page text
	// *******************************************************************************************
	@When("user enters into the add employee page")
	public void user_enters_into_the_add_employee_page() {
		Assert.assertEquals(addEmployeePage.getAddEmpText(), "Add Employee");
	}

	// *******************************************************************************************
	// Step Definition to set generated employee name
	// *******************************************************************************************
	@When("user enters the employee first name \\{generatedFirstName} in the inputbox")
	public void user_enters_the_employee_first_name_in_the_inputbox1() {
		addEmployeePage.setGeneratedEmpName();
	}

	// *******************************************************************************************
	// Step Definition to set first name, middle name and last name
	// *******************************************************************************************

	@Then("user enters the employee first name {string} in the inputbox")
	public void user_enters_the_employee_first_name_in_the_inputbox(String firstName) {
		addEmployeePage.setEmpFirstName(firstName);
	}

	@Then("user enters the employee middle name {string} in the inputbox")
	public void user_enters_the_employee_middle_name_in_the_inputbox(String middleName) {
		addEmployeePage.setEmpMiddleName(middleName);
	}

	@Then("user enters the employee last name {string} in the inputbox")
	public void user_enters_the_employee_last_name_in_the_inputbox(String lastName) {
		addEmployeePage.setEmpLastName(lastName);
	}

	// *******************************************************************************************
	// Step Definition to set employee id
	// *******************************************************************************************
	@Then("user enters the employee id in the inputbox")
	public void user_gets_the_employee_id() {
		addEmployeePage.setEmpId();
	}

	// *******************************************************************************************
	// Step Definition to click save and cancel button
	// *******************************************************************************************
	@When("user clicks on the cancel button")
	public void user_clicks_on_the_cancel_button() {
		addEmployeePage.clickCancelButton();
	}

	@Then("user clicks on the save button to create user")
	public void user_clicks_on_the_save_button_to_create_user() {
		addEmployeePage.clickSaveBtn();
	}
	// *******************************************************************************************
	// Step Definition to set middle name , last name
	// *******************************************************************************************

	@When("user enters the employee middle name \\{generatedMiddleName} in the inputbox")
	public void user_enters_the_employee_middle_name_in_the_inputbox() {
		addEmployeePage.setGeneratedMiddleName();
	}

	@When("user enters the employee last name \\{generatedLastName} in the inputbox")
	public void user_enters_the_employee_last_name_in_the_inputbox() {
		addEmployeePage.setGeneratedLastName();
	}

	// *******************************************************************************************
	// Step Definition to click create login details toggle and set user name,
	// password and confirm password
	// *******************************************************************************************
	@When("user clicks on the toggle button for create login details")
	public void user_clicks_on_the_toggle_button_for_create_login_details() {
		addEmployeePage.createLoginDetailsToggle();
	}

	@When("user enters the username {string} in the inputbox")
	public void user_enters_the_username_in_the_inputbox(String userName) {
		addEmployeePage.setUserNameDetails();
	}

	@When("user enters the password {string} in the inputbox")
	public void user_enters_the_password_in_the_inputbox(String password) {
		addEmployeePage.setPassword(password);
	}

	@When("user enters the confirm password {string} in the inputbox")
	public void user_enters_the_confirm_password_in_the_inputbox(String confirmPassword) {
		addEmployeePage.setConfirmPassword(confirmPassword);
	}

	@When("user enters the following informtion in the input box")
	public void user_enters_the_following_informtion_in_the_input_box(DataTable dataTable) {

		addEmployeePage.enterNameInInputBox();

	}
}
