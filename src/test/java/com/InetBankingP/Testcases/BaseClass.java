package com.InetBankingP.Testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;

//import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Inetbnking.Utilities.ReadConfig;

//import com.Inetbnking.Utilities.ReadConfig;

public class BaseClass {

	public static Logger logger;
	public static WebDriver driver;

	// public String baseURL = "http://demo.guru99.com/V1/index.php";|
	// public String Username = "mngr369724"; |Old Way without COnfig property file
	// public String Password = "rydUgAn"; |

	// Using COnfig.properties and ReadJava class file for reading variable
	ReadConfig rc = new ReadConfig();
	public String baseURL = rc.getApplicationURL();
	public String Username = rc.getUsername();
	public String Password = rc.getPassword();
	public String ChromeDriverPath = rc.getChromeDriverpath();
    
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		// **********HardCoded*********
		// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		// + "\\Drivers\\chromedriver.exe");
		// ***FromConfig****************

		logger = Logger.getLogger("eBanking");
		PropertyConfigurator.configure("Log4j.properties");

		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
			driver = new ChromeDriver();
		} else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", rc.getIEpath());
			driver = new InternetExplorerDriver();

		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void testDown() {
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname ) throws IOException{
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File target = new File(System.getProperty("user.dir") + "/ScreenShots/" + tname + ".png");
	     FileUtils.copyFile(source, target);
	     System.out.println("Screenshot taken");
	}
	
	public String randonString() {
		String generatedString = RandomStringUtils.randomAlphabetic(10);
		return(generatedString);
		
	}


}
