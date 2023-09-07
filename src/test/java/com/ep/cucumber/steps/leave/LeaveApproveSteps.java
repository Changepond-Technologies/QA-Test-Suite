package com.ep.cucumber.steps.leave;

import com.ep.cucumber.pages.leave.LeaveApprovePage;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;

public class LeaveApproveSteps {
	
	@Inject
	LeaveApprovePage assignLeavePage;
	// *******************************************************************************************
	// Step Definition to click leave list tab
	// *******************************************************************************************
	@When("user clicks on leave list menu")
	public void user_clicks_on_leave_list_menu() {
		assignLeavePage.clickonleavelistmenu();
	}
	// *******************************************************************************************
    // Step Definition to select status
	// *******************************************************************************************
	@When("user selects status as {string}")
	public void user_selects_status_as(String status) {

		assignLeavePage.clickonshowleavewithstatus(status);
	}
	// *******************************************************************************************
    // Step Definition to click search button
	// *******************************************************************************************
    @When("user clicks on search button")
	public void user_clicks_on_search_button() {
		assignLeavePage.clickonsearchbutton();
	}
	// *******************************************************************************************
    // Step Definition to click amber button
	// *******************************************************************************************
    @When("user clicks on amber button")
	public void user_clicks_on_amber_button() {
		assignLeavePage.clickonamberbutton();
		
		assignLeavePage.Leaveapproval();
	}
    // *******************************************************************************************
    // Step Definition to click add comment option
	// *******************************************************************************************
	@When("user clicks on add comment")
	public void user_clicks_on_add_comment() {
		assignLeavePage.clickokaddcomment();
	}
	// *******************************************************************************************
    // Step Definition to enter comment 
	// *******************************************************************************************
    @When("user enters the comment")
	public void user_enters_the_comment() {
		assignLeavePage.entercomment();
	}
    // *******************************************************************************************
    // Step Definition to click assign save button
	// *******************************************************************************************
	@When("user click on save button on popup screen")
	public void user_click_on_save_button_on_popup_screen() {
	    
		assignLeavePage.clickonassisgnsavebutton();
	}
	
}