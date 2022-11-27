package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	
	public boolean alertMsg(WebElement element) // method to check  whether the alert message showing or not
	{
		return  element.isDisplayed();
	}



}
