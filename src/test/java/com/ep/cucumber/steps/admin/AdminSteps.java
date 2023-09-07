package com.ep.cucumber.steps.admin;

import com.ep.cucumber.pages.admin.AdminPage;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;

public class AdminSteps {
	
	@Inject
	AdminPage adminPage;
	// *******************************************************************************************
	// Step Definition to click add button
	// *******************************************************************************************
	@When("user clicks Add button from User management tab")
	public void user_clicks_add_button_from_user_management_tab() {
	    
		adminPage.clickOnAdminAddButton();
	}
	// *******************************************************************************************
	// Step Definition to click user role
	// *******************************************************************************************
	@When("user clicks user role dropdown")
	public void user_clicks_user_role_dropdown() {
	    
		adminPage.clickOnUserRole();
		
	}
	// *******************************************************************************************
	// Step Definition to select user role
	// *******************************************************************************************
	@When("user selects the user role as {string}")
	public void user_selects_the_user_role_as(String userrole) {
		
		adminPage.selectUserRole(userrole);
	    
	}
	// *******************************************************************************************
	// Step Definition to enter employee name
	// *******************************************************************************************
	@When("user enters Employee name {string} in the inputBox")
	public void user_enters_employee_name_in_the_input_box(String employeename) {
		
		adminPage.enterEmployeeName(employeename);
	    
	}
	// *******************************************************************************************
	// Step Definition to select employee name
	// *******************************************************************************************
	@When("user selects Employee name {string} from the list")
	public void user_selects_employee_name_from_the_list(String employeeName) {
	    
		adminPage.selectEmployeeName(employeeName);
	}
	// *******************************************************************************************
	// Step Definition to click status field
	// *******************************************************************************************
	@When("user clicks status dropdown")
	public void user_clicks_status_dropdown() {
	   
		adminPage.clickOnStatus();
	}
	// *******************************************************************************************
	// Step Definition to click status field
	// *******************************************************************************************
	@When("user enters Username {string} in the  username inputBox")
	public void user_enters_username_in_the_username_input_box(String username) {
		adminPage.enterUserName(username);
	}
	// *******************************************************************************************
	// Step Definition to enter password
	// *******************************************************************************************
	@When("user enters password {string} in the inputBox")
	public void user_enters_password_in_the_input_box(String password) {
		adminPage.enterPassword(password);
	}
	// *******************************************************************************************
	// Step Definition to enter confirm password
	// *******************************************************************************************
	@When("user enters confirm password {string} in the inputBox")
	public void user_enters_confirm_password_in_the_input_box(String confirmpassword) {
		adminPage.confirmPassword(confirmpassword);
	}
	// *******************************************************************************************
	// Step Definition to click save button
	// *******************************************************************************************
	@When("user clicks save button")
	public void user_clicks_save_button() {
		adminPage.adminSaveButton();
	}




}
