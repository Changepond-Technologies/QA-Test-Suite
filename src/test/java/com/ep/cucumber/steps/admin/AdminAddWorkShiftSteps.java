package com.ep.cucumber.steps.admin;

import com.ep.cucumber.pages.admin.AdminAddWorkShiftPage;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;

public class AdminAddWorkShiftSteps {
	
	@Inject
	AdminAddWorkShiftPage workshiftPage;
	
	// *******************************************************************************************
	// Step Definition to click work shift menu
    // *******************************************************************************************
	@When("user selects work shifts from job dropdown")
	public void user_selects_work_shifts_from_job_dropdown() {
		workshiftPage.clickOnWorkShiftsSubMenu();
	}
	// *******************************************************************************************
	// Step Definition to click work shifts add button
	// *******************************************************************************************
	@When("user clicks Add button")
	public void user_clicks_add_button() {
		workshiftPage.clickOnWorkShiftsAddButton();
	}
	// *******************************************************************************************
	// Step Definition to enter shift name
	// *******************************************************************************************
	@When("user enters Shift name {string} in the inputBox")
	public void user_enters_shift_name_in_the_input_box(String shiftname) {
		workshiftPage.enterShiftName(shiftname);
	}
	// *******************************************************************************************
    // Step Definition to enter assigned employee name
	// *******************************************************************************************
	@When("user enters Assigned Employee name {string} in the inputBox")
	public void user_enters_assigned_employee_name_in_the_input_box(String employeename) {
		workshiftPage.enterAssignedEmployeesName(employeename);
	}
	// *******************************************************************************************
    // Step Definition to select assigned employee name
	// *******************************************************************************************
	@When("user selects Assigned Employee name {string} from the list")
	public void user_selects_assigned_employee_name_from_the_list(String string) {
		workshiftPage.selectAssignedEmployeesName();
	}



}
	