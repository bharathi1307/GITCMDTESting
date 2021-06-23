package com.stepdefn;

import com.pageobjectmodel.LoginPage;

import cucumber.api.java.en.Given;

public class LoginSteps {
	LoginPage loginpage =new LoginPage();
	
	@Given("^User is on HomePage of the application$")
	public void user_is_on_HomePage_of_the_application() throws Throwable {
		loginpage.getSignInbtn();
	}

}
