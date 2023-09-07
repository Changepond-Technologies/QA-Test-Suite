Feature: Validate the Leave Module Functionality in OrangeHRM Application


Background:

    Given user launch the OrangeHrm application
    And user enters the username and password in the input box and clicks on the login button
    And user enters into dashboard screen
    

@period
  Scenario: Configure leave period in leave module.
  
    When user clicks on leave module
    And user selects leave period from configure menu
    And user picks start month 
    And user picks start date
    And user clicks on save button


@type
 Scenario: Configure leave types in leave module.
     
     When user clicks on leave module
    And user selects leave types from configure menu
    And user clicks on add button
    And user enters the name "US-Vacation1" in the inputbox
    And user clicks on leave save button
    
@work    
 Scenario: Configure work week in leave module.    
    
    When user clicks on leave module
    And user selects work week from configure menu
    And user clicks on week save button
    
    
@holiday   
 Scenario: Configure holiday in leave module.    
    
    When user clicks on leave module  
    And user selects holidays from configure menu
    And user clicks on add button
    And user enters the holiday name "Indian's Independence day" in the inputbox
    And user picks holiday date
    And user clicks on save button

@entitlement    
Scenario: Adding leave entitlement to leave module in OrangeHrm website
    
    When user clicks on leave module
    And user selects add entitlements from entitlements menu
    And user enters the employee name "Kiyara Hu" in the inputbox
    And user selects US-Vacation1 from the list
    And user enters the entitlement as "10"
    And user clicks on save button
    And user clicks on confirm button on popup screen

@assign    
Scenario: Adding new assign leave to leave module
    
    When user clicks on leave module
    And user clicks on assign leave menu
    And user enters the employee namee "Kiyara Hu" in the inputbox
    And user selects US-Vacation1 from the lists
    And user picks from date
    And user picks to date
    And user clicks on assign button
 
@approve    
Scenario: Approve the employee leave request
    
    When user clicks on leave module
    And user clicks on leave list menu
    And user selects status as "Scheduled"
    And user clicks on search button
    And user clicks on amber button
    And user clicks on add comment 
    And user enters the comment
    And user click on save button on popup screen
    
@View    
Scenario: View employee leave details
   
    When user clicks on leave module
    And user clicks on leave list menu
    And user selects status as "Scheduled"
    And user clicks on search button
    And user clicks on amber button
    And user clicks on view leave details 
    And user click on back button 
    
@cancel   
Scenario: Cancel the employee leave request
    
    When user clicks on leave module
    And user clicks on leave list menu
    And user selects status as "Scheduled"
    And user clicks on search button
    And user clicks on amber button
    And user clicks on cancel leave 
      
    