package com.ep.cucumber.pages.common;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.base.PageContext;
import com.ep.cucumber.base.TestContext;
import com.ep.cucumber.utils.RunConfig;
import com.ep.cucumber.utils.RunConstants;

public class ApplicationPage extends PageContext {

	StepActions stepActions;

	// *******************************************************************************************
	// Constructor - initialize page elements
	// instantiate step actions to use the reusable methods to perform actions.
	// *******************************************************************************************

	public ApplicationPage(TestContext testcontext, StepActions stepActions) {
		super(testcontext.webDriver);
		this.stepActions = stepActions;
	}

	// *******************************************************************************************
	// Action method to Launch URL.
	// *******************************************************************************************
	public void goToApplication() {
		String url = RunConfig.getConfigProperty("url", RunConstants.RUN_CONFIG_LOCATION);
		stepActions.launchApplication(url);
	}
}
