package PageObjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections.iterators.ArrayListIterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import FunctionLibraries.FunctionLibrary;
import Logger.LoggerInstance;

public class CompaniesPage {	
	
	     private WebDriver driver;
	    
		 // This is a constructor, as every page need a base driver to find web elements
		public CompaniesPage(WebDriver driver) {
			this.driver = driver;
		}

		FunctionLibrary fLib = new FunctionLibrary();
		
/* Method Name: 
 * Description: Function to click on Companies Tab
 * Created By: Mohd Suhail
 * Created Date: 19-08-2014
 * */

public void clickOnCompaniesTab() {
	try {
		LoggerInstance.logger.info("click on Companies Tab");
		FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "CompaniesTab"))    ;
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	} catch (Exception e) {
		System.out.println("Exception: " + e.getMessage());
		LoggerInstance.logger.info("Not able to click on Companies Tab");
	}
}
		

/* Method Name: 
 * Description: Function to click on InforMationTabclick
 * Created By: Mohd Suhail
 * Created Date: 19-08-2014
 * */

public void clickInformationTab() throws InterruptedException
{
	try {
	FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "InforMationTab"))    ;
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	Thread.sleep(10000);
	} catch (Exception e) {
		System.out.println("Exception: " + e.getMessage());
		LoggerInstance.logger.info("Not able to click on Information Tab");
	}
}

		
 /* Method Name: 
 * Description: Function to Verify Information Tab Displayed
 * Created By: Mohd Suhail
 * Created Date: 20-08-2014
 * */

		public Boolean verifyInformationTab(){
			boolean result= false;
			try{
				 result=fLib.getWebelment(driver, "InforMationTab").isDisplayed();
				 if (result==true)
				 LoggerInstance.logger.info("Information _Tab is displayed");
				 return result;
			}
			catch (Exception e) 
			{
				System.out.println("Exception: " + e.getMessage());
				LoggerInstance.logger.info("Information _Tab is not displayed");
				return result;
			}
		}

 /* Method Name: 
 * Description: Function to Verify Document Tab Displayed
 * Created By: Mohd Suhail
 * Created Date: 20-08-2014
 * */
		public Boolean verifyDocumentTabIsDisplayed(){
			
			boolean result= false;
			try{
				 result=fLib.getWebelment(driver, "DocumentTab").isDisplayed();
				 if (result==true)
				 LoggerInstance.logger.info("Document_Tab is displayed");
				 return result;
			}
			catch (Exception e) 
			{
				System.out.println("Exception: " + e.getMessage());
				LoggerInstance.logger.info("Document_Tab is not displayed");
				return result;
			}
		}
		
	
 /* Method Name: 
 * Description: Function to Verify Company name in Ascending order
 * Created By: Mohd Suhail
 * Created Date: 20-08-2014
 * */

public boolean VerifyComanyNameSortedAscending(){
	boolean result = false ;
	try{
		
		List<WebElement> textverifyAscending= fLib.getWebelments(driver, "RowTextValTable");
	
		//List<WebElement> textverifyAscending=(List<WebElement>) textverifyAscending1 ;
	 for(int i=0;i<textverifyAscending.size()-1;i++)
	    {
	    	String Current=textverifyAscending.get(i).getText();
	    	String Next=textverifyAscending.get(i+1).getText();
	    	if (result=Current.compareToIgnoreCase(Next )< 0)
	    	{ 
	    		LoggerInstance.logger.info("Companies Name Is arranged in Ascending Order in Row"+(i+1)+".");
	    	}
	    	else if(result=Current.compareToIgnoreCase(Next) > 0)
	    	{ 
	    		LoggerInstance.logger.info("Companies Name Is not arranged in Ascending Order in Row"+(i+1)+".");
	    	}
	    	else
	    	{ 
	    		LoggerInstance.logger.info("Companies Name are identical.");
	    	}
	    }
	  }
	catch (Exception e) 
		{
		System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Company Name is not arranged in Ascending Order.");
			return result;
		}
	return result;
}
	


/* Method Name: 
* Description: Function to Verify Company name in Descending order
* Created By: Mohd Suhail
* Created Date: 20-08-2014
* */
    
public boolean VerifyComanyNameSorteDecendingOrder(){
boolean result = false ;
	try{
	FunctionLibrary.clickWebLink(fLib.getWebelment(driver, "RowTextVal"));
	
	List<WebElement> textverifyAscending= (List<WebElement>) fLib.getWebelments(driver, "RowTextValTable");
	
	 for(int i=0;i<textverifyAscending.size()-1;i++)
	    {
	    	String Current=textverifyAscending.get(i).getText();
	    	String Next=textverifyAscending.get(i+1).getText();
	    	if (result=Current.compareToIgnoreCase(Next ) >0)
	    	{ 
	    		LoggerInstance.logger.info("Companies Name Is arranged in Descending Order in Row"+(i+1)+".");
	    	}
	    	else if(result=Current.compareToIgnoreCase(Next) < 0)
	    	{ 
	    		LoggerInstance.logger.info("Companies Name Is not arranged in Descending Order in Row"+(i+1)+".");
	    	}
	    	else
	    	{ 
	    		LoggerInstance.logger.info("Companies Name are identical.");
	    	}
	    }	
	  }
	catch (Exception e) 
   		{
		System.out.println("Exception: " + e.getMessage());
			LoggerInstance.logger.info("Company Name is not arranged in Descending Order.");
   		}
	return result;
}
	 
/* Method Name: 
* Description: Function to Verify Table heading CompanyName ,Industry Name
*                            NSE, BSE is displayed
* Created By: Mohd Suhail
* Created Date: 20-08-2014
* */
	 public boolean VerifyComanyTableHeadingIsDisplayed()
	 {	 
		 boolean result = false ;
			
			try{
	 List<WebElement> headerelment=(List<WebElement>) fLib.getWebelments(driver, "HeaderTable");
		 for(int i=0;i<headerelment.size();i++)
		   {
			   
		String HeaderText=	 headerelment.get(i).getText();
		
		if(result=HeaderText.equalsIgnoreCase("Company Name Industry NSE BSE"))
		{
			
			LoggerInstance.logger.info("Companies Column Heading Is Displayed and verified.");
		}
		else
		{
			LoggerInstance.logger.info("Companies Column Heading Is not Displayed and verified.");
		}
		   }   
		   }
		 catch (Exception e) 
			{
			 System.out.println("Exception: " + e.getMessage());
				LoggerInstance.logger.info("Element is not displayed");
				return result;
		}
			return result;
	 }
	
 /* Method Name: 
 * Description: Function to Nse value displayed red color has down arrow
 *               and  value green color in up arrow
 * Created By: Mohd Suhail
 * Created Date: 20-08-2014
 * */
 
 public Boolean VerifyNSEArrowColorTextVal()
 {
 boolean result = false ;
	 List<WebElement> colorTextNse=(List<WebElement>) fLib.getWebelments(driver, "ColorTextNSE");
	 List<WebElement> colorArrowImage= (List<WebElement>) fLib.getWebelments(driver, "ColorimageNse");
	 for(int i=0;i<colorTextNse.size();i++)
        {
           String     colorArrowImagepos=colorArrowImage.get(i).getAttribute("src");
       String     colorTextNseval=colorTextNse.get(i).getAttribute("style");
      try{  
            if(colorArrowImagepos!=null && colorTextNseval!=null)
            {
                 if(result=colorArrowImagepos.contains("green-arrow.gif") && colorTextNseval.contains("rgb(16, 143, 16)"))
                 {
                	 LoggerInstance.logger.info("NSE Data Value is green in color and image is up arrow.");
                 }
                 else if(result=colorArrowImagepos.contains("red-arrow.gif") && colorTextNseval.contains("rgb(255, 0, 0)"))
                		 {
                	 LoggerInstance.logger.info("NSE Data Value is red in color and image is down arrow.");
                 }   
                 else if(result=colorArrowImagepos.contains("red-arrow.gif") && colorTextNseval.contains("rgb(16, 143, 16)"))
        		 {
                	 LoggerInstance.logger.info("NSE Data Value is green in color and image is down arrow.");
        		 } 
                 else if(result=colorArrowImagepos.contains("green-arrow.gif") && colorTextNseval.contains("rgb(255, 0, 0)"))
        		 {
                	 LoggerInstance.logger.info("NSE Data Value is red in color and image is up arrow.");
        		 } 
            }
          }
       catch(Exception e)
          { 
    	   			System.out.println("Exception: " + e.getMessage());
            	  LoggerInstance.logger.info("NSE column does not contain any data Value.");
                  
              }
        }
	return result; 
}	
 
 
 /* Method Name: 
 * Description: Function to BSE value displayed red color has down arrow
 *               and  value green color in up arrow
 * Created By: Mohd Suhail
 * Created Date: 20-08-2014
 * */
 public Boolean VerifyBSEArrowColorTextVal()
   {
	 boolean result = false ;
	 List<WebElement> colorTextBse=(List<WebElement>) fLib.getWebelments(driver, "ColorTextBse");
	 List<WebElement> colorArrowImage=(List<WebElement>) fLib.getWebelments(driver, "ColorimageBse");
	 for(int i=0;i<colorTextBse.size();i++)
        {
          
                String colorArrowImagepos=colorArrowImage.get(i).getAttribute("src");
                String colorTextNseval=colorTextBse.get(i).getAttribute("style");
                  try{  
                if(colorArrowImagepos!=null && colorTextNseval!=null)
                {
                     if(result=colorArrowImagepos.contains("green-arrow.gif") && colorTextNseval.contains("rgb(16, 143, 16)"))
                     {
                     	
                    	 LoggerInstance.logger.info("BSE Data Value is green in color and image is up arrow.");
                     }
                     
                     else if(result=colorArrowImagepos.contains("red-arrow.gif") && colorTextNseval.contains("rgb(255, 0, 0)"))
                    		 {
                    	 LoggerInstance.logger.info("BSE Data Value is red in color and image is down arrow.");
                     }   
                     
                     
                     else if(result=colorArrowImagepos.contains("red-arrow.gif") && colorTextNseval.contains("rgb(16, 143, 16)"))
            		 {
                    	 LoggerInstance.logger.info("BSE Data Value is green in color and image is down arrow.");
            		 } 
                     else if(result=colorArrowImagepos.contains("green-arrow.gif") && colorTextNseval.contains("rgb(255, 0, 0)"))
            		 {
                    	 LoggerInstance.logger.info("BSE Data is red in color and image is up arrow.");
            		 } 
              }
           }
        catch(Exception e)
        	{
        	System.out.println("Exception: " + e.getMessage());
                	  LoggerInstance.logger.info("BSE column does not contain ant data");
	        	}
	        }
		return result;
	 }	
 
	 
 /* Method Name: 
 * Description: Function to Verify Image is displayed to left
 *               of company name
 * Created By: Mohd Suhail
 * Created Date: 22-08-2014
 * */
 
 public Boolean verifyImageLeftTextIsDisplayed()
 {
	 boolean result = false ;
	 List<WebElement> leftimage=(List<WebElement>) fLib.getWebelments(driver, "leftimageBegng");
	    for(int i=0;i<leftimage.size();i++)
	    {
	    	try
	    {
	            String colortextaleftimagesrcval=leftimage.get(i).getAttribute("src");
            if(result=colortextaleftimagesrcval.contains("star-4.png")|| colortextaleftimagesrcval.contains("CID") || colortextaleftimagesrcval.contains("NoSparkline_N.jpg"))
            {
            	 LoggerInstance.logger.info("Image is displayed in left of text Value.");
            }
         
            }catch (Exception e) {
            	System.out.println("Exception: " + e.getMessage());
            	 LoggerInstance.logger.info("Image is  not displayed in left of text Value.");
				}
	    }
		return result;
	    }
 
 
 
 /* Method Name: 
 * Description: Function to Verify Image is displayed to Right
 *               of company name
 * Created By: Mohd Suhail
 * Created Date: 22-08-2014
 * */
    
    public Boolean verifyImageRightTextIsDisplayed()
	 {
    	boolean result = false ;
		 List<WebElement> Rightimage=(List<WebElement>) fLib.getWebelments(driver, "rightimagetext");
		    for(int i=0;i<Rightimage.size();i++)
		    {
		    	try
		    {
		            String  colortextaleftimagesrcval=Rightimage.get(i).getAttribute("src");
		            if(result=colortextaleftimagesrcval.contains("II_Trans_Graph.GIF") )
		            {
		            	 LoggerInstance.logger.info("Image is displayed in Right of Text Value.");
		            }
	
		            }catch (Exception e) {
		            	System.out.println("Exception: " + e.getMessage());
		            	LoggerInstance.logger.info("Image is  not displayed in Right of Text Value.");
						}
			    }
				return result;
		 }
 
    /* Method Name: 
 * Description: Function to Verify Pagination is displayed 
 * Created By: Mohd Suhail
 * Created Date: 22-08-2014
 * */
    
public Boolean verifyPaginationdisplayed()
{
	boolean result= false;
	try{
		 result=fLib.getWebelment(driver, "PaginationDisplayed").isDisplayed();
		 if (result==true)
		 LoggerInstance.logger.info("Pagination  is displayed at the bottom.");
		 return result;
	}
	catch (Exception e) 
	{
		System.out.println("Exception: " + e.getMessage());
		LoggerInstance.logger.info("Pagination is not displayed.");
		return result;
	}
}

/* Method Name: 
 * Description: Function to Verify Next Page then results of next page is displayed 
 *               and when user click on Previous page then results of Previous page is displayed
 * Created By: Mohd Suhail
 * Created Date: 23-08-2014
 * */
public Boolean verifyClickingNextPreviousDislayedPage()
{
	boolean result= false;
	try{
	List<WebElement> elmnt=(List<WebElement>) fLib.getWebelments(driver, "PaginationDisplayed");
	List<WebElement> elmnt1=(List<WebElement>) fLib.getWebelments(driver, "Paginationflicker");
	for(int i=0;i<elmnt.size();i++)
	{
		String Previousbtn=elmnt1.get(i).getAttribute("class");
		if(result=Previousbtn.equalsIgnoreCase("previous-off"))
		{
			LoggerInstance.logger.info("Page One  is displayed.");
			fLib.getWebelment(driver, "PaginationflickerNextBtn").click();
			LoggerInstance.logger.info("Next Button is clicked.");
			LoggerInstance.logger.info("Page two is  displayed.");
			WebElement PreviousBtnEnabled=fLib.getWebelment(driver, "PaginationflickerPreviousBtn");
			if(result=PreviousBtnEnabled.isEnabled())
			{
				PreviousBtnEnabled.click();
				LoggerInstance.logger.info("Previous Button is  displayed and clicked.");
				LoggerInstance.logger.info("Page one is  displayed.");
			}
		}
		}
	}catch(Exception e)
	{
		System.out.println("Exception: " + e.getMessage());
		LoggerInstance.logger.info("Previous Button and Next Button is not enabled.");
	}
	return result;
	}

/* Method Name: 
 * Description: Function to Verify Company Name  ToolTip Industry Value 
 *              and Industry  column value is matching . 
 * Created By: Mohd Suhail
 * Created Date: 23-08-2014
 * */
public  boolean VerifyToolTipCompanyValIndustryColumnValMatches() throws InterruptedException
{
	boolean result= false;
	try{
	List<WebElement>  Companynameval=(List<WebElement>) fLib.getWebelments(driver, "TableColumnVal");
    List<WebElement> ColumnIndustryname=(List<WebElement>) fLib.getWebelments(driver, "TableColumnVal2");
	for(int i=0;i<Companynameval.size();i++)
	{
	    String text=Companynameval.get(i).getText();
		WebDriverWait wait = new WebDriverWait(driver, 80); 
		WebElement cmpnyName = driver.findElement(By.linkText(text));
		Actions act = new Actions(driver);
		act.moveToElement(cmpnyName).build().perform(); 
	  //Need to check
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css_toolTipTextIndustryName))); 
	    WebElement toolTipTextIndustryName  = fLib.getWebelment(driver, "toolTipTextIndustryName"); 
	    Thread.sleep(2000); 
	    String popmsg1=toolTipTextIndustryName.getText();
	   for(int j=0;j< ColumnIndustryname.size();j++)
	   {
		   String ColumnTextValue=ColumnIndustryname.get(i).getText();
		   if (result=popmsg1.equalsIgnoreCase(ColumnTextValue))
		   {
		   LoggerInstance.logger.info("Tool Tip Text Value Company Name" +" "+ popmsg1 +" "+ "equals Industry name" +" "+ColumnTextValue+".");
		   break;
		  
		   }
		   else{
			   LoggerInstance.logger.info("Tool Tip Text ValueCompany Name" +" "+popmsg1 +" "+"not equals Industry name"+" " +ColumnTextValue+".");
			   break;
		   }
	   }
	} 
}
catch (Exception e) 
{
	
	System.out.println("Exception: " + e.getMessage());
   	 LoggerInstance.logger.info("Tool tip is not exist");
           	 return result;
		}   
	return result;
	}


/*
 * Method Name: Description: Verify SubTab Microsite Page is Displayed
 * Created By: Mohd Suhail Created Date: 19-08-2014
 */

public Boolean VerifyMicrositePageIsdisplayed() {
	boolean result = false;
	try {
		LoggerInstance.logger.info("Going to  Sub Tab");
		FunctionLibrary.clickMenuItem(driver, fLib.getWebelment(driver, "MainLink"),
				fLib.getWebelment(driver, "MicrositeSublink"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		result = fLib.getWebelment(driver, "Microsite").isDisplayed();
		if (result == true)
			LoggerInstance.logger.info("Microsite Page is displayed");
		return result;
	} catch (Exception e) {
		System.out.println("Exception: " + e.getMessage());
		LoggerInstance.logger.info("Microsite Page is not displayed");
		return result;
	}
}

/*
 * Method Name: Description: Verify SubTab Results Page is Displayed Created
 * By: Mohd Suhail Created Date: 19-08-2014
 */

public Boolean verifyResultsPageIsdisplayed() {
	boolean result = false;
	try {
		LoggerInstance.logger.info("Going to  Sub Tab");
		FunctionLibrary.clickMenuItem(driver, fLib.getWebelment(driver, "MainLink"),
				fLib.getWebelment(driver, "ResultsSubLink"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		result = fLib.getWebelment(driver, "Resultspage").isDisplayed();
		if (result == true)
			LoggerInstance.logger.info("Results Page is displayed");
		return result;
	} catch (Exception e) {
		System.out.println("Exception: " + e.getMessage());
		LoggerInstance.logger.info("Results Page is not displayed");
		return result;
	}
}

/*
 * Method Name: Description: Verify SubTab Annoucement Page is Displayed
 * Created By: Mohd Suhail Created Date: 19-08-2014
 */
public Boolean VerifyAnnoucementPageIsdisplayed() {
	boolean result = false;
	try {
		LoggerInstance.logger.info("Going to  Sub Tab");
		FunctionLibrary.clickMenuItem(driver, fLib.getWebelment(driver, "MainLink"),
				fLib.getWebelment(driver, "AnnoucementsSubLink"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		result = fLib.getWebelment(driver, "Annoucement").isDisplayed();
		if (result == true)
			LoggerInstance.logger.info("Annoucement Page is displayed");
		return result;
	} catch (Exception e) {
		System.out.println("Exception: " + e.getMessage());
		LoggerInstance.logger.info("Annoucement Page is not displayed");
		return result;
	}
}

/*
 * Method Name: Description: Verify SubTab CompareCompaniesPage is Displayed
 * Created By: Mohd Suhail Created Date: 19-08-2014
 */

public Boolean verifyCompareCompaniesPageIsdisplayed() {

	boolean result = false;
	try {
		LoggerInstance.logger.info("Going to  Sub Tab");
		FunctionLibrary.clickMenuItem(driver, fLib.getWebelment(driver, "MainLink"),
				fLib.getWebelment(driver, "CompareCompnaiesSubLink"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		result = fLib.getWebelment(driver, "CompareCompaniesPage").isDisplayed();
		if (result == true)
			LoggerInstance.logger
					.info("Compare Companies Page is displayed");
		return result;
	} catch (Exception e) {
		System.out.println("Exception: " + e.getMessage());
		LoggerInstance.logger
				.info("Compare Companies Page is not displayed");
		return result;
	}
}

/*
 * Method Name: Description: Verify SubTab IndustriesPage is Displayed
 * Created By: Mohd Suhail Created Date: 19-08-2014
 */

public Boolean verifyIndustriesPageIsdisplayed() {
	boolean result = false;
	try {
		LoggerInstance.logger.info("Going to  Sub Tab");
		FunctionLibrary.clickMenuItem(driver, fLib.getWebelment(driver, "MainLink"),
				fLib.getWebelment(driver, "IndustriesSubTab"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		result = fLib.getWebelment(driver, "Industriespage").isDisplayed();
		if (result == true)
			LoggerInstance.logger.info("Industries Page is displayed");
		return result;
	} catch (Exception e) {
		System.out.println("Exception: " + e.getMessage());
		LoggerInstance.logger.info("Industries Page is not displayed");
		return result;
	}
}

// /* Method Name:
// * Description: Verify SubTab DocumentPage is Displayed
// * Created By: Mohd Suhail
// * Created Date: 19-08-2014
// * */
public Boolean VerifyDocumentPageIsdisplayed() {
	boolean result = false;
	try {
		LoggerInstance.logger.info("Going to  Sub Tab");
		FunctionLibrary.clickMenuItem(driver, fLib.getWebelment(driver, "MainLink"),
				fLib.getWebelment(driver, "DocumentSubTab"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		result = fLib.getWebelment(driver, "CompanyDocument").isDisplayed();
		if (result == true)
			LoggerInstance.logger.info("Document Page is displayed");
		return result;
	} catch (Exception e) {
		System.out.println("Exception: " + e.getMessage());
		LoggerInstance.logger.info("Document Page is not displayed");
		return result;
	}
}
}
			
	
	
	 
	 



