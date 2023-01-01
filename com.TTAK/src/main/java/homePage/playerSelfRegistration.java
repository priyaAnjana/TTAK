package homePage;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelReadClass;
import utility.ExplicitWait;
import utility.GeneralUtilities;

public class playerSelfRegistration {
	WebDriver driver;
	GeneralUtilities gl= new GeneralUtilities();


	ExcelReadClass erc = new ExcelReadClass();
	ExplicitWait ew = new ExplicitWait();

	public playerSelfRegistration(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="players")
	WebElement players;

	@FindBy(xpath="//a[text()='Player Registration']")
	WebElement playerRegistration;

	@FindBy(id="txtfirstname")
	WebElement firatName;

	@FindBy(id="txtlastname")
	WebElement lastName;

	@FindBy(id="txtFatherName")
	WebElement fatherName;

	@FindBy(id="txtMotherName")
	WebElement motherName;

	@FindBy(id="txtemailid")
	WebElement emailId;

	@FindBy(id="txtdob")
	WebElement dateOfBirth;

	@FindBy(id="txtcontactno1")
	WebElement contactNo1;

	@FindBy(id="txtcontactno2")
	WebElement contactNo2;

	@FindBy(id="ddlgender")
	WebElement gender;

	@FindBy(id="ddldistrict")
	WebElement district;

	@FindBy(id="ddlBloodGroup")
	WebElement bloodGroup;

	@FindBy(id="txtbaiid")
	WebElement ttfiId;

	@FindBy(id="txtaddress")
	WebElement address;

	@FindBy(id="txtaadharno")
	WebElement adhaarNum;

	@FindBy(id="ddlClub")
	WebElement club1;

	@FindBy(id="txtbirthplace")
	WebElement birthPlace;

	@FindBy(id="ddlClub2")
	WebElement club2;

	@FindBy(id="ddldoctype")
	WebElement documentType;

	@FindBy(xpath="//input[@id='customFile']")
	WebElement uploadDocument;

	@FindBy(id="txtIName")
	WebElement institutionName;

	@FindBy(id="txtIAddress")
	WebElement institutionAddress;

	@FindBy(id="txtICourse")
	WebElement course;

	@FindBy(id="txtPassportNo")
	WebElement passport;

	@FindBy(id="txtIssueDate")
	WebElement passportIssueDate;

	@FindBy(id="txtValidDate")
	WebElement passportValidDate;

	@FindBy(id="txtIPlace")
	WebElement placeOfIssue;

	@FindBy(id="playerimg")
	WebElement playerImage;

	@FindBy(id = "btnSave")
	WebElement register;

	@FindBy(xpath="//input[@id='contact']")
	WebElement pHNUmberForPayMent;

	@FindBy(xpath="//iframe[@class='razorpay-checkout-frame']")
	WebElement iframePaymentGateWay;

	@FindBy(xpath="//button[@id='redesign-v15-cta']")
	WebElement proceedButton;
	
	@FindBy(xpath="(//div[@class='stack svelte-by96ls horizontal'])[3]")
	WebElement netBankingPayment;
	
	@FindBy(xpath="(//label[@class='radio-label mfix'])[1]")
	WebElement sbiBank;
	
	@FindBy(xpath="//button[@id='redesign-v15-cta']")
	WebElement payNowButton;
	
	@FindBy(xpath = "//button[@class='success']")
	WebElement successButton;
	
	@FindBy (xpath = "//span[text()='Players']")
	WebElement playerText;

	public void clickOnPlayers()
	{
		gl.clickElement(players);
	}

	public void clickOnPlayerRegistration()
	{
		gl.clickElement(playerRegistration);
	}

	public void enterFirstName(String name)
	{
		gl.typeText(firatName, name);
	}

	public void enterLastName(String name)
	{
		gl.typeText(lastName, name);
	}

	public void enterFatherName(String name)
	{
		gl.typeText(fatherName, name);
	}

	public void enterMotherName(String name)
	{
		gl.typeText(motherName, name);
	}

	public void enterEmailId(String mail)
	{
		gl.typeText(emailId, mail);
	}

	public void clickOnDateOfBirth()
	{
		gl.clickElement(dateOfBirth);
	}

	public void enterDateOfBirth(String dob)
	{
		gl.javascriptExecutorForDatePicker(driver, dateOfBirth, dob);
	}

	public void enterContactNo1(String num)
	{
		gl.typeText(contactNo1, num);
	}

	public void enterContactNo2(String num)
	{
		gl.typeText(contactNo2, num);
	}

	public void clickOnGender()
	{
		gl.clickElement(gender);
	}
	public void enterGender(String text)
	{
		gl.selectClass(gender, text);
	}

	public void clickOnDistrict()
	{
		gl.clickElement(district);
	}

	public void enterDistrict(String dis)
	{
		gl.selectClass(district, dis);
	}

	public void clickOnBloodGroup()
	{
		gl.clickElement(bloodGroup);
	}

	public void enterBloodGroup(String blood)
	{
		gl.selectClass(bloodGroup, blood);
	}

	public void enterTtfiId(String id)
	{
		gl.typeText(ttfiId, id);
	}

	public void enterAddress(String add)
	{
		gl.typeText(address, add);
	}

	public void enterAdhaarNum(String adhaar)
	{
		gl.typeText(adhaarNum, adhaar);
	}

	public void clickOnClub1()
	{
		gl.clickElement(club1);
	}

	public void enterClub1(String club)
	{
		gl.selectClass(club1, club);
	}

	public void enterPlaceOfBirth(String place)
	{
		gl.typeText(birthPlace, place);
	}

	public void clickOnClub2()
	{
		gl.clickElement(club2);
	}

	public void enterClub2(String club)
	{
		gl.selectClass(club2, club);
	}

	public void clickOnDocumentsType()
	{
		gl.clickElement(documentType);
	}

	public void enterDocumentsType(String doc)
	{
		gl.selectClass(documentType, doc);
	}

	public void clickOnUploadDocuments()
	{

		gl.javaScriptExecutorForClick(driver, uploadDocument);
	}

	public void uploadDocuments(String doc) throws AWTException
	{
		gl.robortCalssForFileUploading(doc);

	}

	public void enterName(String name)
	{
		gl.typeText(institutionName, name);
	}

	public void enterInstitutionAddress(String address)
	{
		gl.typeText(institutionAddress, address);
	}

	public void enterCourse(String courseName)
	{
		gl.typeText(course, courseName);
	}

	public void enterPasspoertNumber(String passportNum)
	{
		gl.typeText(passport, passportNum);
	}

	public void clickOnPassportIssueDate()
	{
		gl.clickElement(passportIssueDate);
	}

	public void enterPassportIssueDate(String date)
	{
		gl.javascriptExecutorForDatePicker(driver, passportIssueDate, date);
	}

	public void clickOnPassportValidDate()
	{
		gl.clickElement(passportValidDate);
	}

	public void enterPassportValidDate(String passportValid)
	{
		gl.javascriptExecutorForDatePicker(driver, passportValidDate, passportValid);
	}

	public void enterPlaceOfIssue(String place)
	{
		gl.typeText(placeOfIssue, place);
	}

	public void clickOnPlayerImage()
	{
		gl.javaScriptExecutorForClick(driver, playerImage);
	}

	public void uploadPlayerImage(String image) throws AWTException
	{
		gl.robortCalssForFileUploading(image);
	}

	public void explicitWaitForRegsterButton()
	{
		ew.waitElementToBEClickable(driver, register);
	}
	public void clickOnRegisterButton()
	{
		gl.javaScriptExecutorForClick(driver, register);
	}

	public String readData(int r, int c) throws IOException // method to read user name from excel sheet
	{
		return erc.readStringData(r, c);
	}
	public String readIntegerData(int r, int c) throws IOException // method to read user name from excel sheet
	{
		return erc.readIntegerData(r, c);
	}
	public void threadSleep() throws InterruptedException
	{
		gl.threadSleepWait();
	}
	public void scrolling()
	{
		gl.javaScriptEecutorForSrolling(driver, register);
	}
	public void enterphNumberForPayment(String num)
	{
		gl.typeText(pHNUmberForPayMent, num);
	}

	public void swithToPaymentGateWay()
	{

		gl.iframeHandle(driver, iframePaymentGateWay);
	}

	public void clickOnProceedButton()
	{
		gl.clickElement(proceedButton);
	}
	
	public void clickOnNetBankingPayMent()
	{
		gl.clickElement(netBankingPayment);
	}
	
	public void clickOnSbiBank()
	{
		gl.clickElement(sbiBank);
	}
	
	public void clickOnPayNowButton()
	{
		gl.clickElement(payNowButton);
	}
	
	public void multipleWindoHandlingForPayment()
	{
		String MainWindow=driver.getWindowHandle();		
		
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	                                                                                                           
                                 			
                    
                    gl.clickElement(successButton);		
                                 
			// Closing the Child Window.
//                        driver.close();		
            }		
        }		
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);				
    }
	
	public String getUrlOfPlayerRegistrationPage()
	{
		return gl.getUrl(driver);
	}
	}

