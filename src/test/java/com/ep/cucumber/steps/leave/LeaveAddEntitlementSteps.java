package com.ep.cucumber.steps.leave;

import com.ep.cucumber.pages.leave.LeaveAddEntitlementsPage;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;

public class LeaveAddEntitlementSteps {
	
	@Inject
	LeaveAddEntitlementsPage entitlementsPage;
	
	// *******************************************************************************************
	// Step Definition to select add entitlement
	// *******************************************************************************************
	@When("user selects add entitlements from entitlements menu")
	public void user_selects_add_entitlements_from_entitlements_menu() {
		entitlementsPage.clickonaddentitlement();
	}
	// *******************************************************************************************
    // Step Definition to enter employee name
	// *******************************************************************************************
    @When("user enters the employee name {string} in the inputbox")
	public void user_enters_the_employee_name_in_the_inputbox(String employeename) {
		entitlementsPage.clickonemployeename(employeename);
	}
	// *******************************************************************************************
    // Step Definition to select leave type
	// *******************************************************************************************
	@When("user selects US-Vacation1 from the list")
	public void user_selects_us_vacation1_from_the_list() {
		entitlementsPage.clickonleavetype();
	}
	// *******************************************************************************************
    // Step Definition to enter entitlement number
	// *******************************************************************************************
	@When("user enters the entitlement as {string}")
	public void user_enters_the_entitlement_as(String entitlementcount) {
		entitlementsPage.enterentitlement(entitlementcount);
	}
	// *******************************************************************************************
    // Step Definition to click confirm button
	// *******************************************************************************************
	@When("user clicks on confirm button on popup screen")
	public void user_clicks_on_confirm_button_on_popup_screen() {
		entitlementsPage.clickonconfirmbutton();
	}
}
