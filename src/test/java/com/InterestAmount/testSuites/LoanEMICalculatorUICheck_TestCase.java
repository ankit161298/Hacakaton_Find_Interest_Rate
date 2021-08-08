package com.InterestAmount.testSuites;

import org.testng.annotations.Test;

import com.InterestAmount.pages.LoanEMICalculatorUICheck;

public class LoanEMICalculatorUICheck_TestCase extends LoanEMICalculatorUICheck
{
	/*
	 * calling the method and adding priority the method using testNG
	 */
    @Test(priority=0,groups = "Smoke Test")
    public void testOpenBrowserTestCase() 
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
    public void testLoanEMICalcNavigate()
    {
        try
        {
            loanEMICalculator();
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
    public void testLoanAmtTextBox() 
    {
        try
        {
            loanAmountTextBoxCheck();
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
    public void testLoanAmtSliderCheck() 
    {
        try
        {
            loanAmountSliderCheck();
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
    public void testLoanAmtSlider()
    {
        try
        {
            loanAmountSlider();
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
    public void testInterestRateTextBox() 
    {
        try
        {
            interestRateTextBoxCheck();
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
    public void testInterestRateSlider() 
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
    public void testInterestRateSliderCheck() 
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
    public void testLoanTermTextBox() 
    {
        try
        {
            loanTermTextBoxCheck();
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
    public void testLoanTermSlider() 
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
    public void testLoanTermSliderCheck()
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
    public void testFeeChargesTextBox() 
    {
        try
        {
            feeChargesTextBoxCheck();
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
    public void testFeeChargesSlider() 
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
    public void testFeeSliderCheck() 
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

