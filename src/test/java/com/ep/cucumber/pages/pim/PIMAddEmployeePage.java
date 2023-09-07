package com.ep.cucumber.pages.pim;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import com.ep.cucumber.dto.DataContext;

public class PIMAddEmployeePage extends PageContext {

	StepActions stepActions;
	DataContext dataContext;

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - PIM
	// - Add Employee Text Block and Add User Button
	// *******************************************************************************************

	@FindBy(xpath = "//a[normalize-space()='Add Employee']")
	private WebElement addUser;
	@FindBy(xpath = "//h6[text()='Add Employee']")
	private WebElement addEmpText;

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - PIM
	// - First, Middle, Last Name
	// *******************************************************************************************
	@FindBy(name = "firstName")
	private WebElement firstName;
	@FindBy(name = "middleName")
	private WebElement middleName;
	@FindBy(name = "lastName")
	private WebElement lastName;
	@FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private WebElement employeeId;
	// *******************************************************************************************
	// Page Elements declaration - Left Menu - PIM
	// - Save and Cancel Button
	// *******************************************************************************************

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveBtn;
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement cancelButton;

	// *******************************************************************************************
	// Page Elements declaration - Left Menu - PIM
	// - Create Login Details Toggle, UserName, Passwor and Confirm Password
	// *******************************************************************************************

	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	private WebElement createLoginDetailsToggle;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	private WebElement userName;
	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement password;
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement confirmPassword;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************

	public PIMAddEmployeePage(TestContext testContext, StepActions stepActions, DataContext dataContext) {
		super(testContext.webDriver);
		this.dataContext = dataContext;
		this.stepActions = stepActions;

	}

	// *******************************************************************************************
	// Action method to click add user button.
	// *******************************************************************************************

	public void clickAddUser() {

		stepActions.clickElement(addUser);

		// addUser.getShadowRoot();
	}

	// *******************************************************************************************
	// Action method to get Add Employee dialog header.
	// *******************************************************************************************

	public String getAddEmpText() {
		String VerifyAddEmpTxt = stepActions.getElementText(addEmpText);
		return VerifyAddEmpTxt;
	}

	// *******************************************************************************************
	// Action method to Set Employee Random Generated Employee Name.
	// *******************************************************************************************

	public void setGeneratedEmpName() {

		String generateRandomName = stepActions.generateRandomString(5);

		// dataContext.setEmployeeName(generateRandomName);

		// dataContext.setEmployeeName(generateRandomName);
		dataContext.valueMap.put("employeeName", generateRandomName);

		System.out.println("Generated Employee Name : " + generateRandomName);

		stepActions.setDataInTextBox(firstName, generateRandomName);
	}

	public void setGeneratedMiddleName() {
		String generateRandomName = stepActions.generateRandomString(3);
		stepActions.setDataInTextBox(middleName, generateRandomName);
	}

	public void setGeneratedLastName() {

		String generateRandomName = stepActions.generateRandomString(1);
		stepActions.setDataInTextBox(lastName, generateRandomName);
	}
	// *******************************************************************************************
	// Action method to set Employee First,Middle,Last Name and Employee Id.
	// *******************************************************************************************

	public void setEmpFirstName(String firstNameTxt) {
		stepActions.setDataInTextBox(firstName, firstNameTxt);
	}

	public void setEmpMiddleName(String middleNameTxt) {
		stepActions.setDataInTextBox(middleName, middleNameTxt);
	}

	public void setEmpLastName(String lastNameTxt) {
		stepActions.setDataInTextBox(lastName, lastNameTxt);
	}

	public void setEmpId() {

		String empId = employeeId.getAttribute("value");

		// dataContext.setEmployeeId(empId);
		dataContext.valueMap.put("employeeId", empId);

		System.out.println("Employee Id : " + empId);

	}

	// *******************************************************************************************
	// Action method to Save and Cancel the New Employee.
	// *******************************************************************************************

	public void clickCancelButton() {

		stepActions.clickElement(cancelButton);

	}

	public void clickSaveBtn() {

		// String empName = dataContext.getEmployeeName().get();
		stepActions.clickElement(saveBtn);
	}

	// *******************************************************************************************
	// Action method to click on create Login Details
	// *******************************************************************************************

	public void createLoginDetailsToggle() {

		stepActions.checkElementVisibility(createLoginDetailsToggle);

		stepActions.clickElement(createLoginDetailsToggle);

	}

	// *******************************************************************************************
	// Action method to set user name, password and confirm password
	// *******************************************************************************************

	public void setUserNameDetails() {

		String user = stepActions.generateRandomString(6);

		stepActions.setDataInTextBox(userName, user);
	}

	public void setPassword(String pass) {
		stepActions.setDataInTextBox(password, pass);
	}

	public void setConfirmPassword(String confirmPass) {
		stepActions.setDataInTextBox(confirmPassword, confirmPass);
	}

	public void enterNameInInputBox() {

//		stepActions.setDataInTextBox(firstName, constants.Steve.toString());
//		stepActions.setDataInTextBox(firstName, constants.Mike.toString());
//		stepActions.setDataInTextBox(firstName, constants.Jhon.toString());

	}

}
