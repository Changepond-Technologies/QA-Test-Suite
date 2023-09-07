package com.ep.cucumber.steps.leave;

import com.ep.cucumber.pages.leave.LeaveCancelPage;
import io.cucumber.java.en.When;
import org.picocontainer.annotations.Inject;

public class LeaveCancelSteps {
	
	@Inject
	LeaveCancelPage cancelPage;
	
	// *******************************************************************************************
	// Step Definition to cancel leave 
	// *******************************************************************************************
	@When("user clicks on cancel leave")
	public void user_clicks_on_cancel_leave() {
	    
		cancelPage.clickoncancelleave();
	}
}