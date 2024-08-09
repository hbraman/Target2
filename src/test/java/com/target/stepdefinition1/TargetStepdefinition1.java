package com.target.stepdefinition1;

import org.openqa.selenium.WebDriver;

import com.baseclass1.copy.BaseClass;
import com.sdp.Target_PageObjectManager;
import com.targettoy.runner.TargetRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TargetStepdefinition1 extends BaseClass{
	
	public static WebDriver driver = TargetRunner.driver;
	public static Target_PageObjectManager tpom= new Target_PageObjectManager(driver);
	
	
	@Given("^the user launches the Target application$")
	public void the_user_launches_the_Target_application() throws Throwable {
		sleep(3000);
		getUrl("https://www.target.com/");
	// driver.get("https://www.target.com/");
	}

	@Then("^the user scrolls to view today's offers on the main page$")
	public void the_user_scrolls_to_view_today_s_offers_on_the_main_page() throws Throwable {
	   scrollDown(0, 3000);
	   scrollDown(0, 3000);
	   scrollDown(0, 3000);
	   sleep(3000);
	   scrollUp(0,-3000);
	   scrollUp(0,-3000);
	   scrollUp(0,-3000);
	   
	clickOnElement(tpom.getMainPage().getCategories());
	}

	@Given("^the user clicks the Deals list button$")
	public void the_user_clicks_the_Deals_list_button() throws Throwable {
	   sleep(2000);
	   clickOnElement(tpom.getDeals().getDeals());
	   
	}

	@When("^the user clicks to select Weekly Ad and navigates to the Weekly Ad page$")
	public void the_user_clicks_to_select_Weekly_Ad_and_navigates_to_the_Weekly_Ad_page() throws Throwable {
	    sleep(2000);
		clickOnElement(tpom.getDeals().getWeeklyAd());
	}

	@Then("^the user scrolls to view the items$")
	public void the_user_scrolls_to_view_the_items() throws Throwable {
		sleep(2000);
		scrollDown(0,2000);
		scrollDown(0,2000);
		sleep(2000);
		scrollUp(0, -2000);
		scrollUp(0, -2000);
	}

	@Given("^the user clicks the Browse by Category drop-down button$")
	public void the_user_clicks_the_Browse_by_Category_drop_down_button() throws Throwable {
	   clickOnElement(tpom.getByCatagory().getBroweByCategory());
	}
	@When("^the user clicks to select School & Office Supplies$")
	public void the_user_clicks_to_select_School_Office_Supplies() throws Throwable {
	   
	   clickOnElement(tpom.getByCatagory().getSchoolAndOfficeSelect());
	   sleep(2000);
	}

	@When("^the user clicks to select the one offer ad and the items list menu opens$")
	public void the_user_clicks_to_select_the_third_offer_ad_and_the_items_list_menu_opens() throws Throwable {
		clickOnElement(tpom.getByCatagory().getColourPencils());
	   sleep(2000);
	}

	@When("^the user clicks to select the lowest-priced color pencils or crayons$")
	public void the_user_clicks_to_select_the_lowest_priced_color_pencils_or_crayons() throws Throwable {
	   // clickOnElement(tpom.getByCatagory().getOptions());
	    sleep(2000);
	    
	    clickOnElement(tpom.getByCatagory().getLowestprice());
	}

	@Then("^the user clicks the Add to Cart button to add the selected item to the checkout page$")
	public void the_user_clicks_the_Add_to_Cart_button_to_add_the_selected_item_to_the_checkout_page() throws Throwable {
	    clickOnElement(tpom.getChekout().getAddToCart());
	    sleep(2000);
	    clickOnElement(tpom.getChekout().getCheckOut());
	    sleep(2000);
	}

	@Given("^the user scrolls to view the checkout page and takes a screenshot$")
	public void the_user_scrolls_to_view_the_checkout_page_and_takes_a_screenshot() throws Throwable {
	   scrollDown(0, 2000);
	   sleep(2000);
	   scrollUp(0, -2000);
	   screenShot("C:\\Users\\Mr.Prem\\eclipse-workspace\\Target2\\ScreenShot\\TargetDeals.png");
	}

	@When("^the user removes the selected items from the cart$")
	public void the_user_removes_the_selected_items_from_the_cart() throws Throwable {
	   clickOnElement(tpom.getChekout().getDeSelect());
	   sleep(2000);
	}

	@Then("^the user clicks the Go to the Homepage button and navigates to the home page$")
	public void the_user_clicks_the_Go_to_the_Homepage_button_and_navigates_to_the_home_page() throws Throwable {
	    clickOnElement(tpom.getChekout().getReturnHomePage());
	}	
	
}
