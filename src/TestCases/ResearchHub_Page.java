package TestCases;

/* Description: Verification of Research Hub Page.
 * Created By: Mohd Suhail
 * Created Date: 11 September 2014
 * */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FunctionLibraries.AutomationConstants;
import FunctionLibraries.FunctionLibrary;
import FunctionLibraries.WebDriverBrowser;
import Logger.LoggerInstance;
import PageObjects.ResearchHubPage;
import Reports.CustomMethodReport;

public class ResearchHub_Page {

	private ResearchHubPage obj_researchhubPage;
	static WebDriver driver;

	Properties prop = new Properties();
	
	CustomMethodReport cmr = new CustomMethodReport();
	FunctionLibrary fLib = new FunctionLibrary();
	PrintWriter printWrite = null;
	boolean isVerificationPassed= true;
	
	// This method would be run before each method present in testcase file & will launch browser & will open application.
	@BeforeMethod
	public void setUp(Method method) throws Exception {
		String browser = null;
		String url = null;
		
		printWrite = cmr.createWriter(method.getName());
		cmr.startHtmlPage(printWrite);
		
		// Create input stream object of property file.
		InputStream inputConfig = new FileInputStream(AutomationConstants.PROPERTY_FILE_NAME);

		// Create the logger instance object
		LoggerInstance l = new LoggerInstance();
		try {
			prop.load(inputConfig);

			// To get browser value from property file
			browser = prop.get(AutomationConstants.BROWSER).toString();

			// Initialize driver object of particular browser.
			driver = WebDriverBrowser.getWebDriver(browser);
			LoggerInstance.logger.info("Browser launched");

			// Maximize the browser window.
			driver.manage().window().maximize();

			// To get application url value from property file.
			url = prop.get(AutomationConstants.URL).toString();
			driver.get(url);
			LoggerInstance.logger.info("Navigated to  " + url);
		} catch (Exception e) {
			LoggerInstance.logger.info("Unable to launch browser ");
		} finally {
			browser = null;
			url = null;
			inputConfig = null;
		}
	}
	
	//This function will load the MarketPage sheet from excel file that consists the locator from Home page
	
	@org.testng.annotations.BeforeClass
	       public void LoadObjectReository() throws IOException {
	      // System.out.println("Before Class");
	       fLib.readObjectRepository("ResearchHubPage");
	       }

	// This function will clear the hashmap after running all the test cases
	@org.testng.annotations.AfterClass
	public void ClearObjectRepository() {
	                fLib.excelLoad.clear();
	}	
	

	// Scenario 1 :This test case will navigate to the Market Page and will
	// Verify all the Sensex Value and and Nifty Value is Displayed.
	@Test
	public void ResearchHub_ResultsInsights_VerifyResearchHubPage() {
		try {
			LoggerInstance.logger
					.info("***********************ResearchHub_ResultsInsights_VerifyResearchHubPage() Started*********************************");
			// Initialize Page Factory For Research Hub Page
			obj_researchhubPage = PageFactory.initElements(driver,ResearchHubPage.class);
			// Click On Results Insight Tab
			LoggerInstance.logger
					.info("Verify to Click On Results Insight Tab.");
			obj_researchhubPage.clickOnResultsInsightsTab(driver);
			// Verify the Results title is Displayed or not.
			LoggerInstance.logger
					.info("Verify the Results title is Displayed.");
			boolean isVerify_ResultstitleisDisplayed = obj_researchhubPage.VerifyResultstitleDisplayed();
			if(isVerify_ResultstitleisDisplayed)
				cmr.generateExecutionReport(printWrite, "Verify if Results title is Displayed.", "Results title is Displayed.", "Results title is Displayed.", true, null);
			else{
				isVerificationPassed=false;
				cmr.generateExecutionReport(printWrite, "Verify if General Economic Indicator Page is displayed.", "Results title is displayed.", "Results title is not Displayed.", false, fLib.captureScreenshot());
			}
			
			// Verify that PrimarySelection,SecondrySelection,ResultType,SelectTimeLine Quaterly Dropdown is displayed"
			 LoggerInstance.logger.info("Verify that PrimarySelection,SecondrySelection,ResultType,SelectTimeLine and Quaterly Dropdown is displayed");
			 boolean isVerify_VerifyPrimarySecondaryDisplayed = obj_researchhubPage.VerifyPrimarySecondaryDisplayed();
				if(isVerify_VerifyPrimarySecondaryDisplayed)
					cmr.generateExecutionReport(printWrite, "Verify if PrimarySelection,SecondrySelection,ResultType,SelectTimeLine Quaterly Dropdown is displayed.", "PrimarySelection,SecondrySelection,ResultType,SelectTimeLine Quaterly Dropdown is displayed.", "PrimarySelection,SecondrySelection,ResultType,SelectTimeLine Quaterly Dropdown is displayed.", true, null);
				else{
					isVerificationPassed=false;
					cmr.generateExecutionReport(printWrite, "Verify if PrimarySelection,SecondrySelection,ResultType,SelectTimeLine Quaterly Dropdown is displayed.", "PrimarySelection,SecondrySelection,ResultType,SelectTimeLine Quaterly Dropdown is displayed.", "PrimarySelection,SecondrySelection,ResultType,SelectTimeLine Quaterly Dropdown is not displayed.", false, fLib.captureScreenshot());
				}
				
			// Click On Primary Selection Dropdown
			LoggerInstance.logger
					.info("Verify to Click On Primary Selection Dropdown.");
			obj_researchhubPage.clickPrimarySelectionddl();
			// Click On Secondary Selection Dropdown.
			LoggerInstance.logger
					.info("Verify to Click On Secondary Selection Dropdown.");
			// Click On Result Type Dropdown.
			obj_researchhubPage.clickSecondrySelectionddl();
			// Click On Select TimeLine Dropdown.
			LoggerInstance.logger
					.info("Verify to Click On Result Type Dropdown.");
			obj_researchhubPage.clickResultTypeddl();
			// Click On Select TimeLine Dropdown.
			LoggerInstance.logger
					.info("Verify to Click On Select TimeLine Dropdown.");
			obj_researchhubPage.clickSelectTimeLineddl();
			// Click On Quaterly Dropdown.
			LoggerInstance.logger.info("Verify to Click On Quaterly Dropdown.");
			obj_researchhubPage.clickQuaterlyddl();
			// Click On Go Button.
			LoggerInstance.logger.info("Click On Go Button.");
			obj_researchhubPage.clickGobtn();
			// Verify QD1,QD2,QD3,QD4 ,Advance View Button,QuadrantView Button
			// and Motion Chart Button is displayed.
			LoggerInstance.logger
					.info("Verify QD1,QD2,QD3,QD4 ,Advance View Button,QuadrantView Button and Motion Chart Button is displayed.");
			boolean isVerify_QD1QD2QD3QD4Displayed = obj_researchhubPage.VerifyQD1QD2QD3QD4Displayed();
			if(isVerify_QD1QD2QD3QD4Displayed)
				cmr.generateExecutionReport(printWrite, "Verify if QD1 QD2 QD3 QD4 is Displayed.", "QD1 QD2 QD3 QD4 is Displayed.", "QD1 QD2 QD3 QD4 is Displayed.", true, null);
			else{
				isVerificationPassed=false;
				cmr.generateExecutionReport(printWrite, "Verify if QD1 QD2 QD3 QD4 is Displayed.", "QD1 QD2 QD3 QD4 is Displayed.", "QD1 QD2 QD3 QD4 is not Displayed.", false, fLib.captureScreenshot());
			}
			// Click On QD2 Frame Value.
			LoggerInstance.logger.info("Verify to Click On QD2 Frame Value.");
			obj_researchhubPage.clickQD2FrameVal();
			// Verify the QD2 Results Frame Set is Displayed
			LoggerInstance.logger
					.info("Verify the QD2 Results Frame Set is Displayed.");
			boolean isVerify_VerifyQD2ResultantFrameDisplayed = obj_researchhubPage.VerifyQD2ResultantFrameDisplayed();
			if(isVerify_VerifyQD2ResultantFrameDisplayed)
				cmr.generateExecutionReport(printWrite, "Verify if QD2 Resultant Frame is Displayed.", "QD2 ResultantFrame Displayed.", "QD2 ResultantFrame Displayed.", true, null);
			else{
				isVerificationPassed=false;
				cmr.generateExecutionReport(printWrite, "Verify if QD2 ResultantFrame is Displayed.", "QD2 ResultantFrame is Displayed.", "QD2 Resultant Frame is not Displayed.", false, fLib.captureScreenshot());
			}
			// Click QD2 Resultant Frame close button
			LoggerInstance.logger
					.info("Verify to Click QD2 Resultant Frame close button.");
			obj_researchhubPage.clickQD2ResultantFrameclosebtn();
			// Verify the Results title is Displayed
			LoggerInstance.logger
					.info("Verify the Results title is Displayed.");
			boolean isVerify_VerifyResultstitleDisplayed = obj_researchhubPage.VerifyResultstitleDisplayed();
			if(isVerify_VerifyResultstitleDisplayed)
				cmr.generateExecutionReport(printWrite, "Verify if Results title is Displayed.", "Results title is Displayed.", "Results title is Displayed.", true, null);
			else{
				isVerificationPassed=false;
				cmr.generateExecutionReport(printWrite, "Verify if Results title is Displayed.", "Results title is Displayed.", "Results title is not Displayed.", false, fLib.captureScreenshot());
			}
		

			LoggerInstance.logger
					.info("***********************ResearchHub_ResultsInsights_VerifyResearchHubPage() Ended*********************************");
			if(!isVerificationPassed){
				isVerificationPassed=true;
				org.testng.Assert.fail();
			}
		} catch (Exception e) {
			LoggerInstance.logger.info("Exception occured.");
			e.printStackTrace();
		} finally {
			obj_researchhubPage = null;
			if(!isVerificationPassed){
				isVerificationPassed=true;
				org.testng.Assert.fail();
			}
		}
	}

	// This method will be run after each method present in testcase file& will
	// close the all browser windows.
	@AfterMethod
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
		LoggerInstance.logger.info("Browser closed");
		cmr.endHtmlPage(printWrite);
		printWrite.flush();
	}

}
