package com.InterestAmount.pageObjects;

import org.openqa.selenium.By;

public interface UICheck_pObjects {
	By menu_xpath = By.xpath("//a[contains(text(),'Calculators')]");

	By loanEMICalc_xpath = By.xpath("//a[@title='Loan Calculator']");

	By alertDismiss = By.id("dismiss-button");

	By loanAmountText_Id = By.id("loanamount");

	By loanAmountSlider_Id = By.id("loanamountslider");

	By loanInterestText_Id = By.id("loaninterest");

	By loanInterestSlider_Id = By.id("loaninterestslider");

	By loanTenureText_Id = By.id("loanterm");

	By loanTenureSlider_Id = By.id("loantermslider");

	By loanFeesText_Id = By.id("loanfees");

	By loanFeesSlider_Id = By.id("loanfeesslider");
	By loanAmtCalc_Id = By.id("loan-amount-calc");
	By loanEMIText_Id = By.id("loanemi");
	By loanEMISlider_Id = By.id("loanemislider");
	By LoanTenureCalc_Id = By.id("loan-tenure-calc");

}
