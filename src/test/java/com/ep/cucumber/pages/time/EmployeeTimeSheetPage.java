package com.ep.cucumber.pages.time;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeTimeSheetPage extends PageContext {

	StepActions stepActions;

	// *******************************************************************************************
	// Page Elements declaration - Employee search bar, Suggestion name list,
	// My Time sheet Link and Employee Name Error Message
	// *******************************************************************************************

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement employNameSearchBar;

	@FindBy(xpath = "(//div[@class='oxd-autocomplete-dropdown --positon-bottom']//div)[2]")
	WebElement suggestionNameList;

	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	WebElement employNameErrorMessage;

	// *******************************************************************************************
	// Page Elements declaration - View button, Create TimeSheetButton and Reset button
	// *******************************************************************************************

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement viewButton;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement createTimeSheetButton;

	@FindBy(xpath = "//button[text()=' Edit ']")
	WebElement editButton;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************
	public EmployeeTimeSheetPage(TestContext testcontext, StepActions stepActions) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;
	}

	// *******************************************************************************************
	// Action method to click on view button
	// *******************************************************************************************
	public void clickOnViewButton() {stepActions.ClickElementUsingJavaScript(viewButton);}

	// *******************************************************************************************
	// Action method to check the Employee error message is displayed.
	// *******************************************************************************************
	public boolean employeeNameErrorValidation() {return stepActions.checkElementDisplayed(employNameErrorMessage);}

	// *******************************************************************************************
	// Action method to check the create time sheet button is enabled.
	// *******************************************************************************************
	public boolean isCreateTimesheetButtonEnabled() {return stepActions.checkElementEnabled(createTimeSheetButton);}

	// *******************************************************************************************
	// Action method to click on edit button
	// *******************************************************************************************
	public void clickOnEditButton() {stepActions.ClickElementUsingJavaScript(editButton);}

	// *******************************************************************************************
	// Action method to enter the view in search bar and click the name list
	// *******************************************************************************************
	public void enterValueInSearchBar(String value) {
		stepActions.setDataInTextBox(employNameSearchBar, value);
		stepActions.checkElementVisibility(suggestionNameList);
		stepActions.clickElement(suggestionNameList);
	}
}
