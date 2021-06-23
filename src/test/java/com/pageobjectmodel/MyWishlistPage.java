package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.utilsdata.Baseclass.getDriver;
import static com.utilsdata.WebElementUtils.*;

public class MyWishlistPage {

	public MyWishlistPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath="//*[text()=\"My wishlists\"]")
	public WebElement wishlistsBtn;
	@FindBy(id="name")
	public WebElement name;
	@FindBy(xpath="//*[text()=\"Save\"]")
	public WebElement saveBtn;

	@FindBy(xpath="(//*[@class=\"replace-2x img-responsive\"])[1]")
	public WebElement img_resp;

	@FindBy(xpath="//*[text()=\"Add to cart\"]")
	public WebElement cartBtn;

	@FindBy(xpath="//*[@class=\"btn btn-default button button-medium\"]")
	public WebElement checkOut;

	@FindBy(className="logout")
	public WebElement logout;

	public void getwishlistsBtn()
	{
		clickonElement(wishlistsBtn);
		sendKeysTo(name, "bharathi.velayudam");
		clickonElement(saveBtn);

	}
	public void getAddcart()
	{
		clickonElement(img_resp);
		clickonElement(cartBtn);
		clickonElement(checkOut);
	}

	public void getLogout()
	{
		clickonElement(logout);
	}
}
