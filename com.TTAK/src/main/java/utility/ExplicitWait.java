package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	
	WebDriverWait w;
	// to wait for an element

	public void waitAttributeContains(WebDriver driver,String locator, String type,String value)
	{
		w=new WebDriverWait(driver, Duration.ofSeconds(4));
		w.until(ExpectedConditions.attributeContains(By.xpath(locator), type, value));
	}

	public void waitPresenceOfElementLocated(WebDriver driver,String locator)
	{
		w=new WebDriverWait(driver, Duration.ofSeconds(30));
		w.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
	}

	public void waitAlertsPresent(WebDriver driver)
	{
		w=new WebDriverWait(driver, Duration.ofSeconds(30));
		w.until(ExpectedConditions.alertIsPresent());
	}

	public void waitElementToBEClickable(WebDriver driver,WebElement element)
	{
		w= new WebDriverWait(driver,Duration.ofSeconds(50));
		w.until(ExpectedConditions.elementToBeClickable(element));


	}

	public void waitElementToBeSelected(WebDriver driver,WebElement element)
	{
		w= new WebDriverWait(driver,Duration.ofSeconds(50));
		w.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	public void waitVisibilityOfElementLocated(WebDriver driver,WebElement element)
	{
		w= new WebDriverWait(driver,Duration.ofSeconds(100));
		w.until(ExpectedConditions.visibilityOf(element));
	}
}
