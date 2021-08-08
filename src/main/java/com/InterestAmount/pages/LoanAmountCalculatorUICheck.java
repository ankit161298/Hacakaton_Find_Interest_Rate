package com.InterestAmount.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.InterestAmount.base.BaseMethods;
import com.InterestAmount.pageObjects.UICheck_pObjects;
import com.aventstack.extentreports.Status;

public class LoanAmountCalculatorUICheck extends BaseMethods {

	public void openBrowser() // Open browser and navigate to the test URL
	{
		try {
			logger = report.createTest("Browser Initialization");
			setUp("chrome");
			logger.log(Status.INFO, "Browser opened Successfully");
			openURL("url");
			logger.log(Status.PASS, "Test Passed");
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	}
	public void loanAmountCalculator() // navigating to the loan Amount calculator
	{
		try {
			logger = report.createTest("Loan Amount Calculator Navigation");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(UICheck_pObjects.menu_xpath).click();
			driver.findElement(UICheck_pObjects.loanEMICalc_xpath).click();
			driver.navigate().to("https://emicalculator.net/loan-calculator/");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.findElement(UICheck_pObjects.loanAmtCalc_Id).click();
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(22, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(22, 3, "Fail");
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
			RunScriptExcel.write(23, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(23, 3, "Fail");
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
			RunScriptExcel.write(24, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(24, 3, "Fail");
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
			RunScriptExcel.write(25, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(25, 3, "Fail");
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
			RunScriptExcel.write(26, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(26, 3, "Fail");
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
			RunScriptExcel.write(27, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(27, 3, "Fail");
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
			RunScriptExcel.write(28, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(28, 3, "Fail");
		}
	}
	public void loanTermTextBox() // checking whether loan tenure textbox visible or not
	{
		try {
			logger = report.createTest("Loan Term Text Box");
			boolean isElementPresent = driver.findElement(UICheck_pObjects.loanTenureText_Id).isDisplayed();
			if (isElementPresent == true) {
				System.out.println("Loan Tenure Text Box is Visible");
			} else {
				System.out.println("Loan Tenure Text Box is Not Visible");
			}
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(29, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(29, 3, "Fail");
		}
	}
	public void loanTermSlider() // checking whether loan tenure slider visible or not
	{
		try {
			logger = report.createTest("Loan Tenure Slider");
			boolean isElementPresent = driver.findElement(UICheck_pObjects.loanTenureSlider_Id).isDisplayed();
			if (isElementPresent == true) {
				System.out.println("Loan Tenure Slider is Visible");
			} else {
				System.out.println("Loan Tenure Slider is Not Visible");
			}
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(30, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(30, 3, "Fail");
		}
	}
	public void loanTermSliderCheck() // checking whether loan tenure slider is working or not
	{
		try {
			logger = report.createTest("Loan Term Check Slider");
			WebElement slider = driver.findElement(UICheck_pObjects.loanTenureSlider_Id);
			Actions move = new Actions(driver);
			Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
			action.perform();
			System.out.println("Loan Tenure Slider is Checked");
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(31, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(31, 3, "Fail");
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
			RunScriptExcel.write(32, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(32, 3, "Fail");
		}
	}
	public void feeChargesSlider() // checking whether fee & charges slider is visible or not
	{
		try {
			logger = report.createTest("Fees & Charges Slider");
			boolean isElementPresent = driver.findElement(UICheck_pObjects.loanFeesSlider_Id).isDisplayed();
			if (isElementPresent == true) {
				System.out.println("Fees & Charges Slider is Visible");
			} else {
				System.out.println("Fees & Charges Slider is Not Visible");
			}
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(33, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(33, 3, "Fail");
		}
	}
	public void feeSliderCheck() // checking whether fee & charge slider is working or not
	{
		try {
			logger = report.createTest("Fees & Charges Check Slider");
			WebElement slider = driver.findElement(UICheck_pObjects.loanFeesSlider_Id);
			Actions move = new Actions(driver);
			Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
			action.perform();
			System.out.println("Loan Fees Slider is Checked");
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(34, 3, "Pass");
		} catch (Exception e) {
			reportFail(e.getMessage());
			RunScriptExcel.write(34, 3, "Fail");
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
