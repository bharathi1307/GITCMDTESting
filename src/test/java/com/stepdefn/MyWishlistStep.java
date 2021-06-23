package com.stepdefn;

import com.pageobjectmodel.MyWishlistPage;

import cucumber.api.java.en.Then;

public class MyWishlistStep {
	MyWishlistPage mywishlist = new MyWishlistPage();
	@Then("^User is in MyWishlistPage Page$")
	public void user_is_in_MyWishlistPage_Page() throws Throwable {
		mywishlist.getwishlistsBtn();
		mywishlist.getLogout();
	}

}
