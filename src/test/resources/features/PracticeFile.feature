Feature: Validate the PIM Functionality in OrangeHRM Application

  Background: 
    Given user launch the OrangeHrm application
    And user enters the username and password in the input box and clicks on the login button
    And user enters into dashboard screen

  Scenario: Employee Creation
    When user clicks on the PIM from the left panel
    And user clicks on the add button
    And user enters into the add employee page
    And user enters the employee first name "Ben" in the inputbox
    And user enters the employee middle name "Ven" in the inputbox
    And user enters the employee last name "Andrew" in the inputbox
    And user enters the employee id in the inputbox
    And user clicks on the cancel button
    Then user navigates to employee information page
