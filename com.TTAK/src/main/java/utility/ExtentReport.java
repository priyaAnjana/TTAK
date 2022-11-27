package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReport implements ITestListener {
	
	ExtentSparkReporter report;
	ExtentReports  extent = new ExtentReports();
	ExtentTest test;

	public  void  config()  {

		String path = System.getProperty(("user.dir")+ "\\test-output");
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Automation Result");
		report.config().setDocumentTitle("Test Result");

		  //extent = new ExtentReports();
		extent.attachReporter(report);
		//extent.setSystemInfo("tester","priya");
		

	}
	
	
	
	public void onTestStart(ITestResult result)
	{
		test = extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result)
	{
		test = extent.createTest(result.getMethod().getMethodName());
		test.log(Status.PASS,MarkupHelper.createLabel("Name of the Pssed Test Case is :"+ result.getName(), ExtentColor.GREEN));
	}
	
	public void onTestFailure(ITestResult result)
	{
		test = extent.createTest(result.getMethod().getMethodName());
		test.log(Status.FAIL,MarkupHelper.createLabel("Name of the Failed Test Case is :"+ result.getName(), ExtentColor.RED));

	}
	
	public void onTestSkipped(ITestResult result)
	{
		test = extent.createTest(result.getMethod().getMethodName());
		test.log(Status.SKIP,MarkupHelper.createLabel("Name of the Skipped Test Case is :"+ result.getName(), ExtentColor.YELLOW));
	}
	
	
	
	
	
	public void onFinish(ITestContext context )
	{
//		report.flush();
	}
}

