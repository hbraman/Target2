package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	
	public static WebDriver driver;
	
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@style='display: inline-block;']//button[text()='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(xpath="//div[@data-test='content-wrapper']//descendant::a[text()='View cart & check out']")
	private WebElement checkOut;
	
	@FindBy(xpath="//button[@data-test='cartItem-deleteBtn']")
	private WebElement deSelect;
	
	@FindBy(xpath="//a[@aria-label='Target home'][1]")
	private WebElement returnHomePage;

	public WebElement getAddToCart() {
		return addToCart;
	}

	

	public WebElement getCheckOut() {
		return checkOut;
	}

	

	public WebElement getDeSelect() {
		return deSelect;
	}

	

	public WebElement getReturnHomePage() {
		return returnHomePage;
	}

	
	

}
