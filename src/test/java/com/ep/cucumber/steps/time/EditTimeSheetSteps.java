package com.ep.cucumber.steps.time;

import com.ep.cucumber.pages.time.EditTimeSheetPage;
import io.cucumber.java.en.Then;
import org.picocontainer.annotations.Inject;
import org.testng.Assert;

public class EditTimeSheetSteps {

	@Inject
	EditTimeSheetPage editTimeSheetPage;

	// *******************************************************************************************
	// Step Definition to enter the search value and click on the suggested name
	// list
	// *******************************************************************************************
	@Then("user enters the search value {string} in the searchbar and select it")
	public void user_enters_the_search_value_in_the_searchbar_and_select_it(String string) {
		editTimeSheetPage.enterActivitAndProjectValue(string);
	}

	// *******************************************************************************************
	// Step Definition to enter the time hours value
	// *******************************************************************************************
	@Then("user enters the time hours {string} in time hours field")
	public void user_enters_the_time_hours_in_time_hours_field(String string) {
		editTimeSheetPage.enterHoursinTimesheet(string);
	}

	// *******************************************************************************************
	// Step Definition to click on save button
	// *******************************************************************************************
	@Then("user click on timesheet save button")
	public void user_click_on_tiimesheet_save_button() {
		editTimeSheetPage.clickOnSaveButton();
	}

	// *******************************************************************************************
	// Step Definition to check the time period is displayed
	// *******************************************************************************************
	@Then("user check whether the data value is saved")
	public void user_check_whether_the_enter_value_is_not_null() {
		boolean flag = editTimeSheetPage.checkperiodIsDisplayed();
		Assert.assertTrue(flag);
	}

	// *******************************************************************************************
	// Step Definition to verify that the data are reset
	// *******************************************************************************************
	@Then("user should see that the values are reset")
	public void user_should_see_that_the_values_are_reset() {
		boolean flag = editTimeSheetPage.isDataareReset();
		Assert.assertTrue(flag);
	}

	// *******************************************************************************************
	// Step Definition to click on cancel button
	// *******************************************************************************************
	@Then("user click on timesheet cancel button")
	public void user_click_on_timesheet_cancel_button() {
		editTimeSheetPage.clickOnCancelButton();
	}

	// *******************************************************************************************
	// Step Definition to click on reset button
	// *******************************************************************************************
	@Then("user click on timesheet reset button")
	public void user_click_on_timesheet_reset_button() {
		editTimeSheetPage.clickOnResetButton();
	}
}
