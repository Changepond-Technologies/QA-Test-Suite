package com.ep.cucumber.pages.pim;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import com.ep.cucumber.dto.DataContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PIMContactDetailsPage extends PageContext {

	StepActions stepActions;
	DataContext dataContext;

	public PIMContactDetailsPage(TestContext testContext, StepActions stepActions, DataContext dataContext) {
		super(testContext.webDriver);

		this.stepActions = stepActions;
		this.dataContext = dataContext;
	}

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - PIM - Employee list
	// - Contact Details - contact details, street, city, postal code
	// *******************************************************************************************

	@FindBy(xpath = "//a[normalize-space()='Contact Details']")
	WebElement contactDetails;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement street;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
	WebElement city;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[6]")
	WebElement postalCode;

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - PIM - Employee list
	// - Contact Details - country, select country
	// *******************************************************************************************

	@FindBy(css = ".oxd-select-text.oxd-select-text--active")
	WebElement country;

	@FindBy(xpath = "//div[@role='option']")
	List<WebElement> selectCountry;

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - PIM - Employee list
	// - Contact Details - mobile, email and save button
	// *******************************************************************************************

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[8]")
	WebElement mobile;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[10]")
	WebElement email;

	@FindBy(css = "button[type='submit']")
	WebElement saveBtn;

	// *******************************************************************************************
	// Action method to click contact details
	// *******************************************************************************************

	public void clickContactDetails() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// stepActions.clickElement(contactDetails);
		stepActions.ClickElementUsingJavaScript(contactDetails);
	}

	// ********************************************************************************************
	// Action method to set street address, city, postal code, country, mobile,
	// email and save button.
	// ********************************************************************************************

	public void setStreetAddress(String address) {
		stepActions.setDataInTextBox(street, address);

	}

	public void setCity(String City) {
		stepActions.setDataInTextBox(city, City);
	}

	public void setPostalCode(String code) {
		stepActions.setDataInTextBox(postalCode, code);
	}

	public void selectCountry(String Country) {
		stepActions.clickElement(country);
		stepActions.selectFromDropDown(selectCountry, Country);
	}

	public void setMobile(String mobNo) {
		stepActions.setDataInTextBox(mobile, mobNo);
	}

	public void setEmail(String mailId) {
		stepActions.setDataInTextBox(email, mailId);
	}

	public void clickSaveBtn() {
		stepActions.clickElement(saveBtn);
	}
}
