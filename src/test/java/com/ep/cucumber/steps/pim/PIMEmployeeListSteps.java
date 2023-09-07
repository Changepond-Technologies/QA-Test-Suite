package com.ep.cucumber.steps.pim;

import org.picocontainer.annotations.Inject;
import org.testng.Assert;

import com.ep.cucumber.pages.pim.PIMEmployeeListPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMEmployeeListSteps {

	@Inject
	PIMEmployeeListPage employeePage;

	// *******************************************************************************************
	// Step Definition to verify employee information page header text
	// *******************************************************************************************
	@Then("user navigates to employee information page")
	public void user_navigates_to_employee_information_page() {
		String employeeInformationText = employeePage.getEmployeeInformationText();
		Assert.assertEquals(employeeInformationText, "Employee Information");
	}

	// *******************************************************************************************
	// Step Definition to search employee id and employee name
	// *******************************************************************************************
	@Then("user enters the employee id in the searchbox")
	public void user_enters_the_employee_id_in_the_searchbox() {
		employeePage.searchEmpId();
	}

	@Then("user search the employee with following information")
	public void user_search_the_employee_with_following_information(io.cucumber.datatable.DataTable dataTable) {
		employeePage.searchEmpNameAndID(dataTable);
	}

	// *******************************************************************************************
	// Step Definition to click search button
	// *******************************************************************************************
	@Then("user clicks on the search button")
	public void user_clicks_on_the_search_button() {
		employeePage.clickSearchBtn();
	}

	// *******************************************************************************************
	// Step Definition to verify web table data
	// *******************************************************************************************
	@Then("user should see the created record in orangehrm table")
	public void user_should_see_the_created_record_in_orangehrm_table() {
		employeePage.verifyTableData();
	}

	// *******************************************************************************************
	// Step Definition to click edit button
	// *******************************************************************************************
	@Then("user should the matched row values and clicks on the edit button")
	public void user_should_the_matched_row_values_and_clicks_on_the_edit_button() {
		employeePage.clickEditBtn();
	}

	@When("user search the generated employee with following information")
	public void user_search_the_generated_employee_with_following_information(DataTable dataTable) {
		employeePage.searchEmpNameAndID(dataTable);
	}

	@When("user search the generated employee Name and ID with following information")
	public void user_search_the_generated_employee_name_and_id_with_following_information(DataTable dataTable) {
		employeePage.searchGenaratedEmpNameAndID(dataTable);
	}

	@When("user enters the \\{generatedEmpId} in the searchbox")
	public void user_enters_the_in_the_searchbox() {
		employeePage.searchEmpId();

	}

}
