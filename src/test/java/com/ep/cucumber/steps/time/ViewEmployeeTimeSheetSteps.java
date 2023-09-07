package com.ep.cucumber.steps.time;

import com.ep.cucumber.pages.time.ViewEmployeeTimeSheetPage;
import io.cucumber.java.en.Then;
import org.picocontainer.annotations.Inject;
import org.testng.Assert;

public class ViewEmployeeTimeSheetSteps {

	@Inject
	ViewEmployeeTimeSheetPage viewEmployeeTimeSheetPage;

	// *******************************************************************************************
	// Step Definition to check the view employee time sheet is displayed
	// *******************************************************************************************
	@Then("user should see the view employee timesheet page")
	public void user_should_see_the_employee_timesheet_page() {
		boolean flag = viewEmployeeTimeSheetPage.isViewEmployeeTimesheetPageLoaded();
		Assert.assertTrue(flag);
	}

	// *******************************************************************************************
	// Step Definition to click on next arrow button
	// *******************************************************************************************
	@Then("user click on next week arrow button")
	public void user_click_on_next_week_arrow_button() {
		viewEmployeeTimeSheetPage.clickOnNextArrowBtn();
	}

	// *******************************************************************************************
	// Step Definition to verify that the user can't able to create future time
	// sheet
	// *******************************************************************************************
	@Then("user should not able to create the future employee timesheet")
	public void user_should_not_able_to_create_the_future_employee_timesheet() {
		boolean flag = viewEmployeeTimeSheetPage.isCreateTimesheetButtonEnabled();
		Assert.assertFalse(flag);
	}

	// *******************************************************************************************
	// Step Definition to click on previous week arrow button
	// *******************************************************************************************
	@Then("user click on previous week arrow button")
	public void user_click_on_previous_week_arrow_button() {
		viewEmployeeTimeSheetPage.clickOnPreviousArrowBtn();
	}

	// *******************************************************************************************
	// Step Definition to verify time sheet is available for previous week
	// *******************************************************************************************
	@Then("user check employee timesheet is available for previous week")
	public void user_check_employee_timesheet_is_available_for_previous_week() {
		boolean flag = viewEmployeeTimeSheetPage.isTimesheetIsDisplayed();
		if (flag) {
			System.out.println("No Timesheeet is found");
		} else
			System.out.println("Timesheet is available");
	}

	// *******************************************************************************************
	// Step Definition to verify time sheet is available for current week and create one
	// *******************************************************************************************
	@Then("user check employee timesheet is available for current week if not create new one")
	public void user_check_employee_timesheet_is_available_for_current_week_if_not_create_new_one() {
		viewEmployeeTimeSheetPage.checkTimesheetForCurrentWeeks();
	}

	// *******************************************************************************************
	// Step Definition to verify time sheet is create for an employee
	// *******************************************************************************************
	@Then("check timesheet is created for an employee")
	public void check_timesheet_is_created_for_an_employee() {
		boolean flag = viewEmployeeTimeSheetPage.validateWheteherTimeSheetIsCreated();
		Assert.assertTrue(flag);
	}

	// *******************************************************************************************
	// Step Definition to click on submit button
	// *******************************************************************************************
	@Then("user click submit button")
	public void user_click_submit_button() {
		viewEmployeeTimeSheetPage.clickOnSubmitButton();
	}

	// *******************************************************************************************
	// Step Definition to verify time sheet status is displayed
	// *******************************************************************************************
	@Then("check the timesheet status")
	public void check_the_timesheet_status() {
		boolean flag = viewEmployeeTimeSheetPage.checkSubmitStatusIsDisplayed();
		Assert.assertTrue(flag);
	}

	// *******************************************************************************************
	// Step Definition to verify view employee time sheet page is displayed
	// *******************************************************************************************
	@Then("user navigate to view employee timesheet page")
	public void user_navigate_to_previous_page() {
		boolean flag = viewEmployeeTimeSheetPage.checkperiodIsDisplayed();
		Assert.assertTrue(flag);
	}

	// *******************************************************************************************
	// Step Definition to click on approve button
	// *******************************************************************************************
	@Then("user click on Approve button")
	public void user_click_on_approve_button() {
		viewEmployeeTimeSheetPage.clickOnApproveButton();
	}

	// *******************************************************************************************
	// Step Definition to verify time sheet status is updated as approved
	// *******************************************************************************************
	@Then("check the timesheet status is updated as Approved")
	public void check_the_timesheet_status_is_updated_as_approved() {
		boolean flag = viewEmployeeTimeSheetPage.checkApprovedStatusIsDisplayed();
		Assert.assertTrue(flag);
	}

	// *******************************************************************************************
	// Step Definition to click on reject button
	// *******************************************************************************************
	@Then("user click on Reject button")
	public void user_click_on_reject_button() {
		viewEmployeeTimeSheetPage.clickOnRejectButton();
	}

	// *******************************************************************************************
	// Step Definition to verify time sheet status is updated as rejected
	// *******************************************************************************************
	@Then("check the timesheet status is updated as Reject")
	public void check_the_timesheet_status_is_updated_as_reject() {
		boolean flag = viewEmployeeTimeSheetPage.checkRejectedStatusIsDisplayed();
		Assert.assertTrue(flag);
	}
}
