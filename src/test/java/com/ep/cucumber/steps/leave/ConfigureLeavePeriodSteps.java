package com.ep.cucumber.steps.leave;

import com.ep.cucumber.pages.leave.ConfigureLeavePeriodPage;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;

public class ConfigureLeavePeriodSteps {
	
	@Inject
	ConfigureLeavePeriodPage leavePeriodPage;
	
	// *******************************************************************************************
	// Step Definition to select leave period
	// *******************************************************************************************
	@When("user selects leave period from configure menu")
	public void user_selects_leave_period_from_configure_menu() {
		leavePeriodPage.clickonconfiguremenu();
	}
	// *******************************************************************************************
	// Step Definition to select start month
	// *******************************************************************************************
	@When("user picks start month")
	public void user_picks_start_month() {
		 leavePeriodPage.clickonstartmonth();
	}
	// *******************************************************************************************
	// Step Definition to select start date
	// *******************************************************************************************
	@When("user picks start date")
	public void user_picks_start_date() {
		leavePeriodPage.selectstartdate();
	}
	// *******************************************************************************************
	// Step Definition to click save button
	// *******************************************************************************************
	@When("user clicks on save button")
	public void user_clicks_on_save_button() {
		leavePeriodPage.clickonsavebutton();
	}

}