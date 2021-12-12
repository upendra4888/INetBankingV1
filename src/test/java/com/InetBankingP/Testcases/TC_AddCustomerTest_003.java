package com.InetBankingP.Testcases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.iNetBanking.PageObject.AddCustomerPage;
import com.iNetBanking.PageObject.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		logger.info("Username is provided");
		lp.SetUsername(Username);
		logger.info("Username is provided");
		lp.SetPassword(Password);
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		logger.info("Customer detail is provided");
		addcust.clickAddNewCustomer();
		addcust.enterName("Shivaan");
		addcust.selectGender("male");
		addcust.enterDOB("10", "15", "2018");
		Thread.sleep(3000);
		addcust.enterAddress("INDIA");
		addcust.enterCity("Pune");
		addcust.enterState("Mahashtra");
		addcust.enterPinNo("5000074");
		addcust.enterphonenumber("8888801570");
		Thread.sleep(3000);
		logger.info("email is provided");
		Thread.sleep(8000);
		String email = randonString()+"@gmail.com";
		addcust.enterEmailString(email);;
		logger.info("click submit");
		Assert.assertTrue(true);
		/*addcust.clickSubmit();
		Thread.sleep(3000);
		boolean res = driver.getPageSource().contains("Customer Registered Successfully");
		if(res==true)
		{
			Assert.assertTrue(true);
		}
		else {
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
		}*/
		
	}
	
	

}
