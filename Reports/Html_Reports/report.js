$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/targetDeal/feature/Target.feature1");
formatter.feature({
  "line": 1,
  "name": "User Login to Target Website and Buy an Item on Weekly Offer",
  "description": "",
  "id": "user-login-to-target-website-and-buy-an-item-on-weekly-offer",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User logs in to the Target Web Application",
  "description": "",
  "id": "user-login-to-target-website-and-buy-an-item-on-weekly-offer;user-logs-in-to-the-target-web-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the user launches the Target application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user scrolls to view today\u0027s offers on the main page",
  "keyword": "Then "
});
formatter.match({
  "location": "TargetStepdefinition1.the_user_launches_the_Target_application()"
});
formatter.result({
  "duration": 623077597,
  "error_message": "java.lang.NullPointerException\r\n\tat com.target.stepdefinition1.TargetStepdefinition1.the_user_launches_the_Target_application(TargetStepdefinition1.java:23)\r\n\tat ✽.Given the user launches the Target application(src/test/java/com/targetDeal/feature/Target.feature1:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TargetStepdefinition1.the_user_scrolls_to_view_today_s_offers_on_the_main_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 7,
  "name": "User clicks Deals button and selects Weekly Ad",
  "description": "",
  "id": "user-login-to-target-website-and-buy-an-item-on-weekly-offer;user-clicks-deals-button-and-selects-weekly-ad",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "the user clicks the Deals list button",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the user clicks to select Weekly Ad and navigates to the Weekly Ad page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the user scrolls to view the items",
  "keyword": "Then "
});
formatter.match({
  "location": "TargetStepdefinition1.the_user_clicks_the_Deals_list_button()"
});
formatter.result({
  "duration": 2057590751,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy22.click(Unknown Source)\r\n\tat com.baseclass1.copy.BaseClass.clickOnElement(BaseClass.java:67)\r\n\tat com.target.stepdefinition1.TargetStepdefinition1.the_user_clicks_the_Deals_list_button(TargetStepdefinition1.java:41)\r\n\tat ✽.Given the user clicks the Deals list button(src/test/java/com/targetDeal/feature/Target.feature1:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TargetStepdefinition1.the_user_clicks_to_select_Weekly_Ad_and_navigates_to_the_Weekly_Ad_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TargetStepdefinition1.the_user_scrolls_to_view_the_items()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 12,
  "name": "User clicks Browse by Category and selects School \u0026 Office Supplies",
  "description": "",
  "id": "user-login-to-target-website-and-buy-an-item-on-weekly-offer;user-clicks-browse-by-category-and-selects-school-\u0026-office-supplies",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "the user clicks the Browse by Category drop-down button",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "the user clicks to select School \u0026 Office Supplies",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the user clicks to select the one offer ad and the items list menu opens",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "the user clicks to select the lowest-priced color pencils or crayons",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the user clicks the Add to Cart button to add the selected item to the checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "TargetStepdefinition1.the_user_clicks_the_Browse_by_Category_drop_down_button()"
});
formatter.result({
  "duration": 12705236,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy22.click(Unknown Source)\r\n\tat com.baseclass1.copy.BaseClass.clickOnElement(BaseClass.java:67)\r\n\tat com.target.stepdefinition1.TargetStepdefinition1.the_user_clicks_the_Browse_by_Category_drop_down_button(TargetStepdefinition1.java:63)\r\n\tat ✽.Given the user clicks the Browse by Category drop-down button(src/test/java/com/targetDeal/feature/Target.feature1:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TargetStepdefinition1.the_user_clicks_to_select_School_Office_Supplies()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TargetStepdefinition1.the_user_clicks_to_select_the_third_offer_ad_and_the_items_list_menu_opens()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TargetStepdefinition1.the_user_clicks_to_select_the_lowest_priced_color_pencils_or_crayons()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TargetStepdefinition1.the_user_clicks_the_Add_to_Cart_button_to_add_the_selected_item_to_the_checkout_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 19,
  "name": "Take a screenshot and remove items from the cart",
  "description": "",
  "id": "user-login-to-target-website-and-buy-an-item-on-weekly-offer;take-a-screenshot-and-remove-items-from-the-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "the user scrolls to view the checkout page and takes a screenshot",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "the user removes the selected items from the cart",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "the user clicks the Go to the Homepage button and navigates to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "TargetStepdefinition1.the_user_scrolls_to_view_the_checkout_page_and_takes_a_screenshot()"
});
formatter.result({
  "duration": 2257408,
  "error_message": "java.lang.NullPointerException\r\n\tat com.baseclass1.copy.BaseClass.scrollDown(BaseClass.java:217)\r\n\tat com.target.stepdefinition1.TargetStepdefinition1.the_user_scrolls_to_view_the_checkout_page_and_takes_a_screenshot(TargetStepdefinition1.java:94)\r\n\tat ✽.Given the user scrolls to view the checkout page and takes a screenshot(src/test/java/com/targetDeal/feature/Target.feature1:20)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TargetStepdefinition1.the_user_removes_the_selected_items_from_the_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TargetStepdefinition1.the_user_clicks_the_Go_to_the_Homepage_button_and_navigates_to_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
});