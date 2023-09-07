package com.ep.cucumber.pages.pim;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.util.List;

public class PIMPersonalDetailsPage extends PageContext {

	StepActions stepActions;

	public PIMPersonalDetailsPage(TestContext testContext, StepActions stepActions) {
		super(testContext.webDriver);
		this.stepActions = stepActions;
	}

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - PIM - Employee List - Left Menu -
	// Personal Details - Nationality and Save Button
	// *******************************************************************************************

	@FindBy(xpath = "(//input)[8]")
	private WebElement driverLicenseNumber;
	@FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[1]")
	private WebElement licenseExpiryDate;
	@FindBy(xpath = "(//div[contains(@class,'text-input')])[1]")
	WebElement nationality;
	@FindBy(xpath = "//div[@role='listbox']//div")
	List<WebElement> listOfCountry;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement saveBtn;

	// *******************************************************************************************
	// Action method to Select Nationality.
	// *******************************************************************************************

	public void selectNationality() throws AWTException {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//stepActions.clickElement(nationality);
		stepActions.ClickElementUsingJavaScript(nationality);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		stepActions.selectFromDropDown(listOfCountry, "India");
	}

	// *******************************************************************************************
	// Action method to click Save Button.
	// *******************************************************************************************

	public void selectSaveBtn() {
		stepActions.clickElement(saveBtn);
	}
}
