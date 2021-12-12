package com.InetBankingP.Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Inetbnking.Utilities.XLUtils;
import com.iNetBanking.PageObject.LoginPage;

public class TC_LoginDDT_002 extends BaseClass {

	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) {
		LoginPage lp = new LoginPage(driver);
		lp.SetUsername(user);
		logger.info("Entered username");
		lp.SetPassword(pwd);
		logger.info("Entered password");
		lp.clickSubmit();
		if(isAlertPresent()==true)
		{
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			driver.switchTo().alert().accept(); // Close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("login failed");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("login passed");
			lp.clickLogout();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}

	}
	
	public boolean isAlertPresent() { // User Defined methond to check alert
		try
		{
		driver.switchTo().alert();
		return true;
		}catch(NoAlertPresentException e)
		{
			return false;
		}
		
		
		
	}

	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		
		String path =System.getProperty("user.dir")+"/src/test/java/com/Inetbnking/testdata/TestData.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				logindata[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j); //1,0
								
				
			}
		}
		return logindata;
	}

}
