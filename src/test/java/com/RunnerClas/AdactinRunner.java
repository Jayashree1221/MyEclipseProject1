package com.RunnerClas;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.AdactinCucumber.Base_Class;
import com.Properties.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\AdactinCucumber\\Adactin.feature",
glue = "com\\StepDefinition",
monochrome = true,
dryRun = false,
strict = true,
plugin= {"pretty",
		"html:AdactinReport",
		"com.cucumber.listener.ExtentCucumberFormatter:AdactinReport/extentReport.html"})


public class AdactinRunner {
	
public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException{
		String browser = FileReaderManager.getInstanceFR().getInstanceCR().getBrowser();
	driver = Base_Class.browserLaunch(browser);
		
		
	}
	@AfterClass
	public static void quitUp(){
		driver.quit();
	}
	

}
