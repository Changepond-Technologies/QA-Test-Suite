package com.ep.cucumber.pages.pim;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import com.ep.cucumber.dto.DataContext;

import io.cucumber.datatable.DataTable;

public class PIMEmployeeListPage extends PageContext {

	StepActions stepActions;
	DataContext context;

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - PIM - Employee List -
	// - Employee Information Text Block,Employee Id,Name,Search Button and WebTable
	// *******************************************************************************************

	@FindBy(xpath = "//h5[normalize-space()='Employee Information']")
	private WebElement employeeInformation;
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
	private WebElement searchEmpName;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement searchEmpId;
	@FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
	private WebElement searchBtn;
	@FindBy(xpath = "(//div[@role='cell'])[2]")
	private WebElement webTableData;
	@FindBy(xpath = "(//button[@type='button'])[6]")
	private WebElement editBtn;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************

	public PIMEmployeeListPage(TestContext testcontext, StepActions stepActions, DataContext context) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;
		this.context = context;

	}
	// *******************************************************************************************
	// Action method to get Employee Information header
	// *******************************************************************************************

	public String getEmployeeInformationText() {

		String verifyEmployeeInfoTxt = stepActions.getElementText(employeeInformation);

		return verifyEmployeeInfoTxt;

	}

	// *******************************************************************************************
	// Action method to search Employee Id and Name
	// *******************************************************************************************

	public void searchEmpNameAndID(DataTable table) {

		List<String> asList = table.asList();

		String empName = asList.get(0);
		String empId = asList.get(1);

//		if (empName.contains("generatedFirstName")) {
//
//			empName = context.getEmployeeName();
//
//			System.out.println("Employee Name : " + empName);
//
//		} else if (empName.contains("generatedEmpId")) {
//			empId = context.getEmployeeId();
//			System.out.println("Employee Id : " + empId);
//		}

		if (empName.contains("generatedFirstName")) {

		//	empName = context.getEmployeeName();
			  empName = context.valueMap.get("employeeName");

			System.out.println("Employee Name : " + empName);

		}

		stepActions.setDataInTextBox(searchEmpName, empName);

		if (empId.contains("generatedEmpId")) {

			empId = context.getEmployeeId();

			System.out.println("Employee Id : " + empId);
		}

		stepActions.setDataInTextBox(searchEmpId, empId);

//		if (empName.contains("generatedFirstName")) {
//
//			String employeeName = context.getEmployeeName().get();
//
//			stepActions.setDataInTextBox(searchEmpName, employeeName);
//
//		} else if (empId.contains("generatedEmpId")) {
//
//			String employeeName = context.getEmployeeId().get();
//
//			stepActions.setDataInTextBox(searchEmpId, employeeName);
//		}
	}

	 
	public void searchGenaratedEmpNameAndID(DataTable table) {

		List<String> asList = table.asList();

		String empName = asList.get(0);
		String empId = asList.get(1);

		stepActions.setDataInTextBox(searchEmpName, empName);

		stepActions.setDataInTextBox(searchEmpId, empId);
	}

	public void searchEmpId() {

//		System.out.println("Search Id : " + context.getEmployeeId());
//
//		stepActions.setDataInTextBox(searchEmpId, context.getEmployeeId());

	}

	public void searchEmpName() {

		//System.out.println("Search Name : " + context.getEmployeeName());
		
		System.out.println("Search Name : " + context.valueMap.get("employeeName"));

		String employeeName = context.valueMap.get("employeeName");

		stepActions.setDataInTextBox(searchEmpName, employeeName);

	}

	// *******************************************************************************************
	// Action method to click Search Button
	// *******************************************************************************************

	public void clickSearchBtn() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		searchBtn.click();
	}

	// *******************************************************************************************
	// Action method to Verify the Web table Data
	// *******************************************************************************************

 
	public void verifyTableData() {

		String empId = webTableData.getText();

		System.out.println(webTableData.getText());

		// Assert.assertEquals(empId, context.getEmployeeId());
	}
	
 

	public void clickEditBtn() {

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		editBtn.click();
	}
}
