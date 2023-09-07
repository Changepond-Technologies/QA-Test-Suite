package com.ep.cucumber.pages.leave;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ConfigureHolidayPage extends PageContext {

	StepActions stepActions;

	// ***********************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions
	// ***********************************************************************************************
	public ConfigureHolidayPage(TestContext testcontext, StepActions stepActions ) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;
	}
    
    // *******************************************************************************************
 	// Page Elements declaration - Left Menu - Leave - Configure Tab -  Holiday SubMenu 
 	// - HolidayName,PickDate
 	// *******************************************************************************************

	@FindBy(xpath = "//div[@class='oxd-topbar-body']//li[5]")
	private WebElement clickonconfiguremenu;
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li")
	private List<WebElement> configuredsubmenus;
	@FindBy(xpath = "(//ul[@class='oxd-dropdown-menu']//li)[4]")
	private WebElement clickonholidaysubmenu;
	@FindBy(xpath = "(((//div[@class='oxd-grid-item oxd-grid-item--gutters'])[1])//div)//input")
	private WebElement clickonholidayname;
	@FindBy(xpath = "((//div[@class='oxd-grid-item oxd-grid-item--gutters'])[2]//div)[3]")
	private WebElement clickonholidaydate;
	@FindBy(xpath = "(//div[@class='oxd-date-input-calendar']//div)[68]")
	private WebElement pickdate;

	// ************************************************************************************************
	// Action method to click holiday submenu.
	// ************************************************************************************************
	public void clickonholidaysubmenu() {
		stepActions.clickElement(clickonconfiguremenu);
		stepActions.clickElement(clickonholidaysubmenu);
	}

	// ***********************************************************************************************
	// Action method to click Holidayname and set Holidayname
	// ***********************************************************************************************
	public void clickonholidayname(String holidayname) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		clickonholidayname.click();

		stepActions.setDataInTextBox(clickonholidayname, holidayname);
	}

	// ***********************************************************************************************
	// Action method to click Holidaydate,Pickdate
	// ***********************************************************************************************
	public void clickonholidaydate() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		stepActions.clickElement(clickonholidaydate);

		stepActions.clickElement(pickdate);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
	}
}