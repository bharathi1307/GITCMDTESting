package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report",
"json:target/cucumber.json"},glue="com.stepdefn",dryRun = false,
monochrome=true,features="C:\\Users\\BHARATHI_V\\eclipse-workspace\\MyStoreProject\\Feature\\store.feature")
public class testRunner {

}
