package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.BrowseByCatagory;
import com.pom.CheckOutPage;
import com.pom.Deals_WeeklyAd;
import com.pom.TargetMainPage;

public class Target_PageObjectManager {
	
	public static WebDriver driver;
	
	public Target_PageObjectManager(WebDriver driver1) {
	this.driver=driver1;
}
	
	public TargetMainPage getMainPage() {
		TargetMainPage mp=new TargetMainPage(driver);
		return mp;
		
	}
	public Deals_WeeklyAd getDeals() {
		Deals_WeeklyAd deals=new Deals_WeeklyAd(driver);
		return deals;

	}
	public BrowseByCatagory getByCatagory() {
		BrowseByCatagory byCatagory =new BrowseByCatagory(driver);
		return byCatagory;
	}
	public CheckOutPage getChekout() {
		CheckOutPage checkout=new CheckOutPage(driver);
		return checkout;
	}
}
