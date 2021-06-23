package com.utilsdata;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.utilsdata.Baseclass.driver;

public class WebElementUtils {
	 static Long timeout = Long.parseLong("30");
	    static WebDriverWait wait = new WebDriverWait(driver, timeout);

	public static void waitForVisible(WebElement element)
	{
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void clickonElement(WebElement element)
	{
		waitForVisible(element);
		element.click();
	}

	public static void sendKeysTo(WebElement element,String keys)
	{
		waitForVisible(element);
		element.clear();
		element.sendKeys(keys);
	}
	
}
