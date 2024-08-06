package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deals_WeeklyAd {
	
	public static WebDriver driver;
	
	public Deals_WeeklyAd(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Deals']")
	private WebElement deals;
	
	@FindBy(xpath="//span[text()='Weekly Ad']")
	private WebElement weeklyAd;
	
	//getters

	public WebElement getDeals() {
		return deals;
	}

	public WebElement getWeeklyAd() {
		return weeklyAd;
	}


	
	
	
	
	

}
