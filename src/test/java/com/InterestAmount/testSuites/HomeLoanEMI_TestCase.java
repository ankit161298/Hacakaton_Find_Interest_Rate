package com.InterestAmount.testSuites;

import java.io.IOException;

import org.testng.annotations.Test;

import com.InterestAmount.pages.HomeLoanEMI;

public class HomeLoanEMI_TestCase extends HomeLoanEMI
{
	
    @Test(priority=0,groups = "Smoke Test")
    public void testopenBrowser() 		//Open browser and navigate to the test URL by calling method and using testNG
    {
        try
        {
            openBrowser();
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
  
    @Test(priority=1,groups = "Smoke Test")			//Navigate to Home Loan EMI Calculator by calling method and testNG priority
    public void testHomeEmi() 
    {
        try
        {
            homeLoanEMI(); 
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
   
    @Test(priority=1, groups="Regression Test")
    public void testdataexport() throws IOException		//calling the dataexport method and adding priority the method using testNG/AmountTable.xlsx
    {
        try
        {
            extractData();
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
   
    @Test(priority=2,groups = "Smoke Test")
    public void close() 		//calling the close browser method and adding priority the method using testNG
    {
        try
        {
            closeBrowser();
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
   
    @Test(priority=3,groups = "Smoke Test")
    public void endReport() 			//calling the endReport method and adding priority the method using testNG
    {
        try
        {
            report.flush();
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }


}
