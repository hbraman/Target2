package com.targettoy.runner;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.baseclass1.copy.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\targetDeal\\feature\\Target.feature1",
glue="com.target.stepdefinition1",
monochrome=true,
dryRun= false,
strict=true,
plugin = {"html:Reports/Html_Reports","pretty","json:Reports/Json_Reports.json",
"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extend_Report.html"})

public class TargetRunner1  {
	public static WebDriver driver;
	
	@BeforeClass
	public static void targetSetup() {
		
		//driver = browserlaunch("chrome");
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
	}
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
	

	
}
