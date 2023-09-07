package com.ep.cucumber.pages.pim;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import com.ep.cucumber.dto.DataContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.util.List;

public class PIMJobDetailsPage extends PageContext {

	StepActions stepActions;
	DataContext dataContext;

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - PIM - Employee List - Left Menu - Job
	// - Job Details Text Block,Job Title,Job Category,Sub Unit,Location,Employee
	// Status and Save Button
	// *******************************************************************************************

	@FindBy(xpath = "//a[text()='Job']")
	private WebElement job;
	@FindBy(xpath = "//h6[normalize-space()='Job Details']")
	private WebElement jobDetailsTxt;
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	private WebElement clickJobTitle;
	@FindBy(xpath = "//div[@class='oxd-select-option']")
	private List<WebElement> jobTitles;
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	private WebElement clickJobCategory;
	@FindBy(xpath = "//div[@class='oxd-select-option']")
	private List<WebElement> jobCategorys;
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[3]")
	private WebElement clickSubUnit;
	@FindBy(xpath = "//div[@role='option']")
	private List<WebElement> subUnits;
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[4]")
	private WebElement clickLocation;
	@FindBy(xpath = "//div[@role='option']")
	private List<WebElement> locations;
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[5]")
	private WebElement clickEmpStatus;
	@FindBy(xpath = "//div[@role='option']")
	private List<WebElement> employmentStatus;
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement jobSaveButton;

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - PIM - Employee List - Job
	// - Job Details - Terminate Button
	// *******************************************************************************************

	@FindBy(xpath = "//button[normalize-space()='Terminate Employment']")
	private WebElement terminateEmploymentBtn;

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - PIM - Employee List - Job
	// - Job Details - Terminate Date
	// *******************************************************************************************

	@FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[2]")
	private WebElement terminateDate;

	@FindBy(xpath = "//li[@class='oxd-calendar-selector-year']")
	private WebElement yearElement;

	@FindBy(xpath = "//li[@class='oxd-calendar-selector-month']")
	private WebElement monthelElement;

	@FindBy(xpath = "//div[@class='oxd-calendar-date-wrapper']")
	private List<WebElement> dayWebElements;
	@FindBy(xpath = "//button[@title='Activate Employment']")
	private WebElement activateBtn;

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - PIM - Employee List - Job
	// - Job Details - Terminate Button Text,Reason and Notes
	// *******************************************************************************************

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--card-title']")
	private WebElement terminateEmpText;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[6]")
	private WebElement terminateReason;

	@FindBy(xpath = "//div[@role='option']//span")
	private List<WebElement> listOfTerminateReason;

	@FindBy(xpath = "//textarea[@placeholder='Type here']")
	private WebElement terminateNotes;

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - PIM - Employee List - Job
	// - Job Details - Activate Button
	// *******************************************************************************************

	@FindBy(xpath = "//button[@title='Activate Employment']")
	private WebElement activateEmpBtn;

	public PIMJobDetailsPage(TestContext testcontext, StepActions stepActions, DataContext context) {

		super(testcontext.webDriver);
		this.stepActions = stepActions;
		this.dataContext = context;
	}

	// *******************************************************************************************
	// Action method to click Job.
	// *******************************************************************************************

	public void selectJob() {
		stepActions.scrollBy(job);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		job.click();
	}

	// *******************************************************************************************
	// Action method to Select Job title,Job Category,Sub Unit,Location and Employee
	// Status
	// *******************************************************************************************

	public void selectJobTitle(String job) throws AWTException {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		clickJobTitle.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		stepActions.selectFromDropDown(jobTitles, job);
	}

	public void selectJobCategory(String category) throws AWTException {

		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		clickJobCategory.click();

		try {

			Thread.sleep(2500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		stepActions.selectFromDropDown(jobCategorys, category);

	}

	public void selectSubUnit(String unit) throws AWTException {

		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		clickSubUnit.click();

		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		stepActions.selectFromDropDown(subUnits, unit);

	}

	public void selectLocation(String loc) throws AWTException {

		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		clickLocation.click();
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		stepActions.selectFromDropDown(locations, loc);

	}

	public void selectEmpStatus(String status) throws AWTException {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		// clickEmpStatus.click();
		stepActions.ClickElementUsingJavaScript(clickEmpStatus);

		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		stepActions.selectFromDropDown(employmentStatus, status);
	}

	// *******************************************************************************************
	// Action method to get Job details Text
	// *******************************************************************************************

	public void getJobDetailsTxt() {

		stepActions.getElementText(jobDetailsTxt);

	}
	// *******************************************************************************************
	// Action method to Click Job Save Button
	// *******************************************************************************************

	public void clickSaveBtn() {

		stepActions.clickElement(jobSaveButton);
	}

	// *******************************************************************************************
	// Action method to Click Terminate Button
	// *******************************************************************************************

	public void clickTerminateEmployment() {

		stepActions.clickElement(terminateEmploymentBtn);

	}

	// *******************************************************************************************
	// Action method to select Terminate Date
	// *******************************************************************************************

	public void selectTerminateDate() {

//		stepActions.selectDateFromDatePicker(terminateDate, "28-December-2023", yearElement, monthelElement,
//				dayWebElements);

	}

	// *******************************************************************************************
	// Action method to get Terminate Status
	// *******************************************************************************************
	public String verifyTerminateEmploymentPage() {

		String terminateEmp = stepActions.getElementText(terminateEmpText);

		return terminateEmp;

	}

	// *******************************************************************************************
	// Action method to Select Terminate Status
	// *******************************************************************************************

	public void selectTerminateReason() throws AWTException {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		terminateReason.click();

//		stepActions.robot("down");
//		stepActions.robot("down");
//		stepActions.robot("enter");

		stepActions.selectFromDropDown(listOfTerminateReason, "Resigned");

	}

	// *******************************************************************************************
	// Action method for Terminate Notes
	// *******************************************************************************************

	public void setTerminateNotes(String notes) {

		stepActions.setDataInTextBox(terminateNotes, notes);

	}

	// *******************************************************************************************
	// Action method to Verify Activate Button
	// *******************************************************************************************

	public String verifyActivateEmployeeBtn() {

		String activateBtn = stepActions.getElementText(activateEmpBtn);

		return activateBtn;

	}

	public String verifyTerminate() {

		String activateTxt = stepActions.getElementText(activateBtn);

		// Assert.assertEquals(activateTxt, "Activate Employment");

		return activateTxt;
	}

	// *******************************************************************************************
	// Action method to Click Activate Button
	// *******************************************************************************************

	public void clickActivateBtn() {

		stepActions.clickElement(activateBtn);
	}
}
