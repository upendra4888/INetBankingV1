package com.Inetbnking.Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {

	ExtentReports extent;
	ExtentSparkReporter sparkReporter;

	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); // time stamp)
	String repName = "Test-Report-" + timeStamp + ".html";

	@BeforeSuite
	public void BeforeSuite() {
		extent = new ExtentReports();
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/" + repName);

		extent.attachReporter(sparkReporter);

	}
	
	

	@AfterSuite
	public void AfterSuite() {
		extent.flush();

	}
}
