package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.utilsdata.Baseclass.getDriver;

import java.io.IOException;

import static com.utilsdata.WebElementUtils.clickonElement;

public class LoginPage  {
	public  LoginPage()
	{
		PageFactory.initElements(getDriver(),this);
	}
	
	@FindBy(className="login")
	public WebElement signInbtn;
	
	
	public WebElement getSignInbtn() {
		clickonElement(signInbtn);
		return signInbtn;
	}
	
	
}
