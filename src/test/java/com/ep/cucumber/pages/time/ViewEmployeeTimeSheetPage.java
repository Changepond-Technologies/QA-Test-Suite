package com.ep.cucumber.pages.time;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewEmployeeTimeSheetPage extends PageContext {

	StepActions stepActions;

	// *******************************************************************************************
	// Page Elements declaration - Employee time sheet title, Status, Period, No time sheet,
	// Approve status and Reject Status
	// *******************************************************************************************

	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
	WebElement employTimeSheetTitle;

	@FindBy(xpath = "//div[@class='oxd-alert-content oxd-alert-content--warn']")
	WebElement noTimesheet;

	@FindBy(xpath = "//p[text()='Status: Submitted']")
	WebElement status;

	@FindBy(xpath = "//p[text()='Timesheet Period']")
	WebElement period;

	@FindBy(xpath = "//p[text()='Status: Approved']")
	WebElement approveStatus;

	@FindBy(xpath = "//p[text()='Status: Rejected']")
	WebElement rejectStatus;

	// *******************************************************************************************
	// Page Elements declaration - Next Arrow button,Previous arrow button, 
	//Create Time sheet button,Save button, Approve button and Reject button
	// *******************************************************************************************

	@FindBy(xpath = "//i[@class='oxd-icon bi-chevron-right']")
	WebElement nextArrowButton;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement createTimeSheetButton;

	@FindBy(xpath = "//button[@class='oxd-icon-button orangehrm-timeperiod-icon --prev']")
	WebElement previousArrowButton;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement savebutton;

	@FindBy(xpath = "//button[text()=' Approve ']")
	WebElement approveButton;

	@FindBy(xpath = "//button[text()=' Reject ']")
	WebElement rejectButton;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************
	public ViewEmployeeTimeSheetPage(TestContext testcontext, StepActions stepActions) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;
	}

	// *******************************************************************************************
	// Action method to check the view employee time sheet page is displayed.
	// *******************************************************************************************
	public boolean isViewEmployeeTimesheetPageLoaded() {return stepActions.checkElementDisplayed(employTimeSheetTitle);}

	// *******************************************************************************************
	// Action method to click on next arrow button
	// *******************************************************************************************
	public void clickOnNextArrowBtn() {stepActions.ClickElementUsingJavaScript(nextArrowButton);}

	// *******************************************************************************************
	// Action method to check the create time sheet button is enabled.
	// *******************************************************************************************
	public boolean isCreateTimesheetButtonEnabled() {return stepActions.checkElementEnabled(createTimeSheetButton);}

	// *******************************************************************************************
	// Action method to click on previous arrow button
	// *******************************************************************************************
	public void clickOnPreviousArrowBtn() {stepActions.ClickElementUsingJavaScript(previousArrowButton);}

	// *******************************************************************************************
	// Action method to check the time sheet page is displayed.
	// *******************************************************************************************
	public boolean isTimesheetIsDisplayed() {return stepActions.checkElementDisplayed(noTimesheet);}

	// *******************************************************************************************
	// Action method to check the time sheet for current weeks.
	// *******************************************************************************************
	public void checkTimesheetForCurrentWeeks() {
		boolean flag = stepActions.IsElementDisplayed(createTimeSheetButton);
		if (flag) {
			stepActions.clickElement(createTimeSheetButton);
			System.out.println("The new employee timesheet has been created");
		} else
			System.out.println("Already timesheet is available");
	}

	// *******************************************************************************************
	// Action method to check the time sheet is created.
	// *******************************************************************************************
	public boolean validateWheteherTimeSheetIsCreated() {
		boolean flag = stepActions.IsElementDisplayed(createTimeSheetButton);
		if (flag == false) {
			System.out.println("Timesheet has been created");
			return true;
		} else
			return flag;

	}

	// *******************************************************************************************
	// Action method to click on submit button
	// *******************************************************************************************
	public void clickOnSubmitButton() {
		boolean flag = stepActions.IsElementDisplayed(savebutton);
		if (flag) {
			stepActions.ClickElementUsingJavaScript(savebutton);
		} else
			System.out.println("The timesheet is already been submitted");
	}

	// *******************************************************************************************
	// Action method to check the submit status is displayed.
	// *******************************************************************************************
	public boolean checkSubmitStatusIsDisplayed() {
		boolean flag = stepActions.IsElementDisplayed(status);
		return flag;
	}

	// *******************************************************************************************
	// Action method to check the time period is displayed.
	// *******************************************************************************************
	public boolean checkperiodIsDisplayed() {
		boolean flag = stepActions.IsElementDisplayed(period);
		return flag;
	}

	// *******************************************************************************************
	// Action method to click on Approve button
	// *******************************************************************************************
	public void clickOnApproveButton() {
		stepActions.clickElement(approveButton);
		System.out.println("The approved button has been clicked");
	}

	// *******************************************************************************************
	// Action method to check the approve status is displayed.
	// *******************************************************************************************
	public boolean checkApprovedStatusIsDisplayed() {
		boolean flag = stepActions.IsElementDisplayed(approveStatus);
		return flag;
	}

	// *******************************************************************************************
	// Action method to click on Reject button
	// *******************************************************************************************
	public void clickOnRejectButton() {
		stepActions.clickElement(rejectButton);
		System.out.println("The Reject button has been clicked");
	}

	// *******************************************************************************************
	// Action method to check the reject status is displayed.
	// *******************************************************************************************
	public boolean checkRejectedStatusIsDisplayed() {
		boolean flag = stepActions.IsElementDisplayed(rejectStatus);
		return flag;
	}
}
