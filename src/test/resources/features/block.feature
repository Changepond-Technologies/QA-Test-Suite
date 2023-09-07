Feature: Validate the Block sub-menu under General Master

  Background: 
    Given user launch the WAIS application
    And user enters the username "Superadmin" in the inputBox
    And user enters the password "Welcome@123" in the inputBox
    And user clicks on the login button
    When user click on general master module
    And user click on locations menu
    And user click on block sub-menu

  @smoke
  Scenario: Validate the Block sub-menu
    And user enters the {generatedBlockCode} in block code
    And user enters the {generatedBlockName} in block name
    And user enter the shortname "Steve" in the inputbox
    Then user click on save button
    And user enters the following values
    |{generatedBlockCode}|
    |{generatedBlockName}|
    
    