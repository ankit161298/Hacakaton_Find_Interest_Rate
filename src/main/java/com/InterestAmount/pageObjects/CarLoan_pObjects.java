package com.InterestAmount.pageObjects;

import org.openqa.selenium.By;

public interface CarLoan_pObjects 
{
	By carLoanbtn_Id = By.id("car-loan");

	By loanAmount_Id = By.id("loanamount");

	By interestRate_Id = By.id("loaninterest");

	By loanTenure_Id = By.id("loanterm");
	By year_Id = By.id("year2021");
	By principalAmount_xpath = By.xpath("(//table/tbody/tr[3]/td/div/table/tbody/tr/td[2])[1]");
	By interestAmount_xpath = By.xpath("//*[@id='monthyear2021']/td/div/table/tbody/tr[1]/td[3]");

	public static String amount = "1500000";

}
