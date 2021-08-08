package com.InterestAmount.testSuites;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.InterestAmount.pages.LoanAmountCalculatorUICheck;

public class LoanAmountCalculatorUICheck_TestCase extends LoanAmountCalculatorUICheck
{
	/*
	 *  Open browser and navigate to the test URL by calling method and using testNG
	 */
    @BeforeTest(groups = "Smoke Test")
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
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 1, groups = {"UICheck","Smoke Test"})
    public void testloancalcnavigate()
    {
        try
        {
            loanAmountCalculator();
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 2, groups = {"UICheck","Regression Test"})
    public void testEMItextbox() 
    {
        try
        {
            loanEMITextBox(); 
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 2, groups = {"UICheck","Regression Test"})
    public void testEMIslidercheck()
    {
        try
        {
            loanEMISliderCheck();
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 2, groups = {"UICheck","Regression Test"})
    public void testEMIslider()
    {
        try
        {
            loanEMISlider();
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 2, groups = {"UICheck","Regression Test"})
    public void testinterestratetextbox() 
    {
        try
        {
            interestRateTextBox(); 
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 2, groups = {"UICheck","Regression Test"})
    public void testinterestrateslider() 
    {
        try
        {
            interestRateSlider();
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 2, groups = {"UICheck","Regression Test"})
    public void testinterestrateslidercheck()
    {
        try
        {
            interestRateSliderCheck();
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 2, groups = {"UICheck","Regression Test"})
    public void testloantermtextbox() 
    {
        try
        {
            loanTermTextBox();
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 2, groups = {"UICheck","Regression Test"})
    public void testloantermslider()
    {
        try
        {
            loanTermSlider();
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 2, groups = {"UICheck","Regression Test"})
    public void testloantermslidercheck() 
    {
        try
        {
            loanTermSliderCheck();
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 2, groups = {"UICheck","Regression Test"})
    public void testfeechargestextbox()
    {
        try
        {
            feeChargesTextBox();
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 2, groups = {"UICheck","Regression Test"})
    public void testfeechargesslider() 
    {
        try
        {
            feeChargesSlider(); 
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 2, groups = {"UICheck","Regression Test"})
    public void testfeeChargeSlidercheck()
    {
        try
        {
        	feeSliderCheck();
        }
        catch(Exception e)
        {
            reportFail(e.getMessage());
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority=3,groups = "Smoke Test")
    public void close() 
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
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority=4,groups = "Smoke Test")
    public void endReport() 
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

