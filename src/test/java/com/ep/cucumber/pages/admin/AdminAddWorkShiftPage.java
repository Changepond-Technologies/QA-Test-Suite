
package com.ep.cucumber.pages.admin;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import com.ep.cucumber.dto.DataContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

;

public class AdminAddWorkShiftPage extends PageContext {

	StepActions stepActions;
	DataContext context;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************

	public AdminAddWorkShiftPage(TestContext testcontext, StepActions stepActions, DataContext context) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;
		this.context = context;
	}

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - Admin - Job- Work Shift Page
	// WorkShifts,Admin Add Button,Shift Name,Assigned Employee Name
	// *******************************************************************************************
	@FindBy(xpath = "//div[@class='oxd-topbar-body']//li[2]")
	private WebElement clickOnJobtab;
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li")
	private List<WebElement> selectWorkShifts;
	@FindBy(xpath = "//div[@class='orangehrm-header-container']//button")
	private WebElement clickOnAdminAddButton;
	@FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters'])[1]//input")
	private WebElement enterShiftName;
	@FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters'])[5]//input")
	private WebElement enterAssignedEmployeesName;
	@FindBy(xpath = "(//div[@class='oxd-autocomplete-dropdown --positon-bottom']//div)[1]")
	private WebElement selectAssignedEmployeesName;

	// *******************************************************************************************
	// Action method to click job tab and select work shifts
	// *******************************************************************************************
	public void clickOnWorkShiftsSubMenu() {

		stepActions.checkElementDisplayed(clickOnJobtab);

		stepActions.clickElement(clickOnJobtab);

		stepActions.selectFromDropDown(selectWorkShifts, "Work Shifts");

	}

	// *******************************************************************************************
	// Action method to click admin add button
	// *******************************************************************************************
	public void clickOnWorkShiftsAddButton() {

		stepActions.checkElementDisplayed(clickOnAdminAddButton);

		clickOnAdminAddButton.click();

	}

	// *******************************************************************************************
	// Action method to enter shift name
	// *******************************************************************************************
	public void enterShiftName(String shiftname) {

		stepActions.checkElementDisplayed(enterShiftName);

		stepActions.setDataInTextBox(enterShiftName, shiftname);

	}

	// *******************************************************************************************
	// Action method to enter assigned employee name
	// *******************************************************************************************
	public void enterAssignedEmployeesName(String employeename) {

		stepActions.clickElement(enterAssignedEmployeesName);

		stepActions.setDataInTextBox(enterAssignedEmployeesName, employeename);

	}

	// *******************************************************************************************
	// Action method to select assigned employee name
	// *******************************************************************************************
	public void selectAssignedEmployeesName() {
		stepActions.clickElement(selectAssignedEmployeesName);
	}
}