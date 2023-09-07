package com.ep.cucumber.steps.pim;

import com.ep.cucumber.pages.pim.PIMPersonalDetailsPage;
import io.cucumber.java.en.Then;
import org.picocontainer.annotations.Inject;

import java.awt.*;

public class PIMPersonalDetailsSteps {

	@Inject
	PIMPersonalDetailsPage personalDetailsPage;
 
	//*******************************************************************************************
    // Step Definition to select nationality 
    //*******************************************************************************************
	@Then("selects the nationality from dropdown")
	public void selects_the_nationality_from_dropdown() throws AWTException {
		personalDetailsPage.selectNationality();
	}
	//*******************************************************************************************
    // Step Definition to click save button
    //*******************************************************************************************
	@Then("user clicks on the save button")
	public void user_clicks_on_the_save_button() {
		personalDetailsPage.selectSaveBtn();
	}
}
