package com.ep.cucumber.steps.common;

import com.ep.cucumber.pages.common.HomePage;
import io.cucumber.java.en.Then;
import org.picocontainer.annotations.Inject;

public class HomeSteps {

	@Inject
	HomePage homePage;

	@Then("user enters into dashboard screen")
	public void user_enters_into_dashboard_screen() {

		homePage.getDashBoardText();
	}
	

}
