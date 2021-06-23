package com.stepdefn;

import com.pageobjectmodel.HomePageLogin;

import cucumber.api.java.en.Then;

public class HomeSteps {
	HomePageLogin homepage= new HomePageLogin();
	@Then("^User is Login valid credentials$")
	public void user_is_Login_valid_credentials() throws Throwable {
		homepage.getHome();
	}	


}
