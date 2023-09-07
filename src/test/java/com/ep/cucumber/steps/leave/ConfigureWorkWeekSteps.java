package com.ep.cucumber.steps.leave;

import com.ep.cucumber.pages.leave.ConfigureWorkWeekPage;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;

public class ConfigureWorkWeekSteps {
	
	@Inject
	ConfigureWorkWeekPage workWeekPage;
	
	// *******************************************************************************************
	// Step Definition to select work week
	// *******************************************************************************************
	@When("user selects work week from configure menu")
	public void user_selects_work_week_from_configure_menu() {
		workWeekPage.clickonworkweek();
	}
	// *******************************************************************************************
	// Step Definition to click save button
	// *******************************************************************************************
    @When("user clicks on week save button")
	public void user_clicks_on_week_save_button() {
		workWeekPage.clickonweeksave();
	}
	
}