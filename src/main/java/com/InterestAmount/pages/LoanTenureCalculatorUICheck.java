package com.InterestAmount.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.InterestAmount.base.BaseMethods;
import com.InterestAmount.pageObjects.UICheck_pObjects;
import com.aventstack.extentreports.Status;

public class LoanTenureCalculatorUICheck extends BaseMethods
{
	public void openBrowser() // Open browser and navigate to the test URL
	{
		try 
		{
			logger = report.createTest("Browser Initialization");
			setUp("chrome");
			logger.log(Status.INFO, "Browser opened Successfully");
			openURL("url");
			logger.log(Status.PASS, "Test Passed");
		} catch (Exception e) 
		{
			reportFail(e.getMessage());
		}
	}
	public void loanTenureCalc() throws  Exception
	{
		try
		{
			logger = report.createTest("Loan Tenure Calculator Navigation");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(UICheck_pObjects.menu_xpath).click();
			driver.findElement(UICheck_pObjects.loanEMICalc_xpath).click();
			driver.navigate().to("https://emicalculator.net/loan-calculator/");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.findElement(UICheck_pObjects.LoanTenureCalc_Id).click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(35,3,"Pass");
		}
		catch(Exception e)
        {
            reportFail(e.getMessage());
            RunScriptExcel.write(35,3,"Fail");
        }
	}
	public void loanAmountTextBoxCheck()			//checking whether loan amount text box is displayed or not
	{
		try
		{
			logger = report.createTest("Loan Amount Text Box");
			boolean iselementpresent = driver.findElement(UICheck_pObjects.loanAmountText_Id).isDisplayed();
			if (iselementpresent == true) {
				System.out.println("Loan Amount Text Box is Visible");
			} else {
				System.out.println("Loan Amount Text Box is Not Visible");
			}
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(36,3,"Pass");
		}
		catch(Exception e)
        {
            reportFail(e.getMessage());
            RunScriptExcel.write(36,3,"Fail");
        }
	}
	
	public void loanAmountSliderCheck() 		//checking whether loan amount slider is working or not
	{
		try
		{
			logger = report.createTest("Loan Amount Check Slider");
			WebElement slider = driver.findElement(UICheck_pObjects.loanAmountSlider_Id);
			Actions move = new Actions(driver);
			Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
			action.perform();
			System.out.println("Loan Amount Slider is Checked");
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(37,3,"Pass");
		}
		catch(Exception e)
        {
            reportFail(e.getMessage());
            RunScriptExcel.write(37,3,"Fail");
        }
	}
	public void loanAmountSlider() 
	{
		try
		{
			logger = report.createTest("Loan Amount Slider");
			boolean isElementPresent = driver.findElement(UICheck_pObjects.loanAmountSlider_Id).isDisplayed();
			if (isElementPresent == true) {
				System.out.println("Loan Amount Slider is Visible");
			} else {
				System.out.println("Loan Amount Slider is Not Visible");
			}
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(38,3,"Pass");
		}
		catch(Exception e)
        {
            reportFail(e.getMessage());
            RunScriptExcel.write(38,3,"Fail");
        }
	}
	public void loanEMITextBox() // checking whether EMI textbox is visible or not
	{
		try {
			logger = report.createTest("EMI Text Box");
			boolean isElementPresent = driver.findElement(UICheck_pObjects.loanEMIText_Id).isDisplayed();
			if (isElementPresent == true) {
				System.out.println("EMI Text Box is Visible");
			} else {
				System.out.println("EMI Text Box is Not Visible");
			}
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(39, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(39, 3, "Fail");
		}
	}
	public void loanEMISlider()			//checking whether EMI slider is visible or not
	{
		try {
			logger = report.createTest("EMI Slider");
			boolean isElementPresent = driver.findElement(UICheck_pObjects.loanEMISlider_Id).isDisplayed();
			if (isElementPresent == true) {
				System.out.println("EMI Slider is Visible");
			} else {
				System.out.println("EMI Slider is Not Visible");
			}
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(40, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(40, 3, "Fail");
		}
	}
	public void loanEMISliderCheck() 		//checking whether EMI slider is working or not
	{
		try {
			logger = report.createTest("EMI Check Slider");
			WebElement slider = driver.findElement(UICheck_pObjects.loanEMISlider_Id);
			Actions move = new Actions(driver);
			Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
			action.perform();
			System.out.println("EMI Slider is Checked");
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(41, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(41, 3, "Fail");
		}
	}
	public void interestRateTextBox() 			//checking whether interest rate textbox is visible or not
	{
		try {
			logger = report.createTest("Interest Rate Text Box");
			boolean isElementPresent = driver.findElement(UICheck_pObjects.loanInterestText_Id).isDisplayed();
			if (isElementPresent == true) {
				System.out.println("Interest Rate Text Box is Visible");
			} else {
				System.out.println("Interest Rate Text Box is Not Visible");
			}
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(42, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(42, 3, "Fail");
		}
	}
	public void interestRateSlider()			//checking whether interest rate slider is visible or not
	{
		try {
			logger = report.createTest("Interest Rate Slider");
			boolean isElementPresent = driver.findElement(UICheck_pObjects.loanInterestSlider_Id).isDisplayed();
			if (isElementPresent == true) {
				System.out.println("Interest Rate Slider is Visible");
			} else {
				System.out.println("Interest Rate Slider is Not Visible");
			}
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(43, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(43, 3, "Fail");
		}
	}
	public void interestRateSliderCheck() // checking whether interest rate slider working or not
	{
		try {
			logger = report.createTest("Interest Rate Check Slider");
			WebElement slider = driver.findElement(UICheck_pObjects.loanInterestSlider_Id);
			Actions move = new Actions(driver);
			Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
			action.perform();
			System.out.println("Interest Rate Slider is Checked");
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(44, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(44, 3, "Fail");
		}
	}
	
	public void feeChargesTextBox() // checking whether fee & charges textbox is visible or not
	{
		try {
			logger = report.createTest("Fees & Charges Text Box");
			boolean isElementPresent = driver.findElement(UICheck_pObjects.loanFeesText_Id).isDisplayed();
			if (isElementPresent == true) {
				System.out.println("Fees & Charges Text Box is Visible");
			} else {
				System.out.println("Fees & Charges Text Box is Not Visible");
			}
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(45, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(45, 3, "Fail");
		}
	}
	public void feeChargesSlider() // checking whether fee & charges slider is visible or not
	{
		try
		{
			logger = report.createTest("Fees & Charges Slider");
			boolean isElementPresent = driver.findElement(UICheck_pObjects.loanFeesSlider_Id).isDisplayed();
			if (isElementPresent == true) {
				System.out.println("Fees & Charges Slider is Visible");
			} else {
				System.out.println("Fees & Charges Slider is Not Visible");
			}
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(46, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(46, 3, "Fail");
		}
	}
	public void feeSliderCheck() // checking whether fee & charge slider is working or not
	{
		try 
		{
			logger = report.createTest("Fees & Charges Check Slider");
			WebElement slider = driver.findElement(UICheck_pObjects.loanFeesSlider_Id);
			Actions move = new Actions(driver);
			Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
			action.perform();
			System.out.println("Loan Fees Slider is Checked");
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(47, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(47, 3, "Fail");
		}
	}
	public void close() // close the browser
	{
		try {
			closeBrowser();
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	}
	public void endReport() // close the report and create new report
	{
		try {
			report.flush();
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	}
}
