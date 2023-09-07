package com.ep.cucumber.pages.leave;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ConfigureLeavePeriodPage extends PageContext {

	StepActions stepActions;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************
	public ConfigureLeavePeriodPage(TestContext testcontext, StepActions stepActions) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;

	}
	// *******************************************************************************************
	// Page Elements declaration - Left Menu - Leave - Configure Tab - LeavePeriod
	// SubMenu
	// - Start Date,Start Month
	// *******************************************************************************************

	@FindBy(xpath = "//div[@class='oxd-topbar-body']//li[5]")
	private WebElement clickonconfiguremenu;
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li")
	private List<WebElement> configuredsubmenus;
	@FindBy(xpath = "((//div[@class='oxd-grid-4 orangehrm-full-width-grid'])[1]//div[1]//div)[3]")
	private WebElement clickonstartmonth;
	@FindBy(xpath = "(//div[@class='oxd-select-dropdown --positon-bottom']//div)")
	private List<WebElement> selectstartmonth;
	@FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[2]")
	private WebElement clickonstartdate;
	@FindBy(xpath = "(//div[@class='oxd-select-dropdown --positon-bottom']//div)")
	private List<WebElement> selectstartdate;

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - Leave - Configure Tab - LeavePeriod
	// SubMenu
	// - Save Button
	// *******************************************************************************************

	@FindBy(xpath = "(//div[@class='oxd-form-actions']//button)[2]")
	private WebElement cliconsavebutton;

	// *******************************************************************************************
	// Action method to click configuremenu and select leaveperiod
	// *******************************************************************************************
	public void clickonconfiguremenu() {

		stepActions.checkElementDisplayed(clickonconfiguremenu);

		stepActions.clickElement(clickonconfiguremenu);

		stepActions.selectFromDropDown(configuredsubmenus, "Leave Period");

	}

	// *******************************************************************************************
	// Action method to click startmonth
	// *******************************************************************************************
	public void clickonstartmonth() {

		stepActions.checkElementDisplayed(clickonstartmonth);

		stepActions.clickElement(clickonstartmonth);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	// *******************************************************************************************
	// Action method to select startmonth,startdate
	// *******************************************************************************************
	public void selectstartmonth() {
		stepActions.selectFromDropDown(selectstartmonth, "April");
	}

	public void selectstartdate() {
		stepActions.clickElement(clickonstartdate);

		stepActions.selectFromDropDown(selectstartdate, "28");
	}

	// *******************************************************************************************
	// Action method to click save button
	// *******************************************************************************************
	public void clickonsavebutton() {
		stepActions.checkElementDisplayed(cliconsavebutton);

		stepActions.clickElement(cliconsavebutton);
	}

}