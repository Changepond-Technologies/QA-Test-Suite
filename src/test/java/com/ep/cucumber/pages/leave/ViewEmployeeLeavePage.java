package com.ep.cucumber.pages.leave;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ViewEmployeeLeavePage extends PageContext {

	StepActions stepActions;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************
	public ViewEmployeeLeavePage(TestContext testcontext, StepActions stepActions) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;

	}

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - Leave - Leave List Tab - Leave List
	// Page
	// Amber Button,Back Button
	// *******************************************************************************************

	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li")
	private List<WebElement> amberoptions;
	@FindBy(xpath = "(//div[@class='orangehrm-bottom-container']//button)[1]")
	private WebElement clickonbackbutton;

	// *******************************************************************************************
	// Action method to click view leave details
	// *******************************************************************************************
	public void clickonviewleavedetails() {

		stepActions.selectFromDropDown(amberoptions, "View Leave Details");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}

	// *******************************************************************************************
	// Action method to click back button
	// *******************************************************************************************
	public void clickonbackbutton() {

		clickonbackbutton.click();

	}

}