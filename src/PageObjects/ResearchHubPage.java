package PageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import FunctionLibraries.FunctionLibrary;
import Logger.LoggerInstance;

public class ResearchHubPage {
	
	WebDriver driver;
	FunctionLibrary fLib = new FunctionLibrary();
	


	//this will Instance the Webdriver Object
	public ResearchHubPage(WebDriver driver) {
		this.driver = driver;
	}
	
	

	/* Method Name: Function to click on Primary Selection drop down
     * Description: 
     * Created By: Mohd Suhail
     * Created Date: 11-08-2014
     * */
	
 public void clickPrimarySelectionddl()
	{
		try
		{
			List<WebElement> we_ResultsValddl;
			//System.out.println(fLib.getWebelment(driver, "PrimarySelectionddl"));
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "PrimarySelectionddl"));
			we_ResultsValddl=(List<WebElement>) fLib.getWebelments(driver, "Results");
			System.out.println(we_ResultsValddl);
			List<WebElement> options = we_ResultsValddl;
			for (WebElement option : options) 
			{
				
	            if ("Market Capitalization".equalsIgnoreCase(option.getText())) 
	            {
	                  
	                  option.click();
	                  LoggerInstance.logger.info("click on Primary Selection DropDown.");
	            }	
		}
		}
		catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to click on Primary Selection DropDown.");
		}
	}
    
 /* Method Name: Function to click on SecondrySelection drop down
  * Description: 
  * Created By: Mohd Suhail
  * Created Date: 11-08-2014
  * */
    
    public void clickSecondrySelectionddl()
	{
		try
		{
			List<WebElement> we_ResultsValddl;
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "SecondrySelectionddl"));
			we_ResultsValddl=(List<WebElement>) fLib.getWebelments(driver, "Results");
			List<WebElement> options = we_ResultsValddl;
			for (WebElement option : options) 
			{
				
	            if ("Mid Cap".equalsIgnoreCase(option.getText())) 
	            {
	                  
	                  option.click();
	                
	                  LoggerInstance.logger.info("click on Secondary Selection DropDown Value.");
	                  
	            }
		}
		}
		catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to click on Secondary Selection DropDown Value.");
		}
	}

    
    /* Method Name: Function to click on Result Type drop down
     * Description: 
     * Created By: Mohd Suhail
     * Created Date: 11-08-2014
     * */
    
    public void clickResultTypeddl()
   	{
   		try
   		{
   			List<WebElement> we_ResultsTypeValddl;
   			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "ResultTypeddl"));
   			we_ResultsTypeValddl=(List<WebElement>) fLib.getWebelments(driver, "Results");
   			List<WebElement> options = we_ResultsTypeValddl;
   			for (WebElement option : options) 
   			{
   			
   	           if ("Quarterly".equals(option.getText())) 
   	            {
   	                  
   	                  option.click();
   	                 
   	               LoggerInstance.logger.info("click on Results Type DropDown Value .");
   	               break;
   	            }
   			}
   		
   		}
   		catch (Exception e) {
   			System.out.println("Exception: " + e.getMessage());
   			LoggerInstance.logger.info("not able click on Results Type DropDown Value .");
   		}
   	}
    
    

    /* Method Name: Function to click on Select TimeLine drop down
     * Description: 
     * Created By: Mohd Suhail
     * Created Date: 11-08-2014
     * */
    
    public void clickSelectTimeLineddl()
   	{
   		try
   		{
   			List<WebElement> we_ResultsValddl;
   			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "SelectTimeLineddl"));
   			we_ResultsValddl=(List<WebElement>) fLib.getWebelments(driver, "Results");
   			List<WebElement> options = we_ResultsValddl;
   			for (WebElement option : options) 
   			{
   				
   	            if ("Apr-Jun 30, 2014".equalsIgnoreCase(option.getText())) 
   	            {
   	                  
   	                  option.click();
   	               LoggerInstance.logger.info("click on Select Time Line DropDown.");
   	            }   			
   		}
   		}
   		catch (Exception e) {
   			System.out.println("Exception: " + e.getMessage());
   			LoggerInstance.logger.info("Not able to click Select Time Line DropDown.");
   		}
   	}
    
    /* Method Name: Function to click on Quaterly drop down
     * Description: 
     * Created By: Mohd Suhail
     * Created Date: 11-08-2014
     * */
    public void clickQuaterlyddl()
   	{
   		try
   		{
   			List<WebElement> we_ResultsValddl;
   			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "Quaterlyddl"));
   			we_ResultsValddl=(List<WebElement>) fLib.getWebelments(driver, "Results");
   			List<WebElement> options = we_ResultsValddl;
   			for (WebElement option : options) 
   			{
   			
   	            if ("Q-o-Q".equalsIgnoreCase(option.getText())) 
   	            {
   	                  
   	                  option.click();
   	               LoggerInstance.logger.info("click on Quarterly DropDown.");
   	            }	
   		}
   		}
   		catch (Exception e) {
   			System.out.println("Exception: " + e.getMessage());
   			LoggerInstance.logger.info("Not able to click  on Quarterly DropDown.");
   		}
   	}

    /* Method Name: Function to click on Resultant Frame close button
     * Description: 
     * Created By: Mohd Suhail
     * Created Date: 11-08-2014
     * */
    
    public void clickQD2ResultantFrameclosebtn()
	{
		try
		{
			LoggerInstance.logger.info("click on QD2 Resultant Frame close Button.");
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "GoBtn"));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to click on QD2 Resultant Frame close Button.");
		}
	}
    
    /* Method Name: Function to click on Go button
     * Description: 
     * Created By: Mohd Suhail
     * Created Date: 11-08-2014
     * */
    public void clickGobtn()
	{
		try
		{
			LoggerInstance.logger.info("click on Go Button");
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "GoBtn"));
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to click on Go Button");
		}
	}
    
    /* Method Name: Function to click on  Frame value button
     * Description: 
     * Created By: Mohd Suhail
     * Created Date: 11-08-2014
     * */
    public void clickQD2FrameVal()
   	{
   		try
   		{
   			LoggerInstance.logger.info("click on QD2 Frame Value");
   			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "QD2FrameValbtn"));
   		}
   		catch(Exception e)
   		{
   			System.out.println("Exception: " + e.getMessage());
   			LoggerInstance.logger.info("Not able to click on QD2 Frame Value");
   		}
   	}
    
    /* Method Name: Function to click on Results Insights Tab
     * Description: 
     * Created By: Mohd Suhail
     * Created Date: 11-08-2014
     * */
	public void clickOnResultsInsightsTab(WebDriver driver)
	{
		try
		{
			FunctionLibrary.clickMenuItem(driver,fLib.getWebelment(driver, "ResearchTab"), fLib.getWebelment(driver, "ResultsInsightsTab"));
			LoggerInstance.logger.info("click on Results Insights Tab.");
		}
		catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to click Results Insights Tab.");
		}
	}
	
	 /* Method Name: Function to Verify QD2 Resultant Frame Displayed
     * Description: 
     * Created By: Mohd Suhail
     * Created Date: 11-08-2014
     * */
	
	public boolean VerifyQD2ResultantFrameDisplayed(){
		boolean result= false;
		try{
			 result=fLib.getWebelment(driver, "QD2ResultantFrame").isDisplayed();
			 if (result==true)
			 LoggerInstance.logger.info("QD2 Resultant Frame is displayed");
			 return result;
		}
		catch (Exception e) 
		{
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("QD2 Resultant Frame is  not displayed");
			return result;
		}
	}
	
	
	/* Method Name: Function to Verify Results title isDisplayed
     * Description: 
     * Created By: Mohd Suhail
     * Created Date: 11-08-2014
     * */
	public boolean VerifyResultstitleDisplayed(){
		boolean result= false;
		try{
			//Thread.sleep(5000);
			 result=fLib.getWebelment(driver, "ResultsInsightstitle").isDisplayed();
			 if (result==true)
			 LoggerInstance.logger.info("Results Insights title is displayed");
			 return result;
		}
		catch (Exception e) 
		{
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Results Insights title is not displayed");
			return result;
		}
	}
	
	

	/* Method Name: Function to PrimarySelection,SecondrySelection, 
	 *              ResultType,SelectTimeLine and Quaterly Dropdown is displayed
     * Description: 
     * Created By: Mohd Suhail
     * Created Date: 11-08-2014
     * */

	public boolean VerifyPrimarySecondaryDisplayed(){
		boolean result= false;
		try{
			 boolean a=fLib.getWebelment(driver, "PrimarySelectionddl").isDisplayed();
			 boolean c=fLib.getWebelment(driver, "ResultTypeddl").isDisplayed();
			 boolean d=fLib.getWebelment(driver, "SelectTimeLineddl").isDisplayed();
			 boolean e=fLib.getWebelment(driver, "Quaterlyddl").isDisplayed();			 
			 if (result=a  && c && d && e )
			 LoggerInstance.logger.info("PrimarySelection,SecondrySelection,ResultType,SelectTimeLine and Quaterly Dropdown is displayed");
			
			 return result;
		}
		catch (Exception e) 
		{
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("PrimarySelection,SecondrySelection,ResultType,SelectTimeLine and Quaterly Dropdown not is displayed");
			return result;
		}
	}
	
	
	/* Method Name: Function to QD1,QD2,QD3,QD4 ,Advance  View Button,QuadrantView Button and Motion Chart Button is displayed
     * Description: 
     * Created By: Mohd Suhail
     * Created Date: 11-08-2014
     * */
	public boolean VerifyQD1QD2QD3QD4Displayed(){
		boolean result= false;
		try{
			
			 boolean a=fLib.getWebelment(driver, "AdvanceViewbtn").isDisplayed();
			 boolean b=fLib.getWebelment(driver, "QuadrantViewbtn").isDisplayed();
			 boolean c=fLib.getWebelment(driver, "MotionChartViewbtn").isDisplayed();
			 
			 if (result=a && b && c)
			 LoggerInstance.logger.info("QD1,QD2,QD3,QD4 ,Advance View Button,QuadrantView Button and Motion Chart Button is displayed");
			
			 return result;
		}
		catch (Exception e) 
		{
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("QD1,QD2,QD3,QD4 ,Advance View Button,QuadrantView Button and Motion Chart Button is  not displayed");
			return result;
		}
	}
	
	
	}
	
	

