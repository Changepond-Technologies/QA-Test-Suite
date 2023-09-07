package com.ep.cucumber.pages.performance;


import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import com.ep.cucumber.dto.DataContext;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class PerformanceAddReviewPage extends PageContext {

	StepActions stepActions;
    DataContext context;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************
    public PerformanceAddReviewPage(TestContext testcontext, StepActions stepActions, DataContext context
			) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;
		this.context = context;
	}
    // *****************************************************************************************************
 	// Page Elements declaration - Left Menu - Performance - Manage Reviews- Manage Performance Reviews Page 
 	// Key Performance,Job Title,Rating,Performance Save Button
 	// *****************************************************************************************************
	@FindBy(xpath = "//div[@class='oxd-topbar-header']//li//p")
	private WebElement employeelogin;
    @FindBy(xpath = "(//div[@class='oxd-topbar-body']//ul//li)[2]")
	private WebElement clickonmanagereviews;
    @FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li")
	private List<WebElement> selectmanagereviews;
    @FindBy(xpath = "//div[@class='orangehrm-header-container']//button")
	private WebElement clickonreviewaddbuttonn;
    @FindBy(xpath = "(//div[@class='orangehrm-card-container']//div[@class='oxd-grid-item oxd-grid-item--gutters'])[1]")
	private WebElement clickonreviewemployeename;
    @FindBy(xpath = "(//div[@class='orangehrm-card-container']//div[@class='oxd-grid-item oxd-grid-item--gutters'])[1]//input")
	private WebElement enterreviewemployeename;
    @FindBy(xpath = "//div[@class='oxd-autocomplete-dropdown --positon-bottom']//div")
	private List<WebElement> selectreviewemployeenama;
    @FindBy(xpath = "(//div[@class='orangehrm-card-container']//div[@class='oxd-grid-item oxd-grid-item--gutters'])[2]")
	private WebElement clickonsupervisorreview;
    @FindBy(xpath = "(//div[@class='orangehrm-card-container']//div[@class='oxd-grid-item oxd-grid-item--gutters'])[2]//input")
	private WebElement entersupervisorreviewer;
    @FindBy(xpath = "//div[@class='oxd-autocomplete-option']")
	private List<WebElement> supervisorreviewer;
    @FindBy(xpath = "(//div[@class='oxd-date-wrapper'])[1]")
	private WebElement clickonreviewperiodstartdatefield;
    @FindBy(xpath = "(//div[@class='oxd-date-wrapper'])[2]")
	private WebElement clickonreviewperiodenddatefield;
    @FindBy(xpath = "(//div[@class='oxd-date-wrapper'])[3]")
	private WebElement clickonduedatefield;
    @FindBy(xpath = "//li[@class='oxd-calendar-selector-month']")
	private WebElement selectmonth;
    @FindBy(xpath = "//li[@class='oxd-calendar-selector-year']")
	private WebElement selectyear;
    @FindBy(xpath = "//div[@class='oxd-calendar-dates-grid']//div")
	private List<WebElement> selectdate;
    @FindBy(xpath = "//div[@class='oxd-form-actions']//p")
	private WebElement checkreq;
    @FindBy(xpath = "(//div[@class='oxd-form-actions']//div)[1]//button[3]")
	private WebElement clickonactivatebutton;
    // *******************************************************************************************
  	// Action method to click manage reviews  menu and select manage reviews
  	// *******************************************************************************************
	public void selectmanagereviews() {

		stepActions.checkElementDisplayed(clickonmanagereviews);

		stepActions.clickElement(clickonmanagereviews);

		stepActions.selectFromDropDown(selectmanagereviews, "Manage Reviews");

	}
	// *******************************************************************************************
	// Action method to click review add button
	// *******************************************************************************************
	public void clickonreviewaddbutton() {

		stepActions.checkElementDisplayed(clickonreviewaddbuttonn);

		clickonreviewaddbuttonn.click();

	}
	// *******************************************************************************************
	// Action method to click review employee name and enter review employee name
	// *******************************************************************************************
	public void enterreviewemployeename(String employeename) {

		stepActions.checkElementDisplayed(clickonreviewemployeename);

		stepActions.clickElement(clickonreviewemployeename);

		stepActions.setDataInTextBox(enterreviewemployeename, employeename);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		stepActions.selectFromDropDown(selectreviewemployeenama, "Kiyara Hu");

	}
	// *******************************************************************************************
	// Action method to enter supervisor reviewer name and select review employee name
	// *******************************************************************************************
	public void entersupervisorreviewername() {

		stepActions.checkElementDisplayed(clickonreviewemployeename);

		stepActions.clickElement(clickonreviewemployeename);

		String name = employeelogin.getText();

		context.setLoginpersonname(name);

		String empname = context.getLoginpersonname();

		stepActions.setDataInTextBox(entersupervisorreviewer, empname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		stepActions.selectFromDropDown(selectreviewemployeenama, empname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	// *******************************************************************************************
	// Action method to select date from date picker
	// *******************************************************************************************
	public void clickonreviewperiodstartdate() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
//		stepActions.selectDateFromDatePicker(clickonreviewperiodstartdatefield, "27-November-2023", selectyear, selectmonth,
//				selectdate);

	}
	// *******************************************************************************************
	// Action method to select date from date picker
	// *******************************************************************************************
	public void clickonreviewperiodenddate() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
//		stepActions.selectDateFromDatePicker(clickonreviewperiodenddatefield, "30-November-2023", selectyear, selectmonth,
//				selectdate);

	}
	// *******************************************************************************************
	// Action method to select date from date picker
	// *******************************************************************************************
	public void clickonduedate() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
//		stepActions.selectDateFromDatePicker(clickonduedatefield, "01-December-2023", selectyear, selectmonth, selectdate);

	}
	// *******************************************************************************************
	// Action method to click on active button
    // *******************************************************************************************
	public void clickonactivatebutton() {

		// checkreq.click();

		clickonactivatebutton.sendKeys(Keys.TAB);

		stepActions.checkElementDisplayed(clickonactivatebutton);

		clickonactivatebutton.click();

	}

}