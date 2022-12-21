package utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.apache.commons.math3.ode.events.EventHandler.Action;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {

	public void clickElement(WebElement element) // method to click an element
	{
		element.click();
	}

	public String getText(WebElement element) // method to get text
	{
		return element.getText();
	}

	public void typeText(WebElement element, String text) // method to input data
	{
		element.sendKeys(text);
	}

	public String getUrl(WebDriver driver) // method to get url
	{
		return driver.getCurrentUrl();
	}

//	public boolean alertMsg(WebElement element) // method to check  whether the alert message showing or not
//	{
//		return  element.isDisplayed();
//	}


	// method to select value from a drop down
	public void dropdownSelectByIndex(WebElement element, int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	// method to check element displayed or not
	public boolean isDisplayedMethod(WebElement element)
	{
		return element.isDisplayed();
	}

	// method to scrolling the window up to an element

	public void javaScriptEecutorForSrolling(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);


	}

	// robot class method to upload a file

	public void robortCalssForFileUploading(String path) throws AWTException
	{
		Robot rb = new Robot();

		StringSelection str = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		rb.keyPress(KeyEvent .VK_CONTROL);
		rb.keyPress(KeyEvent .VK_V);

		rb.keyRelease(KeyEvent .VK_CONTROL);
		rb.keyRelease(KeyEvent .VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

	// method to select date from date picker using java script executor

	public void javascriptExecutorForDatePicker(WebDriver driver, WebElement element,String date) {

		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
	}

	// method to click alert msg



	public void javaScriptExecutorForClick(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public void iframeHandle(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
	}

	public void switchToAlertPopup(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	public void actionClassToClikEnter(WebDriver driver )
	{
		Actions action = new Actions(driver);
		action.sendKeys( Keys.ENTER);
	}
	public void clikEnterkeys(WebElement element)
	{
		element.sendKeys(Keys.ENTER);
	}
	public void threadSleepWait() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	public void clearFields(WebElement element)
	{
		element.clear();
	}

}






