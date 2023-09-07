Feature: Validate the PIM Functionality in OrangeHRM Application

  Background: 
    Given user launch the OrangeHrm application
    And user enters the username and password in the input box and clicks on the login button
    And user enters into dashboard screen
 
@smoke
  Scenario: Terminate employee
    When user clicks on the PIM from the left panel
    And user search the employee with following information
      | {generatedFirstName} |
      | {generatedEmpId}     |
    And user clicks on the search button
    And user should the matched row values and clicks on the edit button
    And user clicks on the job from left panel
    And user navigated to job details page
    And user clicks on the terminate employment
    And it should open the terminate emploment popup
    And user selects the terminate date from calendar
    And user selects the termination reason from the dropdown
    And user pass the termination notes "personal issue" from the input box
 
