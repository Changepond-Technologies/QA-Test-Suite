package com.ep.cucumber.steps.common;

import com.ep.cucumber.pages.common.ApplicationPage;
import io.cucumber.java.en.Given;
import org.picocontainer.annotations.Inject;

public class ApplicationSteps {

	@Inject
	ApplicationPage applicationPage;

	@Given("user launch the OrangeHrm application")
	public void user_launch_the_orange_hrm_application() {

		applicationPage.goToApplication();
	}

}
