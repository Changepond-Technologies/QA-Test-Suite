
package com.ep.cucumber.steps.performance;

import com.ep.cucumber.pages.performance.PerformanceAddReviewPage;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;

public class PerformanceAddReviewSteps {

	@Inject
	PerformanceAddReviewPage addReviewPage;
	// *******************************************************************************************
	// Step Definition to select manage reviews
	// *******************************************************************************************
	@When("user selects Manage review from manage review menu")
	public void user_selects_manage_review_from_manage_review_menu() {
		addReviewPage.selectmanagereviews();
	}
	// *******************************************************************************************
	// Step Definition to click review add button
	// *******************************************************************************************
	@When("user clicks on manage review add button")
	public void user_clicks_on_manage_review_add_button() {
		addReviewPage.clickonreviewaddbutton();
	}
	// *******************************************************************************************
	// Step Definition to enter review employee name
    // *******************************************************************************************
	@When("user enters the employee namee as {string} in the inpubox.")
	public void user_enters_the_employee_namee_as_in_the_inpubox(String employeename) {
		addReviewPage.enterreviewemployeename(employeename);
	}
	// *******************************************************************************************
    // Step Definition to enter supervisor reviewer name
    // *******************************************************************************************
	@When("user enters the supervisor reviewer name")
	public void user_enters_the_supervisor_reviewer_name() {
		addReviewPage.entersupervisorreviewername();
	}
	// *******************************************************************************************
    // Step Definition to pick review start date
    // *******************************************************************************************
	@When("user picks review start date")
	public void user_picks_review_start_date() {
		addReviewPage.clickonreviewperiodstartdate();
	}
	// *******************************************************************************************
    // Step Definition to pick review end date
    // *******************************************************************************************
	@When("user picks review end date")
	public void user_picks_review_end_date() {
		addReviewPage.clickonreviewperiodenddate();
	}
	// *******************************************************************************************
    // Step Definition to pick due date
    // *******************************************************************************************
	@When("user picks due date")
	public void user_picks_due_date() {
		addReviewPage.clickonduedate();
	}
	// *******************************************************************************************
    // Step Definition to click trackers active button
    // *******************************************************************************************
	@When("user clicks on trackers activate button")
	public void user_clicks_on_trackers_activate_button() {
		addReviewPage.clickonactivatebutton();
	}

}