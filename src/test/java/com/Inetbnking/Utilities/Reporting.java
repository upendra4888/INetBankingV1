package com.Inetbnking.Utilities;
/*
// This is Listener class
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
//import com.aventstack.extentreports.observer.ExtentObserver;
//import com.aventstack.extentreports.reporter.ExtentReporter;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporting extends TestListenerAdapter {

	 public ExtentHtmlReporter htmlReporter;
	 public ExtentReports extent;
	 public ExtentTest logger;
	 
	 @Test
	 public void onStart(ITestContext testContext)
	 {
		 System.out.println(System.getProperty("user.dir"));
		 String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); //time stamp)
		 String repName = "Test-Report-"+timeStamp+".html";
		 htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/"+repName);
			htmlReporter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");
	
		 
		 extent=new ExtentReports();
		 
		 
		 extent.attachReporter(htmlReporter);
		 extent.setSystemInfo("Host Name", "localhost");
		 extent.setSystemInfo("Environment", "QA");
		 extent.setSystemInfo("user", "Upendra");
		 
		 htmlReporter.config().setDocumentTitle("InetBanking Test Project");// Title of Report
		 htmlReporter.config().setReportName("FUnctional Test Report");// name of report
		 htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		 htmlReporter.config().setTheme(Theme.DARK);
		 
		 
	 }
	 
	 public void onTestSuccess(ITestResult tr)
	 {
		 logger = extent.createTest(tr.getName()); // create new entry in the report
		 logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	 }
	 
	 public void onTestFailure(ITestResult tr)
	 {
		 logger=extent.createTest(tr.getName());
		 logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
		 
		 String screenshotPath = System.getProperty("user.dir")+"\\ScreenShots\\"+tr.getName()+".png";
		 
		 File f = new File(screenshotPath);
				 if(f.exists())
				 {
					 try {
						 logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotPath));
					 }catch (Exception e)
					 {
						 e.printStackTrace();
					 }
				 }
	 }
	 
	 
	 public void onTestSkipped(ITestResult tr) {
		 logger = extent.createTest(tr.getName()); 
		 logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
	 }
	 
	 public void onTestFinish(ITestContext testContext) {
		 
		 extent.flush();
		 
	 }
	 
	 
	 
}*/
