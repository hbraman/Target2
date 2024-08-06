package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TargetMainPage {
	
	public static WebDriver driver;
	
	public TargetMainPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@aria-label='Categories']")
	private WebElement categories ;
//getters

	public WebElement getCategories() {
		return categories;
	}


	
	

	
	
	

}
