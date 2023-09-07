package com.ep.cucumber.pages.leave;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AssignLeavePage extends PageContext {

	StepActions stepActions;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************
	public AssignLeavePage(TestContext testcontext, StepActions stepActions) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;
	}

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - Leave - Assign Leave Tab - Assign
	// Leave
	// Page,Employee Name,Leave Type,From Date,To Date,Comments,Assign Button
	// *******************************************************************************************
	@FindBy(xpath = "//div[@class='oxd-topbar-body']//li[7]")
	private WebElement clickonassignleavemenu;
	@FindBy(xpath = "(//div[@class='oxd-form-row'])[1]//div[@class='oxd-autocomplete-wrapper']//input")
	private WebElement enterassignemployeename;
	@FindBy(xpath = "//div[@class='oxd-autocomplete-dropdown --positon-bottom']//div")
	private List<WebElement> selectassignemployeename;
	@FindBy(xpath = "(//div[@class='oxd-form-row'])[2]//div[@class='oxd-select-wrapper']")
	private WebElement clickonassignleavetype;
	@FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']//div")
	private List<WebElement> selectassignleavetype;
	@FindBy(xpath = "(//div[@class='oxd-date-wrapper'])[1]")
	private WebElement clickonassignfromdate;
	@FindBy(xpath = "(//div[@class='--holiday-full oxd-calendar-date'])[2]")
	private WebElement selectassignfromdate;
	@FindBy(xpath = "(//div[@class='oxd-date-wrapper'])[2]")
	private WebElement clickonassigntodate;
	@FindBy(xpath = "(//div[@class='oxd-calendar-date'])[4]")
	private WebElement selectassigntodate;
	@FindBy(xpath = "((//div[@class='oxd-form-row'])//div)[40]//textarea")
	private WebElement entercomments;
	@FindBy(xpath = "//div[@class='oxd-form-actions']//button")
	private WebElement assignbutton;
	@FindBy(xpath = "((//div[@class='oxd-grid-4 orangehrm-full-width-grid'])[1]//div[1]//div)[3]")
	private WebElement clickonstartmonth;

	// *******************************************************************************************
	// Action method to click assignleavemenu
	// *******************************************************************************************
	public void clickonassignleavemenu() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		stepActions.clickElement(clickonassignleavemenu);

	}

	// *******************************************************************************************
	// Action method to enter employee name and select employee name
	// *******************************************************************************************
	public void enterassignemployeename(String employeename) {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		stepActions.setDataInTextBox(enterassignemployeename, employeename);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		stepActions.selectFromDropDown(selectassignemployeename, employeename);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
	}

	// *******************************************************************************************
	// Action method to enter employee name and select employee name
	// *******************************************************************************************
	public void selectassignleavetype() {

		stepActions.clickElement(clickonassignleavetype);
		stepActions.selectFromDropDown(selectassignleavetype, "US-Vacation1");

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}

	// *******************************************************************************************
	// Action method to click from date and select date
	// *******************************************************************************************
	public void assignleavefromdate() throws InterruptedException {

		clickonstartmonth.click();

		clickonassignfromdate.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		stepActions.clickElement(selectassignfromdate);

	}

	// *******************************************************************************************
	// Action method to click to date and select date
	// *******************************************************************************************
	public void assignleavetodate() {

		stepActions.clickElement(clickonassigntodate);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		stepActions.clickElement(selectassigntodate);

	}

	// *******************************************************************************************
	// Action method to enter comments
	// *******************************************************************************************
	public void entercomments(String comments) {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		stepActions.setDataInTextBox(entercomments, comments);

	}

	// *******************************************************************************************
	// Action method to click assign button
	// *******************************************************************************************
	public void clickonassignbutton() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		stepActions.clickElement(assignbutton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
	}

}