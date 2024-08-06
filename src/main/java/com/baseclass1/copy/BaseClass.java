package com.baseclass1.copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static String value;
//1 browselaunch
	public static WebDriver browserlaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (type.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();

		return driver;

	}
//2	geturl
	public static WebDriver getUrl(String url) {
		
		driver.get(url);
		return driver;
		
		
	}
//3	click
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	
	
//4 sendkeys
	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}
//5 dropDown
	public static void alldropdown(WebElement element, String type,String value) {
		
		Select s =new Select(element);
		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("index")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		}
		else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
	}
//6	frames
	public static String frameId(String id) {
		driver.switchTo().frame(id);
		return id;
		}
	public static  int frameIndex(int Index) {
		driver.switchTo().frame(Index);
		return Index;
		}
	public static WebElement fElement(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
		return frameElement;
	}
	public static void defaultContent() {
		driver.switchTo().defaultContent();
		
	}

//7 close
	public void close() {
		driver.close();
	}
//8 quit
	public static void quit() {
		driver.quit();
	}
//9 navigateForward
	public static void navFor() {
		driver.navigate().forward();
	}
//10 navigateBack
	public static void navBack() {
		driver.navigate().back();
	}
//11 navigateRefresh
	public static void navRefresh() {
		driver.navigate().refresh();
	}
//12 navigateTo
	public static void navTo(String url) {
		driver.get(url);
	}
//13 alert
	public static void acceptAlert() {
		Alert ac = driver.switchTo().alert();
		ac.accept();
	}
	public static void dismissAlert() {
		Alert dis = driver.switchTo().alert();
		dis.dismiss();
	}
	public static void sendKeysAlert(String text) {
	  driver.switchTo().alert().sendKeys(text);
	}
	public static String getTextAlert() {
		Alert getTxAl = driver.switchTo().alert();
		return getTxAl.getText();
	}
//14 Is Enable
	public static boolean isEnable(WebElement element) {
		//WebElement element = driver.findElement(locator) ;
		return element.isEnabled();
	}
//15 Is Disable
	public boolean isDisplayed(WebElement element) {
        //WebElement element = driver.findElement(locator);
        return element.isDisplayed();
    }
//16 Is Selected
	public boolean isSelected(WebElement element) {
		//WebElement element = driver.findElement(locator);
		return element.isSelected();
	}
//17 get title
	public static String getPageTitle() {
        return driver.getTitle();
}
//18 get currentUrl
	public static String getcurrentUrl() {
	return	driver.getCurrentUrl();
	}
//19 get Text
	public static String getText(WebElement element) {
		//WebElement element = driver.findElement(locator);
		return element.getText();
	}
//20 get Attribute
	public static String getAttribute(WebElement element,String attribueName) {
	//	WebElement element = driver.findElement(locator);
		return element.getAttribute(attribueName);
	}
//21 is Multiple
	public static boolean isMultible(WebElement element) {
	//	WebElement dropdown = driver.findElement(locator);
		Select select=new Select(element);
		return select.isMultiple();
	}
//22 robot
	
	
	
			
		
//23 wait
	public static void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		}
	public static void explicitWait(By locator, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
	public static void sleep(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} 	
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
//24 scrollup and down
	public static void scrollUp(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy('"+x+"','"+y+"');");
}
	public static void scrollDown(int x,int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy('"+x+"','"+y+"');");
}
	public static void scrollFullDown() {//full page down(Bottom)
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//js.executeScript("window.scrollTo(0,0)");//full page up(Top)
	}
	public static void scrollIntoView(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//WebElement gdpr = driver.findElement(By.xpath("//a[text()='GDPR']"));
		js.executeScript("arguments[0].scrollIntoView();",element);
	}
	public static void jsClick(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//WebElement gdpr = driver.findElement(By.xpath("//a[text()='GDPR']"));
		js.executeScript("arguments[0].click();",element);
	}
//25 window handles	
	public static String getWindowHandle() {
		String getmainWindow = driver.getWindowHandle();
		return getmainWindow;
	}
	public static Set<String> getWindowHandles() {
		Set<String> getAllWindows = driver.getWindowHandles();
		return getAllWindows;
	}
	public static void switchToWindow(String getWindowHandle) {
		TargetLocator switchTo = driver.switchTo();
		switchTo.window(getWindowHandle);
	}
	public static void switchToNewWindow() {
		  String parentHandle = getWindowHandle();
	        Set<String> allHandles = getWindowHandles();
	        
	        for (String handle : allHandles) {
	            if (!handle.equals(parentHandle)) {
	                switchToWindow(handle);
	                break;
	            }
	        }
	}
	
//26 ScreenShot
	public static void screenShot(String filePath) throws IOException {
		TakesScreenshot tss=(TakesScreenshot)driver;
		File source = tss.getScreenshotAs(OutputType.FILE);
		File dest =new File(filePath);
		FileUtils.copyFile(source, dest);
	}
//27 Actions
	
	
	
	
	
	
	
	
	
	
	
	public static void movetoElement(WebElement element) {
		try {
			waituntilElementVisibility(element);
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void waituntilElementVisibility(WebElement element) {
	// TODO Auto-generated method stub
	
}
	public void dragAndDrop(WebElement source, WebElement target) {
		try {
			waituntilElementVisibility(source);
			Actions ac = new Actions(driver);
			ac.dragAndDrop(source, target).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void doubleClick(WebElement element) {
		try {
			waituntilElementVisibility(element);
			Actions ac = new Actions(driver);
			ac.doubleClick(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void contextClick(WebElement element) {
		try {
			waituntilElementVisibility(element);
			Actions ac = new Actions(driver);
			ac.contextClick(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void elementClickusingActions(WebElement element) {
		try {
			Actions ac = new Actions(driver);
			ac.click(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void elementinputValuesusingActions(WebElement element, String value) {
		try {
			Actions ac = new Actions(driver);
			ac.sendKeys(element, value).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}
	
	

	/*	
		public static void click(String element) {
		Actions act =new Actions(driver);
	 	WebElement element1 = driver.findElement(By.xpath(element));
		act.click(element1).build().perform();
}
		
	public static void contextClick(WebElement element2) {
	 Actions act =new Actions(driver);
		//WebElement element2 = driver.findElement(element);
		act.contextClick(element2).build().perform();
	}
	public static void doubleClick(WebElement element3) {
	 Actions act =new Actions(driver);
	//	WebElement element3 = driver.findElement(element);
		act.doubleClick(element3).build().perform();
	}
	public static void moveToElement(WebElement element4) {
	 Actions act =new Actions(driver);
		//WebElement element4 = driver.findElement(element);
		act.moveToElement(element4).build().perform();
	}
	public static void dragAndDrop(WebElement sourceElement, WebElement targetElement) {
	 	Actions act =new Actions(driver);
		//WebElement sourceElement = driver.findElement(sourceLocator);
		//WebElement targetElement = driver.findElement(targetLocator);
		act.dragAndDrop(sourceElement, targetElement).build().perform();
	}*/
//28	radioButton
	//public static boolean radioButton(WebElement rButton) {
     //   WebElement rButton = driver.findElement(locator);
	// rButton.Click();
      //  return rButton.isSelected();
	public static void radioButton(WebElement rButton) {
		
		rButton.click();
	}
//29 get first selected option
	public static String getFirstSelectOption(WebElement dropDown) {
	//	WebElement dropDown = driver.findElement(locator);
		 Select select =new Select(dropDown);
		 WebElement firstOption = select.getFirstSelectedOption();
	     return firstOption.getText();
	}
//30 get all selected options	
	public static List<String> getAllOption(WebElement dropDown) {
	//	WebElement dropdown = driver.findElement(locator);
		Select select = new Select(dropDown);
		List<WebElement> allOpt = select.getOptions();
		List<String> options = new ArrayList<>();
    
		for (WebElement option : allOpt) {
			options.add(option.getText());
    }
		return options;
	}
//31 checkBox
	public static boolean checkBox(WebElement checkElement) {
      //  WebElement checkboxSelect = driver.findElement(locator);
        return checkElement.isSelected();
	}
//32 readData
	
public static String readData(String path,int sheetIndex,int rowIndex,int cellIndex) throws IOException {
	File f= new File(path);
	FileInputStream fis = new FileInputStream(f);
	Workbook wbk=new XSSFWorkbook(fis);
	Sheet sheetAt = wbk.getSheetAt(sheetIndex);
	Row row = sheetAt.getRow(rowIndex);
	Cell cell = row.getCell(cellIndex);
	CellType cellType = cell.getCellType();
	if (cellType.equals(CellType.STRING)) {
		 value = cell.getStringCellValue();
	}
	else if (cellType.equals(CellType.NUMERIC)) {
		double numericValue = cell.getNumericCellValue();
		int data =(int) numericValue;
		value =String.valueOf(data);	
	}
	wbk.close();
	return value;
}


		
	
//33 Read allData	
	public static String readAllData(String path,int sheetIndex) throws IOException {
		File f =new File(path);
		FileInputStream fis =new FileInputStream(f);
		Workbook wbk= new XSSFWorkbook(fis);
		Sheet sheetAt = wbk.getSheetAt(sheetIndex);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j <physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
				else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int data =(int) numericCellValue;
					System.out.println(data);
				} 
				}
				}
					wbk.close();	
					return path;
			
			}
			
		
		
		
		
		
	}
	


