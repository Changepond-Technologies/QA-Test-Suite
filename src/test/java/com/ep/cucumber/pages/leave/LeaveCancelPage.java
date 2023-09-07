package com.ep.cucumber.pages.leave;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LeaveCancelPage extends PageContext {

	StepActions stepActions;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************
	public LeaveCancelPage(TestContext testcontext, StepActions stepActions) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;

	}

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - Leave - Leave List Tab - Leave List
	// Page
	// *******************************************************************************************
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li")
	private List<WebElement> amberoptions;

	// *******************************************************************************************
	// Action method to click cancel button
	// *******************************************************************************************
	public void clickoncancelleave() {

		stepActions.selectFromDropDown(amberoptions, "Cancel Leave");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}
}