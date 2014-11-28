package PageObjects;

/* Description: Reports page object class
 * Created By: Sunny Jain
 * Created Date: 25 Aug 2014
 * */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import FunctionLibraries.FunctionLibrary;
import Logger.LoggerInstance;

public class ReportsPage {

	WebDriver driver;
	FunctionLibrary fLib = new FunctionLibrary();
	
	public ReportsPage(WebDriver driver){
		this.driver=driver;
	}

         /* Method Name: clickOnResearchReportstab
       * Description: 
       *            This method will click on the sub menu of tab.
       * Parameters: 
       *            1. NA
       * Created By: Sunny Jain
       * Created Date: 25-08-2014
       * */
	public void clickOnResearchReportstab(WebDriver driver) {
		try {
			LoggerInstance.logger.info("click on Research Reports Tab");
			FunctionLibrary.clickMenuItem(driver, fLib.getWebelment(driver, "ReportsTab"),fLib.getWebelment(driver, "ResearchReportsMenu"));
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to click on NSE Tab");
		}
	}

   /* Method Name: verifyAllReportsTabIsDisplayed
       * Description: 
       *            This method will verify that All reports tab is displyed or not 
       * Parameters: 
       *            1. NA
       * Created By: Sunny Jain
       * Created Date: 25-08-2014
       * */
	public boolean verifyAllReportsTabIsDisplayed(WebDriver driver) {
		boolean result = false;
		try {
			//FunctionLibrary.waitTillElementPresent(driver, 10, By.cssSelector(csspath_AllReports));
			result = fLib.getWebelment(driver, "AllReports").isDisplayed();
			if (result == true)
				LoggerInstance.logger.info("All Reports tab is displayed");
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("All Reports tab is not displayed");
			return result;
		}
	}
       
 /* Method Name: verifyPremiumTabIsDisplayed
       * Description: 
       *            This method will verify that Premium tab is displyed or not 
       * Parameters: 
       *            1. NA
       * Created By: Sunny Jain
       * Created Date: 25-08-2014
       * */

	public boolean verifyPremiumTabIsDisplayed(WebDriver driver) {
		boolean result = false;
		try {
			//FunctionLibrary.waitTillElementPresent(driver, 10, By.cssSelector(csspath_Premium));
			result = fLib.getWebelment(driver, "Premium").isDisplayed();
			if (result == true)
				LoggerInstance.logger.info("Premium tab is displayed");
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Premium tab is not displayed");
			return result;
		}
	}
  /* Method Name: verifyLatestTabIsDisplayed
       * Description: 
       *            This method will verify that latest tab is displyed or not 
       * Parameters: 
       *            1. NA
       * Created By: Sunny Jain
       * Created Date: 25-08-2014
       * */
	public boolean verifyLatestTabIsDisplayed(WebDriver driver) {
		boolean result = false;
		try {
			//FunctionLibrary.waitTillElementPresent(driver, 10, By.cssSelector(csspath_Latest));
			result = fLib.getWebelment(driver, "Latest").isDisplayed();
			if (result == true)
				LoggerInstance.logger.info("Latest tab is displayed");
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Latest tab is not displayed");
			return result;
		}
	}
 /* Method Name: verifyMostViewedTabIsDisplayed
       * Description: 
       *            This method will verify that Most viewed tab is displyed or not 
       * Parameters: 
       *            1. NA
       * Created By: Sunny Jain
       * Created Date: 25-08-2014
       * */
	public boolean verifyMostViewedTabIsDisplayed(WebDriver driver) {
		boolean result = false;
		try {
			//FunctionLibrary.waitTillElementPresent(driver, 10, By.cssSelector(csspath_MostViewed));
			result = fLib.getWebelment(driver, "MostViewed").isDisplayed();
			if (result == true)
				LoggerInstance.logger.info("Most viewed tab is displayed");
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Most viewed tab is not displayed");
			return result;
		}
	}
 /* Method Name: verifyTitle
       * Description: 
       *            This method will verify the title 
       * Parameters: 
       *            1. NA
       * Created By: Sunny Jain
       * Created Date: 25-08-2014
       * */
	public boolean verifyTitle(WebDriver driver) {
		boolean result = false;
		try {
			Thread.sleep(3000);
			//FunctionLibrary.waitTillElementPresent(driver, 10, By.cssSelector(csspath_Title));
			LoggerInstance.logger.info("verify the tilte");
			result = FunctionLibrary.verifyTextWebelement("Home » Research Reports",fLib.getWebelment(driver, "Title"));
			if (result == true){
				LoggerInstance.logger.info("title is verified");
			return result;
			}
			else{
				LoggerInstance.logger.info("title is not same");
				return result;
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("unable to verify title");
			return result;
		}
	}	
	 /* Method Name: clickOnReportLink
       * Description: 
       *            This method will click on the report link.
       * Parameters: 
       *            1. NA
       * Created By: Sunny Jain
       * Created Date: 25-08-2014
       * */
	public void clickOnReportLink(WebDriver driver) {
		
		try{
			//FunctionLibrary.waitTillElementPresent(driver, 10, By.cssSelector(csspath_FirstReportLink));
			LoggerInstance.logger.info("click on the first report link");
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "FirstReportLink"));
		}
		catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("link is not clicked");	
		}
	}
	 /* Method Name: switchOfNewWindow
       * Description: 
       *            This method will switch on the newly opened window.
       * Parameters: 
       *            1. NA
       * Created By: Sunny Jain
       * Created Date: 25-08-2014
       * */
	public void switchOfNewWindow(WebDriver driver){
		
		try{
			LoggerInstance.logger.info("Swtching to new opened window");
	        String parent = driver.getWindowHandle();
	         Thread.sleep(1000);
	         Set <String> availableWindows = driver.getWindowHandles();
	         String newWindow = null;
	         for (String window : availableWindows) {
	             if (!parent.equals(window)) {
	                 newWindow = window;
	             }  
	         }
	         driver.switchTo().window(newWindow);    
	         Thread.sleep(1000);
		}
		catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Switch to new window fail");	
		}	
	}
	 /* Method Name: verifyNewWindowTitle
       * Description: 
       *            This method will the title of the newly opened window.
       * Parameters: 
       *            1. NA
       * Created By: Sunny Jain
       * Created Date: 25-08-2014
       * */
	public boolean verifyNewWindowTitle(WebDriver driver) {
		  boolean result = false;

		try {
			Thread.sleep(1000);
			//FunctionLibrary.waitTillElementPresent(driver, 10, By.id(id_NewWindowTitle));
			LoggerInstance.logger.info("verify the tilte of newly opened window");
			result = FunctionLibrary.verifyTextWebelement("Research Reports",fLib.getWebelment(driver, "NewWindowTitle"));
		if (result == true){
			LoggerInstance.logger.info("title is verified");
			return result;
			}
		else{
			LoggerInstance.logger.info("title is not same");
			return result;
			}	
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("title is not matched");
			return result;
		}
	}
	
	
	/*
	 * Method Name: Description: Verify DailyMarketWrap Page is Displayed This
	 * method will return DailyMarketWrap Page is Displayed or not.
	 * 
	 * Created By: Mohd Suhail Created Date: 26-08-2014
	 */

	public Boolean VerifyDailyMarketWrapPageIsdisplayed(WebDriver driver) {

		boolean result = false;
		try {
			
			FunctionLibrary.clickMenuItem(driver, fLib.getWebelment(driver, "MainReportTab"), fLib.getWebelment(driver, "DailyWrapMenuTab"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			result = fLib.getWebelment(driver, "DailyWrapPage").isDisplayed();
			if (result == true)
				LoggerInstance.logger
						.info("Daily Market Wrap Page is displayed");
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Daily Market Wrap is not displayed");
			return result;
		}
	}

	/*
	 * Method Name: Description: Verify CNXTable Page is Displayed This method
	 * will returnCNXTable Page is Displayed or not.
	 * 
	 * Created By: Mohd Suhail Created Date: 26-08-2014
	 */
	public Boolean VerifyCNXTableIsdisplayed(WebDriver driver) {

		boolean result = false;
		try {
					result = fLib.getWebelment(driver, "CnxNiftytable").isDisplayed();
			if (result == true)
				LoggerInstance.logger.info("CNX Nifty Table is displayed");
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("CNX Nifty Table  is displayed");
			return result;
		}
	}

	/*
	 * Method Name: Description: Verify S&P BSESensexTable Page is Displayed
	 * This method will return S&P BSESensexTable Page is Displayed or not.
	 * 
	 * Created By: Mohd Suhail Created Date: 26-08-2014
	 */
	public Boolean VerifyBSESensexTableIsdisplayed(WebDriver driver) {

		boolean result = false;
		try {
			result = fLib.getWebelment(driver, "BSeSensextable").isDisplayed();
			if (result == true)
				LoggerInstance.logger.info("S&P BSE Sensex Table is displayed");
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("S&P BSE Sensex Table is not displayed");
			return result;
		}
	}

	/*
	 * Method Name:
	 * 
	 * This method will return Date Value .
	 * 
	 * Created By: Mohd Suhail Created Date: 26-08-2014
	 */

	public static String DateVal(int i) {
       
		String a = null ;
		try{
				Calendar cal = Calendar.getInstance();
		        cal.add(Calendar.DAY_OF_MONTH, i);
		        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
				Date date = cal.getTime();
				a = dateFormat.format(date);
				return a;
        }
		catch(Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
		  	LoggerInstance.logger.info("Does not Contain the date");
		  	return a;
		}
	     }
	

	/*
	 * Method Name: Description: Verify CNXTable contains three dates is
	 * Displayed This method will contains three dates is Displayed or not.
	 * 
	 * Created By: Mohd Suhail Created Date: 26-08-2014
	 */

	public Boolean VerifyCNXEffectiveDateDisplayed(WebDriver driver) {
		boolean result = false;
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;

		try {

			List<WebElement> ListEffectivedate = (List<WebElement>) fLib.getWebelments(driver, "CNXEffectivedate");
			for (int i = 0; i < ListEffectivedate.size(); i++) 
			{
				String ListEffectivedatetable = ListEffectivedate.get(i).getText();

				if (ListEffectivedatetable.equals(DateVal(0).toString()))
				{
					LoggerInstance.logger.info("CNX Nifty Table contains the Current date .");
					flag1 = true;
					continue;
				}				
			
				
				else if (ListEffectivedatetable.equals(DateVal(-1).toString())) 
				{
					LoggerInstance.logger.info("CNX Nifty Table contains the Last date .");
					flag2 = true;
					continue;
				}
				else if (ListEffectivedatetable.equals(DateVal(-2).toString()))
				{
					LoggerInstance.logger.info("CNX Nifty Table contains the Day Before Date .");
					flag3 = true;
					continue;
				}
				
			}
			 
			if (flag1 && flag2 && flag3) {
				result = true;
				LoggerInstance.logger.info("CNX Nifty Table contains Current , lastDate and Day Before Date ");
			}
			else{
				LoggerInstance.logger.info("CNX Nifty Table does not contains Current , lastDate and Day Before Date ");
				result = true;
				
			}
				
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Columns are not displayed");
			result = false;
		}
		return result;

	}

	/*
	 * Method Name: Description: Verify BSESensexTable contains three dates is
	 * Displayed This method will contains BSESensexTable three dates is
	 * Displayed or not.
	 * 
	 * Created By: Mohd Suhail Created Date: 26-08-2014
	 */

	public Boolean VerifyBSESensexTableDateDisplayed(WebDriver driver) {
		boolean result = false;
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;

		try {

			List<WebElement> ListEffectivedate = (List<WebElement>) fLib.getWebelments(driver, "BSeSensexffectivedate");
			for (int i = 0; i < ListEffectivedate.size(); i++)
			{
				String ListEffectivedatetable = ListEffectivedate.get(i).getText();
				if (ListEffectivedatetable.equals(DateVal(0).toString())) {
					LoggerInstance.logger.info("BSE Sensex Table  contains the current date .");
					flag1 = true;
					continue;
				} else if (ListEffectivedatetable.equals(DateVal(-1).toString())) {
					LoggerInstance.logger.info("BSE Sensex Table contains the Last date .");
					flag2 = true;
					continue;
					
				}
                    else if (ListEffectivedatetable.equals(DateVal(-2).toString())) 
                 {
					LoggerInstance.logger.info("BSE Sensex Table contains the Day Before Date .");
					flag3 = true;
					continue;
				 }
			  }
			if (flag1 && flag2 && flag3)
			{
				result = true;
				LoggerInstance.logger.info("BSE Sensex Table contains Current , lastDate and Day Before Date ");
			}
			else{
				LoggerInstance.logger.info("BSE Sensex Table does not contains Current , lastDate and Day Before Date ");
				result = true;
				
			}
		} 
		catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Columns are not displayed");
			result = false;
		  }
		return result;

	  }

	/*
	 * Method Name: Description: Verify CNXTable contains
	 * VerifyDailyWrapFrameContainsHeading and 10 records is displayed This
	 * method will VerifyDailyWrapFrameContainsHeading is Displayed or not.
	 * 
	 * Created By: Mohd Suhail Created Date: 26-08-2014
	 */

	public boolean VerifyDailyWrapFrameContainsHeading(WebDriver driver) {
		boolean result = false;
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
           try {
           			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "ViewArchiveBtn"));
			List<WebElement> headerelment = (List<WebElement>) fLib.getWebelments(driver, "heading");
			int headerval = -1;
			int sum = 0;
			for (int i = 0; i < headerelment.size(); i++) {
				String HeaderText = headerelment.get(i).getText();
				headerval = headerval + 1;
				if (HeaderText.equalsIgnoreCase("Date Heading")) {
					LoggerInstance.logger.info("Daily  Wrap Frame contains Data Heading .");
					flag1 = true;
					continue;
				} else if (headerval == 10) {
					LoggerInstance.logger.info("Daily  Wrap Frame contains 10 records .");
					flag2 = true;
					continue;
				}

			}
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "closeimg"));
			if (flag1 && flag2) {
				result = true;
				LoggerInstance.logger.info("Daily  Wrap Frame contains Data Heading  and 10 records");
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Columns are not displayed");
			result = false;
		}
		return result;
	}


	
	/*
	 * Method Name: Description: Verify Daily  Wrap Frame Value
	 *  contains the Same Heading Value is displayed 
	 * This method will Daily  Wrap Frame Value contains the Same Heading Value
	 *   is Displayed or not.
	 
	 * Created By: Mohd Suhail Created Date: 26-08-2014
	 */

	public boolean VerifyDailyWrapDatePageHeading() {
		boolean result = false;
		boolean flag1 = false;
		

		try {
		
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "ViewArchiveBtn"));
			List<WebElement> headerelment = (List<WebElement>) fLib.getWebelments(driver, "DailyScrapdatelink");
			for (int i = 0; i < headerelment.size(); i++) {
				String HeaderText = headerelment.get(i).getText();
				FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "datelink"));
				if (HeaderText.contains(((WebElement) fLib.getWebelments(driver, "PagedatelinkHeading")).getText())) {
					LoggerInstance.logger.info("Daily  Wrap Frame  contains the Same Heading Value and  date as new Loaded page");
					flag1 = true;
					continue;
				}
			}
			
            if (flag1) {
				result = true;
				LoggerInstance.logger.info("Daily  Wrap Frame  contains the Same Heading Value and  date as new Loaded page");
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Columns are not displayed");
			result = false;
		}
		return result;
	}
	
	/* Method Name: verifyweeklyWraplink()
     * Description: This method will verify weekly wrap link
     * Created By: Aman Saraf Jain
     * Created Date: 23-08-2014
     * */
    
    public boolean verifyweeklyWraplink(WebDriver driver) {
  	  boolean result=false;
   	 try
            {
                    LoggerInstance.logger.info("click on weekly Wrap link on report tab");
                    FunctionLibrary.clickMenuItem(driver,fLib.getWebelment(driver, "ReportsTab"),fLib.getWebelment(driver, "WeeklyWrap")); 
                    result=FunctionLibrary.verifyTextWebelement("Weekly Wrap", fLib.getWebelment(driver, "weeklywraptitle"));
                    if (result==true){
   				     result=true;
   					 LoggerInstance.logger.info("Verification passed");
   			 return result;
   		}
            }
            catch(Exception e)
            {
            	System.out.println("Exception: " + e.getMessage());
            LoggerInstance.logger.info("Not able to click on weekly Wrap link Reports Tab");
            return result;
            }
   	 return result;}
    
    /* Method Name: clickOnweeklyWraplink()
     * Description: This method will click weekly wrap link
     * Created By: Aman Saraf Jain
     * Created Date: 23-08-2014
     * */
    public void clickOnweeklyWraplink(WebDriver driver) {
   	 try
        {
                LoggerInstance.logger.info("click on weekly Wrap link on report tab");
                FunctionLibrary.clickMenuItem(driver,fLib.getWebelment(driver, "ReportsTab"),fLib.getWebelment(driver, "WeeklyWrap")); 
        }
        catch(Exception e)
        {
        	System.out.println("Exception: " + e.getMessage());
        LoggerInstance.logger.info("Not able to click on weekly Wrap link Reports Tab");
        }
}

    
    /* Method Name: verify_table_headers()
     * Description: This method will verify headers of tables present
     * Created By: Aman Saraf Jain
     * Created Date: 23-08-2014
     * */
    public boolean verify_table_headers(WebDriver driver){
  	  boolean result=false;
  	  boolean result1=false;
  	  boolean result2=false;
  	  boolean result3=false; 
   	 try
         {
                 LoggerInstance.logger.info("verifying Broad base indices text as a Table header");
                 result1 =  FunctionLibrary.verifyTextWebelement("Broad-based Indices", fLib.getWebelment(driver, "broadbasedindices"));
                 LoggerInstance.logger.info("verifying F&O summary text as a Table header");
                 result2 =  FunctionLibrary.verifyTextWebelement("F&O Summary", fLib.getWebelment(driver, "fosummary"));
                 LoggerInstance.logger.info("verifying Sectoral Indices (Top 5) text as a Table header");
                 result3 = FunctionLibrary.verifyTextWebelement("Sectoral Indices (Top 5)",fLib.getWebelment(driver, "sectoralIndices"));
           	  if (result1==true&&result2==true&&result3==true){
				     result=true;
					 LoggerInstance.logger.info("Verification passed");
					 return result;
		}
         }
         catch(Exception e)
         {
        	System.out.println("Exception: " + e.getMessage());
       	  	LoggerInstance.logger.info("verification Failed");
       	  	return result;
         }
return result;    }
    
    /* Method Name: verify_right_hand_tables()
     * Description: This method will verify headers of tables present
     * Created By: Aman Saraf Jain
     * Created Date: 23-08-2014
     * */
    
    public boolean verify_right_hand_tables(WebDriver driver){
     	  boolean result=false;
      	  boolean result1=false;
      	  boolean result2=false;
      	  boolean result3=false; 
   	 try
        {
   		 Thread.sleep(5000);
                LoggerInstance.logger.info("verifying Big Wealth Creators Table");
                result1 = FunctionLibrary.verifyTextWebelement("Biggest Wealth Creators", fLib.getWebelment(driver, "bigWealthCreators"));
                LoggerInstance.logger.info("verifying Biggest Wealth Destroyers Table");
                result2 = FunctionLibrary.verifyTextWebelement("Biggest Wealth Destroyers", fLib.getWebelment(driver, "bigWealthDestroyers"));
                LoggerInstance.logger.info("verifying Sensex Drivers Table");
                result3 = FunctionLibrary.verifyTextWebelement("Sensex Drivers",fLib.getWebelment(driver, "sensexDriver"));
                if (result1==true&&result2==true&&result3==true){
				     result=true;
					 LoggerInstance.logger.info("Verification passed");
					 return result;
		}
         }
        catch(Exception e)
        {
        	System.out.println("Exception: " + e.getMessage());
      	  	LoggerInstance.logger.info("verification Failed");
      	  	return result;
        }
   return result;}
    
    /* Method Name: verify_index_link_navigates_marketToday_page()
     * Description: This method will verify verify_index_link_navigates_marketToday_page
     * Created By: Aman Saraf Jain
     * Created Date: 23-08-2014
     * */
    public boolean verify_index_link_navigates_marketToday_page(WebDriver driver){
     	 boolean result=false; 
   	 try
           {
   		 Thread.sleep(3000);
                   LoggerInstance.logger.info("clicking one of the index link");
                   FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "firstIndex"));
                   Thread.sleep(5000);
                   LoggerInstance.logger.info("Verifying navigated to Market Today page");
                   result = FunctionLibrary.verifyTextWebelement("Market Today",fLib.getWebelment(driver, "header"));  
                   if(result==true){
                   	LoggerInstance.logger.info("Verification passed");
                   	return result;
                   }
          
           }
           catch(Exception e)
           {
        	   System.out.println("Exception: " + e.getMessage());
         	  	LoggerInstance.logger.info("verification Failed");
             	return result;
           }
      	return result;   }
	
}
