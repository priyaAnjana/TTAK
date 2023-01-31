package utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatePicker 
{

	GeneralUtilities gl = new GeneralUtilities();

	public void selectDate(WebDriver driver,String targetDate,String dateFormate, WebElement currentDate,WebElement prevButton,WebElement nextButton) throws ParseException
	{
		Calendar calendar = Calendar.getInstance();// using calendar class to getting day information
		SimpleDateFormat targetDateFormat = new SimpleDateFormat (dateFormate);// define date format

		targetDateFormat.setLenient(false);// if we enter invalid date it throw an exception
		Date formattedTargetDate =targetDateFormat.parse(targetDate);//// converting date into format
		calendar.setTime(formattedTargetDate);// to get all date information
		// to get date, month and year 
		int targetDay = calendar.get(Calendar.DAY_OF_MONTH);
		int targetMonth = calendar.get(Calendar.MONTH);
		int targetYear = calendar.get(Calendar.YEAR);	

		String actualDate =currentDate.getText();// to get current actual date text - month and year information
		calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));

		int actualMonth = calendar.get(Calendar.MONTH);
		int actualYear = calendar.get(Calendar.YEAR);

		while(targetMonth<actualMonth||targetYear<actualYear)
		{
			prevButton.click();// to click previous button
			actualDate=currentDate.getText();
			calendar.setTime(new SimpleDateFormat("MMM yyy").parse(actualDate));

			actualMonth = calendar.get(Calendar.MONTH);
			actualYear = calendar.get(Calendar.YEAR);

		}

		while(targetMonth>actualMonth||targetYear>actualYear)
		{
			nextButton.click();// next button
			actualDate=currentDate.getText();
			calendar.setTime(new SimpleDateFormat("MMM yyy").parse(actualDate));

			actualMonth = calendar.get(Calendar.MONTH);
			actualYear = calendar.get(Calendar.YEAR);
		}

		// to click date
		driver.findElement(By.xpath(" //table[@class=' table-condensed']//td[@class='day' and text()="+targetDay+"]")).click();

	}}




