package com.ep.cucumber.steps.leave;

import com.ep.cucumber.pages.leave.AssignLeavePage;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;

public class AssignLeaveSteps {
	
	@Inject
	AssignLeavePage assignLeavePage;
	// *******************************************************************************************
    // Step Definition to click assign leave menu
	// *******************************************************************************************
	@When("user clicks on assign leave menu")
	public void user_clicks_on_assign_leave_menu() {
		assignLeavePage.clickonassignleavemenu();
	}
	
	// *******************************************************************************************
    // Step Definition to enter employee name
	// *******************************************************************************************
	@When("user enters the employee namee {string} in the inputbox")
	public void user_enters_the_employee_namee_in_the_inputbox(String employeename) {
		assignLeavePage.enterassignemployeename(employeename);
	}
	// *******************************************************************************************
    // Step Definition to select US-Vacation1
	// *******************************************************************************************
	@When("user selects US-Vacation1 from the lists")
	public void user_selects_us_vacation1_from_the_lists() {
		assignLeavePage.selectassignleavetype();
	}
	// *******************************************************************************************
    // Step Definition to select from date
	// *******************************************************************************************  
    @When("user picks from date")
	public void user_picks_from_date() throws InterruptedException {
		assignLeavePage.assignleavefromdate();
	}
    // *******************************************************************************************
    // Step Definition to select to date
	// *******************************************************************************************  
	@When("user picks to date")
	public void user_picks_to_date() {
		assignLeavePage.assignleavetodate();
	}
	// *******************************************************************************************
    // Step Definition to click assign button
	// *******************************************************************************************
	@When("user clicks on assign button")
	public void user_clicks_on_assign_button() {
		assignLeavePage.clickonassignbutton();
		
	}

}