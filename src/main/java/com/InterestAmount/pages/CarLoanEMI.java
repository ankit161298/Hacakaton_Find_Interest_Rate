package com.InterestAmount.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.InterestAmount.base.BaseMethods;
import com.InterestAmount.pageObjects.CarLoan_pObjects;
import com.aventstack.extentreports.Status;

public class CarLoanEMI extends BaseMethods
{
	public void openBrowser() 			//Open browser and navigate to the test URL
	{
		try
		{
			logger = report.createTest("Browser Initialization");
			setUp("chrome");
			logger.log(Status.INFO, "Browser opened Successfully");
			openURL("url");
			RunScriptExcel.write(4,3,"Pass");
			logger.log(Status.PASS, "Test Passed");
		}
		catch(Exception e)
		{
			reportFail(e.getMessage());
			RunScriptExcel.write(4,3,"Fail");
		}
	}

	public void carEMIForm() 	//Send the Car Loan Values
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		driver.findElement(CarLoan_pObjects.loanAmount_Id).clear();
		driver.findElement(CarLoan_pObjects.loanAmount_Id).sendKeys(CarLoan_pObjects.amount);
		jse.executeScript("document.getElementById('loaninterest').value='9.5'");	//Using JavaScriptExecutor to set the value of Interest Rate.
		jse.executeScript("document.getElementById('loanterm').value='1'");	//Using JavaScriptExecutor to set the value of Loan Tenure.
		driver.findElement(CarLoan_pObjects.loanTenure_Id).sendKeys(Keys.ENTER);	
	}
	public void getData() 		//Print the interest amount & principal amount for one month
	{
		try 
		{
			
		driver.findElement(CarLoan_pObjects.year_Id).click();
		// Extracting Principle value of one month
		
		String principle = driver.findElement(CarLoan_pObjects.principalAmount_xpath).getText();
		System.out.println("Principle amount for one month is:Rs " + principle.substring(2, (principle.length())));
		// Extracting Interest value of one month
		String interest = driver.findElement(CarLoan_pObjects.interestAmount_xpath).getText();
		System.out.println("Interest amount for one month is:Rs " + interest.substring(2, interest.length()));
		RunScriptExcel.write(6,3,"Pass");
		logger.log(Status.INFO, "EMI Calculated for a month");
		logger.log(Status.PASS, "Test Passed");
		}
		catch(Exception e)
		{
		reportFail(e.getMessage());
		RunScriptExcel.write(6,3,"Fail");
		}
	}
	public void close()			//close the browser
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
	public void endReport() 		//close the report and create new report
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
