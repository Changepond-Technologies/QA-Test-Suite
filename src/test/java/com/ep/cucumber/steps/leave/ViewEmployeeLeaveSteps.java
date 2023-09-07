package com.ep.cucumber.steps.leave;

import com.ep.cucumber.pages.leave.ViewEmployeeLeavePage;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;

public class ViewEmployeeLeaveSteps {

	@Inject
	ViewEmployeeLeavePage EmployeeLeavePage;
    
	// *******************************************************************************************
	// Step Definition to click view leave details
	// *******************************************************************************************
	@When("user clicks on view leave details")
	public void user_clicks_on_view_leave_details() {

		EmployeeLeavePage.clickonviewleavedetails();
	}
    
	// *******************************************************************************************
	// Step Definition to click back button
	// *******************************************************************************************
	@When("user click on back button")
	public void user_click_on_back_button() {

		EmployeeLeavePage.clickonbackbutton();
	}
}