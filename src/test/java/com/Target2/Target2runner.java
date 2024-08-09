package com.Target2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.baseclass1.copy.BaseClass;
import com.sdp.Target_PageObjectManager;

public class Target2runner extends BaseClass {
	public static WebDriver driver = BaseClass.browserlaunch("chrome");

	public static Target_PageObjectManager tpom = new Target_PageObjectManager(driver);

	public static void main(String[] args) throws IOException {

		getUrl("https://www.target.com/");

		scrollDown(0, 3000);
		scrollDown(0, 3000);
		scrollDown(0, 3000);
		sleep(3000);
		scrollUp(0, -3000);
		scrollUp(0, -3000);
		scrollUp(0, -3000);
		clickOnElement(tpom.getMainPage().getCategories());

		sleep(2000);
		clickOnElement(tpom.getDeals().getDeals());

		sleep(2000);
		clickOnElement(tpom.getDeals().getWeeklyAd());

		sleep(2000);
		scrollDown(0, 2000);
		scrollDown(0, 2000);
		sleep(2000);
		scrollUp(0, -2000);
		scrollUp(0, -2000);

		clickOnElement(tpom.getByCatagory().getBroweByCategory());
		sleep(3000);
		//clickOnElement(tpom.getByCatagory().getOptions());
		//sleep(2000);
		clickOnElement(tpom.getByCatagory().getSchoolAndOfficeSelect());
		sleep(2000);
		clickOnElement(tpom.getByCatagory().getColourPencils());

		clickOnElement(tpom.getByCatagory().getLowestprice());
		sleep(2000);

		
		clickOnElement(tpom.getChekout().getAddToCart());
		sleep(2000);
		clickOnElement(tpom.getChekout().getCheckOut());
		sleep(2000);

		scrollDown(0, 2000);
		sleep(2000);
		scrollUp(0, -2000);
		screenShot("C:\\Users\\Mr.Prem\\eclipse-workspace\\Target2\\ScreenShot\\TargetDeals.png");

		clickOnElement(tpom.getChekout().getDeSelect());
		sleep(2000);

		clickOnElement(tpom.getChekout().getReturnHomePage());
	}

}
