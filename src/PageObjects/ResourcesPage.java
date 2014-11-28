package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import FunctionLibraries.FunctionLibrary;
import Logger.LoggerInstance;

public class ResourcesPage {
	WebDriver driver;
	FunctionLibrary fLib = new FunctionLibrary();
	
	
	/* Method Name: Function to click on Resource Tab
     * Description: 
     * Created By: Mohd Suhail
     * Created Date: 13-08-2014
     * */
	public void clickOnResourceTab() {
		try {

		//	LoggerInstance.logger.info("click on Resource Tab")
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "ResourceTab"));

		} catch (Exception e) {
			LoggerInstance.logger.info("Not able to click on Resource Tab");
		}
	}

	public ResourcesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	/* Method Name: KeyEconomic Indicators Page is Displayed
     * Description: Verify SubTab KeyEconomic Indicators Page is Displayed
     * Created By: Mohd Suhail
     * Created Date: 13-08-2014
     * */
	public Boolean verify_KeyEconomic() {
		boolean result = false;
		try {
			result = fLib.getWebelment(driver, "KeyEconomicIndicator").isDisplayed();
			if (result == true)
				LoggerInstance.logger.info("Key_Economic is displayed.");
			return result;
		} catch (Exception e) {
			LoggerInstance.logger.info("Key_Economic is not displayed.");
			return result;
		}
	}

	

	/* Method Name: GeneralEconomicIndicators is displayed
     * Description: Verify  GeneralEconomicIndicators is displayed
     * Created By: Mohd Suhail
     * Created Date: 13-08-2014
     * */

	public Boolean verify_GeneralEconomicIndicatorsIsDisplayed() {
		boolean result = false;
		try {
			result = fLib.getWebelment(driver, "GeneralEconomicIndicators").isDisplayed();
			if (result == true)
				LoggerInstance.logger
						.info("GeneralEconomicIndicators is displayed.");
			return result;
		} catch (Exception e) {
			LoggerInstance.logger
					.info("GeneralEconomicIndicators is not displayed.");
			return result;
		}
	}

	
	/* Method Name: Verify CCilIndicatorsIndices is displayed
     * Description: Verify  CCilIndicatorsIndices is displayed
     * Created By: Mohd Suhail
     * Created Date: 13-08-2014
     * */
	public Boolean verify_CCilIndicatorsIndicesIsDisplayed() {
		boolean result = false;
		try {
			result = fLib.getWebelment(driver, "CCilIndicatorsIndices").isDisplayed();
			if (result == true)
				LoggerInstance.logger
						.info("CCilIndicatorsIndices is displayed.");
			return result;
		} catch (Exception e) {
			LoggerInstance.logger
					.info("CCilIndicatorsIndices is not displayed.");
			return result;
		}
	}

	
	
		/* Method Name:  NSE FIMMDA Indicators is displayed 
	     * Description: Verify  NSE FIMMDA Indicators is displayed 
	     * Created By: Mohd Suhail
	     * Created Date: 13-08-2014
	     * */
	public Boolean verify_NSEFIMMDAIndicatorsIsDisplayed() {
		boolean result = false;
		try {
			result = fLib.getWebelment(driver, "NSEFIMMDAIndicators").isDisplayed();
			if (result == true)
				LoggerInstance.logger.info("NSEFIMMDAIndicators is displayed.");
			return result;
		} catch (Exception e) {
			LoggerInstance.logger.info("NSEFIMMDAIndicators is not displayed.");
			return result;
		}
	}
	

	/* Method Name: General Economic Contains Indicator Name Column
     * Description: Verify General Economic Contains Indicator Name
     * Created By: Mohd Suhail
     * Created Date: 13-08-2014
     * */

	public Boolean verify_GeneralEconomicContainsIndicator() {

		boolean result = false;

		result = fLib.getWebelment(driver, "IndicatorName").isDisplayed();
		try {
			if (result == true)

				LoggerInstance.logger
						.info("General Economic Contains IndicatorName Column.");
			return result;

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger
					.info("GeneralEconomicIndicators does not contains IndicatorName Column.");
			return result;
		}
	}

	
	/* Method Name: General Economic Contains RBI Policy Indicator Column.
     * Description: General Economic Contains RBI Policy Indicator.
     * Created By: Mohd Suhail
     * Created Date: 13-08-2014
     * */

	public Boolean verify_GeneralEconomicContainsRBIPolicyIndicator() {

		boolean result = false;

		result = fLib.getWebelment(driver, "RBIPolicyIndicators").isDisplayed();
		try {
			if (result == true)
				LoggerInstance.logger
						.info("General Economic Contains RBI Policy Indicator Column.");
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger
					.info("GeneralEconomicIndicators does not contains RBI Policy Indicator Column.");
			return result;
		}
	}

	
	/* Method Name: General Economic Contains RBI Reference Exchange Rates Column.
     * Description: General Economic Contains RBI Reference Exchange Rates.
     * Created By: Mohd Suhail
     * Created Date: 13-08-2014
     * */

	public Boolean verify_GeneralEconomicContainsRBIReferenceExchange() {

		boolean result = false;
		try {
			result = fLib.getWebelment(driver, "RBIReferExchRates").isDisplayed();
			if (result == true)

				LoggerInstance.logger
						.info("General Economic Contains RBI Reference Exchange Rates Column.");
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger
					.info("GeneralEconomicIndicators does not contains RBI Reference Exchange Rates Column.");
			return result;
		}

	}

}
