package com.ep.cucumber.pages.common;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends PageContext {

	StepActions stepActions;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************

	public HomePage(TestContext testcontext, StepActions stepActions) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;

	}

	// *******************************************************************************************
	// Page Elements declaration - DashBoard - DashBoard Text 
	// *******************************************************************************************
	@FindBy(xpath = "//h6[contains(@class, 'breadcrumb-module')]")
	private WebElement dashBoardText;

	// *******************************************************************************************
	// Action method to get DashBoard Header.
	// *******************************************************************************************

	public void getDashBoardText() { Assert.assertEquals(stepActions.getElementText(dashBoardText), "Dashboard"); }

}
