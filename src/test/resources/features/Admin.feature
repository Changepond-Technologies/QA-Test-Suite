Feature: Validate adding new user to Admin module in OrangeHrm website

  Background: 
    Given user launch the OrangeHrm application
    And user enters the username and password in the input box and clicks on the login button
    And user enters into dashboard screen

  @admin
  Scenario: Adding new user to Admin module in OrangeHrm website
    When user clicks admin button in home page
    And user clicks Add button from User management tab
    And user clicks user role dropdown
    And user selects the user role as "Admin"
    And user enters Employee name "John Smith" in the inputBox
    And user selects Employee name "John Smith" from the list
    And user clicks status dropdown
    And user enters Username "Admin3" in the  username inputBox
    And user enters password "admin123" in the inputBox
    And user enters confirm password "admin123" in the inputBox
    And user clicks save button

  @location
  Scenario: Adding user location to Admin module in OrangeHrm website
    When user clicks admin button in home page
    And user selects locations from organization dropdown
    And user clicks Add button from location tab
    And user enters Employee name "John Smith" in the inputBox
    And user enters City name "California" in the inputBox
    And user enters Zip code "9001" in the inputBox
    And user enters Phone number "9003801722" in the inputBox
    And user enters Address "5396 North Reese Avenue, Fresno CA 93722" in the inputBox
    And user enters State "Silicon Valley" in the inputBox
    And user clicks Country dropdown
    And user selects Country name  as "United States"
    And user enters Fax number "888-635-0494" in the inputBox
    And user enters notes in the inputBox

  @workshift
  Scenario: Adding work shift to employees
    When user clicks admin button in home page
    And user selects work shifts from job dropdown
    And user clicks Add button
    And user enters Shift name "General Shift" in the inputBox
    And user enters Assigned Employee name "Peter" in the inputBox
    And user selects Assigned Employee name "Peter" from the list
    And user clicks save button
