package com.ep.cucumber.pages.performance;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PerformanceAddKPIPage extends PageContext {

	StepActions stepActions;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************
	public PerformanceAddKPIPage(TestContext testcontext, StepActions stepActions) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;
	}

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - Performance - Configure- KPI for Job
	// Title Page
	// Key Performance,Job Title,Rating,Performance Save Button
	// *******************************************************************************************
	@FindBy(xpath = "(//div[@class='oxd-topbar-body']//ul//li)[1]")
	private WebElement clickonconfiguremenu;
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li")
	private List<WebElement> selectkpi;
	@FindBy(xpath = "//div[@class='orangehrm-header-container']//button")
	private WebElement clickonaddbuttonn;
	@FindBy(xpath = "(//div[@class='orangehrm-background-container']//div[@class='oxd-grid-item oxd-grid-item--gutters'])[1]")
	private WebElement clickonkeyperformanceindicator;
	@FindBy(xpath = "(//div[@class='orangehrm-background-container']//div[@class='oxd-grid-item oxd-grid-item--gutters']//input)[1]")
	private WebElement enterkeyperformance;
	@FindBy(xpath = "(//div[@class='orangehrm-background-container']//div[@class='oxd-grid-item oxd-grid-item--gutters'])[2]")
	private WebElement clickonjobtitle;
	@FindBy(xpath = "(//div[@class='orangehrm-background-container']//div[@class='oxd-grid-item oxd-grid-item--gutters'])[3]")
	private WebElement clickonrating;
	@FindBy(xpath = "(//div[@class='oxd-select-dropdown --positon-bottom']//div)")
	private List<WebElement> selectjob;
	@FindBy(xpath = "(//div[@class='oxd-form-actions']//button)[2]")
	private WebElement clickonperformancesavebutton;
	@FindBy(xpath = "(//div[@id='oxd-toaster_1']//p)[1]")
	private WebElement savemessage;

	// *******************************************************************************************
	// Action method to click configure menu and select kpi
	// *******************************************************************************************
	public void clickonconfiguremenu() {

		stepActions.checkElementDisplayed(clickonconfiguremenu);

		stepActions.clickElement(clickonconfiguremenu);

		stepActions.selectFromDropDown(selectkpi, "KPIs");

	}

	// *******************************************************************************************
	// Action method to click save button
	// *******************************************************************************************
	public void clickonaddbutton() {

		stepActions.checkElementDisplayed(clickonaddbuttonn);

		clickonaddbuttonn.click();

	}

	// *******************************************************************************************
	// Action method to enter key performance
	// *******************************************************************************************
	public void enterkeyperformanceindicator(String keyperformanceindicator) {

		stepActions.checkElementDisplayed(clickonkeyperformanceindicator);

		stepActions.clickElement(clickonkeyperformanceindicator);

		stepActions.setDataInTextBox(enterkeyperformance, keyperformanceindicator);

	}

	// *******************************************************************************************
	// Action method to select job title
	// *******************************************************************************************
	public void selectjobtitle(String jobtitle) {

		stepActions.checkElementDisplayed(clickonjobtitle);

		stepActions.clickElement(clickonjobtitle);

		stepActions.selectFromDropDown(selectjob, jobtitle);

		stepActions.clickElement(clickonrating);

	}

	// *******************************************************************************************
	// Action method to save button
	// *******************************************************************************************
	public void clickonsavebutton() {

		stepActions.checkElementDisplayed(clickonperformancesavebutton);

		clickonperformancesavebutton.click();

	}

	// *******************************************************************************************
	// Action method to verify save message
	// *******************************************************************************************
	public String verifymessage() {

		return stepActions.getElementText(savemessage);

	}

}