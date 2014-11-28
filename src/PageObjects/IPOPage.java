package PageObjects;

/* Description: IPO page object class
 * Created By: Kuldeep Singh
 * Created Date: 16 Aug 2014
 * */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import FunctionLibraries.FunctionLibrary;
import Logger.LoggerInstance;

public class IPOPage {

	WebDriver driver;
	FunctionLibrary fLib = new FunctionLibrary();
	
	
	// This is a constructor, as every page need a base driver to find web
	// elements
	public IPOPage(WebDriver driver) {
		this.driver = driver;
	}

	// Function to click on IPO tab
	public void clickOnIPOTab(WebDriver driver) {
		try {
			LoggerInstance.logger.info("click on IPO Tab");
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "IPOTab"));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to click on Market Tab");
		}
	}

	/*
	 * Method Name: verifyIPOPageLevel 
	 * Description: Function to Verify that user should be navigated to IPO page - verify IPO page level. 
	 * Parameters:
	 * Created By: Kuldeep Singh 
	 * Created Date: 16-08-2014
	 */
	public boolean verifyIPOPageLevel(WebDriver driver) {
		boolean result = false;
		try {
			LoggerInstance.logger.info("User is navigated to IPO page");
			result = FunctionLibrary.verifyTextWebelement("IPO Calendar", fLib.getWebelment(driver, "IPOPageLabel"));
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("User is not navigated to IPO page");
			return result;
		}
	}

	/*
	 * Method Name: verifyCalendarDisplay 
	 * Description: Verify that Calendar is displayed on the page - verify that calendar days are displaying
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 16-08-2014
	 */
	public boolean verifyCalendarDisplay(WebDriver driver) {
		boolean result = false;
		try {
			LoggerInstance.logger.info("Calendar is displayed");
			boolean a = FunctionLibrary.verifyTextWebelement("Sun", fLib.getWebelment(driver, "IPOPageCalDay_Sunday"));
			boolean b = FunctionLibrary.verifyTextWebelement("Mon", fLib.getWebelment(driver, "IPOPageCalDay_Monday"));
			boolean c = FunctionLibrary.verifyTextWebelement("Tue", fLib.getWebelment(driver, "IPOPageCalDay_Tuesday"));
			boolean d = FunctionLibrary.verifyTextWebelement("Wed", fLib.getWebelment(driver, "IPOPageCalDay_Wednesday"));
			boolean e = FunctionLibrary.verifyTextWebelement("Thu", fLib.getWebelment(driver, "IPOPageCalDay_Thursday"));
			boolean f = FunctionLibrary.verifyTextWebelement("Fri", fLib.getWebelment(driver, "IPOPageCalDay_Friday"));
			boolean g = FunctionLibrary.verifyTextWebelement("Sat", fLib.getWebelment(driver, "IPOPageCalDay_Saturday"));
			if (a && b && c && d && e && f && g) {
				result = true;
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Calendar is not displayed");
			result = false;
		}
		return result;
	}

	/*
	 * Method Name: verifyCalendarCurrentMonthAndYearDisplay 
	 * Description: Verify that Calendar current month and year is displayed on the page - verify that calendar current month and year is displaying 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 16-08-2014
	 */
	public boolean verifyCalendarCurrentMonthAndYearDisplay(WebDriver driver) {
		boolean result = false;
		try {
			LoggerInstance.logger.info("Calendar current month and year is displayed");
			result = FunctionLibrary.verifyTextWebelement(FunctionLibrary.getCalendarCurrentMonthAndYear(), fLib.getWebelment(driver, "IPOPageCalCurrentMonthAndYear"));
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Calendar current month and year is not displayed");
			return result;
		}
	}

	/*
	 * Method Name: verifyCalendarNavigationDisplay 
	 * Description: Verify that Calendar navigation is displayed on the right upper side of Calendar - verify calendar navigation is displayed 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 16-08-2014
	 */
	public boolean verifyCalendarNavigationDisplay(WebDriver driver) {
		boolean result = false;
		try {
			LoggerInstance.logger.info("Calendar navigation is displayed on the right upper side of Calendar");
			boolean a = fLib.getWebelment(driver, "IPOPageCal_PreYear").isEnabled();
			boolean b = fLib.getWebelment(driver, "IPOPageCal_PreMonth").isEnabled();
			boolean c = fLib.getWebelment(driver, "IPOPageCal_Today").isDisplayed();
			boolean d = fLib.getWebelment(driver, "IPOPageCal_NextMonth").isEnabled();
			boolean e = fLib.getWebelment(driver, "IPOPageCal_NextYear").isEnabled();
			if (a && b && c && d && e) {
				result = true;
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Calendar navigation is not displayed on the right upper side of Calendar");
			result = false;
		}
		return result;
	}

	/*
	 * Method Name: verifyCalendarColorAndText 
	 * Description: Verify that (Green) Open,(Red) close, (Fellow)Upcoming, (Blue)Listing is displayed - verify color code and text 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 16-08-2014
	 */
	public boolean verifyCalendarColorAndText(WebDriver driver) {
		boolean result = false;
		try {
			LoggerInstance.logger.info("(Green) Open,(Red) close, (Fellow)Upcoming, (Blue)Listing is displayed");
			boolean flag1 = ("#9FE900".equals(FunctionLibrary.getrgbaBackgroundColor(fLib.getWebelment(driver, "IPOPageOpen_Color")))) ? true : false;
			boolean flag2 = ("#D00000".equals(FunctionLibrary.getrgbaBackgroundColor(fLib.getWebelment(driver, "IPOPageClose_Color")))) ? true : false;
			boolean flag3 = ("#E9C500".equals(FunctionLibrary.getrgbaBackgroundColor(fLib.getWebelment(driver, "IPOPageUpcoming_Color")))) ? true : false;
			boolean flag4 = ("#005DE9".equals(FunctionLibrary.getrgbaBackgroundColor(fLib.getWebelment(driver, "IPOPageListing_Color")))) ? true : false;
			boolean flag5 = FunctionLibrary.verifyTextWebelement("Open", fLib.getWebelment(driver, "IPOPageOpen_Text"));
			boolean flag6 = FunctionLibrary.verifyTextWebelement("Close", fLib.getWebelment(driver, "IPOPageClose_Text"));
			boolean flag7 = FunctionLibrary.verifyTextWebelement("Upcoming", fLib.getWebelment(driver, "IPOPageUpcoming_Text"));
			boolean flag8 = FunctionLibrary.verifyTextWebelement("Listing", fLib.getWebelment(driver, "IPOPageListing_Text"));
			if (flag1 && flag2 && flag3 && flag4 && flag5 && flag6 && flag7 && flag8) {
				result = true;
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("(Green) Open,(Red) close, (Fellow)Upcoming, (Blue)Listing is not displayed");
			result = false;
		}
		return result;
	}

	/*
	 * Method Name: verifyCalendarNavigation 
	 * Description: Verify that Calendar navigation functionality is working or not - verify calendar navigation functionality 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 16-08-2014
	 */
	public boolean verifyCalendarNavigation(WebDriver driver) {
		boolean result = false;
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		boolean flag4 = false;
		try {
				LoggerInstance.logger.info("Going to check Calendar navigation functionality");
				// Storing current month and year value in currentMonth and
				// currentYear variable
				String string_IPOPageCalCurrentMonthAndYear = fLib.getWebelment(driver, "IPOPageCalCurrentMonthAndYear").getText();
				int currentMonth = FunctionLibrary.getMonthIntValue(string_IPOPageCalCurrentMonthAndYear.split(" ")[0]);
				int currentYear = Integer.parseInt(string_IPOPageCalCurrentMonthAndYear.split(" ")[1]);
	
				// Clicking on Previous year link
				FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "IPOPageCal_PreYear"));
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				String preMonthAndYear = fLib.getWebelment(driver, "IPOPageCalCurrentMonthAndYear").getText();
				int preYear = Integer.parseInt(preMonthAndYear.split(" ")[1]);
			if (preYear == currentYear - 1) {
				LoggerInstance.logger.info("Previous Year match with value " + preYear);
				flag1 = true;
			} else {
				LoggerInstance.logger.info("Previous Year value is not matching");
			}

				// Clicking on Previous Month link
				FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "IPOPageCal_Today"));
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "IPOPageCal_PreMonth"));
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				String preMonthAndYear_Again = fLib.getWebelment(driver, "IPOPageCalCurrentMonthAndYear").getText();
				int preMonth = FunctionLibrary.getMonthIntValue(preMonthAndYear_Again.split(" ")[0]);
			if (preMonth == currentMonth - 1) {
				LoggerInstance.logger.info("Previous Month match with value " + preMonth);
				flag2 = true;
			} else
				LoggerInstance.logger.info("Previous Month value is not matching");

				// Clicking on Next Month link
				FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "IPOPageCal_Today"));
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "IPOPageCal_NextMonth"));
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				String nextMonthAndYear = fLib.getWebelment(driver, "IPOPageCalCurrentMonthAndYear").getText();
				int nextMonth = FunctionLibrary.getMonthIntValue(nextMonthAndYear.split(" ")[0]);
			if (nextMonth == currentMonth + 1) {
				LoggerInstance.logger.info("Next Month match with value " + nextMonth);
				flag3 = true;
			} else
				LoggerInstance.logger.info("Next Month value is not matching");

				// Clicking on Next Year link
				FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "IPOPageCal_Today"));
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "IPOPageCal_NextYear"));
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				String nextMonthAndYear_Again = fLib.getWebelment(driver, "IPOPageCalCurrentMonthAndYear").getText();
				int nextYear = Integer.parseInt(nextMonthAndYear_Again.split(" ")[1]);
			if (nextYear == currentYear + 1) {
				LoggerInstance.logger.info("Next Year match with value " + nextYear);
				flag4 = true;
			} else
				LoggerInstance.logger.info("Next Year value is not matching");
			if (flag1 && flag2 && flag3 && flag4) {
				result = true;
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Calendar navigation functionality is not working");
			result = false;
		}
		return result;
	}

	/*
	 * Method Name: verifyCalendarCompanyies 
	 * Description: Click on Company Name and Navigated to page under Home> IPO Calender > IPO Microsite where Company Name is displayed as Label 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 16-08-2014
	 */
	public boolean verifyCalendarCompanyies(WebDriver driver) {
		boolean result = false;
		try {
			LoggerInstance.logger.info("Going to click on Company and Navigated to page under Home> IPO Calender > IPO Microsite");
			String ipoCompanyName = fLib.getWebelment(driver, "IPOCalDiv").getText();
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "IPOCalDiv"));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			result = FunctionLibrary.verifyTextWebelement(ipoCompanyName, fLib.getWebelment(driver, "IPOCalMicrositeName"));
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to click on Company");
			return result;
		}
	}

	/*
	 * Method Name: verifyIPOMicrositeTableHeader 
	 * Description: On Page sections displayed are as Overview, Issue details, Contact Information, IPO Managing Bodies, Documents Research Reports 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 16-08-2014
	 */
	public boolean verifyIPOMicrositeTableHeader(WebDriver driver) {
		boolean result = false;
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		boolean flag4 = false;
		boolean flag5 = false;
		boolean flag6 = false;
		boolean flag7 = false;
		try {
			LoggerInstance.logger.info("Going to check table header");
			List<WebElement> th = (List<WebElement>) fLib.getWebelments(driver, "IPOCalMicrositeTableHeader");
			int col_position = 0;
			for (int i = 0; i < th.size(); i++) {
				if ("Overview".equalsIgnoreCase(th.get(i).getText())) {
					col_position = i + 1;
					flag1 = true;
					LoggerInstance.logger.info("Overview displayed");
					continue;
				} else if ("Issue Details".equalsIgnoreCase(th.get(i).getText())) {
					col_position = i + 1;
					flag2 = true;
					LoggerInstance.logger.info("Issue Details displayed");
					continue;
				} else if ("Contact information".equalsIgnoreCase(th.get(i).getText())) {
					col_position = i + 1;
					flag3 = true;
					LoggerInstance.logger.info("Contact information displayed");
					continue;
				} else if ("IPO Managing Bodies".equalsIgnoreCase(th.get(i).getText())) {
					col_position = i + 1;
					flag4 = true;
					LoggerInstance.logger.info("IPO Managing Bodies displayed");
					continue;
				} else if ("Documents".equalsIgnoreCase(th.get(i).getText())) {
					col_position = i + 1;
					flag5 = true;
					LoggerInstance.logger.info("Documents displayed");
					continue;
				} else if ("Research Reports".equalsIgnoreCase(th.get(i).getText())) {
					col_position = i + 1;
					flag6 = true;
					LoggerInstance.logger.info("Research Reports displayed");
					continue;
				}
			}
			if (flag1 && flag2 && flag3 && flag4 && flag5 && flag6) {
				result = true;
				LoggerInstance.logger.info("Columns displayed as Company, Open, Close, Price Band (Rs), Size (Rs. Cr.), MOQ, Grade");
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info(" Table header are not displayed");
			result = false;
		}
		return result;
	}

	/*
	 * Method Name: clickForthcomingSubTab 
	 * Description: Click on Forthcoming IPO page Sub Tab 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 16-08-2014
	 */
	public void clickForthcomingSubTab(WebDriver driver) {
		try {
			LoggerInstance.logger.info("Going to click on Forthcoming IPO page Sub Tab");
			FunctionLibrary.clickMenuItem(driver, fLib.getWebelment(driver, "IPOTab"), fLib.getWebelment(driver, "IPOForthcomingSubTab"));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to click on Forthcoming IPO page Sub Tab");
		}
	}

	/*
	 * Method Name: verifyForthcomingInfoLabel 
	 * Description: Verify Forthcoming Info label 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 16-08-2014
	 */
	public boolean verifyForthcomingInfoLabel(WebDriver driver) {
		boolean result = false;
		try {
			LoggerInstance.logger.info("Going to verify Forthcoming Information label");
			
			WebElement ab = fLib.getWebelment(driver, "IPOForthcomingLabel");
			result = FunctionLibrary.verifyTextWebelement("Forthcoming IPO Information", ab);
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Forthcoming Information label not verified");
			return result;
		}

	}

	/*
	 * Method Name: verifyInformationAndDocumentsTabs
	 * Description: Verify Information and Documents Tabs are displayed 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 16-08-2014
	 */
	public boolean verifyInformationAndDocumentsTabs(WebDriver driver) {
		boolean result = false;
		try {
			LoggerInstance.logger.info("Going to verify Information and Documents Tabs are displayed");
			boolean a = FunctionLibrary.verifyTextWebelement("Information", fLib.getWebelment(driver, "IPOForthcoming_Information"));
			boolean b = FunctionLibrary.verifyTextWebelement("Documents", fLib.getWebelment(driver, "IPOForthcoming_Documents"));
			if (a && b) {
				result = true;
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Information and Documents Tabs are not displayed");
			result = false;
		}
		return result;
	}

	/*
	 * Method Name: verifyColumnsHeaders 
	 * Description: Verify Forthcoming Columns header 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 16-08-2014
	 */
	public boolean verifyColumnsHeaders(WebDriver driver) {
		boolean result = false;
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		boolean flag4 = false;
		boolean flag5 = false;
		boolean flag6 = false;
		boolean flag7 = false;

		try {
			LoggerInstance.logger.info("Going to verify that Columns displayed as Company, Open, Close, Price Band (Rs), Size (Rs. Cr.), MOQ, Grade");
			List<WebElement> th = fLib.getWebelment(driver, "IPOForthcoming_TableHeader").findElements(By.tagName("th"));
			int col_position = 0;
			for (int i = 0; i < th.size(); i++) {
				if ("Company".equalsIgnoreCase(th.get(i).getText())) {
					col_position = i + 1;
					flag1 = true;
					LoggerInstance.logger.info("Company column displayed");
					continue;
				} else if ("Open".equalsIgnoreCase(th.get(i).getText())) {
					col_position = i + 1;
					flag2 = true;
					LoggerInstance.logger.info("Open column displayed");
					continue;
				} else if ("Close".equalsIgnoreCase(th.get(i).getText())) {
					col_position = i + 1;
					flag3 = true;
					LoggerInstance.logger.info("Close column displayed");
					continue;
				} else if ("Price Band (Rs.)".equalsIgnoreCase(th.get(i).getText())) {
					col_position = i + 1;
					flag4 = true;
					LoggerInstance.logger.info("Price Band (Rs.) column displayed");
					continue;
				} else if ("Size(Rs. Cr.)".equalsIgnoreCase(th.get(i).getText())) {
					col_position = i + 1;
					flag5 = true;
					LoggerInstance.logger.info("Size(Rs. Cr.) column displayed");
					continue;
				} else if ("MOQ".equalsIgnoreCase(th.get(i).getText())) {
					col_position = i + 1;
					flag6 = true;
					LoggerInstance.logger.info("MOQ column displayed");
					continue;
				} else if ("Grade".equalsIgnoreCase(th.get(i).getText())) {
					col_position = i + 1;
					flag7 = true;
					LoggerInstance.logger.info("Grade column displayed");
					continue;
				}
			}
			if (flag1 && flag2 && flag3 && flag4 && flag5 && flag6 && flag7) {
				result = true;
				LoggerInstance.logger.info("Columns displayed as Company, Open, Close, Price Band (Rs), Size (Rs. Cr.), MOQ, Grade");
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Columns are not displayed");
			result = false;
		}
		return result;
	}

	/*
	 * Method Name: verifyForthcomingTabRecords 
	 * Description: Verify Forthcoming tab Records 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 16-08-2014
	 */
	public boolean verifyForthcomingTabRecords(WebDriver driver) {
        boolean result = false;
        try {
            LoggerInstance.logger.info("Going to verify If no records, altenate text 'There is no Current IPO Available' is displayed");
            List<WebElement> td = (List<WebElement>) fLib.getWebelments(driver, "IPOForthcoming_TableNoData");
            int col_position = 0;
            for (int i = 0; i < td.size(); i++) {
            	if(td.size()==1 && td.get(i).findElement(By.tagName("span")).isDisplayed()){
            		WebElement span = td.get(i).findElement(By.tagName("span"));
            		if(("There is no Forthcoming IPO available.").equals(span.getText())){
            			LoggerInstance.logger.info("Altenate text 'There is no Current IPO Available' is displayed");
            			result=true;
            			break;
            		}
            	}else if (td.size()>0) {
					col_position = i + 1;
					result=true;
					LoggerInstance.logger.info("Records are displaying");
					break;
				} 
			}
            //result = FunctionLibrary.verifyTextWebelement("There is no Forthcoming IPO available.", we_IPOForthcoming_TableNoData);
            return result;
        } catch (Exception e) {
        	System.out.println("Exception: " + e.getMessage());
            LoggerInstance.logger.info("Text not displayed");
            return result;
        }

    }


	/*
	 * Method Name: verifyForthcomingGuidedSearchSection 
	 * Description: Verify Guided Search Section is displayed with links - Top Gainers, Top Losers, Largest Issue(Share Capital), Top Rated Issues 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 16-08-2014
	 */
	public boolean verifyGuidedSearchSection(WebDriver driver) {
		boolean result = false;
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		boolean flag4 = false;
		try {
			LoggerInstance.logger.info("Going to Verify Guided Search Section is displayed with links - Top Gainers, Top Losers, Largest Issue(Share Capital), Top Rated Issues");
			FunctionLibrary.verifyTextWebelement("Guided Search", fLib.getWebelment(driver, "IPOForthcoming_GuidedSearch"));
			List<WebElement> li = (List<WebElement>) fLib.getWebelments(driver, "IPOForthcoming_GuidedSearch_Contents");
			int col_position = 0;
			for (int i = 0; i < li.size(); i++) {
				if ("Top Gainers".equalsIgnoreCase(li.get(i).getText())) {
					col_position = i + 1;
					flag1 = true;
					LoggerInstance.logger.info("Link - Top Gainers column displayed");
					continue;
				} else if ("Top Losers".equalsIgnoreCase(li.get(i).getText())) {
					col_position = i + 1;
					flag2 = true;
					LoggerInstance.logger.info("Link - Top Losers column displayed");
					continue;
				} else if ("Largest Issue(Share Capital)".equalsIgnoreCase(li.get(i).getText())) {
					col_position = i + 1;
					flag3 = true;
					LoggerInstance.logger.info("Link - Largest Issue(Share Capital) column displayed");
					continue;
				} else if ("Top Rated Issues".equalsIgnoreCase(li.get(i).getText())) {
					col_position = i + 1;
					flag4 = true;
					LoggerInstance.logger.info("Link - Top Rated Issues column displayed");
					continue;
				}
			}
			if (flag1 && flag2 && flag3 && flag4) {
				result = true;
				LoggerInstance.logger.info("Guided Search Section is displayed with links - Top Gainers, Top Losers, Largest Issue(Share Capital), Top Rated Issues");
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info(" Guided Search Section not displayed");
			result = false;
		}
		return result;
	}

	/*
	 * Method Name: clickPastSubTab 
	 * Description: Click on Past IPO page Sub Tab 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 27-08-2014
	 */
	public void clickPastSubTab(WebDriver driver) {
		try {
			LoggerInstance.logger.info("Going to click on Past IPO page Sub Tab");
			FunctionLibrary.clickMenuItem(driver, fLib.getWebelment(driver, "IPOTab"), fLib.getWebelment(driver, "IPOPastSubTab"));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Not able to click on Past IPO page Sub Tab");
		}
	}

	/*
	 * Method Name: verifyPastIPOInfoLabel 
	 * Description: Verify Past IPO Info label 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 16-08-2014
	 */
	public boolean verifyPastIPOInfoLabel(WebDriver driver) {
		boolean result = false;
		try {
			LoggerInstance.logger.info("Going to verify Past IPO Information from method");
			result = FunctionLibrary.verifyTextWebelement("Past IPO Information", fLib.getWebelment(driver, "IPOPastLabel"));
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Past IPO Information label not verified");
			return result;
		}

	}

	/*
	 * Method Name: verifyInformationAndDocumentsTabs 
	 * Description: Verify Information and Documents Tabs are displayed 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 16-08-2014
	 */
	public boolean verifyInformationAndDocumentsTabsPastIPO(WebDriver driver) {
		boolean result = false;
		try {
			LoggerInstance.logger.info("Going to verify Information and Documents Tabs are displayed from method");
			boolean a = FunctionLibrary.verifyTextWebelement("Information", fLib.getWebelment(driver, "IPOPast_Information"));
			boolean b = FunctionLibrary.verifyTextWebelement("Documents", fLib.getWebelment(driver, "IPOPast_Documents"));
			if (a && b) {
				result = true;
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Information and Documents Tabs are not displayed");
			result = false;
		}
		return result;
	}

	/*
	 * Method Name: verifyPastIPOTableHeader 
	 * Description: Verify Columns displayed as Company, Listing Date, Price Band (Rs), Size (Rs. Cr.), MOQ, Close Date, Return 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 16-08-2014
	 */
	public boolean verifyPastIPOTableHeader(WebDriver driver) {
		boolean result = false;
		try {
			result = fLib.getWebelment(driver, "IPOPast_TableHeader").isDisplayed();
			if (result == true)
				LoggerInstance.logger.info("Company, Listing Date, Price Band (Rs), Size (Rs. Cr.), MOQ, Close Date, Return are displayed");
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Company, Listing Date, Price Band (Rs), Size (Rs. Cr.), MOQ, Close Date, Return are not displayed");
			return result;
		}
	}

	/*
	 * Method Name: verifyPastIPOTabRecordsDecrendingOrder 
	 * Description: Records are displayed and Sorted for Close Date in Descending Order 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 27-08-2014
	 */
	public boolean verifyPastIPOTabRecordsDecrendingOrder(WebDriver driver) {
		boolean result = false;
		WebElement colElement;
		List<String> colValues = new ArrayList<String>();
		try {
			List<WebElement> rowList = fLib.getWebelment(driver, "IPOPast_InfoTab_Row").findElements(By.tagName("tr"));
			Iterator<WebElement> i = rowList.iterator();
			int k = 0;
			while (i.hasNext()) {
				k++;
				WebElement row = i.next();
				if (k <= 9) {
					colElement = row.findElement(By.cssSelector("#ctl00_BodyCPH_PastIssues_rptIssueList_ctl0" + k + "_tdItem_CloseDate"));
				} else {
					colElement = row.findElement(By.cssSelector("#ctl00_BodyCPH_PastIssues_rptIssueList_ctl" + k + "_tdItem_CloseDate"));
				}
				// LoggerInstance.logger.info("Value is for index " + k +
				// " is  " + colElement.getText().trim());
				colValues.add(colElement.getText().trim());
			}
			result = FunctionLibrary.checkDateSortingOrder(colValues, false);
			if (result == true)
				LoggerInstance.logger.info("Records are displayed and Sorted for Close Date in Descending Order");
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Records are not displayed and are not Sorted for Close Date in Descending Order");
			return result;
		}
	}

	/*
	 * Method Name: verifyPastIPOTabRecordsAscendingOrder 
	 * Description: Verify after Clicking on Close Date Column, records will be sorted in Ascending Order 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 27-08-2014
	 */
	public boolean verifyPastIPOTabRecordsAscendingOrder(WebDriver driver) {
		boolean result = false;
		WebElement colElement;
		List<String> colValues = new ArrayList<String>();
		try {
			LoggerInstance.logger.info("Going to click on Close Date Column");
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "IPOPast_TableHeader_CloseDate"));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Thread.sleep(3000);
			List<WebElement> rowList = fLib.getWebelment(driver, "IPOPast_InfoTab_Row").findElements(By.tagName("tr"));
			Iterator<WebElement> i = rowList.iterator();
			int k = 0;
			while (i.hasNext()) {
				k++;
				WebElement row = i.next();
				if (k <= 9) {
					colElement = row.findElement(By.cssSelector("#ctl00_BodyCPH_PastIssues_rptIssueList_ctl0" + k + "_tdItem_CloseDate"));
				} else {
					colElement = row.findElement(By.cssSelector("#ctl00_BodyCPH_PastIssues_rptIssueList_ctl" + k + "_tdItem_CloseDate"));
				}
				// LoggerInstance.logger.info("Value is for index " + k +
				// " is  " + colElement.getText().trim());
				colValues.add(colElement.getText().trim());
			}
			result = FunctionLibrary.checkDateSortingOrder(colValues, true);
			if (result == true)
				LoggerInstance.logger.info("Records are displayed and Sorted for Close Date in Ascending Order");
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Records are not displayed and are not Sorted for Close Date in Ascending Order");
			return result;
		}
	}

	/*
	 * Method Name: verifySearchCriteria 
	 * Description: Verify that after entering Values into fields Close Date From and To and click GO Button, records are displayed where Close date is ranging between From and To dates. 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 27-08-2014
	 */
	public boolean verifySearchCriteria(WebDriver driver) {
		boolean result = false;
		WebElement colElement;
		List<String> colValues = new ArrayList<String>();
		DateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy");
		DateFormat format2 = new SimpleDateFormat("dd/MM/yyyy");
		String fromText = "08/07/2014";
		String toText = "17/08/2014";
		try {
			LoggerInstance.logger.info("Going to Verify Search Criteria ");
			fLib.getWebelment(driver, "IPOPast_FromDate").sendKeys(fromText);
			fLib.getWebelment(driver, "IPOPast_ToDate").sendKeys(toText);
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "IPOPast_GoBtn"));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			List<WebElement> rowList = (List<WebElement>) fLib.getWebelment(driver, "IPOPast_InfoTab_Row").findElements(By.tagName("tr"));
			Iterator<WebElement> i = rowList.iterator();
			int k = 0;
			while (i.hasNext()) {
				k++;
				WebElement row = i.next();
				if (k <= 9) {
					colElement = row.findElement(By.cssSelector("#ctl00_BodyCPH_PastIssues_rptIssueList_ctl0" + k + "_tdItem_CloseDate"));
				} else {
					colElement = row.findElement(By.cssSelector("#ctl00_BodyCPH_PastIssues_rptIssueList_ctl" + k + "_tdItem_CloseDate"));
				}
				// LoggerInstance.logger.info("Value is for index " + k +
				// " is  " + colElement.getText().trim());
				colValues.add(colElement.getText().trim());
			}

			if (colValues == null || colValues.isEmpty()) {
				LoggerInstance.logger.info("Date list is empty");
				result = false;
			}

			Date fromTextDate = format2.parse(fromText);
			Date toTextDate = format2.parse(toText);
			for (int j = 0; j < colValues.size() - 1; j++) {
				Date date = format1.parse(colValues.get(j).toString());
				if (toTextDate.compareTo(date) > 0 && fromTextDate.compareTo(date) <= 0) {
					LoggerInstance.logger.info("Date " + colValues.get(j).toString() + " ranging between from " + fromText + " to " + toText + " dates");
					result = true;
				} else {
					result = false;
				}
			}
			if (result == true)
				LoggerInstance.logger.info("For all Records Close date is ranging between From and To dates");
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("For all Records Close date is not ranging between From and To dates");
			return result;
		}
	}

	/*
	 * Method Name: verifyCompanyClickNevigation 
	 * Description: Verify that Under Company Column click on any record and user is navigated to Company's details Page 
	 * Parameters: 
	 * Created By: Kuldeep Singh 
	 * Created Date: 16-08-2014
	 */
	public boolean verifyCompanyClickNevigation(WebDriver driver) {
		boolean result = false;
		try {
			LoggerInstance.logger.info("Going to click on Past IPO page Sub Tab");
			FunctionLibrary.clickMenuItem(driver, fLib.getWebelment(driver, "IPOTab"), fLib.getWebelment(driver, "IPOPastSubTab"));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			LoggerInstance.logger.info("Going to click on Past IPO Company column link");
			String companyName = fLib.getWebelment(driver, "IPOPast_CompanyLink").getText();
			FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "IPOPast_CompanyLink"));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			LoggerInstance.logger.info("Going to verify Company label");
			result = FunctionLibrary.verifyTextWebelement(companyName, fLib.getWebelment(driver, "IPOCalMicrositeName"));
			if (result == true)
				LoggerInstance.logger.info("User is navigated to Company's details Page ");
			return result;
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("User is not able to navigate to Company's details Page");
			return result;
		}
	}
}
