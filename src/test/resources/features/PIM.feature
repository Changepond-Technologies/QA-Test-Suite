Feature: Validate the PIM Functionality in OrangeHRM Application

  Background: 
    Given user launch the OrangeHrm application
    And user enters the username and password in the input box and clicks on the login button
    And user enters into dashboard screen

@E2E
  Scenario: Creating new employee with cancel button
    When user clicks on the PIM from the left panel
    And user clicks on the add button
    And user enters into the add employee page
    And user enters the employee first name "Ben" in the inputbox
    And user enters the employee middle name "Ven" in the inputbox
    And user enters the employee last name "Andrew" in the inputbox
    And user enters the employee id in the inputbox
    And user clicks on the cancel button
    Then user navigates to employee information page
@sanity
  Scenario: Creating new employee with save button
    When user clicks on the PIM from the left panel
    And user clicks on the add button
    And user enters into the add employee page
    And user enters the employee first name "Coleman" in the inputbox
    And user enters the employee middle name "Brrok" in the inputbox
    And user enters the employee last name "Oneill" in the inputbox
    And user enters the employee id in the inputbox
    And user clicks on the save button to create user
    And selects the nationality from dropdown
    And user clicks on the save button
    And user clicks on the job from left panel
    And user navigated to job details page
    And user selects the job title "QA Engineer" from the drop down
    And user selects the job category "Technicians" from the drop down
    And user selects the sub unit "Admin" from the drop down
    And user select the location "New York Sales Office" from the drop down
    And user selects the employment status as "Freelance"
    And user clicks the save button
    And user clicks on the PIM from the left panel
    And user navigates to employee information page
    And user enters the employee id in the searchbox
    And user clicks on the search button
    Then user should see the created record in orangehrm table

 @smoke
  Scenario: Creating login details for user
    When user clicks on the PIM from the left panel
    And user clicks on the add button
    And user enters into the add employee page
    And user enters the employee first name {generatedFirstName} in the inputbox
    And user enters the employee middle name {generatedMiddleName} in the inputbox
    And user enters the employee last name {generatedLastName} in the inputbox
    And user enters the employee id in the inputbox
    And user clicks on the toggle button for create login details
    And user enters the username "Greshamwe" in the inputbox
    And user enters the password "Steve@123" in the inputbox
    And user enters the confirm password "Steve@123" in the inputbox
    And user clicks on the save button to create user
   

  Scenario: Activate the terminated employee
    When user clicks on the PIM from the left panel
    And user clicks on the add button
    And user enters into the add employee page
    And user enters the employee first name {generatedFirstName} in the inputbox
    And user enters the employee middle name "Michale" in the inputbox
    And user enters the employee last name "Schopild" in the inputbox
    And user enters the employee id in the inputbox
    And user clicks on the save button to create user
    And selects the nationality from dropdown
    And user clicks on the save button
    And user clicks on the job from left panel
    And user navigated to job details page
    And user selects the job title "QA Engineer" from the drop down
    And user selects the job category "Technicians" from the drop down
    And user selects the sub unit "Admin" from the drop down
    And user select the location "New York Sales Office" from the drop down
    And user selects the employment status as "Freelance"
    And user clicks the save button
    And user clicks on the terminate employment
    And it should open the terminate emploment popup
    And user selects the terminate date from calendar
    And user selects the termination reason from the dropdown
    And user pass the termination notes "personal issue" from the input box
    And user clicks on the save button
    And user should see Activate Employee button
    And user clicks on the Activate Employee button

  Scenario: Add Contact Details For Created Employee
    When user clicks on the PIM from the left panel
    And user search the generated employee Name and ID with following information
      | {generatedFirstName} |
      | {generatedEmpId}     |
    And user clicks on the search button
    And user should the matched row values and clicks on the edit button
    And user clicks on the contact details from left panel
    And user navigated to contact details page
    And user enters the street1 "8333 Sedrick Extensions Apt. 319" in the inputbox
    And user enters the city "Weymouth Town" in the inputbox
    And user enters postal code "53479" in the inputbox
    And user selects the country as "Oman" from the dropdown
    And user enters the mobile "658-054-9936" in the inputbox
    And user enters the email "lina_powlowski@hotmail.com" in the inputbox
    And user clicks on the save button
