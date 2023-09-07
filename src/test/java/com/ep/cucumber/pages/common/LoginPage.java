package com.ep.cucumber.pages.common;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageContext {

	StepActions stepActions;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************
	public LoginPage(TestContext testcontext, StepActions stepActions) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;
	}

	// *******************************************************************************************
	// Page Elements declaration - Login - UserName, Password and Login Button
	// *******************************************************************************************
	@FindBy(css = "input[placeholder='Username']")
	WebElement userName;

	@FindBy(css = "[name='password']")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;

	// *******************************************************************************************
	// Action method to set UserName and Password.
	// *******************************************************************************************
	
	public void userName() {
		
		//stepActions.isPageDisplayed();
		stepActions.setDataInTextBox(userName, System.getenv("app.username"));
	}

	public void password() {
		stepActions.setDataInTextBox(password, System.getenv("app.password"));
	}

	// *******************************************************************************************
	// Action method to click on Login Button
	// *******************************************************************************************

	public void clickLoginButtonn() {
		stepActions.clickElement(loginButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
