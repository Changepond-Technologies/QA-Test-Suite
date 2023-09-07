package com.ep.cucumber.pages.performance;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import com.ep.cucumber.dto.DataContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
 

public class PerformanceAddTrackerPage extends PageContext {

	StepActions stepActions;
    DataContext context;
    
	// *******************************************************************************************
    // Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************
	public PerformanceAddTrackerPage(TestContext testcontext, StepActions stepActions, DataContext context) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;
		this.context = context;

	}
	// *******************************************************************************************
	// Page Elements declaration - Left Menu - Performance - Configure- Performance Tracker Page
	// Select Tracker,Tracker employee name,Tracker reviewers,Save Button
	// *******************************************************************************************
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li")
	private List<WebElement> selectkpi;
    @FindBy(xpath = "//div[@class='orangehrm-header-container']//button")
	private WebElement clickonaddbuttonn;
	@FindBy(xpath = "(//div[@class='oxd-topbar-body']//ul//li)[1]")
	private WebElement clickonconfiguremenu;
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li")
	private List<WebElement> selecttrackers;
    @FindBy(xpath = "(//div[@class='orangehrm-card-container']//div[@class='oxd-input-group oxd-input-field-bottom-space'])[1]")
	private WebElement clickontrackername;
    @FindBy(xpath = "(//div[@class='orangehrm-card-container']//div[@class='oxd-input-group oxd-input-field-bottom-space'])[1]//input")
	private WebElement entertrackername;
    @FindBy(xpath = "(//div[@class='orangehrm-card-container']//div[@class='oxd-input-group oxd-input-field-bottom-space'])[2]")
	private WebElement clickontrackeremployeename;
    @FindBy(xpath = "(//div[@class='orangehrm-card-container']//div[@class='oxd-input-group oxd-input-field-bottom-space'])[2]//input")
	private WebElement entertrackeremployeename;
    @FindBy(xpath = "//div[@class='oxd-autocomplete-dropdown --positon-bottom']//div")
	private List<WebElement> selectemployeenama;
    @FindBy(xpath = "(//div[@class='orangehrm-card-container']//div[@class='oxd-input-group oxd-input-field-bottom-space'])[3]")
	private WebElement clickontrackerreviewers;
    @FindBy(xpath = "(//div[@class='orangehrm-card-container']//div[@class='oxd-input-group oxd-input-field-bottom-space'])[3]//input")
	private WebElement entertrackerreviewers;
    @FindBy(xpath = "//div[@class='oxd-autocomplete-dropdown --positon-bottom']//div")
	private List<WebElement> selectreviewersname;
    @FindBy(xpath = "(//div[@class='oxd-form-actions']//button)[2]")
	private WebElement clickontrackerssavebutton;
	@FindBy(xpath = "(//div[@id='oxd-toaster_1']//p)[1]")
	private WebElement savemessage;
	// *******************************************************************************************
	// Action method to click configure menu and select trackers
	// *******************************************************************************************
	public void selectTrackers() {

		stepActions.checkElementDisplayed(clickonconfiguremenu);

		stepActions.clickElement(clickonconfiguremenu);

		stepActions.selectFromDropDown(selecttrackers, "Trackers");

	}
	// *******************************************************************************************
	// Action method to click add button
	// *******************************************************************************************
	public void clickontrackersaddbutton() {

		stepActions.checkElementDisplayed(clickonaddbuttonn);

		clickonaddbuttonn.click();

	}
	// *******************************************************************************************
    // Action method to click tracker name and set tracker name
    // *******************************************************************************************
	public void entertrackername(String trackername) {

		stepActions.checkElementDisplayed(clickontrackername);

		stepActions.clickElement(clickontrackername);

		stepActions.setDataInTextBox(entertrackername, trackername);

	}
	// *******************************************************************************************
    // Action method to click tracker name and set tracker name
    // *******************************************************************************************
	public void entertrackeremployeename(String employeenamet) {

		stepActions.checkElementDisplayed(clickontrackeremployeename);

		stepActions.clickElement(clickontrackeremployeename);

		stepActions.setDataInTextBox(entertrackeremployeename, employeenamet);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		stepActions.selectFromDropDown(selectemployeenama, "Kiyara Hu");

	}
	// *******************************************************************************************
    // Action method to click tracker reviewer and set tracker reviewers name
    // *******************************************************************************************
	public void entertrackerreviewersname(String reviewersname) {

		stepActions.checkElementDisplayed(clickontrackerreviewers);

		stepActions.clickElement(clickontrackerreviewers);

		stepActions.setDataInTextBox(entertrackerreviewers, reviewersname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		stepActions.selectFromDropDown(selectreviewersname, "Charlie Carter");

	}
	// *******************************************************************************************
    // Action method to click trackers save button
    // *******************************************************************************************
	public void clickontrackerssavebutton() {

		stepActions.checkElementDisplayed(clickontrackerssavebutton);

		clickontrackerssavebutton.click();

	}
	// *******************************************************************************************
    // Action method to verify save message text
    // *******************************************************************************************
	public String verifymessage() {

		return stepActions.getElementText(savemessage);

	}

}