package PageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import FunctionLibraries.FunctionLibrary;
import FunctionLibraries.FunctionLibrary;
import Logger.LoggerInstance;


public class WidgetPage {
	WebDriver driver;
	FunctionLibrary fLib = new FunctionLibrary();

public void WidgetPage(WebDriver driver) {
	this.driver = driver;
}

/* Method Name: clickOnWidgetTab
 * Description: This method will click Widget Tab
 * Created By: Aman Saraf Jain
 * Created Date: 23-08-2014
 * */
public void clickOnWidgetTab(WebDriver driver) {
	try{
		LoggerInstance.logger.info("clicking  widget tab link on widget Tab");
		FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "WidgetGallery"));
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  }
	  catch(Exception e){
		  System.out.println("Exception: " + e.getMessage());
		  LoggerInstance.logger.info("unable to click");
	  }
	}

/* Method Name: clickOnCompanySnapshot
 * Description: This method will clickOn Company Snapshot link
 * Created By: Aman Saraf Jain
 * Created Date: 23-08-2014
 * */
public void clickOnCompanySnapshot(WebDriver driver) {
	try{
		 LoggerInstance.logger.info("clicking  company_snapshot link on widget Tab");
		FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "company_snapshot_link"));
	  }
	  catch(Exception e){
		  System.out.println("Exception: " + e.getMessage());
		  LoggerInstance.logger.info("unable to click");
	  }
	}
/* Method Name: clickOnBseTopLoserGainer
 * Description: This method will click On Bse Top Loser Gainer
 * Created By: Aman Saraf Jain
 * Created Date: 23-08-2014
 * */
public void clickOnBseTopLoserGainer(WebDriver driver) {
	try{
		LoggerInstance.logger.info("clicking  bse top gainers losers on widget Tab");
		FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "bseTopGainersLosers"));
	  }
	  catch(Exception e){
		  System.out.println("Exception: " + e.getMessage());
		  LoggerInstance.logger.info("unable to click");
	  }
	}

/* Method Name: verifyCompanySnapshot
 * Description: This method verify company snapshot link
 * Created By: Aman Saraf Jain
 * Created Date: 23-08-2014
 * */
  public boolean verifyCompanySnapshot(WebDriver driver) {
	  boolean result=false;
	  boolean result1=false;
	  boolean result2=false;
	  boolean result3=false;
	  try{ 
			  LoggerInstance.logger.info("Verifying company snapshot link on widget Tab");
			  FunctionLibrary.verifyTextWebelement("Company Snapshot", fLib.getWebelment(driver, "widget_lbl"));
			  FunctionLibrary.verifyTextWebelement("BSE", fLib.getWebelment(driver, "BSE_lbl"));
			  result1 = fLib.getWebelment(driver, "company").isDisplayed();
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
	return result;
	
 }
  
	/* Method Name: verifylinkspresent
 * Description: This method verify various links present on Widget tab
 * Created By: Aman Saraf Jain
 * Created Date: 23-08-2014
 * */
  public boolean verifyLinksPresent(WebDriver driver){
	  boolean result=false;
	  boolean result1=false;
	  boolean result2=false;
	  boolean result3=false;
	  boolean result4=false;
	  boolean result5=false;
	  boolean result6=false;
	  boolean result7=false;
	  boolean result8=false;
	  try{
			  LoggerInstance.logger.info("Verifying links : Company Snapshot ,Bse MArket Ticker, Nifty tracker Latest Impressions.. links on widget Tab");
			  result1 = FunctionLibrary.verifyTextWebelement("Company Snapshot", FunctionLibrary.getWebelment(driver, "company_snapshot_link"));
			  result2 = FunctionLibrary.verifyTextWebelement("BSE Market Ticker", fLib.getWebelment(driver, "BSE_MarketTicker"));
			  result3 = FunctionLibrary.verifyTextWebelement("Nifty Ticker", fLib.getWebelment(driver, "NiftyTicker"));
			  result4 = FunctionLibrary.verifyTextWebelement("BSE Top Gainers & Losers", fLib.getWebelment(driver, "bseTopGainersLosers"));
			  result5 = FunctionLibrary.verifyTextWebelement("Market Breadth", fLib.getWebelment(driver, "MarketBreadth"));	
			  result6 = FunctionLibrary.verifyTextWebelement("Latest Impressions", fLib.getWebelment(driver, "latestImpression"));
			  result7 = FunctionLibrary.verifyTextWebelement("Just Downloaded", fLib.getWebelment(driver, "justDownloaded"));
			  result8 = FunctionLibrary.verifyTextWebelement("Most Downloaded", FunctionLibrary.getWebelment(driver, "mostDownloaded"));
			  if (result1==true&&result2==true&&result3==true&&result4==true&&result5==true&&result6==true&&result7==true&&result8==true){
				     result=true;
					 LoggerInstance.logger.info("Verification passed");
			 return result;
		}
	  }
	  catch(Exception e){
		  System.out.println("Exception: " + e.getMessage());
		  	LoggerInstance.logger.info("verification Failed");
		  	return result;
	  }
	  return result; 
  }

	/* Method Name: verifymarketBreadthlink
 * Description: This method verify market breadth link
 * Created By: Aman Saraf Jain
 * Created Date: 23-08-2014
 * */
  
  public  boolean verifyMarketBreadthLink(WebDriver driver){
	  boolean result=false;
	  boolean result1=false;
	  boolean result2=false;
	  boolean result3=false;
	  boolean result4=false;
	  try{
		  LoggerInstance.logger.info("Verifying Market Breadth link on widget Tab");
		  FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "MarketBreadth"));
		  Thread.sleep(3000);
		  result1 = FunctionLibrary.verifyTextWebelement("Market Breadth", fLib.getWebelment(driver, "widget_lbl"));
		  Thread.sleep(3000);
		  FunctionLibrary.switchFrame(driver,"ctl00_BodyCPH_ifrmMarketTracker");
		  result2 = FunctionLibrary.verifyStringsAreSame("Refresh", FunctionLibrary.getTooltipValue(fLib.getWebelment(driver, "refresh")));
		  FunctionLibrary.switchDefaultFrame(driver);

		  if (result1==true&&result2==true){
			  result=true;
			  LoggerInstance.logger.info("Verification passed");
			  return result;
			}
	  	}
	  catch(Exception e){
		  System.out.println("Exception: " + e.getMessage());
		  LoggerInstance.logger.info("verification Failed");
		  return result;
	  }
	  return result;
}

/* Method Name: verifymarketIndicelink
 * Description: This method verify market Indice link
 * Created By: Aman Saraf Jain
 * Created Date: 23-08-2014
 * */

  public  boolean verifymMrketIndiceLink(WebDriver driver){
	  boolean result=false;
	  try{
		  LoggerInstance.logger.info("Verifying Market Indice link on widget Tab");
		  FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "bsemarketindices"));
		  result = FunctionLibrary.verifyTextWebelement("Finalaya Widgets - BSE Market Indices", fLib.getWebelment(driver, "DashboardTitle"));
		  if (result==true){
			  	LoggerInstance.logger.info("Verification passed");
			  	return result;
			}
		  }
	  catch(Exception e){
		  System.out.println("Exception: " + e.getMessage());
		  	LoggerInstance.logger.info("verification Failed");
	  		}
	  return result; 
  	}
 
	/* Method Name: verifysectionby
 * Description: This method verify section by link
 * Created By: Aman Saraf Jain
 * Created Date: 23-08-2014
 * */
  public  boolean verifysectionby(WebDriver driver){
	  boolean result=false;
	  try{
		  LoggerInstance.logger.info("Verifying Section By  link on widget Tab");
		  Thread.sleep(3000);
		  FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "market"));
		  result = FunctionLibrary.verifyTextWebelement("Market", fLib.getWebelment(driver, "markettext"));
		  if (result==true)
		  {
			  LoggerInstance.logger.info("Verification passed");
			  return result;
		}
	  }
	  catch(Exception e){
		  System.out.println("Exception: " + e.getMessage());
		  LoggerInstance.logger.info("verification Failed");
	  	}
	  return result; 
	  }
	/* Method Name: verifyLatestImpression
* Description: This method verify link under Latest Impression 
* Created By: Aman Saraf Jain
* Created Date: 23-08-2014
* */
public  boolean verifyLatestImpression(WebDriver driver){
	  boolean result=false;
	  try{
		  LoggerInstance.logger.info("Verifying Latest Impression section");
		  String expected = fLib.getWebelment(driver, "bsemarketimg").getText();
		  FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "bsemarketimg"));
		  result = FunctionLibrary.verifyTextWebelement(expected, fLib.getWebelment(driver, "DashboardTitle"));
		  if (result==true)
		  {
			  LoggerInstance.logger.info("Verification passed - Navigation to sublink widget successfull");
			  return result;
		}
	  }
	  catch(Exception e){
		  System.out.println("Exception: " + e.getMessage());
		  LoggerInstance.logger.info("verification Failed");
	  	}
	  return result; 
	  }
  
}