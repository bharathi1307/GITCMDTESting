package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.utilsdata.Baseclass.getDriver;
import static com.utilsdata.ConfigUtils.getPropertyByKey;

import static com.utilsdata.WebElementUtils.*;

import java.net.PasswordAuthentication;


public class HomePageLogin {
	public HomePageLogin()
	{
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id="email")
	public WebElement emailId;
	@FindBy(id = "passwd")
    private WebElement Enterpassword;
    @FindBy(id = "SubmitLogin")
    private WebElement signInBtn;
    
    
    public void getHome()
    {
    	sendKeysTo(emailId, getPropertyByKey("username"));
    	sendKeysTo(Enterpassword, getPropertyByKey("password"));
    	clickonElement(signInBtn);
    	
    }
}
