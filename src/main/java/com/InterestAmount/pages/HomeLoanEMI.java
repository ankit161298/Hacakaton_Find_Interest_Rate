package com.InterestAmount.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.InterestAmount.base.BaseMethods;
import com.InterestAmount.pageObjects.HomeLoan_pObjects;
import com.aventstack.extentreports.Status;

public class HomeLoanEMI extends BaseMethods
{
	
	public void openBrowser() 		//Open browser and navigate to the test URL
	{
		try
		{
			logger = report.createTest("Browser Initialization");
			setUp("chrome");
			logger.log(Status.INFO, "Browser opened Successfully");
			openURL("url");
			logger.log(Status.PASS, "Test Passed");
		 }
		catch(Exception e)
        {
            reportFail(e.getMessage());
        }
	}
	
	
	public void homeLoanEMI() throws Exception			//Navigate to Home Loan EMI Calculator
	{
		try
		{
			logger = report.createTest("Navigate to Home Loan EMI Calculator");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(HomeLoan_pObjects.menu_xpath).click();
			driver.findElement(HomeLoan_pObjects.homeLoanEMICalc_xpath).click();
		    driver.navigate().to("https://emicalculator.net/home-loan-emi-calculator/");
		    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		    logger.log(Status.PASS, "Test Passed");
		    RunScriptExcel.write(7,3,"Pass");
		}
		catch(Exception e)
        {
			RunScriptExcel.write(7,3,"Fail");
            reportFail(e.getMessage());
        }
	}
	
	public void extractData() throws IOException			//Export data into Excel sheet-AmountTable.xlsx
	{
		try
		{
			logger = report.createTest("Home Loan Calculation");
			String years = "15";
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(HomeLoan_pObjects.loanTenure_Id).sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
			driver.findElement(HomeLoan_pObjects.loanTenure_Id).sendKeys(years);
			driver.findElement(HomeLoan_pObjects.loanTenure_Id).sendKeys(Keys.ENTER);
			File file = new File(directory+"/Home test-output/HomeLoanPaymentSchedule.xlsx");
	
			// Create an object of FileInputStream class to read excel file
			FileInputStream inputStream = new FileInputStream(file);
	
			// Create workbook instance that refers to .xlsx file
			XSSFWorkbook wb = new XSSFWorkbook(inputStream);
	
			// Create a Sheet object using the sheet Name
			XSSFSheet sheet = wb.getSheet("Sheet1");
	
			// Create a row object to retrieve row at index 1
			XSSFRow row = sheet.createRow(1);
	
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1500)", "");
			List<WebElement> column = driver.findElements(By.xpath("//table[@class='noextras']//tbody/tr[1]/th"));
			int yearcount = Integer.parseInt(years);
			yearcount = (yearcount * 2) + 2;
			for (int i = 1; i <= column.size(); i++) {
				String xpath = "//table[@class='noextras']/tbody/tr[1]/th[" + i + "]";
				String header = driver.findElement(By.xpath(xpath)).getText();
				row.createCell(i).setCellValue(header);
			}																							
			XSSFRow row1 = null;
			for (int i = 2; i <= yearcount; i++) {
				row1 = sheet.createRow(i);
				for (int j = 1; j <= column.size(); j++) {
					String xpath1 = "//table[@class='noextras']/tbody/tr[" + i + "]/td[" + j + "]";
					String data = driver.findElement(By.xpath(xpath1)).getText();
	
					row1.createCell(j).setCellValue(data);
				}
				i = i + 1;
			}
			
			 //Write the data in excel using output stream
			 
			FileOutputStream outputStream = new FileOutputStream(directory+"/Home test-output/HomeLoanPaymentSchedule.xlsx");
			wb.write(outputStream);
			wb.close();
			System.out.println("Data written successfully");
			logger.log(Status.INFO, "Data written successfully");
			logger.log(Status.INFO, "Home Loan Calculated");
			logger.log(Status.PASS, "Test Passed");
			RunScriptExcel.write(8,3,"Pass");
		}
		catch(Exception e)
        {
            reportFail(e.getMessage());
            RunScriptExcel.write(8,3,"Fail");
        }
	}
	public void close() 	//close the browser
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
	public void endReport() 	//close the report and create new report
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
