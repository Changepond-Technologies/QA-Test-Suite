package com.ep.cucumber.pages.leave;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LeaveAddEntitlementsPage extends PageContext {

	StepActions stepActions;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************
	public LeaveAddEntitlementsPage(TestContext testcontext, StepActions stepActions) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;

	}

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - Leave - Entitlements Tab - Add
	// Entitlement SubMenu
	// - Employee Name,Leave Type,Entitlement,Confirm Button
	// *******************************************************************************************

	@FindBy(xpath = "//div[@class='oxd-topbar-body']//li[3]")
	private WebElement clickonentitlementmenu;
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li")
	private List<WebElement> selectaddentitlement;
	@FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[3]//input")
	private WebElement clickonemployeename;
	@FindBy(xpath = "//div[@class='oxd-autocomplete-dropdown --positon-bottom']//div")
	private List<WebElement> selectemployeename;
	@FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[4]//div[2]")
	private WebElement clickonleavetype;
	@FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']//div")
	private List<WebElement> selectleavetype;
	@FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[6]//div[2]")
	private WebElement clickonentitlement;
	@FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[6]//div[2]//input")
	private WebElement enterentitlement;
	@FindBy(xpath = "//div[@class='orangehrm-modal-footer']//button[2]")
	private WebElement clickonconfirmbutton;

	// *******************************************************************************************
	// Action method to click entitlement tab and select add entitlement submenu
	// *******************************************************************************************
	public void clickonaddentitlement() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		stepActions.clickElement(clickonentitlementmenu);

		stepActions.selectFromDropDown(selectaddentitlement, "Add Entitlements");

	}

	// *******************************************************************************************
	// Action method to enter employee name and select employee name
	// *******************************************************************************************
	public void clickonemployeename(String employeename) {

		stepActions.clickElement(clickonemployeename);

		stepActions.setDataInTextBox(clickonemployeename, employeename);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		stepActions.selectFromDropDown(selectemployeename, "Kiyara Hu");
	}

	// *******************************************************************************************
	// Action method to click leave type and select leave type
	// *******************************************************************************************
	public void clickonleavetype() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		stepActions.clickElement(clickonleavetype);

		stepActions.selectFromDropDown(selectleavetype, "US-Vacation1");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	// *******************************************************************************************
	// Action method to click entitlement and enter entitlement value
	// *******************************************************************************************
	public void enterentitlement(String entitlement) {

		stepActions.clickElement(clickonentitlement);

		stepActions.setDataInTextBox(enterentitlement, entitlement);

	}

	// *******************************************************************************************
	// Action method to click confirm button
	// *******************************************************************************************
	public void clickonconfirmbutton() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		stepActions.clickElement(clickonconfirmbutton);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
	}

}