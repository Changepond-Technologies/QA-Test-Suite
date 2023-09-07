package com.ep.cucumber.pages.leave;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ConfigureLeaveTypePage extends PageContext {

	StepActions stepActions;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************
	public ConfigureLeaveTypePage(TestContext testcontext, StepActions stepActions) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;

	}
	// *******************************************************************************************
	// Page Elements declaration - Left Menu - Leave - Configure Tab - LeaveType
	// SubMenu
	// - Name Field,
	// *******************************************************************************************

	@FindBy(xpath = "//div[@class='oxd-topbar-body']//li[5]")
	private WebElement clickonconfiguremenu;
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li")
	private List<WebElement> configuredsubmenus;
	@FindBy(xpath = "(//ul[@class='oxd-dropdown-menu']//li)[2]")
	private WebElement clickonleavetypes;
	@FindBy(xpath = "//div[@class='orangehrm-header-container']//button")
	private WebElement clickonaddbutton1;
	@FindBy(xpath = "(//div[@class='oxd-form-row'])[1]//input")
	private WebElement clickonnamefield;

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - Leave - Configure Tab - LeaveType
	// SubMenu
	// - Entitlement Radio Button,Save Button
	// *******************************************************************************************
	@FindBy(xpath = "(//div[@class='--status-grouped-field']//div[@class='oxd-radio-wrapper'])[1]//label")
	private WebElement clickonentitlementradiobutton;

	@FindBy(xpath = "(//div[@class='oxd-form-actions']//button)[2]")
	private WebElement clickonleavesavebutton;

	// *******************************************************************************************
	// Action method to click configuremenu and select leave type
	// *******************************************************************************************
	public void clickonleavetypes() {

		stepActions.checkElementDisplayed(clickonconfiguremenu);

		stepActions.clickElement(clickonconfiguremenu);

		stepActions.selectFromDropDown(configuredsubmenus, "Leave Types");

	}

	// *******************************************************************************************
	// Action method to click add button
	// *******************************************************************************************
	public void clickonaddbutton() {

		stepActions.checkElementDisplayed(clickonaddbutton1);

		clickonaddbutton1.click();

	}

	// *******************************************************************************************
	// Action method to click name field,radio button and enter name field
	// *******************************************************************************************
	public void clickonnamefield(String leavetype) {

		stepActions.checkElementDisplayed(clickonnamefield);

		stepActions.clickElement(clickonnamefield);

		stepActions.setDataInTextBox(clickonnamefield, leavetype);

		stepActions.checkElementDisplayed(clickonentitlementradiobutton);

		stepActions.clickElement(clickonentitlementradiobutton);

	}

	// *******************************************************************************************
	// Action method to click save button
	// *******************************************************************************************
	public void clickonleavesavebutton() {

		stepActions.checkElementDisplayed(clickonleavesavebutton);

		stepActions.clickElement(clickonleavesavebutton);

	}

}