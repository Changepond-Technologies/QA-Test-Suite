package com.ep.cucumber.pages.admin;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import com.ep.cucumber.dto.DataContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminAddLocationPage extends PageContext {

	StepActions stepActions;
	DataContext context;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************
	public AdminAddLocationPage(TestContext testcontext, StepActions stepActions, DataContext context) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;
		this.context = context;
	}
	// *******************************************************************************************
	// Page Elements declaration - Left Menu - Admin - Organization menu- Location
	// Page
	// Name,City Name,State Name,Postal code,Fax Number,Add button
	// *******************************************************************************************
	@FindBy(xpath = "//div[@class='oxd-topbar-body']//li[3]")
	private WebElement clickOnOraganizationtab;
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li")
	private List<WebElement> selectLocationSubMenu;
	@FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']//input)[1]")
	private WebElement enterName;
	@FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']//input)[2]")
	private WebElement enterCityName;
	@FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']//input)[3]")
	private WebElement enterStateName;
	@FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']//input)[4]")
	private WebElement enterPostalCode;
	@FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']//input)[5]")
	private WebElement enterPhoneNumber;
	@FindBy(xpath = "(//div[@class='oxd-grid-item oxd-grid-item--gutters']//input)[5]")
	private WebElement enterFaxNumber;
	@FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
	private WebElement clickOnCountryfield;
	@FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']//div")
	private List<WebElement> selectCountryName;
	@FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[8]//textarea")
	private WebElement addressTextArea;
	@FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[9]//textarea")
	private WebElement notesTextArea;
	@FindBy(xpath = "//div[@class='orangehrm-header-container']//button")
	private WebElement clickOnAdminAddButton;
	// *******************************************************************************************
	// Action method to click organization tab and select location
	// *******************************************************************************************

	public void clickOnLocationSubMenu() {

		stepActions.checkElementDisplayed(clickOnOraganizationtab);

		stepActions.clickElement(clickOnOraganizationtab);

		stepActions.selectFromDropDown(selectLocationSubMenu, "Locations");

	}

	// *******************************************************************************************
	// Action method to click Add button
	// *******************************************************************************************
	public void clickOnAddButton() {

		clickOnAdminAddButton.click();

	}

	// *******************************************************************************************
	// Action method to enter name
	// *******************************************************************************************
	public void enterEmployeeName() {

		stepActions.checkElementDisplayed(enterName);

		stepActions.setDataInTextBox(enterName, null);

	}

	// *******************************************************************************************
	// Action method to enter city name
	// *******************************************************************************************
	public void enterCityName(String cityname) {

		stepActions.checkElementDisplayed(enterCityName);

		stepActions.setDataInTextBox(enterCityName, cityname);

	}

	// *******************************************************************************************
	// Action method to enter state name
	// *******************************************************************************************
	public void enterStateName(String state) {

		stepActions.checkElementDisplayed(enterStateName);

		stepActions.setDataInTextBox(enterStateName, state);

	}

	// *******************************************************************************************
	// Action method to enter postal code
	// *******************************************************************************************
	public void enterPostalCode(String postalcode) {

		stepActions.checkElementDisplayed(enterPostalCode);

		stepActions.setDataInTextBox(enterPostalCode, postalcode);

	}

	// *******************************************************************************************
	// Action method to enter phone number
	// *******************************************************************************************
	public void enterPhoneNumber(String phonenumber) {

		stepActions.checkElementDisplayed(enterPhoneNumber);

		stepActions.setDataInTextBox(enterPhoneNumber, phonenumber);

	}

	// *******************************************************************************************
	// Action method to enter fax number
	// *******************************************************************************************
	public void enterFaxNumber(String faxnumber) {

		stepActions.checkElementDisplayed(enterFaxNumber);

		stepActions.setDataInTextBox(enterFaxNumber, faxnumber);

	}

	// *******************************************************************************************
	// Action method to click contry field
	// *******************************************************************************************
	public void clickOnCountry() {

		stepActions.checkElementDisplayed(clickOnCountryfield);

		stepActions.clickElement(clickOnCountryfield);

	}

	// *******************************************************************************************
	// Action method to select country
	// *******************************************************************************************
	public void selectCountry(String country) {

		stepActions.selectFromDropDown(selectCountryName, country);

	}

	// *******************************************************************************************
	// Action method to click text area and enter test
	// *******************************************************************************************
	public void enterAddress(String address) {

		stepActions.checkElementDisplayed(addressTextArea);

		stepActions.clickElement(addressTextArea);

		stepActions.setDataInTextBox(addressTextArea, address);

	}

	// *******************************************************************************************
	// Action method to click text area and enter address
	// *******************************************************************************************
	public void enterNotes() {

		stepActions.checkElementDisplayed(notesTextArea);

		stepActions.clickElement(notesTextArea);

		stepActions.setDataInTextBox(notesTextArea, "Present address");

	}

}
