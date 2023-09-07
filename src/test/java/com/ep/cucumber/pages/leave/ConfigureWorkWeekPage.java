package com.ep.cucumber.pages.leave;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ConfigureWorkWeekPage extends PageContext {

	StepActions stepActions;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************
	public ConfigureWorkWeekPage(TestContext testcontext, StepActions stepActions) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;

	}

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - Leave - Configure Tab - Work Week
	// SubMenu
	// - Start Date,Start Month
	// *******************************************************************************************
	@FindBy(xpath = "//div[@class='oxd-topbar-body']//li[5]")
	private WebElement clickonconfiguremenu;
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li")
	private List<WebElement> configuredsubmenus;
	@FindBy(xpath = "(//ul[@class='oxd-dropdown-menu']//li)[3]")
	private WebElement clickonworkweek;
	@FindBy(xpath = "//div[@class='oxd-form-actions']//p")
	private WebElement scrollupto;

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - Leave - Configure Tab - LeavePeriod
	// SubMenu
	// - Save Button
	// *******************************************************************************************
	@FindBy(xpath = "//div[@class='oxd-form-actions']//button")
	private WebElement clickonweeksavebutton;

	// *******************************************************************************************
	// Action method to click configuremenu and select work week
	// *******************************************************************************************
	public void clickonworkweek() {

		stepActions.checkElementDisplayed(clickonconfiguremenu);
		stepActions.clickElement(clickonconfiguremenu);
		stepActions.clickElement(clickonworkweek);
		stepActions.selectFromDropDown(configuredsubmenus, "Work Week");

	}

	// *******************************************************************************************
	// Action method to scrolldown the page and click save button
	// *******************************************************************************************
	public void clickonweeksave() {

		stepActions.clickElement(clickonweeksavebutton);
	}

}