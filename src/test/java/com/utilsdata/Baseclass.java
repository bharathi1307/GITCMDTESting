package com.utilsdata;

import static com.utilsdata.ConfigUtils.getPropertyByKey;
import static com.utilsdata.ConfigUtils.loadProperties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.utilsdata.ConfigUtils.getPropertyByKey;
import static com.utilsdata.ConfigUtils.loadProperties;
public class Baseclass {
static WebDriver driver;
    public static void initDriver() {
        loadProperties();
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getPropertyByKey("url"));
    }



    public static WebDriver getDriver() {

        if (driver == null ) {
            initDriver();
        }
        return driver;
    }

    public static void tearDown() {
        driver.quit();
        driver = null;
    }
	
	
}
