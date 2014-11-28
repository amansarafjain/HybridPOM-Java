package PageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.apache.log4j.Logger;

//import com.gargoylesoftware.htmlunit.WebConsole.Logger;

import FunctionLibraries.FunctionLibrary;
import Logger.LoggerInstance;

public class MarketPage {
	
	WebDriver driver;
	Logger logger;
	FunctionLibrary fLib = new FunctionLibrary();
	
	public MarketPage(){
		this.driver= driver;
		}
	
	public void clickOnMarketTab(WebDriver driver)
	{
		try
		{
			LoggerInstance.logger.info("click on Market Tab");
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "MarketTab"));
		}
		catch(Exception e)
		{
		LoggerInstance.logger.info("Not able to click on Market Tab");
		System.out.println("Exception: " + e.getMessage());
		}
	}
	
	/* Method Name: clickOnETFZoneTab
     * Description: Function to click on ETFZone tab.
     * Parameters:  
     * Created By: Rohit Miglani
     * Created Date: 13-08-2014
     * */
	
	public void clickOnETFZoneTab(WebDriver driver)
	{
		try
		{
			FunctionLibrary.clickMenuItem(driver,fLib.getWebelment(driver, "MarketTab"), fLib.getWebelment(driver, "ETFZoneTab"));
			//FunctionLibrary.clickWebLink(we_ETFZoneTab);
			LoggerInstance.logger.info("click on ETF Zone tab");
		}
		catch (Exception e) {
			LoggerInstance.logger.info("not able to click ETF Zone tab");
			System.out.println("Exception: " + e.getMessage());
		}
	}
	
	/* Method Name: selectValueFromUnderlying
     * Description: Function to select value from Underlying dropdown
     * Parameters:  
     * Created By: Rohit Miglani
     * Created Date: 13-08-2014
     * */
	public void selectValueFromUnderlying(WebDriver driver, String toselect){
		try{
			LoggerInstance.logger.info("Select value "+toselect+" from underlying dropdown");
			FunctionLibrary.selectItemFromWeblist(fLib.getWebelment(driver, "Underlying"),toselect );
			Thread.sleep(3000);
		}catch (Exception e) {
			LoggerInstance.logger.info("Unable to Select "+toselect+"from underlying dropdown");
			System.out.println("Exception: " + e.getMessage());
		}
		
	}
	/* Method Name: verifyNegativeValueColor
     * Description: Function to verify negative value color is red.
     * Parameters:  
     * Created By: Rohit Miglani
     * Created Date: 13-08-2014
     * */
	public boolean verifyNegativeValueColor(WebDriver driver){
		boolean result = false;
		try{
			
			LoggerInstance.logger.info("verify the color of negative value is Red");
			String result2=FunctionLibrary.getrgbaColor(fLib.getWebelment(driver, "NegativeValue"));
			result= FunctionLibrary.verifyStringsAreSame(result2,"#BB202F");
		}
		catch(Exception e){
			LoggerInstance.logger.info("unable to verify the color");
			System.out.println("Exception: " + e.getMessage());
		}
		return result;
	}
	
	/* Method Name: clickOnBSETab
     * Description: Function to click on BSE tab.
     * Parameters:  
     * Created By: Rohit Miglani
     * Created Date: 13-08-2014
     * */
	public void clickOnBSETab(WebDriver driver)
	{
		try
		{
			LoggerInstance.logger.info("click on BSE Tab");
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "BSETAb"));
		}
		catch(Exception e)
		{
			LoggerInstance.logger.info("Not able to click on BSE Tab");
			System.out.println("Exception: " + e.getMessage());
		}
	}
	/* Method Name: clickOnNSETab
     * Description: Function to click on NSE tab.
     * Parameters:  
     * Created By: Rohit Miglani
     * Created Date: 13-08-2014
     * */
		public void clickOnNSETab(WebDriver driver)
		{
			try
			{
				LoggerInstance.logger.info("click on NSE Tab");
				FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "NSETAb"));
			}
			catch(Exception e)
			{
				LoggerInstance.logger.info("Not able to click on NSE Tab");
				System.out.println("Exception: " + e.getMessage());
			}
		}
		/* Method Name: verifyOpenLowHighPreCloseIsDisplayed
	     * Description: Function to verify Open,Low,High,PreClose is displayed.
	     * Parameters:  
	     * Created By: Rohit Miglani
	     * Created Date: 13-08-2014
	     * */
		public boolean verifyOpenLowHighPreCloseIsDisplayed(WebDriver driver){
			boolean result= false;
			try{
				//FunctionLibrary.waitTillElementPresent(driver, 10, By.cssSelector(csspath_OpenLowHighPreClose));
				 result=fLib.getWebelment(driver, "OpenLowHighPreClose").isDisplayed();
				 if (result==true)
				 LoggerInstance.logger.info("Open, low, Hig, Pre Close is displayed");
				 return result;
			}
			catch (Exception e) 
			{
				LoggerInstance.logger.info("Open, low, Hig, Pre Close is not displayed");
				System.out.println("Exception: " + e.getMessage());
				return result;
			}
		}
		/* Method Name: verifyMarketPageIsDisplayed
	     * Description: Function to verify Market Page is displayed.
	     * Parameters:  
	     * Created By: Rohit Miglani
	     * Created Date: 13-08-2014
	     * */
		public boolean verifyMarketPageIsDisplayed(WebDriver driver){
			boolean result= false;
			try{
				
				//FunctionLibrary.waitTillElementPresent(driver, 10, fLib.getWebelment(driver, "MarketToday"));
				Thread.sleep(5000); 
				result=fLib.getWebelment(driver, "MarketToday").isDisplayed();
				 if (result==true)
				 LoggerInstance.logger.info("User is navigated to Market Page");
				 return result;
			}
			catch (Exception e) 
			{
				LoggerInstance.logger.info("User is not navigated to Market Page"+e.getMessage());
				System.out.println("Exception: " + e.getMessage());
				return result;
			}
		}
		
		/* Method Name: verifyETFZonePageIsDisplayed
	     * Description: Function to verify ETFZone Page is displayed.
	     * Parameters:  
	     * Created By: Rohit Miglani
	     * Created Date: 13-08-2014
	     * */
		public boolean verifyETFZonePageIsDisplayed(WebDriver driver){
			boolean result= false;
			try{	
				//FunctionLibrary.waitTillElementPresent(driver, 10, By.id(id_ETFZonePage));
				 result=fLib.getWebelment(driver, "ETFZonePage").isDisplayed();
				 if (result==true)
				 LoggerInstance.logger.info("User is navigated to ETFZone Page");
				 return result;
			}
			catch (Exception e) 
			{
				LoggerInstance.logger.info("User is not navigated to ETFZone Page");
				System.out.println("Exception: " + e.getMessage());
				return result;
			}
		}
		/* Method Name: verifyGoldETFTableIsDisplayed
	     * Description: Function to verify Gold ETF Table is displayed.
	     * Parameters:  
	     * Created By: Rohit Miglani
	     * Created Date: 13-08-2014
	     * */
		public boolean verifyGoldETFTableIsDisplayed(WebDriver driver){
			boolean result= false;
			try{
				 //FunctionLibrary.waitTillElementPresent(driver, 10, By.cssSelector(csspath_GoldETFTAble));
				 result=fLib.getWebelment(driver, "GoldETFTAble").isDisplayed();
				 if (result==true)
				 LoggerInstance.logger.info("User is navigated to Gold ETF Table");
				 return result;
			}
			catch (Exception e) 
			{
				LoggerInstance.logger.info("User is not navigated to Gold ETF Table");
				System.out.println("Exception: " + e.getMessage());
				return result;
			}
		}
		
		/* Method Name: verifyNonGoldETFTableIsDisplayed
	     * Description: Function to verify Non Gold ETF Table is displayed.
	     * Parameters:  
	     * Created By: Rohit Miglani
	     * Created Date: 13-08-2014
	     * */
		public boolean verifyNonGoldETFTableIsDisplayed(WebDriver driver){
			boolean result= false;
			try{
				//Thread.sleep(3000);
					//FunctionLibrary.waitTillElementPresent(driver, 10, By.cssSelector(csspath_NonGoldETFTable));
				 result=fLib.getWebelment(driver, "NonGoldETFTable").isDisplayed();
				 if (result==true)
				 LoggerInstance.logger.info("User is navigated to Non Gold ETF Table");
				 return result;
			}
			catch (Exception e) 
			{
				LoggerInstance.logger.info("User is not navigated to Non Gold ETF Table");
				System.out.println("Exception: " + e.getMessage());
				return result;
			}
		}
		
		/* Method Name: verifyCurrentValueOfSensexIsDisplayed
	     * Description: Function to verify Current value of Sensex is displayed.
	     * Parameters:  
	     * Created By: Rohit Miglani
	     * Created Date: 13-08-2014
	     * */
		public boolean verifyCurrentValueOfSensexIsDisplayed(WebDriver driver){
			boolean result= false;
			try{
				//FunctionLibrary.waitTillElementPresent(driver, 10, By.id(id_SensexCurrentValue));
				 result=fLib.getWebelment(driver, "SensexCurrentValue").isDisplayed();
				 if (result==true)
				 LoggerInstance.logger.info("Current value of Sensex is displayed");
				 return result;
			}
			catch (Exception e) 
			{
				LoggerInstance.logger.info("Current value of Sensex is not displayed");
				System.out.println("Exception: " + e.getMessage());
				return result;
			}
		}
		/* Method Name: verifyCurrentValueOfNiftyIsDisplayed
	     * Description: Function to verify Current value of Nifty is displayed.
	     * Parameters:  
	     * Created By: Rohit Miglani
	     * Created Date: 13-08-2014
	     * */
		public boolean verifyCurrentValueOfNiftyIsDisplayed(WebDriver driver){
			boolean result= false;
			try{
				//FunctionLibrary.waitTillElementPresent(driver, 10, By.id(id_SensexCurrentValue));
				 result=fLib.getWebelment(driver, "SensexCurrentValue").isDisplayed();
				 if (result==true)
				 LoggerInstance.logger.info("Current value of Nifty is displayed");
				 return result;
			}
			catch (Exception e) 
			{
				LoggerInstance.logger.info("Current value of Nifty is not displayed");
				System.out.println("Exception: " + e.getMessage());
				return result;
			}
		}
		
		/* Method Name: verifyValueChangeOfNiftyIsDisplayed
	     * Description: Function to verify value Change of Nifty is displayed.
	     * Parameters:  
	     * Created By: Rohit Miglani
	     * Created Date: 13-08-2014
	     * */
		public boolean verifyValueChangeOfNiftyIsDisplayed(WebDriver driver){
			boolean result= false;
			try{
				//FunctionLibrary.waitTillElementPresent(driver, 10, By.id(id_SensexValueChange));
				 result=fLib.getWebelment(driver, "SensexValueChange").isDisplayed();
				 if (result==true)
				 LoggerInstance.logger.info("Value  of Nifty is displayed");
				 return result;
			}
			catch (Exception e) 
			{
				System.out.println("Exception: " + e.getMessage());
				LoggerInstance.logger.info("Value change of Nifty is not displayed");
				return result;
			}
		}
		/* Method Name: verifyValueChangeOfSensexIsDisplayed
	     * Description: Function to verify value Change of Sensex is displayed.
	     * Parameters:  
	     * Created By: Rohit Miglani
	     * Created Date: 13-08-2014
	     * */
		public boolean verifyValueChangeOfSensexIsDisplayed(WebDriver driver){
			boolean result= false;
			try{
				//FunctionLibrary.waitTillElementPresent(driver, 10, By.id(id_SensexValueChange));
				 result=fLib.getWebelment(driver, "SensexValueChange").isDisplayed();
				 if (result==true)
				 LoggerInstance.logger.info("Value change of Sensex is displayed");
				 return result;
			}
			catch (Exception e) 
			{
				LoggerInstance.logger.info("Value change of Sensex is not displayed");
				System.out.println("Exception: " + e.getMessage());
				return result;
			}
		}
		
		/* Method Name: verifyPercentageChangeOfSensexIsDisplayed
	     * Description: Function to verify Percentage Change of Sensex is displayed.
	     * Parameters:  
	     * Created By: Rohit Miglani
	     * Created Date: 13-08-2014
	     * */
		
		public boolean verifyPercentageChangeOfSensexIsDisplayed(WebDriver driver){
			boolean result= false;
			try{
				//FunctionLibrary.waitTillElementPresent(driver, 10, By.id(id_SensexPercentageChange));
				 result=fLib.getWebelment(driver, "SensexPercentageChange").isDisplayed();
				 if (result==true)
				 LoggerInstance.logger.info("Percentage change of Sensex is displayed");
				 return result;
			}
			catch (Exception e) 
			{
				LoggerInstance.logger.info("Percentage change of Sensex is not displayed");
				System.out.println("Exception: " + e.getMessage());
				return result;
			}
		}
		
		/* Method Name: verifyPercentageChangeOfNiftyIsDisplayed
	     * Description: Function to verify Percentage Change of Nifty is displayed.
	     * Parameters:  
	     * Created By: Rohit Miglani
	     * Created Date: 13-08-2014
	     * */
		public boolean verifyPercentageChangeOfNiftyIsDisplayed(WebDriver driver){
			boolean result= false;
			try{
				//FunctionLibrary.waitTillElementPresent(driver, 10, By.id(id_SensexPercentageChange));
				 result=fLib.getWebelment(driver, "SensexPercentageChange").isDisplayed();
				 if (result==true)
				 LoggerInstance.logger.info("Percentage change of Nifty is displayed");
				 return result;
			}
			catch (Exception e) 
			{
				LoggerInstance.logger.info("Percentage change of Nifty is not displayed");
				System.out.println("Exception: " + e.getMessage());
				return result;
			}
		}
		
}

