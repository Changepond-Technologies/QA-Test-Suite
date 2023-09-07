package com.ep.cucumber.pages.leave;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LeaveApprovePage extends PageContext {

	StepActions stepActions;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************
	public LeaveApprovePage(TestContext testcontext, StepActions stepActions) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;

	}

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - Leave - Leave List Tab - Leave List
	// Page
	// Show Leave With Status,Search Button,Row Count,Status,Comments
	// *******************************************************************************************
	@FindBy(xpath = "//div[@class='oxd-topbar-body']//li[6]")
	private WebElement clickonleavelistmenu;
	@FindBy(xpath = "//div[@class='oxd-table-filter']//div[@class='oxd-multiselect-chips-area']//i")
	private WebElement removependingapproval;
	@FindBy(xpath = "((//div[@class='oxd-grid-item oxd-grid-item--gutters'])[3]//div)[5]")
	private WebElement clickonshowleavewithstatus;
	@FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']//div")
	private List<WebElement> selectstatus;
	@FindBy(xpath = "(//div[@class='oxd-form-actions']//button)[2]")
	private WebElement clickonsearchbutton;
	@FindBy(xpath = "//div[@class='orangehrm-container']")
	private WebElement scrollupwebtable;
	@FindBy(xpath = "//div[@class='orangehrm-container']//div[@class='oxd-table-body']")
	private WebElement rowcount;
	@FindBy(xpath = "(//div[@class='orangehrm-container']//div[@class='oxd-table-body']//div)[16]")
	private WebElement status;
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li")
	private List<WebElement> amberoptions;
	@FindBy(xpath = "(//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white oxd-dialog-sheet oxd-dialog-sheet--shadow oxd-dialog-sheet--gutters orangehrm-dialog-modal']//div)[6]//textarea")
	private WebElement addcomment;
	// *******************************************************************************************
	// Page Elements declaration - Left Menu - Leave - Leave List Tab - Leave List
	// Page
	// Save Button,Amber Button
	// *******************************************************************************************
	@FindBy(xpath = "(//div[@class='oxd-form-actions'])[2]//button[2]")
	private WebElement clickonsavebutton;
	@FindBy(xpath = "(//div[@class='oxd-table-card']//div)[20]//button")
	private WebElement clickonamberbutton;

	// *******************************************************************************************
	// Action method to click leave list menu and remove pending approval
	// *******************************************************************************************
	public void clickonleavelistmenu() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		stepActions.clickElement(clickonleavelistmenu);

		removependingapproval.click();

	}

	// *******************************************************************************************
	// Action method to click show leave wit status and select status
	// *******************************************************************************************
	public void clickonshowleavewithstatus(String status) {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		clickonshowleavewithstatus.click();

		stepActions.selectFromDropDown(selectstatus, status);

	}

	// *******************************************************************************************
	// Action method to click show leave wit status and select status
	// *******************************************************************************************
	public void clickonsearchbutton() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		clickonsearchbutton.click();

	}

	// *******************************************************************************************
	// Action method to click amber button
	// *******************************************************************************************
	public void clickonamberbutton() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}

	// *******************************************************************************************
	// Action method to get the text and click amber button
	// *******************************************************************************************
	public void Leaveapproval() {

		String s1 = status.getText();

		System.out.println("string :" + s1);

		if (s1.contains("Schedule")) {

			clickonamberbutton.click();

			try {
				Thread.sleep(9000);
			} catch (InterruptedException e) {

				e.printStackTrace();

			}

		}

	}

	// *******************************************************************************************
	// Action method to select add comment
	// *******************************************************************************************
	public void clickokaddcomment() {

		stepActions.selectFromDropDown(amberoptions, "Add Comment");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}

	// *******************************************************************************************
	// Action method to enter comments
	// *******************************************************************************************
	public void entercomment() {

		stepActions.setDataInTextBox(addcomment, "Approved");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}

	// *******************************************************************************************
	// Action method to click save buuton
	// *******************************************************************************************
	public void clickonassisgnsavebutton() {

		clickonsavebutton.click();

	}

}