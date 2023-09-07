package com.ep.cucumber.steps.common;

import com.ep.cucumber.pages.common.LeftPanelPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;

public class LeftPanelSteps {

	@Inject
	LeftPanelPage mainModulePage;

	@Then("user clicks on the PIM from the left panel")
	public void user_clicks_on_the_admin_from_the_left_panel() {
		mainModulePage.clickOnPIMModule();
	}

	@When("user clicks on leave module")
	public void user_clicks_on_leave_module() {
		mainModulePage.clickOnLeaveModule();
	}

	@When("user clicks on performance module")
	public void user_clicks_on_performance_module() {
		mainModulePage.clickOnPerformanceModule();
	}

	@When("user click on the time module")
	public void user_click_on_the_time_module() {
		mainModulePage.clickOnTimeModule();
	}

	@When("user clicks admin button in home page")
	public void user_clicks_admin_button_in_the_home_page() {
		mainModulePage.clickOnAdminModule();
	}
}
