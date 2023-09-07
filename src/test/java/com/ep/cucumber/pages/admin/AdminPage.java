package com.ep.cucumber.pages.admin;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import com.ep.cucumber.dto.DataContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminPage extends PageContext {

	StepActions stepActions;
    DataContext context;
    
	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************
	public AdminPage(TestContext testcontext, StepActions stepActions, DataContext context) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;
		this.context = context;

	}
	// *******************************************************************************************
	// Page Elements declaration - Left Menu - Admin- User Mangement- User Page
	// Key Performance,Job Title,Rating,Performance Save Button
	// *******************************************************************************************
	@FindBy(xpath = "//div[@class='orangehrm-header-container']//button")
	private WebElement clickOnAdminAddButton;
    @FindBy(xpath = "(//div[@class='orangehrm-background-container']//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	private WebElement clickOnUserRole;
    @FindBy(xpath = "(//div[@class='orangehrm-background-container']//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	private WebElement clickOnStatus;
    @FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']//div")
	private List<WebElement> selectUserRole;
    @FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']//div")
	private List<WebElement> selectStatus;
    @FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']//input)[1]")
	private WebElement enterEmployeeName;
    @FindBy(xpath = "//div[@class='oxd-autocomplete-dropdown --positon-bottom']//div")
	private List<WebElement> selectEmployeeName;
    @FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']//input)[2]")
	private WebElement enterUserName;
    @FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']//input)[3]")
	private WebElement enterConfirmPassword;
    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space']//input)[3]")
	private WebElement enterPassword;
    @FindBy(xpath = "(//div[@class='oxd-form-actions']//button)[2]")
	private WebElement adminSaveButton;
    
    // *******************************************************************************************
 	// Action method to click admin add button
 	// *******************************************************************************************
    public void clickOnAdminAddButton() {

		stepActions.checkElementDisplayed(clickOnAdminAddButton);

		clickOnAdminAddButton.click();

	}
    // *******************************************************************************************
  	// Action method to click user role
  	// *******************************************************************************************
	public void clickOnUserRole() {

		stepActions.checkElementDisplayed(clickOnUserRole);

		stepActions.clickElement(clickOnUserRole);
	}
    
	// *******************************************************************************************
	// Action method to select user role
	// *******************************************************************************************
	public void selectUserRole(String userrole) {

		stepActions.selectFromDropDown(selectUserRole, userrole);

	}
	// *******************************************************************************************
    // Action method to select status
	// *******************************************************************************************
	public void clickOnStatus() {

		stepActions.checkElementDisplayed(clickOnStatus);

		stepActions.clickElement(clickOnStatus);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		stepActions.selectFromDropDown(selectStatus, "Enabled");

	}
	// *******************************************************************************************
    // Action method to enter employee name
	// *******************************************************************************************
	public void enterEmployeeName(String employeename) {

		stepActions.setDataInTextBox(enterEmployeeName, employeename);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
	}
	// *******************************************************************************************
    // Action method to select employee name
	// *******************************************************************************************
    public void selectEmployeeName(String employeename) {

		stepActions.selectFromDropDown(selectEmployeeName, employeename);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
	}
    // *******************************************************************************************
    // Action method to enter user name
	// *******************************************************************************************
	public void enterUserName(String username) {

		stepActions.setDataInTextBox(enterUserName, username);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
	}
	// *******************************************************************************************
    // Action method to enter password
	// *******************************************************************************************
	public void enterPassword(String password) {

		stepActions.setDataInTextBox(enterPassword, password);
	}
	// *******************************************************************************************
    // Action method to enter confirm password
	// *******************************************************************************************
	public void confirmPassword(String confirmpassword) {

		stepActions.setDataInTextBox(enterConfirmPassword, confirmpassword);
	}
	// *******************************************************************************************
    // Action method to click admin save button
	// *******************************************************************************************
	public void adminSaveButton() {

		adminSaveButton.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
	}
}