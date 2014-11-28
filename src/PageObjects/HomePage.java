package PageObjects;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import FunctionLibraries.FunctionLibrary;
import FunctionLibraries.InputData;
import Logger.LoggerInstance;

public class HomePage {

	final WebDriver driver;

	FunctionLibrary fLib = new FunctionLibrary();
	InputData iData = new InputData();
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	/* Method Name: verifyTabDisplay
     * Description: This method verify all tabs
     * Created By: Anjul Tiwari
     * Created Date: 23-08-2014
     * */
 
	public boolean verifyTabDisplay(WebDriver driver) {
		boolean result=false;
		boolean result1=false;
		boolean result2=false;
		boolean result3=false;
		boolean result4=false;
		boolean result5=false;
		boolean result6=false;
		boolean result7=false;
		boolean result8=false;
		boolean result9=false;
		boolean result10=false;
		
		try{
		
		LoggerInstance.logger.info("click on Market Tab");
		result1 = FunctionLibrary.verifyTextWebelement("Markets Now", fLib.getWebelment(driver, "MarketNowTab"));
		LoggerInstance.logger.info("click on Companies Tab");
		result2=FunctionLibrary.verifyTextWebelement("Companies", fLib.getWebelment(driver, "Companies_tab"));
		LoggerInstance.logger.info("click on Mutual Funds Tab");
		result3=FunctionLibrary.verifyTextWebelement("Mutual Funds", fLib.getWebelment(driver, "MututalFundsTab"));
		LoggerInstance.logger.info("click on IPO Tab");
		result4=FunctionLibrary.verifyTextWebelement("IPO", fLib.getWebelment(driver, "IPOTab"));
		LoggerInstance.logger.info("click on Research Hub Tab");
		result5=FunctionLibrary.verifyTextWebelement("Research Hub", fLib.getWebelment(driver, "ResearchHubTab"));
		LoggerInstance.logger.info("click on Widget Gallery Tab");
		result6=FunctionLibrary.verifyTextWebelement("Widget Gallery", fLib.getWebelment(driver, "WidgetGalleryTab"));
		LoggerInstance.logger.info("click on Resources Tab");
		result7=FunctionLibrary.verifyTextWebelement("Resources", fLib.getWebelment(driver, "ResourcesTab"));
		LoggerInstance.logger.info("click on Quick Link button");
		result8=FunctionLibrary.verifyTextWebelement("QUICK LINKS", fLib.getWebelment(driver, "QuickLink"));
		
		
		if(result1==true && result2==true && result3==true && result4==true && result5==true && result6==true && result7==true && result8==true){
		result=true;
			return result;
		}}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
		LoggerInstance.logger.info("Not able to click on Tab");
		return result;
		}
		return result;	}	
	
	/* Method Name: clickOnSquareButton
     * Description: This method verify after click on square button sensex is displayed or not 
     * Created By: Anjul Tiwari
     * Created Date: 23-08-2014
     * */
	public boolean clickOnSquareButton(WebDriver driver) {
		boolean result=false;
		try{
		LoggerInstance.logger.info("click on square button");
		FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "SquareButton"));
		LoggerInstance.logger.info("click on SENSEX link");
		result=FunctionLibrary.verifyTextWebelement("SENSEX", fLib.getWebelment(driver, "Sensex"));
		if(result==true)
			return result;
	}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to click on Tab");
		return result;
		}
		return result;
	}		
	
	/* Method Name: verifyLatestNewsSection
     * Description: This method click on verify Latest news section.
     * Created By: Anjul Tiwari
     * Created Date: 23-08-2014
     * */
	public boolean verifyLatestNewsSection(WebDriver driver) {
		boolean result= false;
		try{
			LoggerInstance.logger.info("click on Latest News button");
			result=FunctionLibrary.verifyTextWebelement("Latest News", fLib.getWebelment(driver, "LatestNews"));
			if (result==true)
				LoggerInstance.logger.info("click on Latest News button");
				return result;
		}
	catch(Exception e)
	{
		System.out.println("Exception: " + e.getMessage());
	LoggerInstance.logger.info("Not able to click on Latest News button");
	return result;
	}
}	
	public boolean verifyLogoImage(WebDriver driver) {
		boolean result=false;
		
		try{
		LoggerInstance.logger.info("verify logo image");
		
		File directory = new File ("");
		
		String absolutepath	=	directory.getAbsolutePath();
		
		String logoFile = absolutepath + "\\finalaya_logo.jpg";
		
		
		
		result=FunctionLibrary.verifyImage(fLib.getWebelment(driver, "FinalayaImage"), logoFile);
		
		if(result==true)
			return result;
	}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to verify logo image");
		return result;
		}
		return result;
	}
	
	/* Method Name: verifySearchOnHomePage
     * Description: This method verify search functionality 
     * Created By: Anjul Tiwari
     * Created Date: 23-08-2014
     * */
	public boolean verifySearchOnHomePage(WebDriver driver) {
		boolean result= false;
		try{
	    LoggerInstance.logger.info("sends company name on search bar");
	    
	    String companyName=iData.readInputData("company_name");
	    
	    
	    fLib.getWebelment(driver, "SearchText").sendKeys(companyName);
		LoggerInstance.logger.info("Click on search button");
		FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "SearchButton"));
		Thread.sleep(5000);
		LoggerInstance.logger.info("Verify searched company name");
		result = FunctionLibrary.verifyTextWebelement("Real Strips Ltd", fLib.getWebelment(driver, "RSTText"));
		System.out.println("RTTEST: " + result + "sd: " + fLib.getWebelment(driver, "RSTText").getText());
		if (result==true){
			return result;
		}
	}catch(Exception e)
	{
		System.out.println("Exception: " + e.getMessage());
	LoggerInstance.logger.info("Not able to click on Tab");
	return result;
	}
		return result;
}

	public boolean verifyTabsquence(WebDriver driver) {
		// TODO Auto-generated method stub
		return true;
	}
	}


