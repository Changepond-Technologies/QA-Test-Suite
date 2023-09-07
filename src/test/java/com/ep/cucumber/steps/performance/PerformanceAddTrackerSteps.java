
package com.ep.cucumber.steps.performance;

import com.ep.cucumber.pages.performance.PerformanceAddTrackerPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;
import org.testng.Assert;

public class PerformanceAddTrackerSteps {

	@Inject
	PerformanceAddTrackerPage addTrackerPage;
	// *******************************************************************************************
	// Step Definition to select trackers
	// *******************************************************************************************
	@When("user selects Trackers from configure menu")
	public void user_selects_trackers_from_configure_menu() {
		addTrackerPage.selectTrackers();
	}
	// *******************************************************************************************
	// Step Definition to click trackers add button
	// *******************************************************************************************
	@When("user clicks on trackers add button")
	public void user_clicks_on_trackers_add_button() {
		addTrackerPage.clickontrackersaddbutton();
	}
	// *******************************************************************************************
	// Step Definition to enter tracker name
	// *******************************************************************************************
	@When("user enters the tracker name as {string}")
	public void user_enters_the_tracker_name_as(String trackername) {
		addTrackerPage.entertrackername(trackername);
	}
	// *******************************************************************************************
	// Step Definition to enter tracker employee name
	// *******************************************************************************************
	@When("user enters the employee name {string} in the Inputbox")
	public void user_enters_the_employee_name_in_the_inputbox(String employeenamet) {
		addTrackerPage.entertrackeremployeename(employeenamet);
	}
	// *******************************************************************************************
    // Step Definition to enter tracker reviewers name
    // *******************************************************************************************
	@When("user enters the reviewer name {string} in the inputbox")
	public void user_enters_the_reviewer_name_in_the_inputbox(String reviewersname) {
		addTrackerPage.entertrackerreviewersname(reviewersname);
	}
	// *******************************************************************************************
    // Step Definition to click trackers save button
    // *******************************************************************************************
	@When("user clicks on trackers save button")
	public void user_clicks_on_trackers_save_button() {
		addTrackerPage.clickontrackerssavebutton();
	}

	// *******************************************************************************************
    // Step Definition to verify success messgage text
    // *******************************************************************************************
	@Then("user should see the tracker page with pop up message as {string}.")
	public void user_should_see_the_tracker_page_with_pop_up_message_as(String Success) {
		Assert.assertEquals(addTrackerPage.verifymessage(), Success);
	}
}