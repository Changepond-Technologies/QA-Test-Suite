package com.ep.cucumber.steps.leave;

import com.ep.cucumber.pages.leave.ConfigureHolidayPage;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;

public class ConfigureHolidaySteps {
	
	@Inject
	ConfigureHolidayPage holidayPage;
	
	// *******************************************************************************************
	// Step Definition to select holiday submenu
	// *******************************************************************************************
	@When("user selects holidays from configure menu")
	public void user_selects_holidays_from_configure_menu() {
		holidayPage.clickonholidaysubmenu();
	}
	// *******************************************************************************************
	// Step Definition to enter holiday name
	// *******************************************************************************************
	@When("user enters the holiday name {string} in the inputbox")
	public void user_enters_the_holiday_name_in_the_inputbox(String holidayname) {
		holidayPage.clickonholidayname(holidayname);
	}
	// *******************************************************************************************
	// Step Definition to picks holiday date
	// *******************************************************************************************
	@When("user picks holiday date")
	public void user_picks_holiday_date() {
		holidayPage.clickonholidaydate();
	}
}