package baseClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ScreenShotClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClas {

	public WebDriver driver;  // webdriver initialization
	ScreenShotClass sh;

	// property file path 
	public static Properties property;
	public static void readProperty() throws IOException
	{
		property = new Properties();
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\path");
		property.load(fs);
	}
	 @BeforeSuite(alwaysRun=true)
	  public void createReport(final ITestContext testContext) {
		  extentReport.ExtentManager.createInstance().createTest(testContext.getName(), "message");
	  }
	
	@BeforeMethod

	public  void beforeMethod() throws IOException {
		readProperty();
//		System.setProperty(property.getProperty("ChromeSystemProperty"), System.getProperty("user.dir")+property.getProperty("ChromeDriverPath"));// chrome driver path
//		driver= new ChromeDriver();// webdriver object creation
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		driver.get(property.getProperty("url")); // loading application url
		driver.manage().window().maximize();  // window maximizing code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // waits

	}
	
	

	@AfterMethod

	public void afterMethod(ITestResult itr) throws IOException {

		if(itr.getStatus() == ITestResult.FAILURE)
		{
			sh = new ScreenShotClass();
			sh.takeScreenShot(driver, itr.getName());
		}

		driver.close();
	}

}


