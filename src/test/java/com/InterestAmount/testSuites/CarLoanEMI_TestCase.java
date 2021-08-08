package com.InterestAmount.testSuites;

import org.testng.annotations.Test;

import com.InterestAmount.pages.CarLoanEMI;


public class CarLoanEMI_TestCase extends CarLoanEMI 
{
	 //Testing CarLoanEMI class by using testng
	 //calling the open browser and adding priority the method using testNG
	 
    @Test(priority=0,groups = "Smoke Test")
    public void openBrowsertestCase() 
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
    
    //calling the carEMIForm method and adding priority the method using testNG
   
    @Test(priority=1,groups = "Regression Test")
    public void carEMIFormtestCase() 
    {
        try
        {
            carEMIForm(); 
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
    //calling the getdata method and adding priority  and dependency to the method using testNG
    
    @Test(dependsOnMethods = { "carEMIFormtestCase" },priority=2,groups="Regression Test")
    public void getdatatestcase()
    {
        try
        {               
            getData();
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
    //calling the close method and adding priority the method using testNG
   
    @Test(priority=3,groups = "Smoke Test")
    public void closetestcase()
    {
        try
        {
            close();
        }
        
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
    //calling the endReport method and adding priority the method using testNG
     
    @Test(priority=4,groups = "Smoke Test")
    public void endReportestcase() 
    {
        try
        {
            endReport();
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
}
