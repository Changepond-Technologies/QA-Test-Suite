package com.ep.cucumber.pages.common;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import com.ep.cucumber.dto.DataContext;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftPanelPage extends PageContext {

	StepActions stepActions;

	DataContext context;

	// *******************************************************************************************
	// Page Elements declaration - Left Menu
	// - Admin,PIM,Leave,Time,Recruitment and Performance Module
	// *******************************************************************************************

	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adminModule;
	@FindBy(xpath = "//span[text()='PIM']")
	WebElement PIMModule;
	@FindBy(xpath = "//a[@href='/web/index.php/leave/viewLeaveModule']")
	WebElement leaveModule;
	@FindBy(xpath = "//span[text()='Time']")
	WebElement timeModule;
	@FindBy(xpath = "//span[text()='Recruitment']")
	WebElement RecruitmentModule;
	@FindBy(xpath = "//span[text()='Performance']")
	WebElement performanceModule;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************

	public LeftPanelPage(TestContext testContext, StepActions stepActions) {
		super(testContext.webDriver);
		this.stepActions = stepActions;
	}

	// *******************************************************************************************
	// Action method to select Admin, PIM, Leave, Time, Recuitment and Performance
	// *******************************************************************************************
	public void clickOnAdminModule() {
		stepActions.clickElement(adminModule);
	}

	public void clickOnPIMModule() {
		
		stepActions.clickElement(PIMModule);
	}

	public void clickOnLeaveModule() {
		stepActions.clickElement(leaveModule);
	}

	public void clickOnTimeModule() {
		stepActions.clickElement(timeModule);
	}

	public void clickOnRecuitmentModule() {
		stepActions.clickElement(RecruitmentModule);
	}

	public void clickOnPerformanceModule() {
		stepActions.clickElement(performanceModule);
	}
}
