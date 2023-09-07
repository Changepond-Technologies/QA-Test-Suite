package com.ep.cucumber.steps.performance;

import com.ep.cucumber.pages.performance.PerformanceAddKPIPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;
import org.testng.Assert;

public class PerformanceAddKPISteps {

	@Inject
	PerformanceAddKPIPage addKPIPage;
	// *******************************************************************************************
	// Step Definition to click configure menu
	// *******************************************************************************************
	@When("user selects KPIs from configure menu")
	public void user_selects_kp_is_from_configure_menu() {

		addKPIPage.clickonconfiguremenu();
	}
	// *******************************************************************************************
	// Step Definition to click add button
	// *******************************************************************************************
	@When("user clicks on add buttonn")
	public void user_clicks_on_add_buttonn() {

		addKPIPage.clickonaddbutton();
	}
	// *******************************************************************************************
	// Step Definition to enter key performance indicator
	// *******************************************************************************************
	@When("user enters the key performance indicator as {string}")
	public void user_enters_the_key_performance_indicator_as(String keyperformanceindicator) {

		addKPIPage.enterkeyperformanceindicator(keyperformanceindicator);
	}
	// *******************************************************************************************
	// Step Definition to select job title
	// *******************************************************************************************
	@When("user selects {string} from the list")
	public void user_selects_from_the_list(String jobtitle) {

		addKPIPage.selectjobtitle(jobtitle);
	}
	// *******************************************************************************************
	// Step Definition to click save button
	// *******************************************************************************************
	@When("user clicks on save buttonn")
	public void user_clicks_on_save_buttonn() {

		addKPIPage.clickonsavebutton();
	}
	// *******************************************************************************************
	// Step Definition to verify success message text
	// *******************************************************************************************
	@Then("user should see the kpi page with pop up message as {string}.")
	public void user_should_see_the_kpi_page_with_pop_up_message_as(String Success) {
		Assert.assertEquals(addKPIPage.verifymessage(), Success);
	}

}