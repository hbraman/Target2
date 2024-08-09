package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowseByCatagory {
public static WebDriver driver;
	
	public BrowseByCatagory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//span[text()='Browse By Category']")
	private WebElement broweByCategory;
	
	//@FindBy(xpath="//ul[@class='Optionsstyles__StyledSelectCustomOptions-sc-jegzao-0 epxUpS']")
//	private WebElement options;
	
	@FindBy(xpath="//ul[@class='Optionsstyles__StyledSelectCustomOptions-sc-jegzao-0 epxUpS']//div[text()='School & Office Supplies (2)']")
	private WebElement schoolAndOfficeSelect;
	
	@FindBy(xpath="//span[text()='School & Office Supplies']//ancestor::div[@data-test='global-header']//following-sibling::div[@id='weekly-ad-carousel']//descendant::li[@id='page-9']")
	private WebElement colourPencils;
	
	@FindBy(xpath="//div[@data-test='content-wrapper']//span[text()='25¢']")
	private WebElement lowestprice;

	public WebElement getBroweByCategory() {
		return broweByCategory;
	}

	

	//public WebElement getOptions() {
		//return options;
	//}

	

	public WebElement getSchoolAndOfficeSelect() {
		return schoolAndOfficeSelect;
	}

	
	public WebElement getColourPencils() {
		return colourPencils;
	}

	

	public WebElement getLowestprice() {
		return lowestprice;
	}

	
}
