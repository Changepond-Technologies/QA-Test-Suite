Feature: Validate the Performance Functionality in OrangeHRM Application

Background:

    Given user launch the OrangeHrm application
    And user enters the username and password in the input box and clicks on the login button
    And user enters into dashboard screen
    
@kpi
  Scenario: Adding KPIs to Performance module.
    
    When user clicks on performance module
    And user selects KPIs from configure menu
    And user clicks on add buttonn
    And user enters the key performance indicator as "Logical thinking"
    And user selects "Software Engineer" from the list
    And user clicks on save buttonn
    Then user should see the kpi page with pop up message as "Success".
    
    
@trackers
  Scenario: Adding Trackers to Performance module.
    
    When user clicks on performance module
    And user selects Trackers from configure menu
    And user clicks on trackers add button
    And user enters the tracker name as "George"
    And user enters the employee name "Kiyara Hu" in the Inputbox
    And user enters the reviewer name "Charlie Carter" in the inputbox
    And user clicks on trackers save button
    Then user should see the tracker page with pop up message as "Success".
    
    
@review    
  Scenario: Adding review to Performance module.
    
    When user clicks on performance module
    And user selects Manage review from manage review menu
    And user clicks on manage review add button
    And user enters the employee namee as "Kiyara Hu" in the inpubox.
    And user enters the supervisor reviewer name
    And user picks review start date
    And user picks review end date
    And user picks due date
    And user clicks on trackers activate button
 
        
    