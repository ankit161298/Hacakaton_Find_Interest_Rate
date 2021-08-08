package com.InterestAmount.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.utils.DateUtils;
import com.utils.ExtentReportManager;

public class BaseMethods
{

	public WebDriver driver;
	public String directory = System.getProperty("user.dir");
	public Properties prop;
	public ExtentReports report = ExtentReportManager.getReportInstance();
	public ExtentTest logger;
	
	
    
    public void setUp(String browserName)		//Invoke Browsers	
    {
    	prop=new Properties();
    	try{prop.load(new FileInputStream(directory +"\\src\\main\\java\\com\\InterestAmount\\configureProperties\\config.properties"));
    	}
    	catch(Exception e) {}
    	if (browserName.equalsIgnoreCase("chrome"))
		{
				System.setProperty("webdriver.chrome.driver",
						directory + "\\src\\test\\resources\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
				System.setProperty("webdriver.gecko.driver", directory + "\\src\\test\\resources\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
		}
    	driver.manage().window().maximize();
    	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	
    	  
    }
    public void openURL(String url)		//Open URL
	{
		try 
		{
			driver.get(prop.getProperty(url));
			reportPass(url + " Identified Successfully");
		} 
		catch (Exception e) 
		{
			reportFail(e.getMessage());
		}

	}
	
	public void reportFail(String reportString) 
	{
		logger.log(Status.FAIL, reportString);
		Assert.fail(reportString);
	}
	public void reportPass(String reportString)
	{
		logger.log(Status.PASS, reportString);
	}
    public void closeBrowser() 		//close Browser
	{
		driver.close();
	}
	public void quitBrowser()	//quit Browser
	{
		driver.quit();
	}
	public void takeScreenShot()
    {
    	// Get screenshot of the visible part of the web page and store the image
		TakesScreenshot takeScreenShotOnFailure = (TakesScreenshot)driver;
    	File sourceFile=takeScreenShotOnFailure.getScreenshotAs(OutputType.FILE);
    	File destFile = new File(directory + "\\Screenshots\\" + DateUtils.getTimeStamp() + ".png");
		try{
			FileUtils.copyFile(sourceFile, destFile);
			logger.addScreenCaptureFromPath(directory + "\\Screenshots\\" + DateUtils.getTimeStamp() + ".png");
		}catch (IOException e) 
		{
			e.printStackTrace();
		}
    }
    
}
