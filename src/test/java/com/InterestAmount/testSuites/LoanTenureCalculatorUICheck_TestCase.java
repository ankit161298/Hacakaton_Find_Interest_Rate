package com.InterestAmount.testSuites;

import org.testng.annotations.Test;

import com.InterestAmount.pages.LoanTenureCalculatorUICheck;

public class LoanTenureCalculatorUICheck_TestCase extends LoanTenureCalculatorUICheck
{
	/*
	 * calling the method and adding priority the method using testNG
	 */
    @Test(priority=0,groups = "Smoke Test")
    public void openBrowsertestCase() 
    {
        try
        {
            openBrowser();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 1, groups = {"UICheck","Smoke Test"})
    public void testLoanTenureNavigate()
    {
        try
        {
            loanTenureCalc();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 2, groups = {"UICheck","Regression Test"})
    public void testLoanAmountTextBox() 
    {
        try
        {
            loanAmountTextBoxCheck();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 2, groups = {"UICheck","Regression Test"})
    public void testLoanAmountSliderCheck()
    {
        try
        {
            loanAmountSliderCheck();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 2, groups = {"UICheck","Regression Test"})
    public void testLoanAmountSlider() 
    {
        try
        {
            loanAmountSlider();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 2, groups = {"UICheck","Regression Test"})
    public void testEMITextBox() 
    {
        try
        {
            loanEMITextBox();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 2, groups = {"UICheck","Regression Test"})
    public void testEMISlider() 
    {
        try
        {
           loanEMISlider();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority = 2, groups = {"UICheck","Regression Test"})
    public void testEMISliderCheck() 
    {
        try
        {
            loanEMISliderCheck();
        }
        catch(Exception e)
        {
            e.printStackTrace();
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
            interestRateTextBox(); 
        }
        catch(Exception e)
        {
            e.printStackTrace();
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
        	interestRateSlider();
        }
        catch(Exception e)
        {
            e.printStackTrace();
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
        	interestRateSliderCheck();
        }
        catch(Exception e)
        {
            e.printStackTrace();
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
            feeChargesTextBox(); 
        }
        catch(Exception e)
        {
            e.printStackTrace();
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
            e.printStackTrace();
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
            e.printStackTrace();
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority=3,groups = "Smoke Test")
    public void testClose() 
    {
        try
        {
            closeBrowser();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /*
     * calling the method and adding priority the method using testNG
     */
    @Test(priority=4,groups = "Smoke Test")
    public void testEndReport() 
    {
        try
        {
            report.flush();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

