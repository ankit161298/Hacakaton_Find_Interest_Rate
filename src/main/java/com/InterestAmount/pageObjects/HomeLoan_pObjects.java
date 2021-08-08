package com.InterestAmount.pageObjects;

import org.openqa.selenium.By;

public interface HomeLoan_pObjects {

	By menu_xpath = By.xpath("//a[contains(text(),'Calculators')]");

	By homeLoanEMICalc_xpath = By.xpath("//a[@title='Home Loan EMI Calculator']");

	By alertDismiss = By.linkText("Close");

	By homeValue_Id = By.id("homeprice");

	By interestRate_Id = By.id("homeloaninterest");

	By loanTenure_Id = By.id("homeloanterm");

}
