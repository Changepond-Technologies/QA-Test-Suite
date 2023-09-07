package com.ep.cucumber.steps.leave;

import com.ep.cucumber.pages.leave.ConfigureLeaveTypePage;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;

public class ConfigureLeaveTypeSteps {
	
	@Inject
	ConfigureLeaveTypePage leaveTypePage;
	// *******************************************************************************************
	// Step Definition to select leave type
	// *******************************************************************************************
	@When("user selects leave types from configure menu")
	public void user_selects_leave_types_from_configure_menu() {
		leaveTypePage.clickonleavetypes();
	}
	// *******************************************************************************************
	// Step Definition to click add button
	// *******************************************************************************************
	@When("user clicks on add button")
	public void user_clicks_on_add_button() {
		leaveTypePage.clickonaddbutton();
	}
	// *******************************************************************************************
	// Step Definition to enter leave type
	// *******************************************************************************************
	@When("user enters the name {string} in the inputbox")
	public void user_enters_the_name_in_the_inputbox(String leavetype) {
		leaveTypePage.clickonnamefield(leavetype);
	}
	// *******************************************************************************************
	// Step Definition to click save button
	// *******************************************************************************************
    @When("user clicks on leave save button")
	public void user_clicks_on_leave_save_button() {
		leaveTypePage.clickonleavesavebutton();
	}
}