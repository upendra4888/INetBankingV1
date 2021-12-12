package com.InetBankingP.Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.iNetBanking.PageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	// public WebDriver driver;
	LoginPage lp = new LoginPage(driver);
	//ExtentReports extent;

	@Test
	public void loginTest() {

		// driver.get(baseURL); ***** Shifting to Ba class as it is commnon
		//ExtentTest test = extent.createTest("loginTest");

		logger.info("URL Lunched");
		LoginPage lp = new LoginPage(driver);
		lp.SetUsername(Username);
		logger.info("Entered username3");
		lp.SetPassword(Password);
		logger.info("ENtered Password");
		lp.clickSubmit();

		String title = driver.getTitle();
		System.out.println(driver.getTitle());

		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Logging test passed");
			//test.log(Status.PASS, "Title mataches");
		} else {
			try {
				captureScreen(driver, "loginTest");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Assert.assertTrue(false);
			logger.info("Loging Test failed");
			//test.log(Status.FAIL, "Title dosent mataches");
		}

	}

}
