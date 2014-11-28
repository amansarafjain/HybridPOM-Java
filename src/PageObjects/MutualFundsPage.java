package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import FunctionLibraries.FunctionLibrary;
import FunctionLibraries.InputData;
import Logger.LoggerInstance;

public class MutualFundsPage {

	final WebDriver driver;
	FunctionLibrary fLib = new FunctionLibrary();
	InputData iData = new InputData();
		
	private final String expectedTextMF = "Overview of Mutual Funds, Latest NAVs, Best/Worst performing schemes, Corp Actions, AUM-wise Top Schemes/AMCs, Company/ Industry exposure to MF, NFO updates";
	private final String expectedTextCF = "Allows to compare funds with other funds/indices in a graphical layout. This feature also compares fundamentals and NAVs upto five funds in one go.";
	
	private final String expectedCorpusColor = "#006699";
	private final String expectedCorpusGainersColor = "#108900";
	private final String expectedCorpusLosersColor = "#FC2A00";
	private final String expectedNAVGainersColor = "#108900";
	private final String expectedNAVLosersColor = "#FC2A00";
	
	private String valueCorpusGainersOnMSCPage;
	private String valueCorpusLosersOnMSCPage;
	
	// This is a constructor, as every page need a base driver to find web elements
	public MutualFundsPage(WebDriver driver) {
		this.driver = driver;
	}
	/*
	 * Method Name: hoverMouse 
	 * Description: Function to hover mouse over Mutual Funds tab
	 * Parameters:
	 * Created By: Darwin
     * Created Date: 21-08-2014
	 */
	public void hoverMouse() {
		try {
			LoggerInstance.logger.info("Hover mouse over Mutual Funds tab");
			Actions action = new Actions(driver);
			action.moveToElement(fLib.getWebelment(driver, "MutualFundTab")).build().perform();
		} catch (Exception e) {
			LoggerInstance.logger.info("Not able to hover mouse over Mutual Funds tab");
			System.out.println("Exception: " + e.getMessage());
		}
	}
	/*
	 * Method Name: verifyTextMF 
	 * Description: Verify that On right of subtabs,text is displayed
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 21-08-2014
	 */
	public boolean verifyTextMF() {
		boolean result = false;
		try{
			LoggerInstance.logger.info("Verify that On right of subtabs, text is displayed");
			result = FunctionLibrary.verifyTextWebelement(expectedTextMF, fLib.getWebelment(driver, "ActualTextMF"));
		}
		catch(Exception e){
			LoggerInstance.logger.info("unable to Verify that On right of subtabs, text is displayed");
			System.out.println("Exception: " + e.getMessage());
		}
		return result;
	}
	/*
	 * Method Name: clickOnFundHouses 
	 * Description: click On FundHouses item 
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 21-08-2014
	 */
	public void clickOnFundHouses(){
		try
		{	
			LoggerInstance.logger.info("click on Fund Houses");
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "FundHouses"));
		} catch(Exception e)
		{
			LoggerInstance.logger.info("Not able to click on Fund Houses");
			System.out.println("Exception: " + e.getMessage());
		}
	}
	/*
	 * Method Name: clickOnFunds 
	 * Description: click On Funds item 
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 21-08-2014
	 */
	public void clickOnFunds(){
		try
		{	
			LoggerInstance.logger.info("click on Funds");
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "Funds"));
		}
		catch(Exception e)
		{
			LoggerInstance.logger.info("Not able to click on Funds");
			System.out.println("Exception: " + e.getMessage());
		}
	}
	/*
	 * Method Name: clickOnFundScreener 
	 * Description: click On FundScreener item
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 21-08-2014
	 */
	public void clickOnFundScreener(){
		try
		{	
			LoggerInstance.logger.info("click on Fund Screener");
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "FundScreener"));
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to click on Fund Screener");
		}
	}
	/*
	 * Method Name: clickOnPortChur 
	 * Description: click On Portfolio Churning item
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 21-08-2014
	 */
	public void clickOnPortChur(){
		try
		{	
			LoggerInstance.logger.info("click on Portfolio Churning");
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "PortChur"));
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to click on Portfolio Churning");
		}
	}
	/*
	 * Method Name: clickOnCompareFunds 
	 * Description: click On CompareFunds item
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 21-08-2014
	 */
	public void clickOnCompareFunds(WebDriver driver){
		try
		{	
			LoggerInstance.logger.info("click on Compare Funds");
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "CompareFunds"));
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to click on Compare Funds");
		}
	}
	/*
	 * Method Name: clickOnMonthlySCard 
	 * Description: click On Monthly Score Card item
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 21-08-2014
	 */
	public void clickOnMonthlySCard(WebDriver driver){
		
		try
		{	
			LoggerInstance.logger.info("click on Monthly Score Card");
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "MonthlySCard"));
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to click on Monthly Score Card");
		}
	}
	/*
	 * Method Name: clickOnNewFOffers 
	 * Description: click On New Fund Offers item
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 22-08-2014
	 */
	public void clickOnNewFOffers(){
		try
		{	
			LoggerInstance.logger.info("click on New Fund Offers");
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "NewFOffers"));
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to click on New Fund Offers");
		}
	}
	/*
	 * Method Name: verifyFundHousesNavigation 
	 * Description: verify FundHouses page is opened
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 22-08-2014
	 */
	public boolean verifyFundHousesNavigation(WebDriver driver){
		boolean result= false;
		try{
		 result=fLib.getWebelment(driver, "FHHeader").isDisplayed();
		 if (result)
			 LoggerInstance.logger.info("User is navigated to Fund Houses Page");
		 return result;
			}
		catch (Exception e) 
			{
			LoggerInstance.logger.info("User is not navigated to Fund Houses Page");
			System.out.println("Exception: " + e.getMessage());
			return result;
			}
	}
	/*
	 * Method Name: verifyFundsNavigation 
	 * Description: verify Funds page is opened
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 22-08-2014
	 */
	public boolean verifyFundsNavigation(){
		boolean result= false;
		try{
		 result=fLib.getWebelment(driver, "FHeader").isDisplayed();
		 if (result)
		 LoggerInstance.logger.info("User is navigated to Funds Page");
		 return result;
			}
		catch (Exception e) 
			{
			LoggerInstance.logger.info("User is not navigated to Funds Page");
			System.out.println("Exception: " + e.getMessage());
			return result;
			}
	}
	/*
	 * Method Name: verifyFundScreenerNavigation 
	 * Description: verify FundScreener page is opened
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 22-08-2014
	 */
	public boolean verifyFundScreenerNavigation(){
		boolean result= false;
		try{
		 result=fLib.getWebelment(driver, "FSHeader").isDisplayed();
		 if (result)
		 LoggerInstance.logger.info("User is navigated to Fund Screener Page");
		 return result;
			}
		catch (Exception e) 
			{
			LoggerInstance.logger.info("User is not navigated to Fund Screener Page");
			System.out.println("Exception: " + e.getMessage());
			return result;
			}
	}
	/*
	 * Method Name: verifyPortChurNavigation 
	 * Description: verify Portfolio Churning page is opened
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 22-08-2014
	 */
	public boolean verifyPortChurNavigation(){
		boolean result= false;
		try{
		 result=fLib.getWebelment(driver, "PCHeader").isDisplayed();
		 if (result)
		 LoggerInstance.logger.info("User is navigated to Portfolio Churning Page");
		 return result;
			}
		catch (Exception e) 
			{
			LoggerInstance.logger.info("User is not navigated to Portfolio Churning Page");
			System.out.println("Exception: " + e.getMessage());
			return result;
			}
	}
	/*
	 * Method Name: verifyCompFundsNavigation 
	 * Description: verify Compare Funds page is opened
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 26-08-2014
	 */
	public boolean verifyCompFundsNavigation(){
		boolean result= false;
		try{
		 result=fLib.getWebelment(driver, "CFHeader").isDisplayed();
		 if (result)
		 LoggerInstance.logger.info("User is navigated to Compare Funds Page");
		 return result;
			}
		catch (Exception e) 
			{
			LoggerInstance.logger.info("User is not navigated to Compare Funds Page");
			System.out.println("Exception: " + e.getMessage());
			return result;
			}
	}
	/*
	 * Method Name: verifyMSCNavigation 
	 * Description: verify Monthly Score Card page is opened
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 26-08-2014
	 */	
	public boolean verifyMSCNavigation(){
		boolean result= false;
		try{
		 result=fLib.getWebelment(driver, "MSCHeader").isDisplayed();
		 if (result)
		 LoggerInstance.logger.info("User is navigated to Monthly Score Card Page");
		 return result;
			}
		catch (Exception e) 
			{
			LoggerInstance.logger.info("User is not navigated to Monthly Score Card Page");
			System.out.println("Exception: " + e.getMessage());
			return result;
			}
	}
	/*
	 * Method Name: verifyNFONavigation 
	 * Description: verify New Fund Offers page is opened
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 26-08-2014
	 */	
	public boolean verifyNFONavigation(){
		boolean result= false;
		try{
		 result=fLib.getWebelment(driver, "NFOHeader").isDisplayed();
		 if (result)
		 LoggerInstance.logger.info("User is navigated to New Fund Offers Page");
		 return result;
			}
		catch (Exception e) 
			{
			LoggerInstance.logger.info("User is not navigated to New Fund Offers Page");
			System.out.println("Exception: " + e.getMessage());
			return result;
			}
	}

	/*
	 * Method Name: verifyCorpusColour 
	 * Description: Verify Top 5 Fund Houses in terms of Corpus (displayed in BLUE)
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 26-08-2014
	 */
/*	public boolean verifyCorpusColour() {
		boolean result = false;
		try {
			LoggerInstance.logger.info("Verifying color of Top 5 Fund Houses in terms of Corpus displayed in BLUE");
			String colorcode = FunctionLibrary.getrgbaColor(we_Corpus);
			if (colorcode==expectedCorpusColor)
				result=true;
				return result;
		} catch (Exception e) {
			LoggerInstance.logger.info("Not able to verify color of Top 5 Fund Houses in terms of Corpus displayed in BLUE");
		}
		return result;
	}*/
	
	public boolean verifyCorpusColour(WebDriver driver) {
		boolean result = false;
		try {
			LoggerInstance.logger.info("Verifying color of Top 5 Fund Houses in terms of Corpus displayed in BLUE");
			
			result=FunctionLibrary.verifyTextColor(fLib.getWebelment(driver, "Corpus"),expectedCorpusColor);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to verify color of Top 5 Fund Houses in terms of Corpus displayed in BLUE");
		}
		return result;
	}
	
	/*
	 * Method Name: verifyCorpusGainersColour 
	 * Description: Verify Top 5 Fund Houses Gainers on Corpus basis(displayed in GREEN)
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 26-08-2014
	 */
	public boolean verifyCorpusGainersColour() {
		boolean result = false;
		try {
			LoggerInstance.logger.info("Verifying color of Top 5 Fund Houses Gainers on Corpus basis displayed in GREEN");
			result=FunctionLibrary.verifyTextColor(fLib.getWebelment(driver, "CorpusGainers"),expectedCorpusGainersColor);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to verify color of Top 5 Fund Houses Gainers on Corpus basis displayed in GREEN");
		}
		return result;
	}
	/*
	 * Method Name: verifyCorpusLosersColour 
	 * Description: Verify Top 5 Fund Houses Losers on Corpus basis(displayed in RED)
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 26-08-2014
	 */
	public boolean verifyCorpusLosersColour() {
		boolean result = false;
		try {
			LoggerInstance.logger.info("Verifying color of Top 5 Fund Houses Losers on Corpus basis displayed in RED");
			result=FunctionLibrary.verifyTextColor(fLib.getWebelment(driver, "CorpusLosers"),expectedCorpusLosersColor);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to verify color of Top 5 Fund Houses Losers on Corpus basis displayed in RED");
		}
		return result;
	}
	/*
	 * Method Name: verifyNAVGainersColour 
	 * Description: Verify Top 5 NAV (%) Gainers (displayed in GREEN)
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 26-08-2014
	 */
	public boolean verifyNAVGainersColour() {
		boolean result = false;
		try {
			LoggerInstance.logger.info("Verifying color of Top 5 NAV (%) Gainers displayed in GREEN");
			result=FunctionLibrary.verifyTextColor(fLib.getWebelment(driver, "NAVGainers"),expectedNAVGainersColor);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to verify color of Top 5 NAV (%) Gainers displayed in GREEN");
		}
		return result;
	}
	/*
	 * Method Name: verifyNAVLosersColour 
	 * Description: Verify Top 5 NAV (%) Losers tables (displayed in RED)
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 26-08-2014
	 */
	public boolean verifyNAVLosersColour() {
		boolean result = false;
		try {
			LoggerInstance.logger.info("Verifying color of Top 5 NAV (%) Losers tables displayed in RED");
			result=FunctionLibrary.verifyTextColor(fLib.getWebelment(driver, "NAVLosers"),expectedNAVLosersColor);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to verify color of Top 5 NAV (%) Losers tables displayed in RED");
		}
		return result;
	}
	/*
	 * Method Name: verifyValueCorpusGainers 
	 * Description: Verify same Corpus Amount is displayed on page for first record of "Top 5 Fund Houses Gainers on Corpus basis
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 26-08-2014
	 */
	public boolean verifyValueCorpusGainers(WebDriver driver) {
		boolean result = false;
		try {		
			LoggerInstance.logger.info("Verifying value of Corpus Gainers");
		valueCorpusGainersOnMSCPage = fLib.getWebelment(driver, "valueCorpusGainerFirstRow").getText();
		FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "CorpusGainers_FirstRow"));
		result=FunctionLibrary.verifyTextWebelement(valueCorpusGainersOnMSCPage, fLib.getWebelment(driver, "actualValueOnCompPage"));
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to Verify value of Corpus Gainers");
		}
		return result;
	}
	/*
	 * Method Name: verifyValueCorpusLosers 
	 * Description: Verify same Corpus Amount is displayed on page for first record of "Top 5 Fund Houses Losers on Corpus basis
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 26-08-2014
	 */
	public boolean verifyValueCorpusLosers(WebDriver driver) {
		boolean result = false;
		try {
			LoggerInstance.logger.info("Verifying value of Corpus Losers");
		valueCorpusLosersOnMSCPage = fLib.getWebelment(driver, "valueCorpusLosersFirstRow").getText();
		FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "CorpusLosers_FirstRow"));
		result=FunctionLibrary.verifyTextWebelement(valueCorpusLosersOnMSCPage, fLib.getWebelment(driver, "actualValueOnCompPage"));
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to Verify value of Corpus Losers");
		}
		return result;
	}


	/*
	 * Method Name: hoverMouseCF 
	 * Description: Function to hover mouse Compare Funds item
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 26-08-2014
	 */
	public void hoverMouseCF() {
		try {
			LoggerInstance.logger.info("hover mouse over Compare Funds item");
		Actions action = new Actions(driver);
		action.moveToElement(fLib.getWebelment(driver, "MutualFundCF")).build().perform();
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to hover mouse over Compare Funds item");
		}
	}
	/*
	 * Method Name: verifyTextCF 
	 * Description: Function to verify Text
	 * Parameters:
	 * Created By: Darwin
	 * Created Date: 26-08-2014
	 */
	public boolean verifyTextCF(WebDriver driver) {
			boolean result = false;
		try {
			LoggerInstance.logger.info("Verifying text");
			result = FunctionLibrary.verifyTextWebelement(expectedTextCF, fLib.getWebelment(driver, "ActualTextCF"));
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to Verify text");
		}
		return result;
	}
	
	
	/*
	 * Method Name: CompareFundsGraph 
	 * Description: Function to verify Compare Funds Graph is displayed
	 * Parameters:Index1 is value for Index first drop down
	 * 			  Index2 is value for Index second drop down
	 * Created By: Darwin
	 * Created Date: 26-08-2014
	 */
	
	
	public boolean compareFundsGraph(WebDriver driver) throws Throwable {
		boolean result = false;
		try {
			
			LoggerInstance.logger.info("Verifying graph is displayed");
			FunctionLibrary.checkingCheckbox(fLib.getWebelment(driver, "GraphChkBox"));
			FunctionLibrary.checkingCheckbox(fLib.getWebelment(driver, "EquityChkBox"));
			
			String index1 = iData.readInputData("index1");
			String index2 = iData.readInputData("index2");
			
			FunctionLibrary.selectItemFromWeblist(fLib.getWebelment(driver, "DropdownOne"), "Index");
			FunctionLibrary.selectItemFromWeblist(fLib.getWebelment(driver, "DdiOne"), index1);
			FunctionLibrary.selectItemFromWeblist(fLib.getWebelment(driver, "DropdownTwo"), "Index");
			FunctionLibrary.selectItemFromWeblist(fLib.getWebelment(driver, "DdiTwo"), index2);
			fLib.getWebelment(driver, "CompareBtn").click();
			result = fLib.getWebelment(driver, "ImageGraph").isDisplayed();
			if (result){
				LoggerInstance.logger.info("Graph is displayed on page");
			}
			else {
				LoggerInstance.logger.info("Graph is not displayed on page");
				}
			}
		catch(Exception e)
		{
			LoggerInstance.logger.info("Not able to verify if graph is displayed");
			System.out.println("Exception: " + e.getMessage());
		}	
		return result;
	}
}
