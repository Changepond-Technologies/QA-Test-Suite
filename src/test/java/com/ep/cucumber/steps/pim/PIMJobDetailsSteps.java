package com.ep.cucumber.steps.pim;

import com.ep.cucumber.pages.pim.PIMJobDetailsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;
import org.testng.Assert;

import java.awt.*;

public class PIMJobDetailsSteps {

	@Inject
	PIMJobDetailsPage jobDetailsPage;

	// *******************************************************************************************
	// Step Definition to click job
	// *******************************************************************************************
	@When("user clicks on the job from left panel")
	public void user_clicks_on_the_job_from_left_panel() {
		jobDetailsPage.selectJob();
	}
	// *******************************************************************************************
	// Step Definition to verify job details header text
	// *******************************************************************************************
	@When("user navigated to job details page")
	public void user_navigated_to_job_details_page() {
		jobDetailsPage.getJobDetailsTxt();
	}
	// *******************************************************************************************
	// Step Definition to select job title, job category, sub unit, location, status
	// *******************************************************************************************
	@When("user selects the job title {string} from the drop down")
	public void user_selects_the_job_title_from_the_drop_down(String jobTitle) {
		try {
			jobDetailsPage.selectJobTitle(jobTitle);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	@When("user selects the job category {string} from the drop down")
	public void user_selects_the_job_category_from_the_drop_down(String jobCategory) {
		try {
			jobDetailsPage.selectJobCategory(jobCategory);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	@When("user selects the sub unit {string} from the drop down")
	public void user_selects_the_sub_unit_from_the_drop_down(String subUnit) {
		try {
			jobDetailsPage.selectSubUnit(subUnit);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	@When("user select the location {string} from the drop down")
	public void user_select_the_location_new_york_sales_office_from_the_drop_down(String location) {
		try {
			jobDetailsPage.selectLocation(location);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	@When("user selects the employment status as {string}")
	public void user_selects_the_employment_status(String status) {
		try {
			jobDetailsPage.selectEmpStatus(status);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	// *******************************************************************************************
	// Step Definition to click save button
	// *******************************************************************************************
	@Then("user clicks the save button")
	public void user_clicks_the_save_button() {
		jobDetailsPage.clickSaveBtn();
	}
	// *******************************************************************************************
	// Step Definition to click terminate button
	// *******************************************************************************************
	@When("user clicks on the terminate employment")
	public void user_clicks_on_the_terminate_employment() {
		jobDetailsPage.clickTerminateEmployment();
	}
	// *******************************************************************************************
	// Step Definition to verify terminate button text
	// *******************************************************************************************
	@Then("it should open the terminate emploment popup")
	public void it_should_open_the_terminate_emploment_popup() {
		String verifyTerminateEmploymentPage = jobDetailsPage.verifyTerminateEmploymentPage();
		Assert.assertEquals(verifyTerminateEmploymentPage, "Terminate Employment");
	}
	// *******************************************************************************************
	// Step Definition to select terminate date
	// *******************************************************************************************
	@Then("user selects the terminate date from calendar")
	public void user_selects_the_terminate_date_from_calendar() {
		jobDetailsPage.selectTerminateDate();
	}
	// *******************************************************************************************
	// Step Definition to select terminate reason
	// *******************************************************************************************
	@Then("user selects the termination reason from the dropdown")
	public void user_selects_the_termination_reason_from_the_dropdown() {
		try {
			jobDetailsPage.selectTerminateReason();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	// *******************************************************************************************
	// Step Definition to set terminate notes
	// *******************************************************************************************
	@Then("user pass the termination notes {string} from the input box")
	public void user_pass_the_termination_notes_from_the_input_box(String notes) {
		jobDetailsPage.setTerminateNotes(notes);
	}
	// *******************************************************************************************
	// Step Definition to verify activate button text
	// *******************************************************************************************
	@Then("user should see the {string} button")
	public void user_should_see_the_button(String string) {
		String activateBtn = jobDetailsPage.verifyActivateEmployeeBtn();
		Assert.assertEquals(activateBtn, string);
	}
	@Then("user should see Activate Employee button")
	public void user_should_see_activate_employee_button() {
		String verifyTerminate = jobDetailsPage.verifyTerminate();
		Assert.assertEquals(verifyTerminate, "Activate Employment");
	}
	// *******************************************************************************************
	// Step Definition to click activate button
	// *******************************************************************************************
	@Then("user clicks on the Activate Employee button")
	public void user_clicks_on_the_activate_employee_button() {
		jobDetailsPage.clickActivateBtn();
	}
}
