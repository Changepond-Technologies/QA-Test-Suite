package com.ep.cucumber.pages.time;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EditTimeSheetPage extends PageContext {

	StepActions stepActions;

	// *******************************************************************************************
	// Page Elements declaration - Delete button, Save button, Cancel button and Reset button
	// *******************************************************************************************

	@FindBy(xpath = "(//button[@class='oxd-icon-button orangehrm-timesheet-icon'])[1]")
	WebElement deletebutton;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement saveButton;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	WebElement cancelButton;

	@FindBy(xpath = "//div//button[text()=' Reset ']")
	WebElement resetButton;

	// *******************************************************************************************
	// Page Elements declaration - Employee search bar, Suggestion name list,
	// activity,bugFixes, time values and period
	// *******************************************************************************************

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement employNameSearchBar;

	@FindBy(xpath = "(//div[@class='oxd-autocomplete-dropdown --positon-bottom']//div)[2]")
	WebElement suggestionNameList;

	@FindBy(xpath = "(//td//div[@class='oxd-input-group oxd-input-field-bottom-space'])[2]")
	WebElement activity;

	@FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']//span[text()='Bug Fixes']")
	WebElement bugFixes;

	@FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//input")
	List<WebElement> timevalues;

	@FindBy(xpath = "//p[text()='Timesheet Period']")
	WebElement period;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************
	public EditTimeSheetPage(TestContext testcontext, StepActions stepActions) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;
	}
	
	// *******************************************************************************************
	// Action method to enter hours value in time sheet page
	// *******************************************************************************************
	public void enterHoursinTimesheet(String value) {
		for (int i = 1; i < timevalues.size(); i++) {
			WebElement element = timevalues.get(i);
			stepActions.setDataInTextBox(element, value);
		}
	}

	// *******************************************************************************************
	// Action method to check the time period is displayed.
	// *******************************************************************************************
	public boolean checkperiodIsDisplayed() {
		boolean flag = stepActions.IsElementDisplayed(period);
		return flag;
	}

	// *******************************************************************************************
	// Action method to click on save button
	// *******************************************************************************************
	public void clickOnSaveButton() {stepActions.clickElement(saveButton);}

	// *******************************************************************************************
	// Action method to click on cancel button
	// *******************************************************************************************
	public void clickOnCancelButton() {	stepActions.clickElement(cancelButton);}

	// *******************************************************************************************
	// Action method to check the data are reset
	// *******************************************************************************************
	public boolean isDataareReset() {
		String value = stepActions.getElementText(activity);
		String expectedvalue = "-- Select --";
		if (value.contains(expectedvalue)) {
			System.out.println("The enter data has been reset");
			return true;
		} else
			return false;
	}

	// *******************************************************************************************
	// Action method to click on reset button
	// *******************************************************************************************
	public void clickOnResetButton() {stepActions.ClickElementUsingJavaScript(resetButton);}
	
	// *******************************************************************************************
	// Action method to enter activity and project value in time sheet page
	// *******************************************************************************************
		public void enterActivitAndProjectValue(String value) {
			stepActions.clickElement(deletebutton);
			stepActions.setDataInTextBox(employNameSearchBar, value);
			stepActions.clickElement(suggestionNameList);
			stepActions.clickElement(activity);
			stepActions.clickElement(bugFixes);
		}
}
