package com.ep.cucumber.steps.common;

import com.ep.cucumber.pages.common.LoginPage;
import io.cucumber.java.en.Given;
import org.picocontainer.annotations.Inject;

public class LoginSteps {

	@Inject
	LoginPage loginPage;

	@Given("user enters the username and password in the input box and clicks on the login button")
	public void user_enters_the_username_and_password_in_the_input_box_and_clicks_on_the_login_button() {

		loginPage.userName();
		loginPage.password();
		loginPage.clickLoginButtonn();

	}

}
